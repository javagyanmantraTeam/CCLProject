
package org.keybank.creditlimitserviceres;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditLimitServiceResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditLimitServiceResType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusBlock" type="{http://www.keybank.org/CreditLimitServiceRes}StatusBlockType"/>
 *         &lt;element name="CardDetail" type="{http://www.keybank.org/CreditLimitServiceRes}CardDetailType"/>
 *         &lt;element name="BalanceDetail" type="{http://www.keybank.org/CreditLimitServiceRes}BalanceDetailType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditLimitServiceResType", propOrder = {
    "statusBlock",
    "cardDetail",
    "balanceDetail"
})
public class CreditLimitServiceResType {

    @XmlElement(name = "StatusBlock", required = true)
    protected StatusBlockType statusBlock;
    @XmlElement(name = "CardDetail", required = true)
    protected CardDetailType cardDetail;
    @XmlElement(name = "BalanceDetail", required = true)
    protected BalanceDetailType balanceDetail;

    /**
     * Gets the value of the statusBlock property.
     * 
     * @return
     *     possible object is
     *     {@link StatusBlockType }
     *     
     */
    public StatusBlockType getStatusBlock() {
        return statusBlock;
    }

    /**
     * Sets the value of the statusBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusBlockType }
     *     
     */
    public void setStatusBlock(StatusBlockType value) {
        this.statusBlock = value;
    }

    /**
     * Gets the value of the cardDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CardDetailType }
     *     
     */
    public CardDetailType getCardDetail() {
        return cardDetail;
    }

    /**
     * Sets the value of the cardDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDetailType }
     *     
     */
    public void setCardDetail(CardDetailType value) {
        this.cardDetail = value;
    }

    /**
     * Gets the value of the balanceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceDetailType }
     *     
     */
    public BalanceDetailType getBalanceDetail() {
        return balanceDetail;
    }

    /**
     * Sets the value of the balanceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceDetailType }
     *     
     */
    public void setBalanceDetail(BalanceDetailType value) {
        this.balanceDetail = value;
    }

}
