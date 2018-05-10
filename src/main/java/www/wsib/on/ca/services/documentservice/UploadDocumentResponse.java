
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
 *         &lt;element name="return" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.wsib.on.ca/services/documentmanagementservice}UploadDocumentResponse"/&gt;
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
    "_return"
})
@XmlRootElement(name = "uploadDocumentResponse", namespace = "http://www.wsib.on.ca/services/documentservice")
public class UploadDocumentResponse {

    @XmlElement(name = "return", namespace = "http://www.wsib.on.ca/services/documentservice")
    protected UploadDocumentResponse.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link UploadDocumentResponse.Return }
     *     
     */
    public UploadDocumentResponse.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadDocumentResponse.Return }
     *     
     */
    public void setReturn(UploadDocumentResponse.Return value) {
        this._return = value;
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
     *         &lt;element ref="{http://www.wsib.on.ca/services/documentmanagementservice}UploadDocumentResponse"/&gt;
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
        "uploadDocumentResponse"
    })
    public static class Return {

        @XmlElement(name = "UploadDocumentResponse", required = true)
        protected UploadDocumentResType uploadDocumentResponse;

        /**
         * Gets the value of the uploadDocumentResponse property.
         * 
         * @return
         *     possible object is
         *     {@link UploadDocumentResType }
         *     
         */
        public UploadDocumentResType getUploadDocumentResponse() {
            return uploadDocumentResponse;
        }

        /**
         * Sets the value of the uploadDocumentResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link UploadDocumentResType }
         *     
         */
        public void setUploadDocumentResponse(UploadDocumentResType value) {
            this.uploadDocumentResponse = value;
        }

    }

}
