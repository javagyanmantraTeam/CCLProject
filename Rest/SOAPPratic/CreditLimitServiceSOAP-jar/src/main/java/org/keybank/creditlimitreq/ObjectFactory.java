
package org.keybank.creditlimitreq;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.keybank.creditlimitreq package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreditLimitReq_QNAME = new QName("http://www.keybank.org/CreditLimitReq", "CreditLimitReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.keybank.creditlimitreq
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreditLimitReqType }
     * 
     */
    public CreditLimitReqType createCreditLimitReqType() {
        return new CreditLimitReqType();
    }

    /**
     * Create an instance of {@link OfferDetailType }
     * 
     */
    public OfferDetailType createOfferDetailType() {
        return new OfferDetailType();
    }

    /**
     * Create an instance of {@link ServiceDetailType }
     * 
     */
    public ServiceDetailType createServiceDetailType() {
        return new ServiceDetailType();
    }

    /**
     * Create an instance of {@link ClientContextType }
     * 
     */
    public ClientContextType createClientContextType() {
        return new ClientContextType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditLimitReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.keybank.org/CreditLimitReq", name = "CreditLimitReq")
    public JAXBElement<CreditLimitReqType> createCreditLimitReq(CreditLimitReqType value) {
        return new JAXBElement<CreditLimitReqType>(_CreditLimitReq_QNAME, CreditLimitReqType.class, null, value);
    }

}
