package www.wsib.on.ca.services.documentservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-05-10T16:47:57.020-04:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "DocumentAPI", 
                  wsdlLocation = "file:/C:/Users/shirans/Development/SpringInt/WS_GenClient_DocAPI/src/main/resources/wsdl/DocumentAPI.wsdl",
                  targetNamespace = "http://www.wsib.on.ca/services/documentservice") 
public class DocumentAPI extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.wsib.on.ca/services/documentservice", "DocumentAPI");
    public final static QName DocumentAPISoap12Port = new QName("http://www.wsib.on.ca/services/documentservice", "DocumentAPISoap12Port");
    public final static QName DocumentAPISoap11Port = new QName("http://www.wsib.on.ca/services/documentservice", "DocumentAPISoap11Port");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/shirans/Development/SpringInt/WS_GenClient_DocAPI/src/main/resources/wsdl/DocumentAPI.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DocumentAPI.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/shirans/Development/SpringInt/WS_GenClient_DocAPI/src/main/resources/wsdl/DocumentAPI.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DocumentAPI(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DocumentAPI(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DocumentAPI() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public DocumentAPI(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public DocumentAPI(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public DocumentAPI(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns DocumentAPIPortType
     */
    @WebEndpoint(name = "DocumentAPISoap12Port")
    public DocumentAPIPortType getDocumentAPISoap12Port() {
        return super.getPort(DocumentAPISoap12Port, DocumentAPIPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DocumentAPIPortType
     */
    @WebEndpoint(name = "DocumentAPISoap12Port")
    public DocumentAPIPortType getDocumentAPISoap12Port(WebServiceFeature... features) {
        return super.getPort(DocumentAPISoap12Port, DocumentAPIPortType.class, features);
    }


    /**
     *
     * @return
     *     returns DocumentAPIPortType
     */
    @WebEndpoint(name = "DocumentAPISoap11Port")
    public DocumentAPIPortType getDocumentAPISoap11Port() {
        return super.getPort(DocumentAPISoap11Port, DocumentAPIPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DocumentAPIPortType
     */
    @WebEndpoint(name = "DocumentAPISoap11Port")
    public DocumentAPIPortType getDocumentAPISoap11Port(WebServiceFeature... features) {
        return super.getPort(DocumentAPISoap11Port, DocumentAPIPortType.class, features);
    }

}
