//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.29 at 12:49:28 PM CEST 
//


package com.ftn.webservice.files;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nameRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="nameRole"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ROLE_ADMIN"/&gt;
 *     &lt;enumeration value="ROLE_USER"/&gt;
 *     &lt;enumeration value="ROLE_AGENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "nameRole")
@XmlEnum
public enum NameRole {

    ROLE_ADMIN,
    ROLE_USER,
    ROLE_AGENT;

    public String value() {
        return name();
    }

    public static NameRole fromValue(String v) {
        return valueOf(v);
    }

}
