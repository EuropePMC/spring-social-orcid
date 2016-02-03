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
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}security-details" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}preferences" minOccurs="0"/>
 *         &lt;element name="group-orcid-identifier" type="{http://www.orcid.org/ns/orcid}orcid-id" minOccurs="0"/>
 *         &lt;element name="referred-by" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}salesforce-id" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}visibility"/>
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}scope"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface OrcidInternal {


    /**
     * Gets the value of the securityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityDetails }
     *     
     */
    SecurityDetails getSecurityDetails();

    /**
     * Sets the value of the securityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityDetails }
     *     
     */
    void setSecurityDetails(SecurityDetails value);

    /**
     * Gets the value of the preferences property.
     * 
     * @return
     *     possible object is
     *     {@link Preferences }
     *     
     */
    Preferences getPreferences();

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preferences }
     *     
     */
    void setPreferences(Preferences value);

    /**
     * Gets the value of the groupOrcidIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link OrcidId }
     *     
     */
    OrcidId getGroupOrcidIdentifier();

    /**
     * Sets the value of the groupOrcidIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrcidId }
     *     
     */
    void setGroupOrcidIdentifier(OrcidId value);

    /**
     * Gets the value of the referredBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getReferredBy();

    /**
     * Sets the value of the referredBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setReferredBy(String value);

    /**
     * Gets the value of the salesforceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSalesforceId();

    /**
     * Sets the value of the salesforceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSalesforceId(String value);

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Visibility }
     *     
     */
    Visibility getVisibility();

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visibility }
     *     
     */
    void setVisibility(Visibility value);

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link Scope }
     *     
     */
    Scope getScope();

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Scope }
     *     
     */
    void setScope(Scope value);

}
