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

import org.springframework.social.orcid.jaxb.beans.ApprovalDate;
import org.springframework.social.orcid.jaxb.beans.DelegateSummary;
import org.springframework.social.orcid.jaxb.beans.DelegationDetails;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "approvalDate",
    "delegateSummary"
})
@XmlRootElement(name = "delegation-details")
public class DelegationDetailsImpl
    implements DelegationDetails
{

    @XmlElement(name = "approval-date", required = true, type = ApprovalDateImpl.class)
    protected ApprovalDateImpl approvalDate;
    @XmlElement(name = "delegate-summary", required = true, type = DelegateSummaryImpl.class)
    protected DelegateSummaryImpl delegateSummary;

    public ApprovalDate getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(ApprovalDate value) {
        this.approvalDate = ((ApprovalDateImpl) value);
    }

    public DelegateSummary getDelegateSummary() {
        return delegateSummary;
    }

    public void setDelegateSummary(DelegateSummary value) {
        this.delegateSummary = ((DelegateSummaryImpl) value);
    }

}
