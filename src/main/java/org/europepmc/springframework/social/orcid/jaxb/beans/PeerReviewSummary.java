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
 *     &lt;extension base="{http://www.orcid.org/ns/common}element-summary">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.orcid.org/ns/common}external-ids" minOccurs="0"/>
 *         &lt;element name="completion-date" type="{http://www.orcid.org/ns/common}fuzzy-date"/>
 *         &lt;element name="review-group-id" type="{http://www.orcid.org/ns/common}group-id"/>
 *         &lt;element name="convening-organization" type="{http://www.orcid.org/ns/common}organization"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "externalIds",
    "completionDate",
    "reviewGroupId",
    "conveningOrganization"
})
@XmlRootElement(name = "peer-review-summary", namespace = "http://www.orcid.org/ns/peer-review")
public class PeerReviewSummary
    extends ElementSummary
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "external-ids")
    protected ExternalIds externalIds;
    @XmlElement(name = "completion-date", namespace = "http://www.orcid.org/ns/peer-review", required = true)
    protected FuzzyDate completionDate;
    @XmlElement(name = "review-group-id", namespace = "http://www.orcid.org/ns/peer-review", required = true)
    protected String reviewGroupId;
    @XmlElement(name = "convening-organization", namespace = "http://www.orcid.org/ns/peer-review", required = true)
    protected Organization conveningOrganization;

    /**
     * The unique generated identifier of the review.
     * 								
     * 
     * @return
     *     possible object is
     *     {@link ExternalIds }
     *     
     */
    public ExternalIds getExternalIds() {
        return externalIds;
    }

    /**
     * Sets the value of the externalIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIds }
     *     
     */
    public void setExternalIds(ExternalIds value) {
        this.externalIds = value;
    }

    /**
     * Gets the value of the completionDate property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyDate }
     *     
     */
    public FuzzyDate getCompletionDate() {
        return completionDate;
    }

    /**
     * Sets the value of the completionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyDate }
     *     
     */
    public void setCompletionDate(FuzzyDate value) {
        this.completionDate = value;
    }

    /**
     * Gets the value of the reviewGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewGroupId() {
        return reviewGroupId;
    }

    /**
     * Sets the value of the reviewGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewGroupId(String value) {
        this.reviewGroupId = value;
    }

    /**
     * Gets the value of the conveningOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getConveningOrganization() {
        return conveningOrganization;
    }

    /**
     * Sets the value of the conveningOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setConveningOrganization(Organization value) {
        this.conveningOrganization = value;
    }

}
