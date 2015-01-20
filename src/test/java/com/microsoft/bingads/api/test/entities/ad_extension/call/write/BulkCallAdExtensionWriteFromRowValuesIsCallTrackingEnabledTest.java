package com.microsoft.bingads.api.test.entities.ad_extension.call.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ad_extension.call.BulkCallAdExtensionTest;
import com.microsoft.bingads.bulk.entities.BulkCallAdExtension;

@RunWith(Parameterized.class)
public class BulkCallAdExtensionWriteFromRowValuesIsCallTrackingEnabledTest extends BulkCallAdExtensionTest {

    @Parameter(value = 1)
    public Boolean expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"True", true},
            {"False", false},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Boolean>testWriteProperty("Toll Free", this.datum, this.expectedResult, new BiConsumer<BulkCallAdExtension, Boolean>() {
            @Override
            public void accept(BulkCallAdExtension c, Boolean v) {
                c.getCallAdExtension().setRequireTollFreeTrackingNumber(v);
            }
        });
    }
}
