//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.08 at 11:03:47 PM CEST 
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
 *         &lt;element name="returnedAccomodation" type="{http://ftn.com/webservice}accomodationSoap"/>
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
    "returnedAccomodation"
})
@XmlRootElement(name = "GetAccomodationResponse")
public class GetAccomodationResponse {

    @XmlElement(required = true)
    protected AccomodationSoap returnedAccomodation;

    /**
     * Gets the value of the returnedAccomodation property.
     * 
     * @return
     *     possible object is
     *     {@link AccomodationSoap }
     *     
     */
    public AccomodationSoap getReturnedAccomodation() {
        return returnedAccomodation;
    }

    /**
     * Sets the value of the returnedAccomodation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccomodationSoap }
     *     
     */
    public void setReturnedAccomodation(AccomodationSoap value) {
        this.returnedAccomodation = value;
    }

}
