
package ca.on.wsib.cc.webservices.createclaim;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Claim complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Claim"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claimant" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DateOfBirth" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PrimaryAddress" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="WorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="WSIB_LanguageOfService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ClaimInjuryIncident" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BodyParts" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Entry" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="DetailedBodyPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClaimType_WC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateRenderReportSubmitted_WC" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Documents" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Entry" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DateCreated" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DocUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="WSIB_DateReceived" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="WSIB_DocSubSection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="WSIB_Document_Intake_Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="WSIB_DocumentSection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="WSIB_FormID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="WSIB_HCPymtDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="WSIB_UDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="employer_WC" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="WSIB_AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PrimaryAddress" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PrimaryContact" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WSIB_LegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LossDate" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LossTimeRTW_WC" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MWAcceptance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="NoRTWModifiedWorkOffered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RTWWorkDate" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Policy" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="WSIB_FirmNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WSIB_ClaimFileSecure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WSIB_HealthPymtInd_WC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WSIB_IntakeChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WSIB_KOFAX_SpecialHandlingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WSIB_KofaxBatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Claim", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", propOrder = {
    "claimant",
    "claimInjuryIncident",
    "claimNumber",
    "claimTypeWC",
    "dateRenderReportSubmittedWC",
    "documents",
    "employerWC",
    "lossDate",
    "lossTimeRTWWC",
    "policy",
    "wsibClaimFileSecure",
    "wsibHealthPymtIndWC",
    "wsibIntakeChannel",
    "wsibkofaxSpecialHandlingCode",
    "wsibKofaxBatchID"
})
public class Claim {

    @XmlElement(nillable = true)
    protected Claim.Claimant claimant;
    @XmlElement(name = "ClaimInjuryIncident", nillable = true)
    protected Claim.ClaimInjuryIncident claimInjuryIncident;
    @XmlElement(name = "ClaimNumber", nillable = true)
    protected String claimNumber;
    @XmlElement(name = "ClaimType_WC", nillable = true)
    protected String claimTypeWC;
    @XmlElement(name = "DateRenderReportSubmitted_WC", nillable = true)
    protected Claim.DateRenderReportSubmittedWC dateRenderReportSubmittedWC;
    @XmlElement(name = "Documents", nillable = true)
    protected Claim.Documents documents;
    @XmlElement(name = "employer_WC", nillable = true)
    protected Claim.EmployerWC employerWC;
    @XmlElement(name = "LossDate", nillable = true)
    protected Claim.LossDate lossDate;
    @XmlElement(name = "LossTimeRTW_WC", nillable = true)
    protected Claim.LossTimeRTWWC lossTimeRTWWC;
    @XmlElement(name = "Policy", nillable = true)
    protected Claim.Policy policy;
    @XmlElement(name = "WSIB_ClaimFileSecure", nillable = true)
    protected String wsibClaimFileSecure;
    @XmlElement(name = "WSIB_HealthPymtInd_WC", nillable = true)
    protected String wsibHealthPymtIndWC;
    @XmlElement(name = "WSIB_IntakeChannel", nillable = true)
    protected String wsibIntakeChannel;
    @XmlElement(name = "WSIB_KOFAX_SpecialHandlingCode", nillable = true)
    protected String wsibkofaxSpecialHandlingCode;
    @XmlElement(name = "WSIB_KofaxBatchID", nillable = true)
    protected String wsibKofaxBatchID;

    /**
     * Gets the value of the claimant property.
     * 
     * @return
     *     possible object is
     *     {@link Claim.Claimant }
     *     
     */
    public Claim.Claimant getClaimant() {
        return claimant;
    }

    /**
     * Sets the value of the claimant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Claim.Claimant }
     *     
     */
    public void setClaimant(Claim.Claimant value) {
        this.claimant = value;
    }

    /**
     * Gets the value of the claimInjuryIncident property.
     * 
     * @return
     *     possible object is
     *     {@link Claim.ClaimInjuryIncident }
     *     
     */
    public Claim.ClaimInjuryIncident getClaimInjuryIncident() {
        return claimInjuryIncident;
    }

