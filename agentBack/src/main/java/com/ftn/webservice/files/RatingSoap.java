//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.29 at 12:49:28 PM CEST 
//


package com.ftn.webservice.files;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ratingSoap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ratingSoap"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ratingMark" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="user" type="{http://ftn.com/webservice}userSoap"/&gt;
 *         &lt;element name="room" type="{http://ftn.com/webservice}roomSoap"/&gt;
 *         &lt;element name="approved" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ratingSoap", propOrder = {
    "id",
    "comment",
    "ratingMark",
    "user",
    "room",
    "approved"
})
public class RatingSoap {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long id;
    @XmlElement(required = true)
    protected String comment;
    protected int ratingMark;
    @XmlElement(required = true)
    protected UserSoap user;
    @XmlElement(required = true)
    protected RoomSoap room;
    protected boolean approved;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the ratingMark property.
     * 
     */
    public int getRatingMark() {
        return ratingMark;
    }

    /**
     * Sets the value of the ratingMark property.
     * 
     */
    public void setRatingMark(int value) {
        this.ratingMark = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserSoap }
     *     
     */
    public UserSoap getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSoap }
     *     
     */
    public void setUser(UserSoap value) {
        this.user = value;
    }

    /**
     * Gets the value of the room property.
     * 
     * @return
     *     possible object is
     *     {@link RoomSoap }
     *     
     */
    public RoomSoap getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomSoap }
     *     
     */
    public void setRoom(RoomSoap value) {
        this.room = value;
    }

    /**
     * Gets the value of the approved property.
     * 
     */
    public boolean isApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     */
    public void setApproved(boolean value) {
        this.approved = value;
    }

}
