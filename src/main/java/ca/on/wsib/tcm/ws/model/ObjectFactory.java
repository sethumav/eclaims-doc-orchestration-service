//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 02:47:35 PM EDT 
//


package ca.on.wsib.tcm.ws.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ca.on.wsib.tcm.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddClaimsVersion_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "AddClaimsVersion");
    private final static QName _AddClaimsVersionResponse_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "AddClaimsVersionResponse");
    private final static QName _ClaimsDataBean_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "ClaimsDataBean");
    private final static QName _ClaimsDocumentBean_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "ClaimsDocumentBean");
    private final static QName _ClaimsMetaData_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "ClaimsMetaData");
    private final static QName _DownloadClaimsDocument_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "DownloadClaimsDocument");
    private final static QName _DownloadClaimsDocumentResponse_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "DownloadClaimsDocumentResponse");
    private final static QName _FileInfo_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "FileInfo");
    private final static QName _GetClaimsMetaData_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "GetClaimsMetaData");
    private final static QName _GetClaimsMetaDataResponse_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "GetClaimsMetaDataResponse");
    private final static QName _IntegrationMetaData_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "IntegrationMetaData");
    private final static QName _UpdateClaimsMetadata_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "UpdateClaimsMetadata");
    private final static QName _UpdateClaimsMetadataResponse_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "UpdateClaimsMetadataResponse");
    private final static QName _UploadClaimsDocument_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "UploadClaimsDocument");
    private final static QName _UploadClaimsDocumentResponse_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "UploadClaimsDocumentResponse");
    private final static QName _ClaimsValidation_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "ClaimsValidation");
    private final static QName _CMValidation_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "CMValidation");
    private final static QName _CMException_QNAME = new QName("http://ws.tcm.wsib.on.ca/", "CMException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ca.on.wsib.tcm.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddClaimsVersion }
     * 
     */
    public AddClaimsVersion createAddClaimsVersion() {
        return new AddClaimsVersion();
    }

    /**
     * Create an instance of {@link AddClaimsVersionResponse }
     * 
     */
    public AddClaimsVersionResponse createAddClaimsVersionResponse() {
        return new AddClaimsVersionResponse();
    }

    /**
     * Create an instance of {@link ClaimsDataBean }
     * 
     */
    public ClaimsDataBean createClaimsDataBean() {
        return new ClaimsDataBean();
    }

    /**
     * Create an instance of {@link ClaimsDocumentBean }
     * 
     */
    public ClaimsDocumentBean createClaimsDocumentBean() {
        return new ClaimsDocumentBean();
    }

    /**
     * Create an instance of {@link DownloadClaimsDocument }
     * 
     */
    public DownloadClaimsDocument createDownloadClaimsDocument() {
        return new DownloadClaimsDocument();
    }

    /**
     * Create an instance of {@link DownloadClaimsDocumentResponse }
     * 
     */
    public DownloadClaimsDocumentResponse createDownloadClaimsDocumentResponse() {
        return new DownloadClaimsDocumentResponse();
    }

    /**
     * Create an instance of {@link GetClaimsMetaData }
     * 
     */
    public GetClaimsMetaData createGetClaimsMetaData() {
        return new GetClaimsMetaData();
    }

    /**
     * Create an instance of {@link GetClaimsMetaDataResponse }
     * 
     */
    public GetClaimsMetaDataResponse createGetClaimsMetaDataResponse() {
        return new GetClaimsMetaDataResponse();
    }

    /**
     * Create an instance of {@link UpdateClaimsMetadata }
     * 
     */
    public UpdateClaimsMetadata createUpdateClaimsMetadata() {
        return new UpdateClaimsMetadata();
    }

    /**
     * Create an instance of {@link UpdateClaimsMetadataResponse }
     * 
     */
    public UpdateClaimsMetadataResponse createUpdateClaimsMetadataResponse() {
        return new UpdateClaimsMetadataResponse();
    }

    /**
     * Create an instance of {@link UploadClaimsDocument }
     * 
     */
    public UploadClaimsDocument createUploadClaimsDocument() {
        return new UploadClaimsDocument();
    }

    /**
     * Create an instance of {@link UploadClaimsDocumentResponse }
     * 
     */
    public UploadClaimsDocumentResponse createUploadClaimsDocumentResponse() {
        return new UploadClaimsDocumentResponse();
    }

    /**
     * Create an instance of {@link ClaimsValidation }
     * 
     */
    public ClaimsValidation createClaimsValidation() {
        return new ClaimsValidation();
    }

    /**
     * Create an instance of {@link CMValidation }
     * 
     */
    public CMValidation createCMValidation() {
        return new CMValidation();
    }

    /**
     * Create an instance of {@link CMException }
     * 
     */
    public CMException createCMException() {
        return new CMException();
    }

    /**
     * Create an instance of {@link ClaimsMetaData }
     * 
     */
    public ClaimsMetaData createClaimsMetaData() {
        return new ClaimsMetaData();
    }

    /**
     * Create an instance of {@link IntegrationMetaData }
     * 
     */
    public IntegrationMetaData createIntegrationMetaData() {
        return new IntegrationMetaData();
    }

    /**
     * Create an instance of {@link FileInfo }
     * 
     */
    public FileInfo createFileInfo() {
        return new FileInfo();
    }

    /**
     * Create an instance of {@link UploadClaimsDocumentClaimsMetaData }
     * 
     */
    public UploadClaimsDocumentClaimsMetaData createUploadClaimsDocumentClaimsMetaData() {
        return new UploadClaimsDocumentClaimsMetaData();
    }

    /**
     * Create an instance of {@link UploadClaimsDocumentIntegrationMetaData }
     * 
     */
    public UploadClaimsDocumentIntegrationMetaData createUploadClaimsDocumentIntegrationMetaData() {
        return new UploadClaimsDocumentIntegrationMetaData();
    }

    /**
     * Create an instance of {@link UploadClaimsDocumentFileInfo }
     * 
     */
    public UploadClaimsDocumentFileInfo createUploadClaimsDocumentFileInfo() {
        return new UploadClaimsDocumentFileInfo();
    }

    /**
     * Create an instance of {@link UpdateClaimsMetadataClaimsMetaData }
     * 
     */
    public UpdateClaimsMetadataClaimsMetaData createUpdateClaimsMetadataClaimsMetaData() {
        return new UpdateClaimsMetadataClaimsMetaData();
    }

    /**
     * Create an instance of {@link UpdateClaimsMetadataIntegrationMetaData }
     * 
     */
    public UpdateClaimsMetadataIntegrationMetaData createUpdateClaimsMetadataIntegrationMetaData() {
        return new UpdateClaimsMetadataIntegrationMetaData();
    }

    /**
     * Create an instance of {@link UpdateClaimsMetadataFileInfo }
     * 
     */
    public UpdateClaimsMetadataFileInfo createUpdateClaimsMetadataFileInfo() {
        return new UpdateClaimsMetadataFileInfo();
    }

    /**
     * Create an instance of {@link AddClaimsVersionClaimsMetaData }
     * 
     */
    public AddClaimsVersionClaimsMetaData createAddClaimsVersionClaimsMetaData() {
        return new AddClaimsVersionClaimsMetaData();
    }

    /**
     * Create an instance of {@link AddClaimsVersionIntegrationMetaData }
     * 
     */
    public AddClaimsVersionIntegrationMetaData createAddClaimsVersionIntegrationMetaData() {
        return new AddClaimsVersionIntegrationMetaData();
    }

    /**
     * Create an instance of {@link AddClaimsVersionFileInfo }
     * 
     */
    public AddClaimsVersionFileInfo createAddClaimsVersionFileInfo() {
        return new AddClaimsVersionFileInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddClaimsVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "AddClaimsVersion")
    public JAXBElement<AddClaimsVersion> createAddClaimsVersion(AddClaimsVersion value) {
        return new JAXBElement<AddClaimsVersion>(_AddClaimsVersion_QNAME, AddClaimsVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddClaimsVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "AddClaimsVersionResponse")
    public JAXBElement<AddClaimsVersionResponse> createAddClaimsVersionResponse(AddClaimsVersionResponse value) {
        return new JAXBElement<AddClaimsVersionResponse>(_AddClaimsVersionResponse_QNAME, AddClaimsVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimsDataBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "ClaimsDataBean")
    public JAXBElement<ClaimsDataBean> createClaimsDataBean(ClaimsDataBean value) {
        return new JAXBElement<ClaimsDataBean>(_ClaimsDataBean_QNAME, ClaimsDataBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimsDocumentBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "ClaimsDocumentBean")
    public JAXBElement<ClaimsDocumentBean> createClaimsDocumentBean(ClaimsDocumentBean value) {
        return new JAXBElement<ClaimsDocumentBean>(_ClaimsDocumentBean_QNAME, ClaimsDocumentBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "ClaimsMetaData")
    public JAXBElement<Object> createClaimsMetaData(Object value) {
        return new JAXBElement<Object>(_ClaimsMetaData_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadClaimsDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "DownloadClaimsDocument")
    public JAXBElement<DownloadClaimsDocument> createDownloadClaimsDocument(DownloadClaimsDocument value) {
        return new JAXBElement<DownloadClaimsDocument>(_DownloadClaimsDocument_QNAME, DownloadClaimsDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadClaimsDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "DownloadClaimsDocumentResponse")
    public JAXBElement<DownloadClaimsDocumentResponse> createDownloadClaimsDocumentResponse(DownloadClaimsDocumentResponse value) {
        return new JAXBElement<DownloadClaimsDocumentResponse>(_DownloadClaimsDocumentResponse_QNAME, DownloadClaimsDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "FileInfo")
    public JAXBElement<Object> createFileInfo(Object value) {
        return new JAXBElement<Object>(_FileInfo_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClaimsMetaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "GetClaimsMetaData")
    public JAXBElement<GetClaimsMetaData> createGetClaimsMetaData(GetClaimsMetaData value) {
        return new JAXBElement<GetClaimsMetaData>(_GetClaimsMetaData_QNAME, GetClaimsMetaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClaimsMetaDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "GetClaimsMetaDataResponse")
    public JAXBElement<GetClaimsMetaDataResponse> createGetClaimsMetaDataResponse(GetClaimsMetaDataResponse value) {
        return new JAXBElement<GetClaimsMetaDataResponse>(_GetClaimsMetaDataResponse_QNAME, GetClaimsMetaDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "IntegrationMetaData")
    public JAXBElement<Object> createIntegrationMetaData(Object value) {
        return new JAXBElement<Object>(_IntegrationMetaData_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClaimsMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "UpdateClaimsMetadata")
    public JAXBElement<UpdateClaimsMetadata> createUpdateClaimsMetadata(UpdateClaimsMetadata value) {
        return new JAXBElement<UpdateClaimsMetadata>(_UpdateClaimsMetadata_QNAME, UpdateClaimsMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClaimsMetadataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "UpdateClaimsMetadataResponse")
    public JAXBElement<UpdateClaimsMetadataResponse> createUpdateClaimsMetadataResponse(UpdateClaimsMetadataResponse value) {
        return new JAXBElement<UpdateClaimsMetadataResponse>(_UpdateClaimsMetadataResponse_QNAME, UpdateClaimsMetadataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadClaimsDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "UploadClaimsDocument")
    public JAXBElement<UploadClaimsDocument> createUploadClaimsDocument(UploadClaimsDocument value) {
        return new JAXBElement<UploadClaimsDocument>(_UploadClaimsDocument_QNAME, UploadClaimsDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadClaimsDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "UploadClaimsDocumentResponse")
    public JAXBElement<UploadClaimsDocumentResponse> createUploadClaimsDocumentResponse(UploadClaimsDocumentResponse value) {
        return new JAXBElement<UploadClaimsDocumentResponse>(_UploadClaimsDocumentResponse_QNAME, UploadClaimsDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimsValidation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "ClaimsValidation")
    public JAXBElement<ClaimsValidation> createClaimsValidation(ClaimsValidation value) {
        return new JAXBElement<ClaimsValidation>(_ClaimsValidation_QNAME, ClaimsValidation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CMValidation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "CMValidation")
    public JAXBElement<CMValidation> createCMValidation(CMValidation value) {
        return new JAXBElement<CMValidation>(_CMValidation_QNAME, CMValidation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CMException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tcm.wsib.on.ca/", name = "CMException")
    public JAXBElement<CMException> createCMException(CMException value) {
        return new JAXBElement<CMException>(_CMException_QNAME, CMException.class, null, value);
    }

}
