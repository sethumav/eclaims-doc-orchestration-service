//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 02:47:35 PM EDT 
//


package ca.on.wsib.tcm.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddClaimsVersionIntegrationMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddClaimsVersionIntegrationMetaData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gwPublicDocID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="channelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="channelUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddClaimsVersionIntegrationMetaData", propOrder = {
    "gwPublicDocID",
    "channelID",
    "channelUser"
})
public class AddClaimsVersionIntegrationMetaData {

    protected String gwPublicDocID;
    protected String channelID;
    protected String channelUser;

    /**
     * Gets the value of the gwPublicDocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGwPublicDocID() {
        return gwPublicDocID;
    }

    /**
     * Sets the value of the gwPublicDocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGwPublicDocID(String value) {
        this.gwPublicDocID = value;
    }

    /**
     * Gets the value of the channelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelID() {
        return channelID;
    }

    /**
     * Sets the value of the channelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelID(String value) {
        this.channelID = value;
    }

    /**
     * Gets the value of the channelUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelUser() {
        return channelUser;
    }

    /**
     * Sets the value of the channelUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelUser(String value) {
        this.channelUser = value;
    }

}
