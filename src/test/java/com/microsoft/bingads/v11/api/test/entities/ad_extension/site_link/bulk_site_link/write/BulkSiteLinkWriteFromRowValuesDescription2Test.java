package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.bulk_site_link.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.bulk_site_link.BulkSiteLinkTest;
import com.microsoft.bingads.v11.bulk.entities.BulkSiteLink;

public class BulkSiteLinkWriteFromRowValuesDescription2Test extends BulkSiteLinkTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test text", "Test text"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Sitelink Extension Description2", this.datum, this.expectedResult, new BiConsumer<BulkSiteLink, String>() {
            @Override
            public void accept(BulkSiteLink c, String v) {
                c.getSiteLink().setDescription2(v);
            }
        });
    }
}
