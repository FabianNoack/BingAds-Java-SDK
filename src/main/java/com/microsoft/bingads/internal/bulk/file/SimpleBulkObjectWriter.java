package com.microsoft.bingads.internal.bulk.file;

import com.microsoft.bingads.bulk.entities.StaticBulkObjectFactory;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.googlecode.jcsv.CSVStrategy;
import com.googlecode.jcsv.writer.CSVWriter;
import com.googlecode.jcsv.writer.internal.CSVWriterBuilder;
import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.DownloadFileType;
import com.microsoft.bingads.internal.StringTable;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 *
 *
 */
public class SimpleBulkObjectWriter implements BulkObjectWriter {

    private BulkObjectFactory bulkObjectFactory;
    private CSVWriter<String[]> csvWriter;

    public SimpleBulkObjectWriter(File filePath, DownloadFileType fileFormat) throws IOException {
        this.bulkObjectFactory = new StaticBulkObjectFactory();

        Writer writer = new OutputStreamWriter(new FileOutputStream(filePath), "UTF-8");
        writer.write(0xFEFF);
        
        this.csvWriter = this.buildCSVWriter(writer, fileFormat == DownloadFileType.CSV ? ',' : '\t');
    }

    /**
     * @see
     * com.microsoft.bingads.internal.bulk.file.BulkObjectWriter#writeFileMetadata()
     */
    @Override
    public void writeFileMetadata() throws IOException {
        this.writeHeaders();
        this.writeFormatVersion();
    }

    private void writeFormatVersion() throws IOException {
        RowValues versionRow = new RowValues();
        
        versionRow.put(StringTable.Type, StringTable.SemanticVersion);
        versionRow.put(StringTable.Name, "3.0"); //TODO: move to BulkServiceManager
                
        csvWriter.write(versionRow.getColumns());
    }

    private void writeHeaders() throws IOException {
        this.csvWriter.write(CsvHeaders.Headers);
        this.csvWriter.flush();
    }

    /**
     *
     * @param writer
     * @param delimiter
     * @return a CSV writer which uses the delimiter provided
     */
    private CSVWriter<String[]> buildCSVWriter(Writer writer, char delimiter) {
        return new CSVWriterBuilder<String[]>(writer)
                .entryConverter(new ReplaceNullsWithEmptyStringCSVEntryConverter())
                .strategy(this.createStrategyWithDelimiter(delimiter)).build();
    }

    /**
     *
     * @param delimiter
     * @return a strategy for writing the CSV using the delimiter provided
     */
    private CSVStrategy createStrategyWithDelimiter(char delimiter) {
        return new CSVStrategy(delimiter, '"', '#', false, true);
    }

    /**
     * @see
     * com.microsoft.bingads.internal.bulk.file.BulkObjectWriter#writeObjectRow(com.microsoft.bingads.internal.bulk.file.BulkObject)
     */
    @Override
    public void writeObjectRow(BulkObject bulkObject) throws IOException {
        RowValues values = new RowValues();
        bulkObject.writeToRowValues(values);

        String type = bulkObjectFactory.getBulkRowType(bulkObject);
        values.put(StringTable.Type, type);

        this.csvWriter.write(values.getColumns());
        this.csvWriter.flush();
    }

    @Override
    public void close() throws IOException {
        this.csvWriter.close();
    }

}
