package com.microsoft.bingads.api.test.entities.adgroup.read;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.campaignmanagement.PricingModel;

@RunWith(Parameterized.class)
public class BulkAdGroupReadFromRowValuesPricingModelTest extends BulkAdGroupTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public PricingModel expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"CPC", PricingModel.CPC},
            {"CPM", PricingModel.CPM},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<PricingModel>testReadProperty("Pricing Model", this.datum, this.expectedResult, new Function<BulkAdGroup, PricingModel>() {
            @Override
            public PricingModel apply(BulkAdGroup c) {
                return c.getAdGroup().getPricingModel();
            }
        });
    }
}
