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
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://www.orcid.org/ns/common}last-modified-date" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.orcid.org/ns/personal-details}name" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/other-name}other-names" minOccurs="0"/>
 *         &lt;element name="biography" type="{http://www.orcid.org/ns/personal-details}biography" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="path" type="{http://www.orcid.org/ns/common}element-path" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lastModifiedDate",
    "name",
    "otherNames",
    "biography"
})
@XmlRootElement(name = "personal-details", namespace = "http://www.orcid.org/ns/personal-details")
public class PersonalDetails
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "last-modified-date")
    protected LastModifiedDate lastModifiedDate;
    @XmlElement(namespace = "http://www.orcid.org/ns/personal-details")
    protected Name name;
    @XmlElement(name = "other-names", namespace = "http://www.orcid.org/ns/other-name")
    protected OtherNames otherNames;
    @XmlElement(namespace = "http://www.orcid.org/ns/personal-details")
    protected Biography biography;
    @XmlAttribute(name = "path")
    protected String path;

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link LastModifiedDate }
     *     
     */
    public LastModifiedDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastModifiedDate }
     *     
     */
    public void setLastModifiedDate(LastModifiedDate value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the otherNames property.
     * 
     * @return
     *     possible object is
     *     {@link OtherNames }
     *     
     */
    public OtherNames getOtherNames() {
        return otherNames;
    }

    /**
     * Sets the value of the otherNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherNames }
     *     
     */
    public void setOtherNames(OtherNames value) {
        this.otherNames = value;
    }

    /**
     * Gets the value of the biography property.
     * 
     * @return
     *     possible object is
     *     {@link Biography }
     *     
     */
    public Biography getBiography() {
        return biography;
    }

    /**
     * Sets the value of the biography property.
     * 
     * @param value
     *     allowed object is
     *     {@link Biography }
     *     
     */
    public void setBiography(Biography value) {
        this.biography = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

}
