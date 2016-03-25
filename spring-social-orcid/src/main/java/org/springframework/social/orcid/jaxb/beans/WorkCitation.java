//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 01:57:48 PM BST 
//


package org.springframework.social.orcid.jaxb.beans;



/**
 * Container for a work citation. Citations may be fielded (e.g., RIS, BibTeX - preferred citation type), or may be textual (APA, MLA, Chicago, etc.) The required work-citation-type element indicates the format of the citation.
 * 			
 * 
 * <p>Java class for citation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="work-citation-type" type="{http://www.orcid.org/ns/orcid}citation-type"/>
 *         &lt;element name="citation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface WorkCitation {


    /**
     * Gets the value of the workCitationType property.
     * 
     * @return
     *     possible object is
     *     {@link CitationType }
     *     
     */
    CitationType getWorkCitationType();

    /**
     * Sets the value of the workCitationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitationType }
     *     
     */
    void setWorkCitationType(CitationType value);

    /**
     * Gets the value of the citation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCitation();

    /**
     * Sets the value of the citation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCitation(String value);

}