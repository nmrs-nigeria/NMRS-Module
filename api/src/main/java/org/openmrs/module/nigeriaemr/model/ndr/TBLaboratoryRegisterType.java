//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2022.11.23 at 09:34:14 AM WAT
//

package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for TBLaboratoryRegisterType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TBLaboratoryRegisterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VisitID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VisitDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="NTBLCPOrTB04" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LaboratoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LGA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecimenIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateSpecimenWasSentToLaboratory" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SpecimenStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="SpecimenAccepted"/>
 *               &lt;enumeration value="SpecimenRejected"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReasonForSpecimenRejection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferringFacilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeOfTBPresumptive" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="DSTB"/>
 *               &lt;enumeration value="DRTB"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TBSiteOfDisease" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Pulmonary"/>
 *               &lt;enumeration value="ExtraPulmonary"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HealthCareProvider" type="{}YNCodeType" minOccurs="0"/>
 *         &lt;element name="HIVStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Positive"/>
 *               &lt;enumeration value="Negative"/>
 *               &lt;enumeration value="Unknown"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TestedForHIVInTheLab" type="{}YNCodeType" minOccurs="0"/>
 *         &lt;element name="SpecifyTypeOfSpecimen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecifyTestsRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WasMTBDetected" type="{}YNCodeType" minOccurs="0"/>
 *         &lt;element name="SpecifyDetectedMTB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvalidOrIncompleteTest" type="{}YNCodeType" minOccurs="0"/>
 *         &lt;element name="ReasonForAFBTest" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="FollowUp"/>
 *               &lt;enumeration value="Diagnosis"/>
 *               &lt;enumeration value="MonthOfTreatment"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AFBResult" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="OtherTBTestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherTBTestsResult" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Positive"/>
 *               &lt;enumeration value="Negative"/>
 *               &lt;enumeration value="Indeterminate"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NameOfReporter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TuberculosisTestResultDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TBRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBLaboratoryRegisterType", propOrder = { "visitID", "visitDate", "ntblcpOrTB04", "laboratoryName", "lga",
        "specimenIdentificationNumber", "dateSpecimenWasSentToLaboratory", "specimenStatus", "reasonForSpecimenRejection",
        "referringFacilityName", "typeOfTBPresumptive", "tbSiteOfDisease", "healthCareProvider", "hivStatus",
        "testedForHIVInTheLab", "specifyTypeOfSpecimen", "specifyTestsRequired", "wasMTBDetected", "specifyDetectedMTB",
        "errorCode", "invalidOrIncompleteTest", "reasonForAFBTest", "afbResult", "otherTBTestType", "otherTBTestsResult",
        "nameOfReporter", "tuberculosisTestResultDate", "tbRemarks" })
public class TBLaboratoryRegisterType {
	
	@XmlElement(name = "VisitID", required = true)
	protected String visitID;
	
