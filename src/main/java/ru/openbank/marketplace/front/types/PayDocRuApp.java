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
 * ������ ���������� ���������
 *
 * <p>Java class for PayDocRuApp complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PayDocRuApp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://directbank.1c.ru/XMLSchema}PaymentDataType">
 *       &lt;sequence>
 *         &lt;element name="BudgetPaymentInfo" type="{http://directbank.1c.ru/XMLSchema}BudgetPaymentInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayDocRuApp", propOrder = {
        "budgetPaymentInfo"
})
public class PayDocRuApp
        extends PaymentDataType {

    @XmlElement(name = "BudgetPaymentInfo")
    protected BudgetPaymentInfoType budgetPaymentInfo;

    /**
     * Gets the value of the budgetPaymentInfo property.
     *
     * @return possible object is
     * {@link BudgetPaymentInfoType }
     */
    public BudgetPaymentInfoType getBudgetPaymentInfo() {
        return budgetPaymentInfo;
    }

    /**
     * Sets the value of the budgetPaymentInfo property.
     *
     * @param value allowed object is
     *              {@link BudgetPaymentInfoType }
     */
    public void setBudgetPaymentInfo(BudgetPaymentInfoType value) {
        this.budgetPaymentInfo = value;
    }

}
