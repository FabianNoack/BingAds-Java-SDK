package com.microsoft.bingads.v11.internal.bulk;

import com.microsoft.bingads.v11.internal.bulk.StringTable;

import java.util.HashMap;
import java.util.Map;

/**
 * Creates and provides a column name to positional index mapping
 */
public class CsvHeaders {

    public final static String[] HiddenHeaders = {};

    public final static String[] Headers = new String[]{

            // common
            StringTable.Type,
            StringTable.Status,
            StringTable.Id,
            StringTable.ParentId,
            StringTable.SubType,
            StringTable.Campaign,
            StringTable.AdGroup,
            StringTable.Website,
            StringTable.SyncTime,
            StringTable.ClientId,
            StringTable.LastModifiedTime,

            // campaign
            StringTable.TimeZone,
            StringTable.BudgetId,
            StringTable.BudgetName,
            StringTable.Budget,
            StringTable.BudgetType,

            // Ad Group
            StringTable.StartDate,
            StringTable.EndDate,
            StringTable.NetworkDistribution,
            StringTable.PricingModel,
            StringTable.AdRotation,
            StringTable.SearchNetwork,
            StringTable.SearchBid,
            StringTable.ContentNetwork,
            StringTable.ContentBid,
            StringTable.Language,
            StringTable.PrivacyStatus,

            // Ads
            StringTable.Title,
            StringTable.Text,
            StringTable.DisplayUrl,
            StringTable.DestinationUrl,
            StringTable.BusinessName,
            StringTable.PhoneNumber,
            StringTable.PromotionalText,
            StringTable.EditorialStatus,
            StringTable.EditorialLocation,
            StringTable.EditorialTerm,
            StringTable.EditorialReasonCode,
            StringTable.EditorialAppealStatus,
            StringTable.DevicePreference,
            

            // Keywords
            StringTable.Keyword,
            StringTable.MatchType,
            StringTable.Bid,
            StringTable.Param1,
            StringTable.Param2,
            StringTable.Param3,

            // location target
            StringTable.Target,
            StringTable.PhysicalIntent,
            StringTable.TargetAll,
            StringTable.BidAdjustment,
            StringTable.RadiusTargetId,
            StringTable.Name,
            StringTable.OsNames,
            StringTable.Radius,
            StringTable.Unit,
            StringTable.BusinessId,

            // DayTime target
            StringTable.FromHour,
            StringTable.FromMinute,
            StringTable.ToHour,
            StringTable.ToMinute,
            
            // Profile Criterion
            StringTable.Profile,
            StringTable.ProfileId,

            // AdExtensions common
            StringTable.Version,
            StringTable.AdSchedule,
            StringTable.UseSearcherTimeZone,

            // Site link ad extensions
            StringTable.SiteLinkExtensionOrder,
            StringTable.SiteLinkDisplayText,
            StringTable.SiteLinkDestinationUrl,
            StringTable.SiteLinkDescription1,
            StringTable.SiteLinkDescription2,

            // Location ad extensions
            StringTable.GeoCodeStatus,
            StringTable.IconMediaId,
            StringTable.ImageMediaId,
            StringTable.AddressLine1,
            StringTable.AddressLine2,
            StringTable.PostalCode,
            StringTable.City,
            StringTable.StateOrProvince,
            StringTable.ProvinceName,
            StringTable.Latitude,
            StringTable.Longitude,

            // Call ad extensions
            StringTable.CountryCode,
            StringTable.IsCallOnly,
            StringTable.IsCallTrackingEnabled,
            StringTable.RequireTollFreeTrackingNumber,

            // Image ad extension
            StringTable.AltText,
            StringTable.MediaIds,
            StringTable.PublisherCountries,

            // Product target
            StringTable.BingMerchantCenterId,
            StringTable.BingMerchantCenterName,
            StringTable.ProductCondition1,
            StringTable.ProductValue1,
            StringTable.ProductCondition2,
            StringTable.ProductValue2,
            StringTable.ProductCondition3,
            StringTable.ProductValue3,
            StringTable.ProductCondition4,
            StringTable.ProductValue4,
            StringTable.ProductCondition5,
            StringTable.ProductValue5,
            StringTable.ProductCondition6,
            StringTable.ProductValue6,
            StringTable.ProductCondition7,
            StringTable.ProductValue7,
            StringTable.ProductCondition8,
            StringTable.ProductValue8,

            // BI
            StringTable.Spend,
            StringTable.Impressions,
            StringTable.Clicks,
            StringTable.CTR,
            StringTable.AvgCPC,
            StringTable.AvgCPM,
            StringTable.AvgPosition,
            StringTable.Conversions,
            StringTable.CPA,
            StringTable.QualityScore,
            StringTable.KeywordRelevance,
            StringTable.LandingPageRelevance,
            StringTable.LandingPageUserExperience,

            // App Ad Extension
            StringTable.AppPlatform,
            StringTable.AppStoreId,
            StringTable.IsTrackingEnabled,

            StringTable.Error,
            StringTable.ErrorNumber,
            StringTable.FieldPath,

            // Bing Shopping Campaigns
            StringTable.IsExcluded,
            StringTable.ParentAdGroupCriterionId,
            StringTable.CampaignType,
            StringTable.CampaignPriority,
            StringTable.LocalInventoryAdsEnabled,
            
            // CoOp
            StringTable.BidOption,
            StringTable.BidBoostValue,
            StringTable.MaximumBid,
            
            //Upgrade Url
            StringTable.FinalUrl,
            StringTable.FinalMobileUrl,
            StringTable.TrackingTemplate,
            StringTable.CustomParameter,

            // Review Ad Extension
            StringTable.IsExact,
            StringTable.Source,
            StringTable.Url,

            // Price Ad Extension
            StringTable.PriceExtensionType,
            StringTable.CurrencyCode1,
            StringTable.CurrencyCode2,
            StringTable.CurrencyCode3,
            StringTable.CurrencyCode4,
            StringTable.CurrencyCode5,
            StringTable.CurrencyCode6,
            StringTable.CurrencyCode7,
            StringTable.CurrencyCode8,
            StringTable.PriceDescription1,
            StringTable.PriceDescription2,
            StringTable.PriceDescription3,
            StringTable.PriceDescription4,
            StringTable.PriceDescription5,
            StringTable.PriceDescription6,
            StringTable.PriceDescription7,
            StringTable.PriceDescription8,
            StringTable.Header1,
            StringTable.Header2,
            StringTable.Header3,
            StringTable.Header4,
            StringTable.Header5,
            StringTable.Header6,
            StringTable.Header7,
            StringTable.Header8,
            StringTable.FinalMobileUrl1,
            StringTable.FinalMobileUrl2,
            StringTable.FinalMobileUrl3,
            StringTable.FinalMobileUrl4,
            StringTable.FinalMobileUrl5,
            StringTable.FinalMobileUrl6,
            StringTable.FinalMobileUrl7,
            StringTable.FinalMobileUrl8,
            StringTable.FinalUrl1,
            StringTable.FinalUrl2,
            StringTable.FinalUrl3,
            StringTable.FinalUrl4,
            StringTable.FinalUrl5,
            StringTable.FinalUrl6,
            StringTable.FinalUrl7,
            StringTable.FinalUrl8,
            StringTable.Price1,
            StringTable.Price2,
            StringTable.Price3,
            StringTable.Price4,
            StringTable.Price5,
            StringTable.Price6,
            StringTable.Price7,
            StringTable.Price8,
            StringTable.PriceQualifier1,
            StringTable.PriceQualifier2,
            StringTable.PriceQualifier3,
            StringTable.PriceQualifier4,
            StringTable.PriceQualifier5,
            StringTable.PriceQualifier6,
            StringTable.PriceQualifier7,
            StringTable.PriceQualifier8,
            StringTable.PriceUnit1,
            StringTable.PriceUnit2,
            StringTable.PriceUnit3,
            StringTable.PriceUnit4,
            StringTable.PriceUnit5,
            StringTable.PriceUnit6,
            StringTable.PriceUnit7,
            StringTable.PriceUnit8,

            // Callout Ad Extension
            StringTable.CalloutText,
            
            // AutoBidding
            StringTable.BidStrategyType,
            StringTable.BidStrategyMaxCpc,
            StringTable.BidStrategyTargetCpa,
            StringTable.InheritedBidStrategyType,
            
            // Target and bid
            StringTable.TargetSetting,
            
            // Native Preference
            StringTable.NativePreference,
            
            // Remarketing
            StringTable.Audience,
            StringTable.AudienceId,
            StringTable.Description,
            StringTable.MembershipDuration,
            StringTable.Scope,
            StringTable.TagId,
            StringTable.RemarketingTargetingSetting,
            StringTable.RemarketingRule,
            StringTable.AudienceSearchSize,
            StringTable.AudienceNetworkSize,
            StringTable.SupportedCampaignTypes,
            StringTable.ProductAudienceType,

            // Structured Snippet Ad Extension
            StringTable.StructuredSnippetHeader,
            StringTable.StructuredSnippetValues,
            
            // Expanded Text Ad
            StringTable.TitlePart1,
            StringTable.TitlePart2,
            StringTable.Path1,
            StringTable.Path2,
            
            // Responsive Ad
            StringTable.CallToAction,
            StringTable.Headline,
            StringTable.LandscapeImageMediaId,
            StringTable.LandscapeLogoMediaId,
            StringTable.LongHeadline,
            StringTable.SquareImageMediaId,
            StringTable.SquareLogoMediaId,
            
            // Dynamic Search Ad
            StringTable.DomainLanguage,
            StringTable.DynamicAdTargetCondition1,
            StringTable.DynamicAdTargetCondition2,
            StringTable.DynamicAdTargetCondition3,
            StringTable.DynamicAdTargetValue1,
            StringTable.DynamicAdTargetValue2,
            StringTable.DynamicAdTargetValue3,

            // Labels
            StringTable.ColorCode,
            StringTable.Label,

            // Offline Conversions
            StringTable.ConversionCurrencyCode,
            StringTable.ConversionName,
            StringTable.ConversionTime,
            StringTable.ConversionValue,
            StringTable.MicrosoftClickId,
            
            // Account
            StringTable.MSCLKIDAutoTaggingEnabled,

    };

    private static final Map<String, Integer> columnIndexMap = initializeMap();

    public static Map<String, Integer> getMappings() {
        return columnIndexMap;
    }

    /**
     * Get index for a given column name
     *
     * @param columnName
     * @return the index
     */
    public static int GetColumnIndex(String columnName) {
        if (!columnIndexMap.containsKey(columnName)) {
            throw new IllegalArgumentException(String.format("Column name %s is not present in headers.", columnName));
        }

        Integer index = columnIndexMap.get(columnName);
        return index.intValue();
    }

    /**
     * maps column name into its positional index
     *
     * @return a map to positional indices
     */
    private static Map<String, Integer> initializeMap() {
        Map<String, Integer> mapping = new HashMap<String, Integer>();

        for (int i = 0; i < CsvHeaders.Headers.length; i++) {
            mapping.put(CsvHeaders.Headers[i], new Integer(i));
        }

        return mapping;
    }
}
