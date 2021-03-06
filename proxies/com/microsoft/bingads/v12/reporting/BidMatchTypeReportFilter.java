package com.microsoft.bingads.v12.reporting;

/**
 * Enum class for BidMatchTypeReportFilter.
 */
public enum BidMatchTypeReportFilter {

    EXACT("Exact"),
    PHRASE("Phrase"),
    BROAD("Broad");
        
    private final String value;

    BidMatchTypeReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BidMatchTypeReportFilter fromValue(String v) {
        for (BidMatchTypeReportFilter c : BidMatchTypeReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}