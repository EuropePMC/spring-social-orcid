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
 * <p>Java class for locale.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="locale">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="en"/>
 *     &lt;enumeration value="es"/>
 *     &lt;enumeration value="fr"/>
 *     &lt;enumeration value="ko"/>
 *     &lt;enumeration value="pt"/>
 *     &lt;enumeration value="ru"/>
 *     &lt;enumeration value="zh_CN"/>
 *     &lt;enumeration value="zh_TW"/>
 *     &lt;enumeration value="it"/>
 *     &lt;enumeration value="ja"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "locale")
@XmlEnum
public enum Locale {

    @XmlEnumValue("en")
    EN("en"),
    @XmlEnumValue("es")
    ES("es"),
    @XmlEnumValue("fr")
    FR("fr"),
    @XmlEnumValue("ko")
    KO("ko"),
    @XmlEnumValue("pt")
    PT("pt"),
    @XmlEnumValue("ru")
    RU("ru"),
    @XmlEnumValue("zh_CN")
    ZH_CN("zh_CN"),
    @XmlEnumValue("zh_TW")
    ZH_TW("zh_TW"),
    @XmlEnumValue("it")
    IT("it"),
    @XmlEnumValue("ja")
    JA("ja");
    private final String value;

    Locale(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Locale fromValue(String v) {
        for (Locale c: Locale.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
