//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.21 at 04:55:19 PM CST 
//


package com.zcbspay.platform.channel.beps.bean.batchpaymentbyagencyresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DbtrCdtrAgt1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DbtrCdtrAgt1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FIId" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.383.001.01}FIId1"/>
 *         &lt;element name="BrnchId" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.383.001.01}BrnchId1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DbtrCdtrAgt1", propOrder = {
    "fiId",
    "brnchId"
})
public class DbtrCdtrAgt1 {

    @XmlElement(name = "FIId", required = true)
    protected FIId1 fiId;
    @XmlElement(name = "BrnchId", required = true)
    protected BrnchId1 brnchId;

    /**
     * Gets the value of the fiId property.
     * 
     * @return
     *     possible object is
     *     {@link FIId1 }
     *     
     */
    public FIId1 getFIId() {
        return fiId;
    }

    /**
     * Sets the value of the fiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIId1 }
     *     
     */
    public void setFIId(FIId1 value) {
        this.fiId = value;
    }

    /**
     * Gets the value of the brnchId property.
     * 
     * @return
     *     possible object is
     *     {@link BrnchId1 }
     *     
     */
    public BrnchId1 getBrnchId() {
        return brnchId;
    }

    /**
     * Sets the value of the brnchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrnchId1 }
     *     
     */
    public void setBrnchId(BrnchId1 value) {
        this.brnchId = value;
    }

}
