
package www.wsib.on.ca.services.documentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadDocumentResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadDocumentResType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.wsib.on.ca/services}BaseResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UploadResponse" type="{http://www.wsib.on.ca/services/documentmanagementservice}UploadResType" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadDocumentResType", propOrder = {
    "uploadResponse"
})
public class UploadDocumentResType
    extends BaseResponseType
{

    @XmlElement(name = "UploadResponse", required = true)
    protected UploadResType uploadResponse;

    /**
     * Gets the value of the uploadResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UploadResType }
     *     
     */
    public UploadResType getUploadResponse() {
        return uploadResponse;
    }

    /**
     * Sets the value of the uploadResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadResType }
     *     
     */
    public void setUploadResponse(UploadResType value) {
        this.uploadResponse = value;
    }

}
