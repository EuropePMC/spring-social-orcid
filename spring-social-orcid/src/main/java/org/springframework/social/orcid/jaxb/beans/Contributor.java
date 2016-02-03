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
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}contributor-orcid" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}credit-name" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}contributor-email" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}contributor-attributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Contributor {


    /**
     * Gets the value of the contributorOrcid property.
     * 
     * @return
     *     possible object is
     *     {@link OrcidId }
     *     
     */
    OrcidId getContributorOrcid();

    /**
     * Sets the value of the contributorOrcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrcidId }
     *     
     */
    void setContributorOrcid(OrcidId value);

    /**
     * Gets the value of the creditName property.
     * 
     * @return
     *     possible object is
     *     {@link CreditName }
     *     
     */
    CreditName getCreditName();

    /**
     * Sets the value of the creditName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditName }
     *     
     */
    void setCreditName(CreditName value);

    /**
     * Gets the value of the contributorEmail property.
     * 
     * @return
     *     possible object is
     *     {@link ContributorEmail }
     *     
     */
    ContributorEmail getContributorEmail();

    /**
     * Sets the value of the contributorEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributorEmail }
     *     
     */
    void setContributorEmail(ContributorEmail value);

    /**
     * Gets the value of the contributorAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ContributorAttributes }
     *     
     */
    ContributorAttributes getContributorAttributes();

    /**
     * Sets the value of the contributorAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributorAttributes }
     *     
     */
    void setContributorAttributes(ContributorAttributes value);

}
