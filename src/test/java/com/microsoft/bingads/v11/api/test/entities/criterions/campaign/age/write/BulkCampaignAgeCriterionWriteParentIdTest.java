package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.age.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.age.BulkCampaignAgeCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignAgeCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignAgeCriterionWriteParentIdTest extends BulkCampaignAgeCriterionTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", 9223372036854775807L},
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Parent Id",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignAgeCriterion, Long>() {
                    @Override
                    public void accept(BulkCampaignAgeCriterion c, Long v) {
                        c.getBiddableCampaignCriterion().setCampaignId(v);
                    }
                }
        );
    }
}
