
package org.keybank.creditlimitserviceres;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="eligibalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceDetailType", propOrder = {
    "currentLimit",
    "eligibalAmount"
})
public class BalanceDetailType {

    protected double currentLimit;
    protected double eligibalAmount;

    /**
     * Gets the value of the currentLimit property.
     * 
     */
    public double getCurrentLimit() {
        return currentLimit;
    }

    /**
     * Sets the value of the currentLimit property.
     * 
     */
    public void setCurrentLimit(double value) {
        this.currentLimit = value;
    }

    /**
     * Gets the value of the eligibalAmount property.
     * 
     */
    public double getEligibalAmount() {
        return eligibalAmount;
    }

    /**
     * Sets the value of the eligibalAmount property.
     * 
     */
    public void setEligibalAmount(double value) {
        this.eligibalAmount = value;
    }

}
