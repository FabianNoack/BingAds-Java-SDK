
package com.microsoft.bingads.v12.bulk;

import java.util.Calendar;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="CompressionType" type="{https://bingads.microsoft.com/CampaignManagement/v12}CompressionType" minOccurs="0"/>
 *         &lt;element name="DataScope" type="{https://bingads.microsoft.com/CampaignManagement/v12}DataScope" minOccurs="0"/>
 *         &lt;element name="DownloadEntities" type="{https://bingads.microsoft.com/CampaignManagement/v12}ArrayOfDownloadEntity" minOccurs="0"/>
 *         &lt;element name="DownloadFileType" type="{https://bingads.microsoft.com/CampaignManagement/v12}DownloadFileType" minOccurs="0"/>
 *         &lt;element name="FormatVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastSyncTimeInUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PerformanceStatsDateRange" type="{https://bingads.microsoft.com/CampaignManagement/v12}PerformanceStatsDateRange" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountIds",
    "compressionType",
    "dataScope",
    "downloadEntities",
    "downloadFileType",
    "formatVersion",
    "lastSyncTimeInUTC",
    "performanceStatsDateRange"
})
@XmlRootElement(name = "DownloadCampaignsByAccountIdsRequest")
public class DownloadCampaignsByAccountIdsRequest {

    @XmlElement(name = "AccountIds", nillable = true)
    protected ArrayOflong accountIds;
    @XmlElement(name = "CompressionType", nillable = true)
    @XmlSchemaType(name = "string")
    protected CompressionType compressionType;
    @XmlElement(name = "DataScope", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Collection<DataScope> dataScope;
    @XmlElement(name = "DownloadEntities", nillable = true)
    protected ArrayOfDownloadEntity downloadEntities;
    @XmlElement(name = "DownloadFileType", nillable = true)
    @XmlSchemaType(name = "string")
    protected DownloadFileType downloadFileType;
    @XmlElement(name = "FormatVersion", nillable = true)
    protected String formatVersion;
    @XmlElement(name = "LastSyncTimeInUTC", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastSyncTimeInUTC;
    @XmlElement(name = "PerformanceStatsDateRange", nillable = true)
    protected PerformanceStatsDateRange performanceStatsDateRange;

    /**
     * Gets the value of the accountIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getAccountIds() {
        return accountIds;
    }

    /**
     * Sets the value of the accountIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setAccountIds(ArrayOflong value) {
        this.accountIds = value;
    }

    /**
     * Gets the value of the compressionType property.
     * 
     * @return
     *     possible object is
     *     {@link CompressionType }
     *     
     */
    public CompressionType getCompressionType() {
        return compressionType;
    }

    /**
     * Sets the value of the compressionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionType }
     *     
     */
    public void setCompressionType(CompressionType value) {
        this.compressionType = value;
    }

    /**
     * Gets the value of the dataScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<DataScope> getDataScope() {
        return dataScope;
    }

    /**
     * Sets the value of the dataScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataScope(Collection<DataScope> value) {
        this.dataScope = value;
    }

    /**
     * Gets the value of the downloadEntities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDownloadEntity }
     *     
     */
    public ArrayOfDownloadEntity getDownloadEntities() {
        return downloadEntities;
    }

    /**
     * Sets the value of the downloadEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDownloadEntity }
     *     
     */
    public void setDownloadEntities(ArrayOfDownloadEntity value) {
        this.downloadEntities = value;
    }

    /**
     * Gets the value of the downloadFileType property.
     * 
     * @return
     *     possible object is
     *     {@link DownloadFileType }
     *     
     */
    public DownloadFileType getDownloadFileType() {
        return downloadFileType;
    }

    /**
     * Sets the value of the downloadFileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DownloadFileType }
     *     
     */
    public void setDownloadFileType(DownloadFileType value) {
        this.downloadFileType = value;
    }

    /**
     * Gets the value of the formatVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatVersion() {
        return formatVersion;
    }

    /**
     * Sets the value of the formatVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatVersion(String value) {
        this.formatVersion = value;
    }

    /**
     * Gets the value of the lastSyncTimeInUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastSyncTimeInUTC() {
        return lastSyncTimeInUTC;
    }

    /**
     * Sets the value of the lastSyncTimeInUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSyncTimeInUTC(Calendar value) {
        this.lastSyncTimeInUTC = value;
    }

    /**
     * Gets the value of the performanceStatsDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceStatsDateRange }
     *     
     */
    public PerformanceStatsDateRange getPerformanceStatsDateRange() {
        return performanceStatsDateRange;
    }

    /**
     * Sets the value of the performanceStatsDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceStatsDateRange }
     *     
     */
    public void setPerformanceStatsDateRange(PerformanceStatsDateRange value) {
        this.performanceStatsDateRange = value;
    }

}
