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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides detail of the nature of the contribution
 * 				by the collaborator or other contirbutor.
 * 			
 * 
 * <p>Java class for contributor-attributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contributor-attributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contributor-sequence" type="{http://www.orcid.org/ns/common}contributor-sequence" minOccurs="0"/>
 *         &lt;element name="contributor-role" type="{http://www.orcid.org/ns/common}contributor-role" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contributor-attributes", propOrder = {
    "contributorSequence",
    "contributorRole"
})
public class ContributorAttributes
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "contributor-sequence")
    @XmlSchemaType(name = "string")
    protected ContributorSequence contributorSequence;
    @XmlElement(name = "contributor-role")
    @XmlSchemaType(name = "string")
    protected ContributorRole contributorRole;

    /**
     * Gets the value of the contributorSequence property.
     * 
     * @return
     *     possible object is
     *     {@link ContributorSequence }
     *     
     */
    public ContributorSequence getContributorSequence() {
        return contributorSequence;
    }

    /**
     * Sets the value of the contributorSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributorSequence }
     *     
     */
    public void setContributorSequence(ContributorSequence value) {
        this.contributorSequence = value;
    }

    /**
     * Gets the value of the contributorRole property.
     * 
     * @return
     *     possible object is
     *     {@link ContributorRole }
     *     
     */
    public ContributorRole getContributorRole() {
        return contributorRole;
    }

    /**
     * Sets the value of the contributorRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributorRole }
     *     
     */
    public void setContributorRole(ContributorRole value) {
        this.contributorRole = value;
    }

}
