package www.wsib.on.ca.services.documentservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-05-10T16:47:56.982-04:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://www.wsib.on.ca/services/documentservice", name = "DocumentAPIPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface DocumentAPIPortType {

    @WebMethod
    @RequestWrapper(localName = "uploadDocument", targetNamespace = "http://www.wsib.on.ca/services/documentservice", className = "www.wsib.on.ca.services.documentservice.UploadDocument")
    @ResponseWrapper(localName = "uploadDocumentResponse", targetNamespace = "http://www.wsib.on.ca/services/documentservice", className = "www.wsib.on.ca.services.documentservice.UploadDocumentResponse")
    @WebResult(name = "return", targetNamespace = "http://www.wsib.on.ca/services/documentservice")
    public www.wsib.on.ca.services.documentservice.UploadDocumentResponse.Return uploadDocument(
        @WebParam(name = "uploadRequest", targetNamespace = "http://www.wsib.on.ca/services/documentservice")
        www.wsib.on.ca.services.documentservice.UploadDocument.UploadRequest uploadRequest,
        @WebParam(name = "authentication", targetNamespace = "http://guidewire.com/ws/soapheaders", header = true)
        Authentication gwAuthentication,
        @WebParam(name = "locale", targetNamespace = "http://guidewire.com/ws/soapheaders", header = true)
        Locale gwLocale
    );
}
