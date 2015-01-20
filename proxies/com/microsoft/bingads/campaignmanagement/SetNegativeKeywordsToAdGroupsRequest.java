
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AdGroupNegativeKeywords" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfAdGroupNegativeKeywords" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "campaignId",
    "adGroupNegativeKeywords"
})
@XmlRootElement(name = "SetNegativeKeywordsToAdGroupsRequest")
public class SetNegativeKeywordsToAdGroupsRequest {

    @XmlElement(name = "CampaignId")
    protected Long campaignId;
    @XmlElement(name = "AdGroupNegativeKeywords", nillable = true)
    protected ArrayOfAdGroupNegativeKeywords adGroupNegativeKeywords;

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignId(Long value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the adGroupNegativeKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdGroupNegativeKeywords }
     *     
     */
    public ArrayOfAdGroupNegativeKeywords getAdGroupNegativeKeywords() {
        return adGroupNegativeKeywords;
    }

    /**
     * Sets the value of the adGroupNegativeKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdGroupNegativeKeywords }
     *     
     */
    public void setAdGroupNegativeKeywords(ArrayOfAdGroupNegativeKeywords value) {
        this.adGroupNegativeKeywords = value;
    }

}
