//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.22 at 11:07:40 AM IST 
//


package com.sreenutech.scema.res;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusBeans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusBeans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statucCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statucMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusBeans", propOrder = {
    "statucCode",
    "statucMsg"
})
public class StatusBeans {

    @XmlElement(required = true)
    protected String statucCode;
    @XmlElement(required = true)
    protected String statucMsg;

    /**
     * Gets the value of the statucCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatucCode() {
        return statucCode;
    }

    /**
     * Sets the value of the statucCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatucCode(String value) {
        this.statucCode = value;
    }

    /**
     * Gets the value of the statucMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatucMsg() {
        return statucMsg;
    }

    /**
     * Sets the value of the statucMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatucMsg(String value) {
        this.statucMsg = value;
    }

}
