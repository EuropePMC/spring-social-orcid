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
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}deprecated-date"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}primary-record"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface OrcidDeprecated {


    /**
     * Gets the value of the deprecatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DeprecatedDate }
     *     
     */
    DeprecatedDate getDeprecatedDate();

    /**
     * Sets the value of the deprecatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeprecatedDate }
     *     
     */
    void setDeprecatedDate(DeprecatedDate value);

    /**
     * Gets the value of the primaryRecord property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryRecord }
     *     
     */
    PrimaryRecord getPrimaryRecord();

    /**
     * Sets the value of the primaryRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryRecord }
     *     
     */
    void setPrimaryRecord(PrimaryRecord value);

}
