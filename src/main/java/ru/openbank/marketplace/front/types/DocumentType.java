//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.10 at 05:04:50 PM EET 
//


package ru.openbank.marketplace.front.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for DocumentType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Data">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *                 &lt;attribute name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="contentType" type="{http://directbank.1c.ru/XMLSchema}ContentType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Signature" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SignedData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="x509IssuerName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="x509SerialNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://directbank.1c.ru/XMLSchema}IDType" />
 *       &lt;attribute name="dockind" use="required" type="{http://directbank.1c.ru/XMLSchema}DocKindType" />
 *       &lt;attribute name="formatVersion" use="required" type="{http://directbank.1c.ru/XMLSchema}FormatVersionType" />
 *       &lt;attribute name="testOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="compressed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="signResponse" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="notifyRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="extID" type="{http://directbank.1c.ru/XMLSchema}IDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = {
        "data",
        "signature"
})
public class DocumentType {

    @XmlElement(name = "Data", required = true)
    protected DocumentType.Data data;
    @XmlElement(name = "Signature")
    protected List<DocumentType.Signature> signature;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "dockind", required = true)
    protected String dockind;
    @XmlAttribute(name = "formatVersion", required = true)
    protected String formatVersion;
    @XmlAttribute(name = "testOnly")
    protected Boolean testOnly;
    @XmlAttribute(name = "compressed")
    protected Boolean compressed;
    @XmlAttribute(name = "encrypted")
    protected Boolean encrypted;
    @XmlAttribute(name = "signResponse")
    protected Boolean signResponse;
    @XmlAttribute(name = "notifyRequired")
    protected Boolean notifyRequired;
    @XmlAttribute(name = "extID")
    protected String extID;

    /**
     * Gets the value of the data property.
     *
     * @return possible object is
     * {@link DocumentType.Data }
     */
    public DocumentType.Data getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     *
     * @param value allowed object is
     *              {@link DocumentType.Data }
     */
    public void setData(DocumentType.Data value) {
        this.data = value;
    }

    /**
     * Gets the value of the signature property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signature property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignature().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType.Signature }
     */
    public List<DocumentType.Signature> getSignature() {
        if (signature == null) {
            signature = new ArrayList<DocumentType.Signature>();
        }
        return this.signature;
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
     * Gets the value of the testOnly property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTestOnly() {
        return testOnly;
    }

    /**
     * Sets the value of the testOnly property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTestOnly(Boolean value) {
        this.testOnly = value;
    }

    /**
     * Gets the value of the compressed property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isCompressed() {
        return compressed;
    }

    /**
     * Sets the value of the compressed property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setCompressed(Boolean value) {
        this.compressed = value;
    }

    /**
     * Gets the value of the encrypted property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * Sets the value of the encrypted property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setEncrypted(Boolean value) {
        this.encrypted = value;
    }

    /**
     * Gets the value of the signResponse property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSignResponse() {
        return signResponse;
    }

    /**
     * Sets the value of the signResponse property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSignResponse(Boolean value) {
        this.signResponse = value;
    }

    /**
     * Gets the value of the notifyRequired property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isNotifyRequired() {
        return notifyRequired;
    }

    /**
     * Sets the value of the notifyRequired property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setNotifyRequired(Boolean value) {
        this.notifyRequired = value;
    }

    /**
     * Gets the value of the extID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExtID() {
        return extID;
    }

    /**
     * Sets the value of the extID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExtID(String value) {
        this.extID = value;
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
     *       &lt;attribute name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="contentType" type="{http://directbank.1c.ru/XMLSchema}ContentType" />
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
        @XmlAttribute(name = "fileName")
        protected String fileName;
        @XmlAttribute(name = "contentType")
        protected ContentType contentType;

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
         * Gets the value of the fileName property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

        /**
         * Gets the value of the contentType property.
         *
         * @return possible object is
         * {@link ContentType }
         */
        public ContentType getContentType() {
            return contentType;
        }

        /**
         * Sets the value of the contentType property.
         *
         * @param value allowed object is
         *              {@link ContentType }
         */
        public void setContentType(ContentType value) {
            this.contentType = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SignedData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
     *       &lt;/sequence>
     *       &lt;attribute name="x509IssuerName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="x509SerialNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "signedData"
    })
    public static class Signature {

        @XmlElement(name = "SignedData", required = true)
        protected byte[] signedData;
        @XmlAttribute(name = "x509IssuerName", required = true)
        protected String x509IssuerName;
        @XmlAttribute(name = "x509SerialNumber", required = true)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected byte[] x509SerialNumber;

        /**
         * Gets the value of the signedData property.
         *
         * @return possible object is
         * byte[]
         */
        public byte[] getSignedData() {
            return signedData;
        }

        /**
         * Sets the value of the signedData property.
         *
         * @param value allowed object is
         *              byte[]
         */
        public void setSignedData(byte[] value) {
            this.signedData = value;
        }

        /**
         * Gets the value of the x509IssuerName property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getX509IssuerName() {
            return x509IssuerName;
        }

        /**
         * Sets the value of the x509IssuerName property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setX509IssuerName(String value) {
            this.x509IssuerName = value;
        }

        /**
         * Gets the value of the x509SerialNumber property.
         *
         * @return possible object is
         * {@link String }
         */
        public byte[] getX509SerialNumber() {
            return x509SerialNumber;
        }

        /**
         * Sets the value of the x509SerialNumber property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setX509SerialNumber(byte[] value) {
            this.x509SerialNumber = value;
        }

    }

}
