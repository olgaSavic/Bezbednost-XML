//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.21 at 08:06:31 PM CEST 
//


package com.ftn.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accomodationSoap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accomodationSoap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://ftn.com/webservice}citySoap"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="typeAccomodation" type="{http://ftn.com/webservice}typeAccomodationSoap"/>
 *         &lt;element name="category" type="{http://ftn.com/webservice}categorySoap"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rooms" type="{http://ftn.com/webservice}roomSoap" maxOccurs="unbounded"/>
 *         &lt;element name="additionalServices" type="{http://ftn.com/webservice}additionalServicesSoap" maxOccurs="unbounded"/>
 *         &lt;element name="agent" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accomodationSoap", propOrder = {
    "id",
    "name",
    "city",
    "address",
    "typeAccomodation",
    "category",
    "description",
    "pic",
    "rooms",
    "additionalServices",
    "agent"
})
public class AccomodationSoap {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected CitySoap city;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected TypeAccomodationSoap typeAccomodation;
    @XmlElement(required = true)
    protected CategorySoap category;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String pic;
    @XmlElement(required = true)
    protected List<RoomSoap> rooms;
    @XmlElement(required = true)
    protected List<AdditionalServicesSoap> additionalServices;
    protected long agent;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link CitySoap }
     *     
     */
    public CitySoap getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitySoap }
     *     
     */
    public void setCity(CitySoap value) {
        this.city = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the typeAccomodation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAccomodationSoap }
     *     
     */
    public TypeAccomodationSoap getTypeAccomodation() {
        return typeAccomodation;
    }

    /**
     * Sets the value of the typeAccomodation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAccomodationSoap }
     *     
     */
    public void setTypeAccomodation(TypeAccomodationSoap value) {
        this.typeAccomodation = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CategorySoap }
     *     
     */
    public CategorySoap getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategorySoap }
     *     
     */
    public void setCategory(CategorySoap value) {
        this.category = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the pic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPic() {
        return pic;
    }

    /**
     * Sets the value of the pic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPic(String value) {
        this.pic = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rooms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRooms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomSoap }
     * 
     * 
     */
    public List<RoomSoap> getRooms() {
        if (rooms == null) {
            rooms = new ArrayList<RoomSoap>();
        }
        return this.rooms;
    }

    /**
     * Gets the value of the additionalServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalServicesSoap }
     * 
     * 
     */
    public List<AdditionalServicesSoap> getAdditionalServices() {
        if (additionalServices == null) {
            additionalServices = new ArrayList<AdditionalServicesSoap>();
        }
        return this.additionalServices;
    }

    /**
     * Gets the value of the agent property.
     * 
     */
    public long getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     */
    public void setAgent(long value) {
        this.agent = value;
    }

}
