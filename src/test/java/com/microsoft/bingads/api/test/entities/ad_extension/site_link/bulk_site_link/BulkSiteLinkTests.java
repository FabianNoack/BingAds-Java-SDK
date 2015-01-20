package com.microsoft.bingads.api.test.entities.ad_extension.site_link.bulk_site_link;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.api.test.entities.ad_extension.site_link.bulk_site_link.read.BulkSiteLinkReadTests;
import com.microsoft.bingads.api.test.entities.ad_extension.site_link.bulk_site_link.write.BulkSiteLinkWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkSiteLinkReadTests.class, BulkSiteLinkWriteTests.class})
public class BulkSiteLinkTests {

}
