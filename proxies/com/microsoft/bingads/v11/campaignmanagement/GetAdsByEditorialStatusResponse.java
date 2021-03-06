
package com.microsoft.bingads.v11.campaignmanagement;

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
 *         &lt;element name="Ads" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfAd" minOccurs="0"/>
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
    "ads"
})
@XmlRootElement(name = "GetAdsByEditorialStatusResponse")
public class GetAdsByEditorialStatusResponse {

    @XmlElement(name = "Ads", nillable = true)
    protected ArrayOfAd ads;

    /**
     * Gets the value of the ads property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAd }
     *     
     */
    public ArrayOfAd getAds() {
        return ads;
    }

    /**
     * Sets the value of the ads property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAd }
     *     
     */
    public void setAds(ArrayOfAd value) {
        this.ads = value;
    }

}
