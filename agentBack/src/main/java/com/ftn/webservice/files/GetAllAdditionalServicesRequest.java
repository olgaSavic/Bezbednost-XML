//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.14 at 07:07:55 PM CEST 
//


package com.ftn.webservice.files;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getAdditionalServicesList" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAdditionalServicesList"
})
@XmlRootElement(name = "GetAllAdditionalServicesRequest")
public class GetAllAdditionalServicesRequest {

    @XmlElement(required = true)
    protected String getAdditionalServicesList;

    /**
     * Gets the value of the getAdditionalServicesList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetAdditionalServicesList() {
        return getAdditionalServicesList;
    }

    /**
     * Sets the value of the getAdditionalServicesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetAdditionalServicesList(String value) {
        this.getAdditionalServicesList = value;
    }

}