    /**
     * Sets the value of the claimInjuryIncident property.
     * 
     * @param value
     *     allowed object is
     *     {@link Claim.ClaimInjuryIncident }
     *     
     */
    public void setClaimInjuryIncident(Claim.ClaimInjuryIncident value) {
        this.claimInjuryIncident = value;
    }

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
     * Gets the value of the claimTypeWC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimTypeWC() {
        return claimTypeWC;
    }

    /**
     * Sets the value of the claimTypeWC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimTypeWC(String value) {
        this.claimTypeWC = value;
    }

    /**
     * Gets the value of the dateRenderReportSubmittedWC property.
     * 
     * @return
     *     possible object is
     *     {@link Claim.DateRenderReportSubmittedWC }
     *     
     */
    public Claim.DateRenderReportSubmittedWC getDateRenderReportSubmittedWC() {
        return dateRenderReportSubmittedWC;
    }

    /**
     * Sets the value of the dateRenderReportSubmittedWC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Claim.DateRenderReportSubmittedWC }
     *     
     */
    public void setDateRenderReportSubmittedWC(Claim.DateRenderReportSubmittedWC value) {
        this.dateRenderReportSubmittedWC = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link Claim.Documents }
     *     
     */
    public Claim.Documents getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Claim.Documents }
     *     
     */
    public void setDocuments(Claim.Documents value) {
        this.documents = value;
    }

    /**
     * Gets the value of the employerWC property.
     * 
     * @return
     *     possible object is
     *     {@link Claim.EmployerWC }
     *     
     */
    public Claim.EmployerWC getEmployerWC() {
        return employerWC;
    }

    /**
     * Sets the value of the employerWC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Claim.EmployerWC }
     *     
     */
    public void setEmployerWC(Claim.EmployerWC value) {
        this.employerWC = value;
    }

    /**
     * Gets the value of the lossDate property.
     * 
     * @return
     *     possible object is
     *     {@link Claim.LossDate }
     *     
     */
    public Claim.LossDate getLossDate() {
        return lossDate;
    }

    /**
     * Sets the value of the lossDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Claim.LossDate }
     *     
     */
    public void setLossDate(Claim.LossDate value) {
        this.lossDate = value;
    }

    /**
     * Gets the value of the lossTimeRTWWC property.
     * 
     * @return
     *     possible object is
     *     {@link Claim.LossTimeRTWWC }
     *     
     */
    public Claim.LossTimeRTWWC getLossTimeRTWWC() {
        return lossTimeRTWWC;
    }

    /**
     * Sets the value of the lossTimeRTWWC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Claim.LossTimeRTWWC }
     *     
     */
    public void setLossTimeRTWWC(Claim.LossTimeRTWWC value) {
        this.lossTimeRTWWC = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link Claim.Policy }
     *     
     */
    public Claim.Policy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Claim.Policy }
     *     
     */
    public void setPolicy(Claim.Policy value) {
        this.policy = value;
    }

    /**
     * Gets the value of the wsibClaimFileSecure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSIBClaimFileSecure() {
        return wsibClaimFileSecure;
    }

    /**
     * Sets the value of the wsibClaimFileSecure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSIBClaimFileSecure(String value) {
        this.wsibClaimFileSecure = value;
    }

    /**
     * Gets the value of the wsibHealthPymtIndWC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSIBHealthPymtIndWC() {
        return wsibHealthPymtIndWC;
    }

    /**
     * Sets the value of the wsibHealthPymtIndWC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSIBHealthPymtIndWC(String value) {
        this.wsibHealthPymtIndWC = value;
    }

    /**
     * Gets the value of the wsibIntakeChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSIBIntakeChannel() {
        return wsibIntakeChannel;
    }

    /**
     * Sets the value of the wsibIntakeChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSIBIntakeChannel(String value) {
        this.wsibIntakeChannel = value;
    }

    /**
     * Gets the value of the wsibkofaxSpecialHandlingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSIBKOFAXSpecialHandlingCode() {
        return wsibkofaxSpecialHandlingCode;
    }

    /**
     * Sets the value of the wsibkofaxSpecialHandlingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSIBKOFAXSpecialHandlingCode(String value) {
        this.wsibkofaxSpecialHandlingCode = value;
    }

    /**
     * Gets the value of the wsibKofaxBatchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSIBKofaxBatchID() {
        return wsibKofaxBatchID;
    }

    /**
     * Sets the value of the wsibKofaxBatchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSIBKofaxBatchID(String value) {
        this.wsibKofaxBatchID = value;
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
     *         &lt;element name="BodyParts" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Entry" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="DetailedBodyPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
        "bodyParts"
    })
    public static class ClaimInjuryIncident {

        @XmlElement(name = "BodyParts", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected Claim.ClaimInjuryIncident.BodyParts bodyParts;

        /**
         * Gets the value of the bodyParts property.
         * 
         * @return
         *     possible object is
         *     {@link Claim.ClaimInjuryIncident.BodyParts }
         *     
         */
        public Claim.ClaimInjuryIncident.BodyParts getBodyParts() {
            return bodyParts;
        }

        /**
         * Sets the value of the bodyParts property.
         * 
         * @param value
         *     allowed object is
         *     {@link Claim.ClaimInjuryIncident.BodyParts }
         *     
         */
        public void setBodyParts(Claim.ClaimInjuryIncident.BodyParts value) {
            this.bodyParts = value;
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
         *         &lt;element name="Entry" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="DetailedBodyPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
            "entry"
        })
        public static class BodyParts {

            @XmlElement(name = "Entry", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected List<Claim.ClaimInjuryIncident.BodyParts.Entry> entry;

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
             * {@link Claim.ClaimInjuryIncident.BodyParts.Entry }
             * 
             * 
             */
            public List<Claim.ClaimInjuryIncident.BodyParts.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<Claim.ClaimInjuryIncident.BodyParts.Entry>();
                }
                return this.entry;
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
             *         &lt;element name="DetailedBodyPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "detailedBodyPart"
            })
            public static class Entry {

                @XmlElement(name = "DetailedBodyPart", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
                protected String detailedBodyPart;
                @XmlAttribute(name = "action")
                protected String action;

                /**
                 * Gets the value of the detailedBodyPart property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDetailedBodyPart() {
                    return detailedBodyPart;
                }

                /**
                 * Sets the value of the detailedBodyPart property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDetailedBodyPart(String value) {
                    this.detailedBodyPart = value;
                }

                /**
                 * Gets the value of the action property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAction() {
                    return action;
                }

                /**
                 * Sets the value of the action property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAction(String value) {
                    this.action = value;
                }

            }

        }

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
     *         &lt;element name="DateOfBirth" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PrimaryAddress" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="WorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="WSIB_LanguageOfService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "dateOfBirth",
        "firstName",
        "gender",
        "lastName",
        "primaryAddress",
        "taxID",
        "workPhone",
        "wsibLanguageOfService"
    })
    public static class Claimant {

        @XmlElement(name = "DateOfBirth", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected Claim.Claimant.DateOfBirth dateOfBirth;
        @XmlElement(name = "FirstName", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected String firstName;
        @XmlElement(name = "Gender", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected String gender;
        @XmlElement(name = "LastName", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected String lastName;
        @XmlElement(name = "PrimaryAddress", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected Claim.Claimant.PrimaryAddress primaryAddress;
        @XmlElement(name = "TaxID", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected String taxID;
        @XmlElement(name = "WorkPhone", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected String workPhone;
        @XmlElement(name = "WSIB_LanguageOfService", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected String wsibLanguageOfService;

        /**
         * Gets the value of the dateOfBirth property.
         * 
         * @return
         *     possible object is
         *     {@link Claim.Claimant.DateOfBirth }
         *     
         */
        public Claim.Claimant.DateOfBirth getDateOfBirth() {
            return dateOfBirth;
        }

        /**
         * Sets the value of the dateOfBirth property.
         * 
         * @param value
         *     allowed object is
         *     {@link Claim.Claimant.DateOfBirth }
         *     
         */
        public void setDateOfBirth(Claim.Claimant.DateOfBirth value) {
            this.dateOfBirth = value;
        }

        /**
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the gender property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGender() {
            return gender;
        }

        /**
         * Sets the value of the gender property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGender(String value) {
            this.gender = value;
        }

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the primaryAddress property.
         * 
         * @return
         *     possible object is
         *     {@link Claim.Claimant.PrimaryAddress }
         *     
         */
        public Claim.Claimant.PrimaryAddress getPrimaryAddress() {
            return primaryAddress;
        }

        /**
         * Sets the value of the primaryAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link Claim.Claimant.PrimaryAddress }
         *     
         */
        public void setPrimaryAddress(Claim.Claimant.PrimaryAddress value) {
            this.primaryAddress = value;
        }

        /**
         * Gets the value of the taxID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxID() {
            return taxID;
        }

        /**
         * Sets the value of the taxID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxID(String value) {
            this.taxID = value;
        }

        /**
         * Gets the value of the workPhone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWorkPhone() {
            return workPhone;
        }

        /**
         * Sets the value of the workPhone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWorkPhone(String value) {
            this.workPhone = value;
        }

        /**
         * Gets the value of the wsibLanguageOfService property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWSIBLanguageOfService() {
            return wsibLanguageOfService;
        }

        /**
         * Sets the value of the wsibLanguageOfService property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWSIBLanguageOfService(String value) {
            this.wsibLanguageOfService = value;
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
         *         &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "xmlDateTime"
        })
        public static class DateOfBirth {

            @XmlElement(name = "XmlDateTime", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected String xmlDateTime;

            /**
             * Gets the value of the xmlDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmlDateTime() {
                return xmlDateTime;
            }

            /**
             * Sets the value of the xmlDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmlDateTime(String value) {
                this.xmlDateTime = value;
            }

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
         *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "postalCode"
        })
        public static class PrimaryAddress {

            @XmlElement(name = "PostalCode", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected String postalCode;

            /**
             * Gets the value of the postalCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostalCode() {
                return postalCode;
            }

            /**
             * Sets the value of the postalCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostalCode(String value) {
                this.postalCode = value;
            }

        }

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
     *         &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "xmlDateTime"
    })
    public static class DateRenderReportSubmittedWC {

        @XmlElement(name = "XmlDateTime", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected String xmlDateTime;

        /**
         * Gets the value of the xmlDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXmlDateTime() {
            return xmlDateTime;
        }

        /**
         * Sets the value of the xmlDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXmlDateTime(String value) {
            this.xmlDateTime = value;
        }

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
     *         &lt;element name="Entry" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DateCreated" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DocUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="WSIB_DateReceived" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="WSIB_DocSubSection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="WSIB_Document_Intake_Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="WSIB_DocumentSection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="WSIB_FormID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="WSIB_HCPymtDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="WSIB_UDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        "entry"
    })
    public static class Documents {

        @XmlElement(name = "Entry", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected List<Claim.Documents.Entry> entry;

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
         * {@link Claim.Documents.Entry }
         * 
         * 
         */
        public List<Claim.Documents.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<Claim.Documents.Entry>();
            }
            return this.entry;
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
         *         &lt;element name="Author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DateCreated" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DocUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="WSIB_DateReceived" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="WSIB_DocSubSection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="WSIB_Document_Intake_Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="WSIB_DocumentSection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="WSIB_FormID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="WSIB_HCPymtDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="WSIB_UDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "author",
            "dateCreated",
            "description",
            "docUID",
            "language",
            "mimeType",
            "name",
            "wsibDateReceived",
            "wsibDocSubSection",
            "wsibDocumentIntakeSource",
            "wsibDocumentSection",
            "wsibFormID",
            "wsibhcPymtDocument",
            "wsibudid"
        })
        public static class Entry {

            @XmlElement(name = "Author", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected String author;
            @XmlElement(name = "DateCreated", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected Claim.Documents.Entry.DateCreated dateCreated;
            @XmlElement(name = "Description", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected String description;
            @XmlElement(name = "DocUID", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected String docUID;
            @XmlElement(name = "Language", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected String language;
            @XmlElement(name = "MimeType", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected String mimeType;
            @XmlElement(name = "Name", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected String name;
            @XmlElement(name = "WSIB_DateReceived", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected Claim.Documents.Entry.WSIBDateReceived wsibDateReceived;
            @XmlElement(name = "WSIB_DocSubSection", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected String wsibDocSubSection;
            @XmlElement(name = "WSIB_Document_Intake_Source", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected String wsibDocumentIntakeSource;
            @XmlElement(name = "WSIB_DocumentSection", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected String wsibDocumentSection;
            @XmlElement(name = "WSIB_FormID", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected String wsibFormID;
            @XmlElement(name = "WSIB_HCPymtDocument", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected String wsibhcPymtDocument;
            @XmlElement(name = "WSIB_UDID", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected String wsibudid;
            @XmlAttribute(name = "action")
            protected String action;

            /**
             * Gets the value of the author property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuthor() {
                return author;
            }

            /**
             * Sets the value of the author property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuthor(String value) {
                this.author = value;
            }

            /**
             * Gets the value of the dateCreated property.
             * 
             * @return
             *     possible object is
             *     {@link Claim.Documents.Entry.DateCreated }
             *     
             */
            public Claim.Documents.Entry.DateCreated getDateCreated() {
                return dateCreated;
            }

            /**
             * Sets the value of the dateCreated property.
             * 
             * @param value
             *     allowed object is
             *     {@link Claim.Documents.Entry.DateCreated }
             *     
             */
            public void setDateCreated(Claim.Documents.Entry.DateCreated value) {
                this.dateCreated = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the docUID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocUID() {
                return docUID;
            }

            /**
             * Sets the value of the docUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocUID(String value) {
                this.docUID = value;
            }

            /**
             * Gets the value of the language property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLanguage() {
                return language;
            }

            /**
             * Sets the value of the language property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLanguage(String value) {
                this.language = value;
            }

            /**
             * Gets the value of the mimeType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMimeType() {
                return mimeType;
            }

            /**
             * Sets the value of the mimeType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMimeType(String value) {
                this.mimeType = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the wsibDateReceived property.
             * 
             * @return
             *     possible object is
             *     {@link Claim.Documents.Entry.WSIBDateReceived }
             *     
             */
            public Claim.Documents.Entry.WSIBDateReceived getWSIBDateReceived() {
                return wsibDateReceived;
            }

            /**
             * Sets the value of the wsibDateReceived property.
             * 
             * @param value
             *     allowed object is
             *     {@link Claim.Documents.Entry.WSIBDateReceived }
             *     
             */
            public void setWSIBDateReceived(Claim.Documents.Entry.WSIBDateReceived value) {
                this.wsibDateReceived = value;
            }

            /**
             * Gets the value of the wsibDocSubSection property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWSIBDocSubSection() {
                return wsibDocSubSection;
            }

            /**
             * Sets the value of the wsibDocSubSection property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWSIBDocSubSection(String value) {
                this.wsibDocSubSection = value;
            }

            /**
             * Gets the value of the wsibDocumentIntakeSource property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWSIBDocumentIntakeSource() {
                return wsibDocumentIntakeSource;
            }

            /**
             * Sets the value of the wsibDocumentIntakeSource property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWSIBDocumentIntakeSource(String value) {
                this.wsibDocumentIntakeSource = value;
            }

            /**
             * Gets the value of the wsibDocumentSection property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWSIBDocumentSection() {
                return wsibDocumentSection;
            }

            /**
             * Sets the value of the wsibDocumentSection property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWSIBDocumentSection(String value) {
                this.wsibDocumentSection = value;
            }

            /**
             * Gets the value of the wsibFormID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWSIBFormID() {
                return wsibFormID;
            }

            /**
             * Sets the value of the wsibFormID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWSIBFormID(String value) {
                this.wsibFormID = value;
            }

            /**
             * Gets the value of the wsibhcPymtDocument property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWSIBHCPymtDocument() {
                return wsibhcPymtDocument;
            }

            /**
             * Sets the value of the wsibhcPymtDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWSIBHCPymtDocument(String value) {
                this.wsibhcPymtDocument = value;
            }

            /**
             * Gets the value of the wsibudid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWSIBUDID() {
                return wsibudid;
            }

            /**
             * Sets the value of the wsibudid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWSIBUDID(String value) {
                this.wsibudid = value;
            }

            /**
             * Gets the value of the action property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAction() {
                return action;
            }

            /**
             * Sets the value of the action property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAction(String value) {
                this.action = value;
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
             *         &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "xmlDateTime"
            })
            public static class DateCreated {

                @XmlElement(name = "XmlDateTime", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
                protected String xmlDateTime;

                /**
                 * Gets the value of the xmlDateTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXmlDateTime() {
                    return xmlDateTime;
                }

                /**
                 * Sets the value of the xmlDateTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXmlDateTime(String value) {
                    this.xmlDateTime = value;
                }

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
             *         &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "xmlDateTime"
            })
            public static class WSIBDateReceived {

                @XmlElement(name = "XmlDateTime", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
                protected String xmlDateTime;

                /**
                 * Gets the value of the xmlDateTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXmlDateTime() {
                    return xmlDateTime;
                }

                /**
                 * Sets the value of the xmlDateTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXmlDateTime(String value) {
                    this.xmlDateTime = value;
                }

            }

        }

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
     *         &lt;element name="WSIB_AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PrimaryAddress" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PrimaryContact" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="WSIB_LegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "wsibAccountNumber",
        "primaryAddress",
        "primaryContact",
        "wsibLegalName"
    })
    public static class EmployerWC {

        @XmlElement(name = "WSIB_AccountNumber", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected String wsibAccountNumber;
        @XmlElement(name = "PrimaryAddress", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected Claim.EmployerWC.PrimaryAddress primaryAddress;
        @XmlElement(name = "PrimaryContact", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected Claim.EmployerWC.PrimaryContact primaryContact;
        @XmlElement(name = "WSIB_LegalName", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected String wsibLegalName;

        /**
         * Gets the value of the wsibAccountNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWSIBAccountNumber() {
            return wsibAccountNumber;
        }

        /**
         * Sets the value of the wsibAccountNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWSIBAccountNumber(String value) {
            this.wsibAccountNumber = value;
        }

        /**
         * Gets the value of the primaryAddress property.
         * 
         * @return
         *     possible object is
         *     {@link Claim.EmployerWC.PrimaryAddress }
         *     
         */
        public Claim.EmployerWC.PrimaryAddress getPrimaryAddress() {
            return primaryAddress;
        }

        /**
         * Sets the value of the primaryAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link Claim.EmployerWC.PrimaryAddress }
         *     
         */
        public void setPrimaryAddress(Claim.EmployerWC.PrimaryAddress value) {
            this.primaryAddress = value;
        }

        /**
         * Gets the value of the primaryContact property.
         * 
         * @return
         *     possible object is
         *     {@link Claim.EmployerWC.PrimaryContact }
         *     
         */
        public Claim.EmployerWC.PrimaryContact getPrimaryContact() {
            return primaryContact;
        }

        /**
         * Sets the value of the primaryContact property.
         * 
         * @param value
         *     allowed object is
         *     {@link Claim.EmployerWC.PrimaryContact }
         *     
         */
        public void setPrimaryContact(Claim.EmployerWC.PrimaryContact value) {
            this.primaryContact = value;
        }

        /**
         * Gets the value of the wsibLegalName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWSIBLegalName() {
            return wsibLegalName;
        }

        /**
         * Sets the value of the wsibLegalName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWSIBLegalName(String value) {
            this.wsibLegalName = value;
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
         *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "postalCode"
        })
        public static class PrimaryAddress {

            @XmlElement(name = "PostalCode", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected String postalCode;

            /**
             * Gets the value of the postalCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostalCode() {
                return postalCode;
            }

            /**
             * Sets the value of the postalCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostalCode(String value) {
                this.postalCode = value;
            }

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
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "name"
        })
        public static class PrimaryContact {

            @XmlElement(name = "Name", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected String name;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

        }

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
     *         &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "xmlDateTime"
    })
    public static class LossDate {

        @XmlElement(name = "XmlDateTime", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected String xmlDateTime;

        /**
         * Gets the value of the xmlDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXmlDateTime() {
            return xmlDateTime;
        }

        /**
         * Sets the value of the xmlDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXmlDateTime(String value) {
            this.xmlDateTime = value;
        }

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
     *         &lt;element name="MWAcceptance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="NoRTWModifiedWorkOffered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RTWWorkDate" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mwAcceptance",
        "noRTWModifiedWorkOffered",
        "rtwWorkDate"
    })
    public static class LossTimeRTWWC {

        @XmlElement(name = "MWAcceptance", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected Boolean mwAcceptance;
        @XmlElement(name = "NoRTWModifiedWorkOffered", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected String noRTWModifiedWorkOffered;
        @XmlElement(name = "RTWWorkDate", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected Claim.LossTimeRTWWC.RTWWorkDate rtwWorkDate;

        /**
         * Gets the value of the mwAcceptance property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMWAcceptance() {
            return mwAcceptance;
        }

        /**
         * Sets the value of the mwAcceptance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMWAcceptance(Boolean value) {
            this.mwAcceptance = value;
        }

        /**
         * Gets the value of the noRTWModifiedWorkOffered property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNoRTWModifiedWorkOffered() {
            return noRTWModifiedWorkOffered;
        }

        /**
         * Sets the value of the noRTWModifiedWorkOffered property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNoRTWModifiedWorkOffered(String value) {
            this.noRTWModifiedWorkOffered = value;
        }

        /**
         * Gets the value of the rtwWorkDate property.
         * 
         * @return
         *     possible object is
         *     {@link Claim.LossTimeRTWWC.RTWWorkDate }
         *     
         */
        public Claim.LossTimeRTWWC.RTWWorkDate getRTWWorkDate() {
            return rtwWorkDate;
        }

        /**
         * Sets the value of the rtwWorkDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Claim.LossTimeRTWWC.RTWWorkDate }
         *     
         */
        public void setRTWWorkDate(Claim.LossTimeRTWWC.RTWWorkDate value) {
            this.rtwWorkDate = value;
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
         *         &lt;element name="XmlDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "xmlDateTime"
        })
        public static class RTWWorkDate {

            @XmlElement(name = "XmlDateTime", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
            protected String xmlDateTime;

            /**
             * Gets the value of the xmlDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXmlDateTime() {
                return xmlDateTime;
            }

            /**
             * Sets the value of the xmlDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXmlDateTime(String value) {
                this.xmlDateTime = value;
            }

        }

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
     *         &lt;element name="WSIB_FirmNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "wsibFirmNumber"
    })
    public static class Policy {

        @XmlElement(name = "WSIB_FirmNumber", namespace = "http://guidewire.com/cc/gx/ca.on.wsib.cc.xmlmodel.kofaxclaimmodel", nillable = true)
        protected String wsibFirmNumber;

        /**
         * Gets the value of the wsibFirmNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWSIBFirmNumber() {
            return wsibFirmNumber;
        }

        /**
         * Sets the value of the wsibFirmNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWSIBFirmNumber(String value) {
            this.wsibFirmNumber = value;
        }

    }

}
