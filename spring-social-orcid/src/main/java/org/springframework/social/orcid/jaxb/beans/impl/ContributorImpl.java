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

import org.springframework.social.orcid.jaxb.beans.Contributor;
import org.springframework.social.orcid.jaxb.beans.ContributorAttributes;
import org.springframework.social.orcid.jaxb.beans.ContributorEmail;
import org.springframework.social.orcid.jaxb.beans.CreditName;
import org.springframework.social.orcid.jaxb.beans.OrcidId;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contributorOrcid",
    "creditName",
    "contributorEmail",
    "contributorAttributes"
})
@XmlRootElement(name = "contributor")
public class ContributorImpl
    implements Contributor
{

    @XmlElement(name = "contributor-orcid", type = OrcidIdImpl.class)
    protected OrcidIdImpl contributorOrcid;
    @XmlElement(name = "credit-name", type = CreditNameImpl.class)
    protected CreditNameImpl creditName;
    @XmlElement(name = "contributor-email", type = ContributorEmailImpl.class)
    protected ContributorEmailImpl contributorEmail;
    @XmlElement(name = "contributor-attributes", type = ContributorAttributesImpl.class)
    protected ContributorAttributesImpl contributorAttributes;

    public OrcidId getContributorOrcid() {
        return contributorOrcid;
    }

    public void setContributorOrcid(OrcidId value) {
        this.contributorOrcid = ((OrcidIdImpl) value);
    }

    public CreditName getCreditName() {
        return creditName;
    }

    public void setCreditName(CreditName value) {
        this.creditName = ((CreditNameImpl) value);
    }

    public ContributorEmail getContributorEmail() {
        return contributorEmail;
    }

    public void setContributorEmail(ContributorEmail value) {
        this.contributorEmail = ((ContributorEmailImpl) value);
    }

    public ContributorAttributes getContributorAttributes() {
        return contributorAttributes;
    }

    public void setContributorAttributes(ContributorAttributes value) {
        this.contributorAttributes = ((ContributorAttributesImpl) value);
    }

}
