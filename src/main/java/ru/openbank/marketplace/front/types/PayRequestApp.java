//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.10 at 05:04:50 PM EET 
//


package ru.openbank.marketplace.front.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ������ ���������� ����������
 *
 * <p>Java class for PayRequestApp complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PayRequestApp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://directbank.1c.ru/XMLSchema}PaymentDataType">
 *       &lt;sequence>
 *         &lt;element name="PaymentCondition">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AcceptTerm" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *         &lt;element name="DocDispatchDate" type="{http://directbank.1c.ru/XMLSchema}DateString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayRequestApp", propOrder = {
        "paymentCondition",
        "acceptTerm",
        "docDispatchDate"
})
public class PayRequestApp
        extends PaymentDataType {

    @XmlElement(name = "PaymentCondition", required = true)
    protected String paymentCondition;
    @XmlElement(name = "AcceptTerm")
    protected Byte acceptTerm;
    @XmlElement(name = "DocDispatchDate")
    protected String docDispatchDate;

    /**
     * Gets the value of the paymentCondition property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPaymentCondition() {
        return paymentCondition;
    }

    /**
     * Sets the value of the paymentCondition property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPaymentCondition(String value) {
        this.paymentCondition = value;
    }

    /**
     * Gets the value of the acceptTerm property.
     *
     * @return possible object is
     * {@link Byte }
     */
    public Byte getAcceptTerm() {
        return acceptTerm;
    }

    /**
     * Sets the value of the acceptTerm property.
     *
     * @param value allowed object is
     *              {@link Byte }
     */
    public void setAcceptTerm(Byte value) {
        this.acceptTerm = value;
    }

    /**
     * Gets the value of the docDispatchDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocDispatchDate() {
        return docDispatchDate;
    }

    /**
     * Sets the value of the docDispatchDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocDispatchDate(String value) {
        this.docDispatchDate = value;
    }

}
