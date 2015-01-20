package com.microsoft.bingads.api.test.entities.ads.product;

import java.util.Map;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import com.microsoft.bingads.internal.functionalInterfaces.Supplier;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.bulk.entities.BulkProductAd;
import com.microsoft.bingads.campaignmanagement.ProductAd;

public abstract class BulkProductAdTest extends BulkEntityTest<BulkProductAd> {

    @Override
    protected void onEntityCreation(BulkProductAd entity) {
        entity.setProductAd(new ProductAd());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkProductAd, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkProductAd>() {
            @Override
            public BulkProductAd get() {
                return new BulkProductAd();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkProductAd, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkProductAd>() {
            @Override
            public BulkProductAd get() {
                return new BulkProductAd();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkProductAd, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkProductAd>() {
            @Override
            public BulkProductAd get() {
                return new BulkProductAd();
            }
        });
    }
}
