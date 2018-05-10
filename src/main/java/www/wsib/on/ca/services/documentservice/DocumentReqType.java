
package www.wsib.on.ca.services.documentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.wsib.on.ca/services/documentmanagementservice}DocumentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.wsib.on.ca/services/documentmanagementservice}externalDocumentID"/&gt;
 *         &lt;element ref="{http://www.wsib.on.ca/services/documentmanagementservice}documentName"/&gt;
 *         &lt;element ref="{http://www.wsib.on.ca/services/documentmanagementservice}documentType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentReqType", propOrder = {
    "externalDocumentID",
    "documentName",
    "documentType"
})
public class DocumentReqType
    extends DocumentType
{

    @XmlElement(required = true, nillable = true)
    protected String externalDocumentID;
    @XmlElement(required = true)
    protected String documentName;
    @XmlElement(required = true)
    protected String documentType;

    /**
     * Gets the value of the externalDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDocumentID() {
        return externalDocumentID;
    }

    /**
     * Sets the value of the externalDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDocumentID(String value) {
        this.externalDocumentID = value;
    }

    /**
     * Gets the value of the documentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentName(String value) {
        this.documentName = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

}
