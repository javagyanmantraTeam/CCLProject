
package org.keybank.creditlimitserviceres;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.keybank.creditlimitserviceres package. 
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

    private final static QName _CreditLimitServiceRes_QNAME = new QName("http://www.keybank.org/CreditLimitServiceRes", "CreditLimitServiceRes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.keybank.creditlimitserviceres
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreditLimitServiceResType }
     * 
     */
    public CreditLimitServiceResType createCreditLimitServiceResType() {
        return new CreditLimitServiceResType();
    }

    /**
     * Create an instance of {@link BalanceDetailType }
     * 
     */
    public BalanceDetailType createBalanceDetailType() {
        return new BalanceDetailType();
    }

    /**
     * Create an instance of {@link CardType }
     * 
     */
    public CardType createCardType() {
        return new CardType();
    }

    /**
     * Create an instance of {@link StatusBlockType }
     * 
     */
    public StatusBlockType createStatusBlockType() {
        return new StatusBlockType();
    }

    /**
     * Create an instance of {@link CardDetailType }
     * 
     */
    public CardDetailType createCardDetailType() {
        return new CardDetailType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditLimitServiceResType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.keybank.org/CreditLimitServiceRes", name = "CreditLimitServiceRes")
    public JAXBElement<CreditLimitServiceResType> createCreditLimitServiceRes(CreditLimitServiceResType value) {
        return new JAXBElement<CreditLimitServiceResType>(_CreditLimitServiceRes_QNAME, CreditLimitServiceResType.class, null, value);
    }

}
