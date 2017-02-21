//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.21 at 04:55:00 PM CST 
//


package com.zcbspay.platform.channel.beps.bean.batchcollectionchargesresponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BtchColltnChrgsRspnInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BtchColltnChrgsRspnInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RcvgTtlAmt" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.381.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="RcvgTtlNb" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.381.001.01}Max8NumericText"/>
 *         &lt;element name="OrgnlTxTpCd" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.381.001.01}Max4Text"/>
 *         &lt;element name="CdtrAgt" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.381.001.01}CdtrAgt1"/>
 *         &lt;element name="Cdtr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.381.001.01}DbtrCdtr1"/>
 *         &lt;element name="CdtrAcct" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.381.001.01}DbtrCdtrAcct1"/>
 *         &lt;element name="RcvgDtls" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.381.001.01}RcvgDtls1" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BtchColltnChrgsRspnInf1", propOrder = {
    "rcvgTtlAmt",
    "rcvgTtlNb",
    "orgnlTxTpCd",
    "cdtrAgt",
    "cdtr",
    "cdtrAcct",
    "rcvgDtls"
})
public class BtchColltnChrgsRspnInf1 {

    @XmlElement(name = "RcvgTtlAmt", required = true)
    protected ActiveCurrencyAndAmount rcvgTtlAmt;
    @XmlElement(name = "RcvgTtlNb", required = true)
    protected String rcvgTtlNb;
    @XmlElement(name = "OrgnlTxTpCd", required = true)
    protected String orgnlTxTpCd;
    @XmlElement(name = "CdtrAgt", required = true)
    protected CdtrAgt1 cdtrAgt;
    @XmlElement(name = "Cdtr", required = true)
    protected DbtrCdtr1 cdtr;
    @XmlElement(name = "CdtrAcct", required = true)
    protected DbtrCdtrAcct1 cdtrAcct;
    @XmlElement(name = "RcvgDtls", required = true)
    protected List<RcvgDtls1> rcvgDtls;

    /**
     * Gets the value of the rcvgTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRcvgTtlAmt() {
        return rcvgTtlAmt;
    }

    /**
     * Sets the value of the rcvgTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRcvgTtlAmt(ActiveCurrencyAndAmount value) {
        this.rcvgTtlAmt = value;
    }

    /**
     * Gets the value of the rcvgTtlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvgTtlNb() {
        return rcvgTtlNb;
    }

    /**
     * Sets the value of the rcvgTtlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvgTtlNb(String value) {
        this.rcvgTtlNb = value;
    }

    /**
     * Gets the value of the orgnlTxTpCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlTxTpCd() {
        return orgnlTxTpCd;
    }

    /**
     * Sets the value of the orgnlTxTpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlTxTpCd(String value) {
        this.orgnlTxTpCd = value;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link CdtrAgt1 }
     *     
     */
    public CdtrAgt1 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdtrAgt1 }
     *     
     */
    public void setCdtrAgt(CdtrAgt1 value) {
        this.cdtrAgt = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link DbtrCdtr1 }
     *     
     */
    public DbtrCdtr1 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DbtrCdtr1 }
     *     
     */
    public void setCdtr(DbtrCdtr1 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link DbtrCdtrAcct1 }
     *     
     */
    public DbtrCdtrAcct1 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DbtrCdtrAcct1 }
     *     
     */
    public void setCdtrAcct(DbtrCdtrAcct1 value) {
        this.cdtrAcct = value;
    }

    /**
     * Gets the value of the rcvgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcvgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcvgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RcvgDtls1 }
     * 
     * 
     */
    public List<RcvgDtls1> getRcvgDtls() {
        if (rcvgDtls == null) {
            rcvgDtls = new ArrayList<RcvgDtls1>();
        }
        return this.rcvgDtls;
    }

}
