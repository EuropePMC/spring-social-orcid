//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 01:57:48 PM BST 
//


package org.springframework.social.orcid.jaxb.beans.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import org.springframework.social.orcid.jaxb.beans.LanguageCode;
import org.springframework.social.orcid.jaxb.beans.StringWithLangCode;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stringWithLangCode", propOrder = {
    "value"
})
@XmlSeeAlso({
    TranslatedTitleImpl.class
})
public class StringWithLangCodeImpl
    implements StringWithLangCode
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "language-code", required = true)
    protected LanguageCode languageCode;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(LanguageCode value) {
        this.languageCode = value;
    }

}