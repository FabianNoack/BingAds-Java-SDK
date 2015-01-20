package com.microsoft.bingads.api.test.entities.bid_suggestion_data;

import java.util.Map;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import com.microsoft.bingads.internal.functionalInterfaces.Supplier;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.internal.bulk.entities.BulkKeywordBidSuggestion;

public abstract class BulkKeywordBidSuggestionTest extends BulkEntityTest<BulkKeywordBidSuggestion> {

    @Override
    protected void onEntityCreation(BulkKeywordBidSuggestion entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkKeywordBidSuggestion, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkKeywordBidSuggestion>() {
            @Override
            public BulkKeywordBidSuggestion get() {
                return new BulkKeywordBidSuggestion();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkKeywordBidSuggestion, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkKeywordBidSuggestion>() {
            @Override
            public BulkKeywordBidSuggestion get() {
                return new BulkKeywordBidSuggestion();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkKeywordBidSuggestion, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkKeywordBidSuggestion>() {
            @Override
            public BulkKeywordBidSuggestion get() {
                return new BulkKeywordBidSuggestion();
            }
        });
    }
}
