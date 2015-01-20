package com.microsoft.bingads.api.test.entities.targets.campaign.bids.gender.read;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.gender.read.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.gender.read.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.gender.read.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.gender.BulkCampaignGenderTargetBidTest;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignGenderTargetBid;

@RunWith(Parameterized.class)
public class BulkCampaignGenderTargetReadFromRowValuesBidAdjustmentTest extends BulkCampaignGenderTargetBidTest {

    @Parameter(value = 1)
    public int expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123}            
        });
    }

    @Test
    public void testRead() {
        this.<Integer>testReadProperty("Bid Adjustment", this.datum, this.expectedResult, new Function<BulkCampaignGenderTargetBid, Integer>() {
            @Override
            public Integer apply(BulkCampaignGenderTargetBid c) {
                return c.getGenderTargetBid().getBidAdjustment();
            }
        });
    }
}
