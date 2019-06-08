//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.08 at 10:37:37 PM CEST 
//


package com.ftn.webservice.files;

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
 * &lt;complexType name="accomodationSoap"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="city" type="{http://ftn.com/webservice}citySoap"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="typeAccomodation" type="{http://ftn.com/webservice}typeAccomodationSoap"/&gt;
 *         &lt;element name="category" type="{http://ftn.com/webservice}categorySoap"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pic" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="agent" type="{http://ftn.com/webservice}agentSoap"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    "capacity",
    "pic",
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
    protected int capacity;
    @XmlElement(required = true)
    protected String pic;
    @XmlElement(required = true)
    protected AgentSoap agent;

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
     * Gets the value of the capacity property.
     * 
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     */
    public void setCapacity(int value) {
        this.capacity = value;
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
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link AgentSoap }
     *     
     */
    public AgentSoap getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentSoap }
     *     
     */
    public void setAgent(AgentSoap value) {
        this.agent = value;
    }

}
