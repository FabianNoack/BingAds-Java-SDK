package com.microsoft.bingads.api.test.entities.adgroup;

import java.util.Map;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import com.microsoft.bingads.internal.functionalInterfaces.Supplier;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.campaignmanagement.AdGroup;

public abstract class BulkAdGroupTest extends BulkEntityTest<BulkAdGroup> {

    @Override
    protected void onEntityCreation(BulkAdGroup entity) {
        entity.setAdGroup(new AdGroup());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAdGroup, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAdGroup>() {
            @Override
            public BulkAdGroup get() {
                return new BulkAdGroup();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAdGroup, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroup>() {
            @Override
            public BulkAdGroup get() {
                return new BulkAdGroup();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAdGroup, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroup>() {
            @Override
            public BulkAdGroup get() {
                return new BulkAdGroup();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAdGroup, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAdGroup>() {
            @Override
            public BulkAdGroup get() {
                return new BulkAdGroup();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAdGroup, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAdGroup>() {
            @Override
            public BulkAdGroup get() {
                return new BulkAdGroup();
            }
        }, comparer);
    }
}
