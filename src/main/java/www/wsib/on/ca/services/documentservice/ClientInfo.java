
package www.wsib.on.ca.services.documentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClientInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.wsib.on.ca/services}ClientID"/&gt;
 *         &lt;element ref="{http://www.wsib.on.ca/services}ClientName"/&gt;
 *         &lt;element ref="{http://www.wsib.on.ca/services}RequestReference"/&gt;
 *         &lt;element ref="{http://www.wsib.on.ca/services}TransactionTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientInfo", namespace = "http://www.wsib.on.ca/services", propOrder = {
    "clientID",
    "clientName",
    "requestReference",
    "transactionTime"
})
public class ClientInfo {

    @XmlElement(name = "ClientID", required = true)
    @XmlSchemaType(name = "string")
    protected ClientIDType clientID;
    @XmlElement(name = "ClientName", required = true)
    protected String clientName;
    @XmlElement(name = "RequestReference", required = true)
    protected String requestReference;
    @XmlElement(name = "TransactionTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionTime;

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link ClientIDType }
     *     
     */
    public ClientIDType getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientIDType }
     *     
     */
    public void setClientID(ClientIDType value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the requestReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestReference() {
        return requestReference;
    }

    /**
     * Sets the value of the requestReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestReference(String value) {
        this.requestReference = value;
    }

    /**
     * Gets the value of the transactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionTime() {
        return transactionTime;
    }

    /**
     * Sets the value of the transactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionTime(XMLGregorianCalendar value) {
        this.transactionTime = value;
    }

}
