//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.03 at 11:16:50 AM BST 
//


package org.europepmc.springframework.social.orcid.jaxb.beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collaborator or other contributor to a work or
 * 				other orcid-activity
 * 			
 * 
 * <p>Java class for contributor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contributor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.orcid.org/ns/common}contributor-orcid" minOccurs="0"/>
 *         &lt;element name="credit-name" type="{http://www.orcid.org/ns/common}credit-name" minOccurs="0"/>
 *         &lt;element name="contributor-email" type="{http://www.orcid.org/ns/common}contributor-email" minOccurs="0"/>
 *         &lt;element name="contributor-attributes" type="{http://www.orcid.org/ns/funding}contributor-attributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contributor", namespace = "http://www.orcid.org/ns/funding", propOrder = {
    "contributorOrcid",
    "creditName",
    "contributorEmail",
    "contributorAttributes"
})
public class Contributor
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "contributor-orcid", namespace = "http://www.orcid.org/ns/common")
    protected OrcidId contributorOrcid;
    @XmlElement(name = "credit-name")
    protected CreditName creditName;
    @XmlElement(name = "contributor-email")
    protected ContributorEmail contributorEmail;
    @XmlElement(name = "contributor-attributes")
    protected ContributorAttributes2 contributorAttributes;

    /**
     * Gets the value of the contributorOrcid property.
     * 
     * @return
     *     possible object is
     *     {@link OrcidId }
     *     
     */
    public OrcidId getContributorOrcid() {
        return contributorOrcid;
    }

    /**
     * Sets the value of the contributorOrcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrcidId }
     *     
     */
    public void setContributorOrcid(OrcidId value) {
        this.contributorOrcid = value;
    }

    /**
     * Gets the value of the creditName property.
     * 
     * @return
     *     possible object is
     *     {@link CreditName }
     *     
     */
    public CreditName getCreditName() {
        return creditName;
    }

    /**
     * Sets the value of the creditName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditName }
     *     
     */
    public void setCreditName(CreditName value) {
        this.creditName = value;
    }

    /**
     * Gets the value of the contributorEmail property.
     * 
     * @return
     *     possible object is
     *     {@link ContributorEmail }
     *     
     */
    public ContributorEmail getContributorEmail() {
        return contributorEmail;
    }

    /**
     * Sets the value of the contributorEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributorEmail }
     *     
     */
    public void setContributorEmail(ContributorEmail value) {
        this.contributorEmail = value;
    }

    /**
     * Gets the value of the contributorAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ContributorAttributes2 }
     *     
     */
    public ContributorAttributes2 getContributorAttributes() {
        return contributorAttributes;
    }

    /**
     * Sets the value of the contributorAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributorAttributes2 }
     *     
     */
    public void setContributorAttributes(ContributorAttributes2 value) {
        this.contributorAttributes = value;
    }

}
