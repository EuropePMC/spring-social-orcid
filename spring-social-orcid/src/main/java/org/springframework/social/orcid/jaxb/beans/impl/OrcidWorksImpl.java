//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 01:57:48 PM BST 
//


package org.springframework.social.orcid.jaxb.beans.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.social.orcid.jaxb.beans.OrcidWork;
import org.springframework.social.orcid.jaxb.beans.OrcidWorks;
import org.springframework.social.orcid.jaxb.beans.Scope;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orcidWorks"
})
@XmlRootElement(name = "orcid-works")
public class OrcidWorksImpl
    implements OrcidWorks
{

    @XmlElement(name = "orcid-work", type = OrcidWorkImpl.class)
    protected List<OrcidWork> orcidWorks;
    @XmlAttribute(name = "scope")
    protected Scope scope;

    public List<OrcidWork> getOrcidWorks() {
        if (orcidWorks == null) {
            orcidWorks = new ArrayList<OrcidWork>();
        }
        return this.orcidWorks;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope value) {
        this.scope = value;
    }

}
