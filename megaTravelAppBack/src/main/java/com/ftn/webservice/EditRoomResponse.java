//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.29 at 12:41:45 PM CEST 
//


package com.ftn.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="accomodationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="editedRoom" type="{http://ftn.com/webservice}roomSoap"/>
 *         &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accomodationId",
    "editedRoom",
    "response"
})
@XmlRootElement(name = "EditRoomResponse")
public class EditRoomResponse {

    protected long accomodationId;
    @XmlElement(required = true)
    protected RoomSoap editedRoom;
    @XmlElement(required = true)
    protected String response;

    /**
     * Gets the value of the accomodationId property.
     * 
     */
    public long getAccomodationId() {
        return accomodationId;
    }

    /**
     * Sets the value of the accomodationId property.
     * 
     */
    public void setAccomodationId(long value) {
        this.accomodationId = value;
    }

    /**
     * Gets the value of the editedRoom property.
     * 
     * @return
     *     possible object is
     *     {@link RoomSoap }
     *     
     */
    public RoomSoap getEditedRoom() {
        return editedRoom;
    }

    /**
     * Sets the value of the editedRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomSoap }
     *     
     */
    public void setEditedRoom(RoomSoap value) {
        this.editedRoom = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponse(String value) {
        this.response = value;
    }

}
