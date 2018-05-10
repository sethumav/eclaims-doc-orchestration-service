//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 02:47:35 PM EDT 
//


package ca.on.wsib.tcm.ws.model;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadClaimsDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadClaimsDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claimMetaData" type="{http://ws.tcm.wsib.on.ca/}UploadClaimsDocumentClaimsMetaData"/&gt;
 *         &lt;element name="integrationMetaData" type="{http://ws.tcm.wsib.on.ca/}UploadClaimsDocumentIntegrationMetaData"/&gt;
 *         &lt;element name="fileInfo" type="{http://ws.tcm.wsib.on.ca/}UploadClaimsDocumentFileInfo"/&gt;
 *         &lt;element name="fileContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadClaimsDocument", propOrder = {
    "claimMetaData",
    "integrationMetaData",
    "fileInfo",
    "fileContent",
    "transactionID"
})
@XmlRootElement(name = "UploadClaimsDocument")
public class UploadClaimsDocument {

    @XmlElement(required = true)
    protected UploadClaimsDocumentClaimsMetaData claimMetaData;
    @XmlElement(required = true)
    protected UploadClaimsDocumentIntegrationMetaData integrationMetaData;
    @XmlElement(required = true)
    protected UploadClaimsDocumentFileInfo fileInfo;
    @XmlElement(required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler fileContent;
    @XmlElement(required = true)
    protected String transactionID;

    /**
     * Gets the value of the claimMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link UploadClaimsDocumentClaimsMetaData }
     *     
     */
    public UploadClaimsDocumentClaimsMetaData getClaimMetaData() {
        return claimMetaData;
    }

    /**
     * Sets the value of the claimMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadClaimsDocumentClaimsMetaData }
     *     
     */
    public void setClaimMetaData(UploadClaimsDocumentClaimsMetaData value) {
        this.claimMetaData = value;
    }

    /**
     * Gets the value of the integrationMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link UploadClaimsDocumentIntegrationMetaData }
     *     
     */
    public UploadClaimsDocumentIntegrationMetaData getIntegrationMetaData() {
        return integrationMetaData;
    }

    /**
     * Sets the value of the integrationMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadClaimsDocumentIntegrationMetaData }
     *     
     */
    public void setIntegrationMetaData(UploadClaimsDocumentIntegrationMetaData value) {
        this.integrationMetaData = value;
    }

    /**
     * Gets the value of the fileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UploadClaimsDocumentFileInfo }
     *     
     */
    public UploadClaimsDocumentFileInfo getFileInfo() {
        return fileInfo;
    }

    /**
     * Sets the value of the fileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadClaimsDocumentFileInfo }
     *     
     */
    public void setFileInfo(UploadClaimsDocumentFileInfo value) {
        this.fileInfo = value;
    }

    /**
     * Gets the value of the fileContent property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getFileContent() {
        return fileContent;
    }

    /**
     * Sets the value of the fileContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setFileContent(DataHandler value) {
        this.fileContent = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

}