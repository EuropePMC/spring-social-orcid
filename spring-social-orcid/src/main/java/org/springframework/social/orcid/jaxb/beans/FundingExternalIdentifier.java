//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 01:57:48 PM BST 
//


package org.springframework.social.orcid.jaxb.beans;



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
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}funding-external-identifier-type"/>
 *         &lt;element name="funding-external-identifier-value" type="{http://www.orcid.org/ns/orcid}string2084" minOccurs="0"/>
 *         &lt;element name="funding-external-identifier-url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface FundingExternalIdentifier {


    /**
     * Gets the value of the fundingExternalIdentifierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getFundingExternalIdentifierType();

    /**
     * Sets the value of the fundingExternalIdentifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFundingExternalIdentifierType(String value);

    /**
     * Gets the value of the fundingExternalIdentifierValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getFundingExternalIdentifierValue();

    /**
     * Sets the value of the fundingExternalIdentifierValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFundingExternalIdentifierValue(String value);

    /**
     * Gets the value of the fundingExternalIdentifierUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getFundingExternalIdentifierUrl();

    /**
     * Sets the value of the fundingExternalIdentifierUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFundingExternalIdentifierUrl(String value);

}
