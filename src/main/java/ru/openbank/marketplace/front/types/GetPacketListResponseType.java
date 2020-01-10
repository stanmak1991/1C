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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for GetPacketListResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetPacketListResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PacketID" type="{http://directbank.1c.ru/XMLSchema}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TimeStampLastPacket" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPacketListResponseType", propOrder = {
        "packetID"
})
public class GetPacketListResponseType {

    @XmlElement(name = "PacketID")
    protected List<String> packetID;
    @XmlAttribute(name = "TimeStampLastPacket")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStampLastPacket;

    /**
     * Gets the value of the packetID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packetID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPacketID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getPacketID() {
        if (packetID == null) {
            packetID = new ArrayList<String>();
        }
        return this.packetID;
    }

    /**
     * Gets the value of the timeStampLastPacket property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getTimeStampLastPacket() {
        return timeStampLastPacket;
    }

    /**
     * Sets the value of the timeStampLastPacket property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setTimeStampLastPacket(XMLGregorianCalendar value) {
        this.timeStampLastPacket = value;
    }

}