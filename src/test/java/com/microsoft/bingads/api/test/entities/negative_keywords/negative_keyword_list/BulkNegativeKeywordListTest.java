package com.microsoft.bingads.api.test.entities.negative_keywords.negative_keyword_list;

import java.util.Map;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import com.microsoft.bingads.internal.functionalInterfaces.Supplier;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.bulk.entities.BulkNegativeKeywordList;
import com.microsoft.bingads.campaignmanagement.NegativeKeywordList;

public abstract class BulkNegativeKeywordListTest extends BulkEntityTest<BulkNegativeKeywordList> {

    @Override
    protected void onEntityCreation(BulkNegativeKeywordList entity) {
        entity.setNegativeKeywordList(new NegativeKeywordList());;
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkNegativeKeywordList, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkNegativeKeywordList>() {
            @Override
            public BulkNegativeKeywordList get() {
                return new BulkNegativeKeywordList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkNegativeKeywordList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkNegativeKeywordList>() {
            @Override
            public BulkNegativeKeywordList get() {
                return new BulkNegativeKeywordList();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkNegativeKeywordList, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkNegativeKeywordList>() {
            @Override
            public BulkNegativeKeywordList get() {
                return new BulkNegativeKeywordList();
            }
        });
    }
}
