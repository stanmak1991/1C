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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * ������ ������������� ������
 *
 * <p>Java class for MemOrderApp complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MemOrderApp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SpareField5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Author" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://directbank.1c.ru/XMLSchema}BankType">
 *                 &lt;sequence>
 *                   &lt;element name="Branch" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccountNameDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountDebit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://directbank.1c.ru/XMLSchema}AccNumType">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Sum" type="{http://directbank.1c.ru/XMLSchema}SumType"/>
 *         &lt;element name="SpareField9a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountNameCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountCredit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://directbank.1c.ru/XMLSchema}AccNumType">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PartialTransitionKind" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SpareField14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpareField15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransitionContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpareField20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemOrderApp", propOrder = {
        "docNo",
        "docDate",
        "spareField5",
        "author",
        "accountNameDebit",
        "accountDebit",
        "sum",
        "spareField9A",
        "accountNameCredit",
        "accountCredit",
        "partialTransitionKind",
        "spareField14",
        "spareField15",
        "transitionContent",
        "spareField20"
})
public class MemOrderApp {

    @XmlElement(name = "DocNo", required = true)
    protected String docNo;
    @XmlElement(name = "DocDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDate;
    @XmlElement(name = "SpareField5")
    protected String spareField5;
    @XmlElement(name = "Author")
    protected MemOrderApp.Author author;
    @XmlElement(name = "AccountNameDebit")
    protected String accountNameDebit;
    @XmlElement(name = "AccountDebit")
    protected String accountDebit;
    @XmlElement(name = "Sum", required = true)
    protected BigDecimal sum;
    @XmlElement(name = "SpareField9a")
    protected String spareField9A;
    @XmlElement(name = "AccountNameCredit")
    protected String accountNameCredit;
    @XmlElement(name = "AccountCredit")
    protected String accountCredit;
    @XmlElement(name = "PartialTransitionKind")
    protected String partialTransitionKind;
    @XmlElement(name = "SpareField14")
    protected String spareField14;
    @XmlElement(name = "SpareField15")
    protected String spareField15;
    @XmlElement(name = "TransitionContent")
    protected String transitionContent;
    @XmlElement(name = "SpareField20")
    protected String spareField20;

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
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the spareField5 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSpareField5() {
        return spareField5;
    }

    /**
     * Sets the value of the spareField5 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSpareField5(String value) {
        this.spareField5 = value;
    }

    /**
     * Gets the value of the author property.
     *
     * @return possible object is
     * {@link MemOrderApp.Author }
     */
    public MemOrderApp.Author getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     *
     * @param value allowed object is
     *              {@link MemOrderApp.Author }
     */
    public void setAuthor(MemOrderApp.Author value) {
        this.author = value;
    }

    /**
     * Gets the value of the accountNameDebit property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAccountNameDebit() {
        return accountNameDebit;
    }

    /**
     * Sets the value of the accountNameDebit property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAccountNameDebit(String value) {
        this.accountNameDebit = value;
    }

    /**
     * Gets the value of the accountDebit property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAccountDebit() {
        return accountDebit;
    }

    /**
     * Sets the value of the accountDebit property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAccountDebit(String value) {
        this.accountDebit = value;
    }

    /**
     * Gets the value of the sum property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setSum(BigDecimal value) {
        this.sum = value;
    }

    /**
     * Gets the value of the spareField9A property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSpareField9A() {
        return spareField9A;
    }

    /**
     * Sets the value of the spareField9A property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSpareField9A(String value) {
        this.spareField9A = value;
    }

    /**
     * Gets the value of the accountNameCredit property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAccountNameCredit() {
        return accountNameCredit;
    }

    /**
     * Sets the value of the accountNameCredit property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAccountNameCredit(String value) {
        this.accountNameCredit = value;
    }

    /**
     * Gets the value of the accountCredit property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAccountCredit() {
        return accountCredit;
    }

    /**
     * Sets the value of the accountCredit property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAccountCredit(String value) {
        this.accountCredit = value;
    }

    /**
     * Gets the value of the partialTransitionKind property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPartialTransitionKind() {
        return partialTransitionKind;
    }

    /**
     * Sets the value of the partialTransitionKind property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPartialTransitionKind(String value) {
        this.partialTransitionKind = value;
    }

    /**
     * Gets the value of the spareField14 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSpareField14() {
        return spareField14;
    }

    /**
     * Sets the value of the spareField14 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSpareField14(String value) {
        this.spareField14 = value;
    }

    /**
     * Gets the value of the spareField15 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSpareField15() {
        return spareField15;
    }

    /**
     * Sets the value of the spareField15 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSpareField15(String value) {
        this.spareField15 = value;
    }

    /**
     * Gets the value of the transitionContent property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTransitionContent() {
        return transitionContent;
    }

    /**
     * Sets the value of the transitionContent property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTransitionContent(String value) {
        this.transitionContent = value;
    }

    /**
     * Gets the value of the spareField20 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSpareField20() {
        return spareField20;
    }

    /**
     * Sets the value of the spareField20 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSpareField20(String value) {
        this.spareField20 = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://directbank.1c.ru/XMLSchema}BankType">
     *       &lt;sequence>
     *         &lt;element name="Branch" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "branch"
    })
    public static class Author
            extends BankType {

        @XmlElement(name = "Branch")
        protected String branch;

        /**
         * Gets the value of the branch property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getBranch() {
            return branch;
        }

        /**
         * Sets the value of the branch property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setBranch(String value) {
            this.branch = value;
        }

    }

}