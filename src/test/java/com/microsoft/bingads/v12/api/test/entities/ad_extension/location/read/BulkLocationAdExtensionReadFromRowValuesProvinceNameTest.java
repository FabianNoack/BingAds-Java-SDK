package com.microsoft.bingads.v12.api.test.entities.ad_extension.location.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.location.BulkLocationAdExtensionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkLocationAdExtension;

public class BulkLocationAdExtensionReadFromRowValuesProvinceNameTest extends BulkLocationAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test text", "Test text"}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Province Name", this.datum, this.expectedResult, new Function<BulkLocationAdExtension, String>() {
            @Override
            public String apply(BulkLocationAdExtension c) {
                return c.getLocationAdExtension().getAddress().getProvinceName();
            }
        });
    }
}
