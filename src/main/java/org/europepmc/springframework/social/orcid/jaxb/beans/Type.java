//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.03 at 11:16:50 AM BST 
//


package org.europepmc.springframework.social.orcid.jaxb.beans;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="review"/>
 *     &lt;enumeration value="evaluation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "type", namespace = "http://www.orcid.org/ns/peer-review")
@XmlEnum
public enum Type {


    /**
     * An expert assessment of a scholarly output that
     * 						contributes to a decision regarding on the object of the review.
     * 					
     * 
     */
    @XmlEnumValue("review")
    REVIEW("review"),

    /**
     * 
     * 						A post­peer review, expert evaluation of a
     * 						scholarly output.
     * 					
     * 
     */
    @XmlEnumValue("evaluation")
    EVALUATION("evaluation");
    private final String value;

    Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type fromValue(String v) {
        for (Type c: Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