	@XmlElement(name = "VisitDate", required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar visitDate;
	
	@XmlElement(name = "NTBLCPOrTB04")
	protected String ntblcpOrTB04;
	
	@XmlElement(name = "LaboratoryName")
	protected String laboratoryName;
	
	@XmlElement(name = "LGA")
	protected String lga;
	
	@XmlElement(name = "SpecimenIdentificationNumber")
	protected String specimenIdentificationNumber;
	
	@XmlElement(name = "DateSpecimenWasSentToLaboratory")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar dateSpecimenWasSentToLaboratory;
	
	@XmlElement(name = "SpecimenStatus")
	protected String specimenStatus;
	
	@XmlElement(name = "ReasonForSpecimenRejection")
	protected String reasonForSpecimenRejection;
	
	@XmlElement(name = "ReferringFacilityName")
	protected String referringFacilityName;
	
	@XmlElement(name = "TypeOfTBPresumptive")
	protected String typeOfTBPresumptive;
	
	@XmlElement(name = "TBSiteOfDisease")
	protected String tbSiteOfDisease;
	
	@XmlElement(name = "HealthCareProvider")
	@XmlSchemaType(name = "string")
	protected YNCodeType healthCareProvider;
	
	@XmlElement(name = "HIVStatus")
	protected String hivStatus;
	
	@XmlElement(name = "TestedForHIVInTheLab")
	@XmlSchemaType(name = "string")
	protected YNCodeType testedForHIVInTheLab;
	
	@XmlElement(name = "SpecifyTypeOfSpecimen")
	protected String specifyTypeOfSpecimen;
	
	@XmlElement(name = "SpecifyTestsRequired")
	protected String specifyTestsRequired;
	
	@XmlElement(name = "WasMTBDetected")
	@XmlSchemaType(name = "string")
	protected YNCodeType wasMTBDetected;
	
	@XmlElement(name = "SpecifyDetectedMTB")
	protected String specifyDetectedMTB;
	
	@XmlElement(name = "ErrorCode")
	protected String errorCode;
	
	@XmlElement(name = "InvalidOrIncompleteTest")
	@XmlSchemaType(name = "string")
	protected YNCodeType invalidOrIncompleteTest;
	
	@XmlElement(name = "ReasonForAFBTest")
	protected String reasonForAFBTest;
	
	@XmlElement(name = "AFBResult")
	protected Float afbResult;
	
	@XmlElement(name = "OtherTBTestType")
	protected String otherTBTestType;
	
	@XmlElement(name = "OtherTBTestsResult")
	protected String otherTBTestsResult;
	
	@XmlElement(name = "NameOfReporter")
	protected String nameOfReporter;
	
	@XmlElement(name = "TuberculosisTestResultDate")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar tuberculosisTestResultDate;
	
	@XmlElement(name = "TBRemarks")
	protected String tbRemarks;
	
	/**
	 * Gets the value of the visitID property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getVisitID() {
		return visitID;
	}
	
	/**
	 * Sets the value of the visitID property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setVisitID(String value) {
		this.visitID = value;
	}
	
	/**
	 * Gets the value of the visitDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getVisitDate() {
		return visitDate;
	}
	
	/**
	 * Sets the value of the visitDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setVisitDate(XMLGregorianCalendar value) {
		this.visitDate = value;
	}
	
	/**
	 * Gets the value of the ntblcpOrTB04 property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getNTBLCPOrTB04() {
		return ntblcpOrTB04;
	}
	
	/**
	 * Sets the value of the ntblcpOrTB04 property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setNTBLCPOrTB04(String value) {
		this.ntblcpOrTB04 = value;
	}
	
	/**
	 * Gets the value of the laboratoryName property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getLaboratoryName() {
		return laboratoryName;
	}
	
	/**
	 * Sets the value of the laboratoryName property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setLaboratoryName(String value) {
		this.laboratoryName = value;
	}
	
	/**
	 * Gets the value of the lga property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getLGA() {
		return lga;
	}
	
	/**
	 * Sets the value of the lga property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setLGA(String value) {
		this.lga = value;
	}
	
	/**
	 * Gets the value of the specimenIdentificationNumber property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getSpecimenIdentificationNumber() {
		return specimenIdentificationNumber;
	}
	
	/**
	 * Sets the value of the specimenIdentificationNumber property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setSpecimenIdentificationNumber(String value) {
		this.specimenIdentificationNumber = value;
	}
	
	/**
	 * Gets the value of the dateSpecimenWasSentToLaboratory property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getDateSpecimenWasSentToLaboratory() {
		return dateSpecimenWasSentToLaboratory;
	}
	
	/**
	 * Sets the value of the dateSpecimenWasSentToLaboratory property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setDateSpecimenWasSentToLaboratory(XMLGregorianCalendar value) {
		this.dateSpecimenWasSentToLaboratory = value;
	}
	
	/**
	 * Gets the value of the specimenStatus property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getSpecimenStatus() {
		return specimenStatus;
	}
	
	/**
	 * Sets the value of the specimenStatus property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setSpecimenStatus(String value) {
		this.specimenStatus = value;
	}
	
	/**
	 * Gets the value of the reasonForSpecimenRejection property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getReasonForSpecimenRejection() {
		return reasonForSpecimenRejection;
	}
	
	/**
	 * Sets the value of the reasonForSpecimenRejection property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setReasonForSpecimenRejection(String value) {
		this.reasonForSpecimenRejection = value;
	}
	
	/**
	 * Gets the value of the referringFacilityName property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getReferringFacilityName() {
		return referringFacilityName;
	}
	
	/**
	 * Sets the value of the referringFacilityName property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setReferringFacilityName(String value) {
		this.referringFacilityName = value;
	}
	
	/**
	 * Gets the value of the typeOfTBPresumptive property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getTypeOfTBPresumptive() {
		return typeOfTBPresumptive;
	}
	
	/**
	 * Sets the value of the typeOfTBPresumptive property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setTypeOfTBPresumptive(String value) {
		this.typeOfTBPresumptive = value;
	}
	
	/**
	 * Gets the value of the tbSiteOfDisease property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getTBSiteOfDisease() {
		return tbSiteOfDisease;
	}
	
	/**
	 * Sets the value of the tbSiteOfDisease property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setTBSiteOfDisease(String value) {
		this.tbSiteOfDisease = value;
	}
	
	/**
	 * Gets the value of the healthCareProvider property.
	 * 
	 * @return possible object is {@link YNCodeType }
	 */
	public YNCodeType getHealthCareProvider() {
		return healthCareProvider;
	}
	
	/**
	 * Sets the value of the healthCareProvider property.
	 * 
	 * @param value allowed object is {@link YNCodeType }
	 */
	public void setHealthCareProvider(YNCodeType value) {
		this.healthCareProvider = value;
	}
	
	/**
	 * Gets the value of the hivStatus property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getHIVStatus() {
		return hivStatus;
	}
	
	/**
	 * Sets the value of the hivStatus property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setHIVStatus(String value) {
		this.hivStatus = value;
	}
	
	/**
	 * Gets the value of the testedForHIVInTheLab property.
	 * 
	 * @return possible object is {@link YNCodeType }
	 */
	public YNCodeType getTestedForHIVInTheLab() {
		return testedForHIVInTheLab;
	}
	
	/**
	 * Sets the value of the testedForHIVInTheLab property.
	 * 
	 * @param value allowed object is {@link YNCodeType }
	 */
	public void setTestedForHIVInTheLab(YNCodeType value) {
		this.testedForHIVInTheLab = value;
	}
	
	/**
	 * Gets the value of the specifyTypeOfSpecimen property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getSpecifyTypeOfSpecimen() {
		return specifyTypeOfSpecimen;
	}
	
	/**
	 * Sets the value of the specifyTypeOfSpecimen property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setSpecifyTypeOfSpecimen(String value) {
		this.specifyTypeOfSpecimen = value;
	}
	
	/**
	 * Gets the value of the specifyTestsRequired property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getSpecifyTestsRequired() {
		return specifyTestsRequired;
	}
	
	/**
	 * Sets the value of the specifyTestsRequired property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setSpecifyTestsRequired(String value) {
		this.specifyTestsRequired = value;
	}
	
	/**
	 * Gets the value of the wasMTBDetected property.
	 * 
	 * @return possible object is {@link YNCodeType }
	 */
	public YNCodeType getWasMTBDetected() {
		return wasMTBDetected;
	}
	
	/**
	 * Sets the value of the wasMTBDetected property.
	 * 
	 * @param value allowed object is {@link YNCodeType }
	 */
	public void setWasMTBDetected(YNCodeType value) {
		this.wasMTBDetected = value;
	}
	
	/**
	 * Gets the value of the specifyDetectedMTB property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getSpecifyDetectedMTB() {
		return specifyDetectedMTB;
	}
	
	/**
	 * Sets the value of the specifyDetectedMTB property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setSpecifyDetectedMTB(String value) {
		this.specifyDetectedMTB = value;
	}
	
	/**
	 * Gets the value of the errorCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getErrorCode() {
		return errorCode;
	}
	
	/**
	 * Sets the value of the errorCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setErrorCode(String value) {
		this.errorCode = value;
	}
	
	/**
	 * Gets the value of the invalidOrIncompleteTest property.
	 * 
	 * @return possible object is {@link YNCodeType }
	 */
	public YNCodeType getInvalidOrIncompleteTest() {
		return invalidOrIncompleteTest;
	}
	
	/**
	 * Sets the value of the invalidOrIncompleteTest property.
	 * 
	 * @param value allowed object is {@link YNCodeType }
	 */
	public void setInvalidOrIncompleteTest(YNCodeType value) {
		this.invalidOrIncompleteTest = value;
	}
	
	/**
	 * Gets the value of the reasonForAFBTest property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getReasonForAFBTest() {
		return reasonForAFBTest;
	}
	
	/**
	 * Sets the value of the reasonForAFBTest property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setReasonForAFBTest(String value) {
		this.reasonForAFBTest = value;
	}
	
	/**
	 * Gets the value of the afbResult property.
	 * 
	 * @return possible object is {@link Float }
	 */
	public Float getAFBResult() {
		return afbResult;
	}
	
	/**
	 * Sets the value of the afbResult property.
	 * 
	 * @param value allowed object is {@link Float }
	 */
	public void setAFBResult(Float value) {
		this.afbResult = value;
	}
	
	/**
	 * Gets the value of the otherTBTestType property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getOtherTBTestType() {
		return otherTBTestType;
	}
	
	/**
	 * Sets the value of the otherTBTestType property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setOtherTBTestType(String value) {
		this.otherTBTestType = value;
	}
	
	/**
	 * Gets the value of the otherTBTestsResult property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getOtherTBTestsResult() {
		return otherTBTestsResult;
	}
	
	/**
	 * Sets the value of the otherTBTestsResult property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setOtherTBTestsResult(String value) {
		this.otherTBTestsResult = value;
	}
	
	/**
	 * Gets the value of the nameOfReporter property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getNameOfReporter() {
		return nameOfReporter;
	}
	
	/**
	 * Sets the value of the nameOfReporter property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setNameOfReporter(String value) {
		this.nameOfReporter = value;
	}
	
	/**
	 * Gets the value of the tuberculosisTestResultDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getTuberculosisTestResultDate() {
		return tuberculosisTestResultDate;
	}
	
	/**
	 * Sets the value of the tuberculosisTestResultDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setTuberculosisTestResultDate(XMLGregorianCalendar value) {
		this.tuberculosisTestResultDate = value;
	}
	
	/**
	 * Gets the value of the tbRemarks property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getTBRemarks() {
		return tbRemarks;
	}
	
	/**
	 * Sets the value of the tbRemarks property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setTBRemarks(String value) {
		this.tbRemarks = value;
	}
	
}
