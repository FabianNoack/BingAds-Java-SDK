package com.microsoft.bingads.api.test.entities.ad_extension.image;

import java.util.Map;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import com.microsoft.bingads.internal.functionalInterfaces.Supplier;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.bulk.entities.BulkImageAdExtension;
import com.microsoft.bingads.campaignmanagement.ImageAdExtension;

public abstract class BulkImageAdExtensionTest extends BulkEntityTest<BulkImageAdExtension> {

    @Override
    protected void onEntityCreation(BulkImageAdExtension entity) {
        entity.setImageAdExtension(new ImageAdExtension());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkImageAdExtension, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkImageAdExtension>() {
            @Override
            public BulkImageAdExtension get() {
                return new BulkImageAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkImageAdExtension, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkImageAdExtension>() {
            @Override
            public BulkImageAdExtension get() {
                return new BulkImageAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkImageAdExtension, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkImageAdExtension>() {
            @Override
            public BulkImageAdExtension get() {
                return new BulkImageAdExtension();
            }
        });
    }

}
