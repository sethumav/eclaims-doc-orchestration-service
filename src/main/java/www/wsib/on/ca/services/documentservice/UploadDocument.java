
package www.wsib.on.ca.services.documentservice;

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
 *         &lt;element name="uploadRequest" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.wsib.on.ca/services/documentmanagementservice}UploadDocumentRequest"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "uploadRequest"
})
@XmlRootElement(name = "uploadDocument", namespace = "http://www.wsib.on.ca/services/documentservice")
public class UploadDocument {

    @XmlElement(namespace = "http://www.wsib.on.ca/services/documentservice")
    protected UploadDocument.UploadRequest uploadRequest;

    /**
     * Gets the value of the uploadRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UploadDocument.UploadRequest }
     *     
     */
    public UploadDocument.UploadRequest getUploadRequest() {
        return uploadRequest;
    }

    /**
     * Sets the value of the uploadRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadDocument.UploadRequest }
     *     
     */
    public void setUploadRequest(UploadDocument.UploadRequest value) {
        this.uploadRequest = value;
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
     *         &lt;element ref="{http://www.wsib.on.ca/services/documentmanagementservice}UploadDocumentRequest"/&gt;
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
        "uploadDocumentRequest"
    })
    public static class UploadRequest {

        @XmlElement(name = "UploadDocumentRequest", required = true)
        protected UploadDocumentReqType uploadDocumentRequest;

        /**
         * Gets the value of the uploadDocumentRequest property.
         * 
         * @return
         *     possible object is
         *     {@link UploadDocumentReqType }
         *     
         */
        public UploadDocumentReqType getUploadDocumentRequest() {
            return uploadDocumentRequest;
        }

        /**
         * Sets the value of the uploadDocumentRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link UploadDocumentReqType }
         *     
         */
        public void setUploadDocumentRequest(UploadDocumentReqType value) {
            this.uploadDocumentRequest = value;
        }

    }

}
