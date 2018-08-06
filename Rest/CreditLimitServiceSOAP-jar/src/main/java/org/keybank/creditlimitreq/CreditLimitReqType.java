
package org.keybank.creditlimitreq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditLimitReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditLimitReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientContext" type="{http://www.keybank.org/CreditLimitReq}ClientContextType"/>
 *         &lt;element name="OfferDetail" type="{http://www.keybank.org/CreditLimitReq}OfferDetailType"/>
 *         &lt;element name="ServiceDetail" type="{http://www.keybank.org/CreditLimitReq}ServiceDetailType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditLimitReqType", propOrder = {
    "clientContext",
    "offerDetail",
    "serviceDetail"
})
public class CreditLimitReqType {

    @XmlElement(name = "ClientContext", required = true)
    protected ClientContextType clientContext;
    @XmlElement(name = "OfferDetail", required = true)
    protected OfferDetailType offerDetail;
    @XmlElement(name = "ServiceDetail", required = true)
    protected ServiceDetailType serviceDetail;

    /**
     * Gets the value of the clientContext property.
     * 
     * @return
     *     possible object is
     *     {@link ClientContextType }
     *     
     */
    public ClientContextType getClientContext() {
        return clientContext;
    }

    /**
     * Sets the value of the clientContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientContextType }
     *     
     */
    public void setClientContext(ClientContextType value) {
        this.clientContext = value;
    }

    /**
     * Gets the value of the offerDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OfferDetailType }
     *     
     */
    public OfferDetailType getOfferDetail() {
        return offerDetail;
    }

    /**
     * Sets the value of the offerDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDetailType }
     *     
     */
    public void setOfferDetail(OfferDetailType value) {
        this.offerDetail = value;
    }

    /**
     * Gets the value of the serviceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDetailType }
     *     
     */
    public ServiceDetailType getServiceDetail() {
        return serviceDetail;
    }

    /**
     * Sets the value of the serviceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDetailType }
     *     
     */
    public void setServiceDetail(ServiceDetailType value) {
        this.serviceDetail = value;
    }

}
