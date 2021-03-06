package com.microsoft.bingads.v12.api.test.entities.ad_extension.app.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.app.BulkAppAdExtensionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAppAdExtension;

public class BulkAppAdExtensionWriteFromRowValuesDevicePreferenceTest extends BulkAppAdExtensionTest {

    @Parameterized.Parameter(value = 1)
    public Long expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"All", 0L},
                {"Mobile", 30001L},
                {"All", null},
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Device Preference", this.datum, this.expectedResult, new BiConsumer<BulkAppAdExtension, Long>() {
            @Override
            public void accept(BulkAppAdExtension c, Long v) {
                c.getAppAdExtension().setDevicePreference(v);
            }
        });
    }
}
