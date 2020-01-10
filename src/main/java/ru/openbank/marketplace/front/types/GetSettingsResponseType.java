//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.10 at 02:20:56 PM EET 
//


package ru.openbank.marketplace.front.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetSettingsResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetSettingsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Data">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *                 &lt;attribute name="dockind" use="required" type="{http://directbank.1c.ru/XMLSchema}DocKindType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://directbank.1c.ru/XMLSchema}IDType" />
 *       &lt;attribute name="formatVersion" use="required" type="{http://directbank.1c.ru/XMLSchema}FormatVersionType" />
 *       &lt;attribute name="creationDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="userAgent" type="{http://directbank.1c.ru/XMLSchema}UserAgentType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSettingsResponseType", propOrder = {
        "data"
})
@XmlSeeAlso({
        SuccessResultType.GetSettingsResponse.class
})
public class GetSettingsResponseType {

    @XmlElement(name = "Data", required = true)
    protected GetSettingsResponseType.Data data;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "formatVersion", required = true)
    protected String formatVersion;
    @XmlAttribute(name = "creationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlAttribute(name = "userAgent")
    protected String userAgent;

    /**
     * Gets the value of the data property.
     *
     * @return possible object is
     * {@link GetSettingsResponseType.Data }
     */
    public GetSettingsResponseType.Data getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     *
     * @param value allowed object is
     *              {@link GetSettingsResponseType.Data }
     */
    public void setData(GetSettingsResponseType.Data value) {
        this.data = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the formatVersion property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFormatVersion() {
        return formatVersion;
    }

    /**
     * Sets the value of the formatVersion property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFormatVersion(String value) {
        this.formatVersion = value;
    }

    /**
     * Gets the value of the creationDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the userAgent property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Sets the value of the userAgent property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUserAgent(String value) {
        this.userAgent = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
     *       &lt;attribute name="dockind" use="required" type="{http://directbank.1c.ru/XMLSchema}DocKindType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    public static class Data {

        @XmlValue
        protected byte[] value;
        @XmlAttribute(name = "dockind", required = true)
        protected String dockind;

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * byte[]
         */
        public byte[] getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              byte[]
         */
        public void setValue(byte[] value) {
            this.value = value;
        }

        /**
         * Gets the value of the dockind property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getDockind() {
            return dockind;
        }

        /**
         * Sets the value of the dockind property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDockind(String value) {
            this.dockind = value;
        }

    }

}
