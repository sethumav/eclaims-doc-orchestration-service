
package ca.on.wsib.cc.webservices.createclaim;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.generated package. 
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

    private final static QName _Claim_QNAME = new QName("http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", "Claim");
    private final static QName _Authentication_QNAME = new QName("http://guidewire.com/ws/soapheaders", "authentication");
    private final static QName _Locale_QNAME = new QName("http://guidewire.com/ws/soapheaders", "locale");
    private final static QName _TransactionId_QNAME = new QName("http://guidewire.com/ws/soapheaders", "transaction_id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateClaimResponse }
     * 
     */
    public CreateClaimResponse createCreateClaimResponse() {
        return new CreateClaimResponse();
    }

    /**
     * Create an instance of {@link Claim }
     * 
     */
    public Claim createClaim() {
        return new Claim();
    }

    /**
     * Create an instance of {@link Claim.LossTimeRTWWC }
     * 
     */
    public Claim.LossTimeRTWWC createClaimLossTimeRTWWC() {
        return new Claim.LossTimeRTWWC();
    }

    /**
     * Create an instance of {@link Claim.EmployerWC }
     * 
     */
    public Claim.EmployerWC createClaimEmployerWC() {
        return new Claim.EmployerWC();
    }

    /**
     * Create an instance of {@link Claim.Documents }
     * 
     */
    public Claim.Documents createClaimDocuments() {
        return new Claim.Documents();
    }

    /**
     * Create an instance of {@link Claim.Documents.Entry }
     * 
     */
    public Claim.Documents.Entry createClaimDocumentsEntry() {
        return new Claim.Documents.Entry();
    }

    /**
     * Create an instance of {@link Claim.ClaimInjuryIncident }
     * 
     */
    public Claim.ClaimInjuryIncident createClaimClaimInjuryIncident() {
        return new Claim.ClaimInjuryIncident();
    }

    /**
     * Create an instance of {@link Claim.ClaimInjuryIncident.BodyParts }
     * 
     */
    public Claim.ClaimInjuryIncident.BodyParts createClaimClaimInjuryIncidentBodyParts() {
        return new Claim.ClaimInjuryIncident.BodyParts();
    }

    /**
     * Create an instance of {@link Claim.Claimant }
     * 
     */
    public Claim.Claimant createClaimClaimant() {
        return new Claim.Claimant();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link Locale }
     * 
     */
    public Locale createLocale() {
        return new Locale();
    }

    /**
     * Create an instance of {@link TransactionId }
     * 
     */
    public TransactionId createTransactionId() {
        return new TransactionId();
    }

    /**
     * Create an instance of {@link CreateDraftClaim }
     * 
     */
    public CreateDraftClaim createCreateDraftClaim() {
        return new CreateDraftClaim();
    }

    /**
     * Create an instance of {@link CreateDraftClaimResponse }
     * 
     */
    public CreateDraftClaimResponse createCreateDraftClaimResponse() {
        return new CreateDraftClaimResponse();
    }

    /**
     * Create an instance of {@link DocumentMetaDataVO }
     * 
     */
    public DocumentMetaDataVO createDocumentMetaDataVO() {
        return new DocumentMetaDataVO();
    }

    /**
     * Create an instance of {@link CreateClaimResponse.DocumentMetaDataList }
     * 
     */
    public CreateClaimResponse.DocumentMetaDataList createCreateClaimResponseDocumentMetaDataList() {
        return new CreateClaimResponse.DocumentMetaDataList();
    }

    /**
     * Create an instance of {@link Claim.DateRenderReportSubmittedWC }
     * 
     */
    public Claim.DateRenderReportSubmittedWC createClaimDateRenderReportSubmittedWC() {
        return new Claim.DateRenderReportSubmittedWC();
    }

    /**
     * Create an instance of {@link Claim.LossDate }
     * 
     */
    public Claim.LossDate createClaimLossDate() {
        return new Claim.LossDate();
    }

    /**
     * Create an instance of {@link Claim.Policy }
     * 
     */
    public Claim.Policy createClaimPolicy() {
        return new Claim.Policy();
    }

    /**
     * Create an instance of {@link Claim.LossTimeRTWWC.RTWWorkDate }
     * 
     */
    public Claim.LossTimeRTWWC.RTWWorkDate createClaimLossTimeRTWWCRTWWorkDate() {
        return new Claim.LossTimeRTWWC.RTWWorkDate();
    }

    /**
     * Create an instance of {@link Claim.EmployerWC.PrimaryAddress }
     * 
     */
    public Claim.EmployerWC.PrimaryAddress createClaimEmployerWCPrimaryAddress() {
        return new Claim.EmployerWC.PrimaryAddress();
    }

    /**
     * Create an instance of {@link Claim.EmployerWC.PrimaryContact }
     * 
     */
    public Claim.EmployerWC.PrimaryContact createClaimEmployerWCPrimaryContact() {
        return new Claim.EmployerWC.PrimaryContact();
    }

    /**
     * Create an instance of {@link Claim.Documents.Entry.DateCreated }
     * 
     */
    public Claim.Documents.Entry.DateCreated createClaimDocumentsEntryDateCreated() {
        return new Claim.Documents.Entry.DateCreated();
    }

    /**
     * Create an instance of {@link Claim.Documents.Entry.WSIBDateReceived }
     * 
     */
    public Claim.Documents.Entry.WSIBDateReceived createClaimDocumentsEntryWSIBDateReceived() {
        return new Claim.Documents.Entry.WSIBDateReceived();
    }

    /**
     * Create an instance of {@link Claim.ClaimInjuryIncident.BodyParts.Entry }
     * 
     */
    public Claim.ClaimInjuryIncident.BodyParts.Entry createClaimClaimInjuryIncidentBodyPartsEntry() {
        return new Claim.ClaimInjuryIncident.BodyParts.Entry();
    }

    /**
     * Create an instance of {@link Claim.Claimant.DateOfBirth }
     * 
     */
    public Claim.Claimant.DateOfBirth createClaimClaimantDateOfBirth() {
        return new Claim.Claimant.DateOfBirth();
    }

    /**
     * Create an instance of {@link Claim.Claimant.PrimaryAddress }
     * 
     */
    public Claim.Claimant.PrimaryAddress createClaimClaimantPrimaryAddress() {
        return new Claim.Claimant.PrimaryAddress();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Claim }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", name = "Claim")
    public JAXBElement<Claim> createClaim(Claim value) {
        return new JAXBElement<Claim>(_Claim_QNAME, Claim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/ws/soapheaders", name = "authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Locale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/ws/soapheaders", name = "locale")
    public JAXBElement<Locale> createLocale(Locale value) {
        return new JAXBElement<Locale>(_Locale_QNAME, Locale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/ws/soapheaders", name = "transaction_id")
    public JAXBElement<TransactionId> createTransactionId(TransactionId value) {
        return new JAXBElement<TransactionId>(_TransactionId_QNAME, TransactionId.class, null, value);
    }

}
