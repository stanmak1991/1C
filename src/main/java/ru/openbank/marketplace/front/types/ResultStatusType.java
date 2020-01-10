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
 * <p>Java class for ResultStatusType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ResultStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Error" type="{http://directbank.1c.ru/XMLSchema}ErrorType"/>
 *         &lt;element name="Status" type="{http://directbank.1c.ru/XMLSchema}StatusType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultStatusType", propOrder = {
        "error",
        "status"
})
public class ResultStatusType {

    @XmlElement(name = "Error")
    protected ErrorType error;
    @XmlElement(name = "Status")
    protected StatusType status;

    /**
     * Gets the value of the error property.
     *
     * @return possible object is
     * {@link ErrorType }
     */
    public ErrorType getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     *
     * @param value allowed object is
     *              {@link ErrorType }
     */
    public void setError(ErrorType value) {
        this.error = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return possible object is
     * {@link StatusType }
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is
     *              {@link StatusType }
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

}