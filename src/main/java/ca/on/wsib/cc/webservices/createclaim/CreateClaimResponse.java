
package ca.on.wsib.cc.webservices.createclaim;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateClaimResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateClaimResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentMetaDataList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Entry" type="{http://wsib.on.ca/cc/webservices/createclaim/kofax/vo}DocumentMetaDataVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReturnMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateClaimResponse", namespace = "http://wsib.on.ca/cc/webservices/createclaim/kofax/vo", propOrder = {
    "claimNumber",
    "documentMetaDataList",
    "returnCode",
    "returnMessage"
})
public class CreateClaimResponse {

    @XmlElement(name = "ClaimNumber")
    protected String claimNumber;
    @XmlElement(name = "DocumentMetaDataList")
    protected CreateClaimResponse.DocumentMetaDataList documentMetaDataList;
    @XmlElement(name = "ReturnCode")
    protected int returnCode;
    @XmlElement(name = "ReturnMessage")
    protected String returnMessage;

    /**
     * Gets the value of the claimNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimNumber() {
        return claimNumber;
    }

    /**
     * Sets the value of the claimNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimNumber(String value) {
        this.claimNumber = value;
    }

    /**
     * Gets the value of the documentMetaDataList property.
     * 
     * @return
     *     possible object is
     *     {@link CreateClaimResponse.DocumentMetaDataList }
     *     
     */
    public CreateClaimResponse.DocumentMetaDataList getDocumentMetaDataList() {
        return documentMetaDataList;
    }

    /**
     * Sets the value of the documentMetaDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateClaimResponse.DocumentMetaDataList }
     *     
     */
    public void setDocumentMetaDataList(CreateClaimResponse.DocumentMetaDataList value) {
        this.documentMetaDataList = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     */
    public void setReturnCode(int value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the returnMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnMessage() {
        return returnMessage;
    }

    /**
     * Sets the value of the returnMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnMessage(String value) {
        this.returnMessage = value;
    }


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
     *         &lt;element name="Entry" type="{http://wsib.on.ca/cc/webservices/createclaim/kofax/vo}DocumentMetaDataVO" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "entry"
    })
    public static class DocumentMetaDataList {

        @XmlElement(name = "Entry", namespace = "http://wsib.on.ca/cc/webservices/createclaim/kofax/vo", nillable = true)
        protected List<DocumentMetaDataVO> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentMetaDataVO }
         * 
         * 
         */
        public List<DocumentMetaDataVO> getEntry() {
            if (entry == null) {
                entry = new ArrayList<DocumentMetaDataVO>();
            }
            return this.entry;
        }

    }

}
