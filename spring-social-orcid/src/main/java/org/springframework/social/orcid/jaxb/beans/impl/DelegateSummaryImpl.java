//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 01:57:48 PM BST 
//


package org.springframework.social.orcid.jaxb.beans.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.social.orcid.jaxb.beans.CreditName;
import org.springframework.social.orcid.jaxb.beans.DelegateSummary;
import org.springframework.social.orcid.jaxb.beans.LastModifiedDate;
import org.springframework.social.orcid.jaxb.beans.OrcidId;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orcidIdentifier",
    "lastModifiedDate",
    "creditName"
})
@XmlRootElement(name = "delegate-summary")
public class DelegateSummaryImpl
    implements DelegateSummary
{

    @XmlElement(name = "orcid-identifier", required = true, type = OrcidIdImpl.class)
    protected OrcidIdImpl orcidIdentifier;
    @XmlElement(name = "last-modified-date", required = true, type = LastModifiedDateImpl.class)
    protected LastModifiedDateImpl lastModifiedDate;
    @XmlElement(name = "credit-name", type = CreditNameImpl.class)
    protected CreditNameImpl creditName;

    public OrcidId getOrcidIdentifier() {
        return orcidIdentifier;
    }

    public void setOrcidIdentifier(OrcidId value) {
        this.orcidIdentifier = ((OrcidIdImpl) value);
    }

    public LastModifiedDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LastModifiedDate value) {
        this.lastModifiedDate = ((LastModifiedDateImpl) value);
    }

    public CreditName getCreditName() {
        return creditName;
    }

    public void setCreditName(CreditName value) {
        this.creditName = ((CreditNameImpl) value);
    }

}
