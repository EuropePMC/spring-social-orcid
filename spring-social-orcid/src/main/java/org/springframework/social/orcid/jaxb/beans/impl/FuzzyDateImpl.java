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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.springframework.social.orcid.jaxb.beans.Day;
import org.springframework.social.orcid.jaxb.beans.FuzzyDate;
import org.springframework.social.orcid.jaxb.beans.Month;
import org.springframework.social.orcid.jaxb.beans.Year;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fuzzy-date", propOrder = {
    "year",
    "month",
    "day"
})
@XmlSeeAlso({
    PublicationDateImpl.class
})
public class FuzzyDateImpl
    implements FuzzyDate
{

    @XmlElement(required = true, type = YearImpl.class)
    protected YearImpl year;
    @XmlElement(type = MonthImpl.class)
    protected MonthImpl month;
    @XmlElement(type = DayImpl.class)
    protected DayImpl day;

    public Year getYear() {
        return year;
    }

    public void setYear(Year value) {
        this.year = ((YearImpl) value);
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month value) {
        this.month = ((MonthImpl) value);
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day value) {
        this.day = ((DayImpl) value);
    }

}