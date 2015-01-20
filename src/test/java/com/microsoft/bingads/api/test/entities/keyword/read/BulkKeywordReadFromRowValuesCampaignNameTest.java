package com.microsoft.bingads.api.test.entities.keyword.read;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.bulk.entities.BulkKeyword;

public class BulkKeywordReadFromRowValuesCampaignNameTest extends BulkKeywordTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test AdGroup 1", "Test AdGroup 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Campaign", this.datum, this.expectedResult, new Function<BulkKeyword, String>() {
            @Override
            public String apply(BulkKeyword c) {
                return c.getCampaignName();
            }
        });
    }
}
