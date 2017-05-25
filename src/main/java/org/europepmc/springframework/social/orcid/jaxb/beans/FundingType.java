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
 * <p>Java class for funding-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="funding-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="grant"/>
 *     &lt;enumeration value="contract"/>
 *     &lt;enumeration value="award"/>
 *     &lt;enumeration value="salary-award"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "funding-type", namespace = "http://www.orcid.org/ns/funding")
@XmlEnum
public enum FundingType {

    @XmlEnumValue("grant")
    GRANT("grant"),
    @XmlEnumValue("contract")
    CONTRACT("contract"),
    @XmlEnumValue("award")
    AWARD("award"),
    @XmlEnumValue("salary-award")
    SALARY_AWARD("salary-award");
    private final String value;

    FundingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FundingType fromValue(String v) {
        for (FundingType c: FundingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
