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
 * ��������� ���������� ���������.  ��.������� ���������� ��������� ���������, ������������ �������� ������� ������ �� 12 ������ 2013 ���� � 107�.
 *
 * <p>Java class for BudgetPaymentInfoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BudgetPaymentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DrawerStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CBC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OKTMO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Reason" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TaxPeriod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DocNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DocDate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://directbank.1c.ru/XMLSchema}DateString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PayType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetPaymentInfoType", propOrder = {
        "drawerStatus",
        "cbc",
        "oktmo",
        "reason",
        "taxPeriod",
        "docNo",
        "docDate",
        "payType"
})
public class BudgetPaymentInfoType {

    @XmlElement(name = "DrawerStatus")
    protected String drawerStatus;
    @XmlElement(name = "CBC")
    protected String cbc;
    @XmlElement(name = "OKTMO")
    protected String oktmo;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "TaxPeriod")
    protected String taxPeriod;
    @XmlElement(name = "DocNo")
    protected String docNo;
    @XmlElement(name = "DocDate")
    protected String docDate;
    @XmlElement(name = "PayType")
    protected String payType;

    /**
     * Gets the value of the drawerStatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDrawerStatus() {
        return drawerStatus;
    }

    /**
     * Sets the value of the drawerStatus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDrawerStatus(String value) {
        this.drawerStatus = value;
    }

    /**
     * Gets the value of the cbc property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCBC() {
        return cbc;
    }

    /**
     * Sets the value of the cbc property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCBC(String value) {
        this.cbc = value;
    }

    /**
     * Gets the value of the oktmo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOKTMO(String value) {
        this.oktmo = value;
    }

    /**
     * Gets the value of the reason property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the taxPeriod property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTaxPeriod() {
        return taxPeriod;
    }

    /**
     * Sets the value of the taxPeriod property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTaxPeriod(String value) {
        this.taxPeriod = value;
    }

    /**
     * Gets the value of the docNo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocNo() {
        return docNo;
    }

    /**
     * Sets the value of the docNo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocNo(String value) {
        this.docNo = value;
    }

    /**
     * Gets the value of the docDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocDate(String value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the payType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPayType() {
        return payType;
    }

    /**
     * Sets the value of the payType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPayType(String value) {
        this.payType = value;
    }

}