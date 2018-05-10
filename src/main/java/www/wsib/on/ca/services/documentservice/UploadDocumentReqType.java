
package www.wsib.on.ca.services.documentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadDocumentReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadDocumentReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.wsib.on.ca/services}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UploadRequest" type="{http://www.wsib.on.ca/services/documentmanagementservice}UploadReqType" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadDocumentReqType", propOrder = {
    "uploadRequest"
})
public class UploadDocumentReqType
    extends BaseRequestType
{

    @XmlElement(name = "UploadRequest")
    protected UploadReqType uploadRequest;

    /**
     * Gets the value of the uploadRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UploadReqType }
     *     
     */
    public UploadReqType getUploadRequest() {
        return uploadRequest;
    }

    /**
     * Sets the value of the uploadRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadReqType }
     *     
     */
    public void setUploadRequest(UploadReqType value) {
        this.uploadRequest = value;
    }

}
