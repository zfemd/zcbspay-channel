//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.21 at 04:56:21 PM CST 
//


package com.zcbspay.platform.channel.beps.bean.BusinessRejectNotice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RspnInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RspnInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sts" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.388.001.01}Max4Text"/>
 *         &lt;element name="RjctCd" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.388.001.01}Max4Text" minOccurs="0"/>
 *         &lt;element name="RjctInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.388.001.01}Max105Text" minOccurs="0"/>
 *         &lt;element name="PrcPty" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.388.001.01}Max14Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RspnInf1", propOrder = {
    "sts",
    "rjctCd",
    "rjctInf",
    "prcPty"
})
public class RspnInf1 {

    @XmlElement(name = "Sts", required = true)
    protected String sts;
    @XmlElement(name = "RjctCd")
    protected String rjctCd;
    @XmlElement(name = "RjctInf")
    protected String rjctInf;
    @XmlElement(name = "PrcPty")
    protected String prcPty;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSts(String value) {
        this.sts = value;
    }

    /**
     * Gets the value of the rjctCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctCd() {
        return rjctCd;
    }

    /**
     * Sets the value of the rjctCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRjctCd(String value) {
        this.rjctCd = value;
    }

    /**
     * Gets the value of the rjctInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctInf() {
        return rjctInf;
    }

    /**
     * Sets the value of the rjctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRjctInf(String value) {
        this.rjctInf = value;
    }

    /**
     * Gets the value of the prcPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcPty() {
        return prcPty;
    }

    /**
     * Sets the value of the prcPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcPty(String value) {
        this.prcPty = value;
    }

}
