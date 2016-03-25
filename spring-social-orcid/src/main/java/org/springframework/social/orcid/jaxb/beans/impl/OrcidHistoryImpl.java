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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import org.springframework.social.orcid.jaxb.beans.Claimed;
import org.springframework.social.orcid.jaxb.beans.CompletionDate;
import org.springframework.social.orcid.jaxb.beans.CreationMethod;
import org.springframework.social.orcid.jaxb.beans.DeactivationDate;
import org.springframework.social.orcid.jaxb.beans.LastModifiedDate;
import org.springframework.social.orcid.jaxb.beans.OrcidHistory;
import org.springframework.social.orcid.jaxb.beans.Source;
import org.springframework.social.orcid.jaxb.beans.SubmissionDate;
import org.springframework.social.orcid.jaxb.beans.Visibility;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creationMethod",
    "completionDate",
    "submissionDate",
    "lastModifiedDate",
    "claimed",
    "source",
    "deactivationDate",
    "verifiedEmail",
    "verifiedPrimaryEmail"
})
@XmlRootElement(name = "orcid-history")
public class OrcidHistoryImpl
    implements OrcidHistory
{

    @XmlElement(name = "creation-method")
    @XmlSchemaType(name = "string")
    protected CreationMethod creationMethod;
    @XmlElement(name = "completion-date", type = CompletionDateImpl.class)
    protected CompletionDateImpl completionDate;
    @XmlElement(name = "submission-date", type = SubmissionDateImpl.class)
    protected SubmissionDateImpl submissionDate;
    @XmlElement(name = "last-modified-date", type = LastModifiedDateImpl.class)
    protected LastModifiedDateImpl lastModifiedDate;
    @XmlElement(type = ClaimedImpl.class)
    protected ClaimedImpl claimed;
    @XmlElement(type = SourceImpl.class)
    protected SourceImpl source;
    @XmlElement(name = "deactivation-date", type = DeactivationDateImpl.class)
    protected DeactivationDateImpl deactivationDate;
    @XmlElement(name = "verified-email")
    protected boolean verifiedEmail;
    @XmlElement(name = "verified-primary-email")
    protected boolean verifiedPrimaryEmail;
    @XmlAttribute(name = "visibility")
    protected Visibility visibility;

    public CreationMethod getCreationMethod() {
        return creationMethod;
    }

    public void setCreationMethod(CreationMethod value) {
        this.creationMethod = value;
    }

    public CompletionDate getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(CompletionDate value) {
        this.completionDate = ((CompletionDateImpl) value);
    }

    public SubmissionDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(SubmissionDate value) {
        this.submissionDate = ((SubmissionDateImpl) value);
    }

    public LastModifiedDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LastModifiedDate value) {
        this.lastModifiedDate = ((LastModifiedDateImpl) value);
    }

    public Claimed getClaimed() {
        return claimed;
    }

    public void setClaimed(Claimed value) {
        this.claimed = ((ClaimedImpl) value);
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source value) {
        this.source = ((SourceImpl) value);
    }

    public DeactivationDate getDeactivationDate() {
        return deactivationDate;
    }

    public void setDeactivationDate(DeactivationDate value) {
        this.deactivationDate = ((DeactivationDateImpl) value);
    }

    public boolean isVerifiedEmail() {
        return verifiedEmail;
    }

    public void setVerifiedEmail(boolean value) {
        this.verifiedEmail = value;
    }

    public boolean isVerifiedPrimaryEmail() {
        return verifiedPrimaryEmail;
    }

    public void setVerifiedPrimaryEmail(boolean value) {
        this.verifiedPrimaryEmail = value;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility value) {
        this.visibility = value;
    }

}