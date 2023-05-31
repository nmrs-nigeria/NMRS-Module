//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2022.11.01 at 09:42:41 AM WAT
//

package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for TBIndexPatientContactInvestigationType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TBIndexPatientContactInvestigationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VisitID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VisitDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TBContactInvestigator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesignationOfTBContactInvestigator" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="TBTrackingAssistant"/>
 *               &lt;enumeration value="DOTSFO"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PhoneNumberOfTBContactInvestigator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfTBContactTracing" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LGATBNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfHouseholdContacts" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="One"/>
 *               &lt;enumeration value="Two"/>
 *               &lt;enumeration value="Three"/>
 *               &lt;enumeration value="Four"/>
 *               &lt;enumeration value="Five"/>
 *               &lt;enumeration value="Six"/>
 *               &lt;enumeration value="Seven"/>
 *               &lt;enumeration value="Eight"/>
 *               &lt;enumeration value="Nine"/>
 *               &lt;enumeration value="Ten"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TypeOfTB">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="DSTB"/>
 *               &lt;enumeration value="DRTB"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ConsentForContactTracing">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Agree"/>
 *               &lt;enumeration value="DeclinedToAnswer"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TBContactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TBContactAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TBContactSex">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="FEMALE"/>
 *               &lt;enumeration value="MALE"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TBContactPhoneNumber" type="{}NumericType" minOccurs="0"/>
 *         &lt;element name="RelationshipWithTBIndexCase">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Father"/>
 *               &lt;enumeration value="Mother"/>
 *               &lt;enumeration value="Daughter"/>
 *               &lt;enumeration value="Sister"/>
 *               &lt;enumeration value="Brother"/>
 *               &lt;enumeration value="Son"/>
 *               &lt;enumeration value="Uncle"/>
 *               &lt;enumeration value="Aunt"/>
 *               &lt;enumeration value="Wife"/>
 *               &lt;enumeration value="Husband"/>
 *               &lt;enumeration value="Friend"/>
 *               &lt;enumeration value="Parent"/>
 *               &lt;enumeration value="Other"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CoughGreaterThanOrEqualTo2Weeks" type="{}YNCodeType" minOccurs="0"/>
 *         &lt;element name="RecentWeightLoss" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="No"/>
 *               &lt;enumeration value="Unknown"/>
 *               &lt;enumeration value="Yes"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NightSweat" type="{}YNCodeType" minOccurs="0"/>
 *         &lt;element name="Fever">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="No"/>
 *               &lt;enumeration value="Unknown"/>
 *               &lt;enumeration value="Yes"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PresumptiveTBCaseIdentified" type="{}YNCodeType" minOccurs="0"/>
 *         &lt;element name="PresumptiveTBCaseReferredForDiagnosis" type="{}YNCodeType" minOccurs="0"/>
 *         &lt;element name="SputumSamplesCollected" type="{}YNCodeType" minOccurs="0"/>
 *         &lt;element name="TBDiagnosed" type="{}YNCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBIndexPatientContactInvestigationType", propOrder = { "visitID", "visitDate", "tbContactInvestigator",
        "designationOfTBContactInvestigator", "phoneNumberOfTBContactInvestigator", "dateOfTBContactTracing", "lgatbNumber",
        "numberOfHouseholdContacts", "typeOfTB", "consentForContactTracing", "tbContactName", "tbContactAge",
        "tbContactSex", "tbContactPhoneNumber", "relationshipWithTBIndexCase", "coughGreaterThanOrEqualTo2Weeks",
        "recentWeightLoss", "nightSweat", "fever", "presumptiveTBCaseIdentified", "presumptiveTBCaseReferredForDiagnosis",
        "sputumSamplesCollected", "tbDiagnosed" })
public class TBIndexPatientContactInvestigationType {
	
	@XmlElement(name = "VisitID", required = true)
	protected String visitID;
	
	@XmlElement(name = "VisitDate", required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar visitDate;
	
	@XmlElement(name = "TBContactInvestigator")
	protected String tbContactInvestigator;
	
	@XmlElement(name = "DesignationOfTBContactInvestigator")
	protected String designationOfTBContactInvestigator;
	
	@XmlElement(name = "PhoneNumberOfTBContactInvestigator")
	protected String phoneNumberOfTBContactInvestigator;
	
	@XmlElement(name = "DateOfTBContactTracing")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar dateOfTBContactTracing;
	
	@XmlElement(name = "LGATBNumber")
	protected String lgatbNumber;
	
	@XmlElement(name = "NumberOfHouseholdContacts")
	protected String numberOfHouseholdContacts;
	
	@XmlElement(name = "TypeOfTB", required = true)
	protected String typeOfTB;
	
	@XmlElement(name = "ConsentForContactTracing", required = true)
	protected String consentForContactTracing;
	
	@XmlElement(name = "TBContactName", required = true)
	protected String tbContactName;
	
	@XmlElement(name = "TBContactAge")
	protected Integer tbContactAge;
	
	@XmlElement(name = "TBContactSex", required = true)
	protected String tbContactSex;
	
	@XmlElement(name = "TBContactPhoneNumber")
	protected String tbContactPhoneNumber;
	
	@XmlElement(name = "RelationshipWithTBIndexCase", required = true)
	protected String relationshipWithTBIndexCase;
	
	@XmlElement(name = "CoughGreaterThanOrEqualTo2Weeks")
	@XmlSchemaType(name = "string")
	protected YNCodeType coughGreaterThanOrEqualTo2Weeks;
	
	@XmlElement(name = "RecentWeightLoss")
	protected String recentWeightLoss;
	
	@XmlElement(name = "NightSweat")
	@XmlSchemaType(name = "string")
	protected YNCodeType nightSweat;
	
	@XmlElement(name = "Fever", required = true)
	protected String fever;
	
	@XmlElement(name = "PresumptiveTBCaseIdentified")
	@XmlSchemaType(name = "string")
	protected YNCodeType presumptiveTBCaseIdentified;
	
	@XmlElement(name = "PresumptiveTBCaseReferredForDiagnosis")
	@XmlSchemaType(name = "string")
	protected YNCodeType presumptiveTBCaseReferredForDiagnosis;
	
	@XmlElement(name = "SputumSamplesCollected")
	@XmlSchemaType(name = "string")
	protected YNCodeType sputumSamplesCollected;
	
	@XmlElement(name = "TBDiagnosed")
	@XmlSchemaType(name = "string")
	protected YNCodeType tbDiagnosed;
	
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
	 * Gets the value of the tbContactInvestigator property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getTBContactInvestigator() {
		return tbContactInvestigator;
	}
	
	/**
	 * Sets the value of the tbContactInvestigator property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setTBContactInvestigator(String value) {
		this.tbContactInvestigator = value;
	}
	
	/**
	 * Gets the value of the designationOfTBContactInvestigator property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getDesignationOfTBContactInvestigator() {
		return designationOfTBContactInvestigator;
	}
	
	/**
	 * Sets the value of the designationOfTBContactInvestigator property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setDesignationOfTBContactInvestigator(String value) {
		this.designationOfTBContactInvestigator = value;
	}
	
	/**
	 * Gets the value of the phoneNumberOfTBContactInvestigator property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPhoneNumberOfTBContactInvestigator() {
		return phoneNumberOfTBContactInvestigator;
	}
	
	/**
	 * Sets the value of the phoneNumberOfTBContactInvestigator property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setPhoneNumberOfTBContactInvestigator(String value) {
		this.phoneNumberOfTBContactInvestigator = value;
	}
	
	/**
	 * Gets the value of the dateOfTBContactTracing property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getDateOfTBContactTracing() {
		return dateOfTBContactTracing;
	}
	
	/**
	 * Sets the value of the dateOfTBContactTracing property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setDateOfTBContactTracing(XMLGregorianCalendar value) {
		this.dateOfTBContactTracing = value;
	}
	
	/**
	 * Gets the value of the lgatbNumber property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getLGATBNumber() {
		return lgatbNumber;
	}
	
	/**
	 * Sets the value of the lgatbNumber property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setLGATBNumber(String value) {
		this.lgatbNumber = value;
	}
	
	/**
	 * Gets the value of the numberOfHouseholdContacts property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getNumberOfHouseholdContacts() {
		return numberOfHouseholdContacts;
	}
	
	/**
	 * Sets the value of the numberOfHouseholdContacts property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setNumberOfHouseholdContacts(String value) {
		this.numberOfHouseholdContacts = value;
	}
	
	/**
	 * Gets the value of the typeOfTB property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getTypeOfTB() {
		return typeOfTB;
	}
	
	/**
	 * Sets the value of the typeOfTB property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setTypeOfTB(String value) {
		this.typeOfTB = value;
	}
	
	/**
	 * Gets the value of the consentForContactTracing property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getConsentForContactTracing() {
		return consentForContactTracing;
	}
	
	/**
	 * Sets the value of the consentForContactTracing property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setConsentForContactTracing(String value) {
		this.consentForContactTracing = value;
	}
	
	/**
	 * Gets the value of the tbContactName property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getTBContactName() {
		return tbContactName;
	}
	
	/**
	 * Sets the value of the tbContactName property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setTBContactName(String value) {
		this.tbContactName = value;
	}
	
	/**
	 * Gets the value of the tbContactAge property.
	 * 
	 * @return possible object is {@link Integer }
	 */
	public Integer getTBContactAge() {
		return tbContactAge;
	}
	
	/**
	 * Sets the value of the tbContactAge property.
	 * 
	 * @param value allowed object is {@link Integer }
	 */
	public void setTBContactAge(Integer value) {
		this.tbContactAge = value;
	}
	
	/**
	 * Gets the value of the tbContactSex property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getTBContactSex() {
		return tbContactSex;
	}
	
	/**
	 * Sets the value of the tbContactSex property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setTBContactSex(String value) {
		this.tbContactSex = value;
	}
	
	/**
	 * Gets the value of the tbContactPhoneNumber property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getTBContactPhoneNumber() {
		return tbContactPhoneNumber;
	}
	
	/**
	 * Sets the value of the tbContactPhoneNumber property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setTBContactPhoneNumber(String value) {
		this.tbContactPhoneNumber = value;
	}
	
	/**
	 * Gets the value of the relationshipWithTBIndexCase property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getRelationshipWithTBIndexCase() {
		return relationshipWithTBIndexCase;
	}
	
	/**
	 * Sets the value of the relationshipWithTBIndexCase property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setRelationshipWithTBIndexCase(String value) {
		this.relationshipWithTBIndexCase = value;
	}
	
	/**
	 * Gets the value of the coughGreaterThanOrEqualTo2Weeks property.
	 * 
	 * @return possible object is {@link YNCodeType }
	 */
	public YNCodeType getCoughGreaterThanOrEqualTo2Weeks() {
		return coughGreaterThanOrEqualTo2Weeks;
	}
	
	/**
	 * Sets the value of the coughGreaterThanOrEqualTo2Weeks property.
	 * 
	 * @param value allowed object is {@link YNCodeType }
	 */
	public void setCoughGreaterThanOrEqualTo2Weeks(YNCodeType value) {
		this.coughGreaterThanOrEqualTo2Weeks = value;
	}
	
	/**
	 * Gets the value of the recentWeightLoss property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getRecentWeightLoss() {
		return recentWeightLoss;
	}
	
	/**
	 * Sets the value of the recentWeightLoss property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setRecentWeightLoss(String value) {
		this.recentWeightLoss = value;
	}
	
	/**
	 * Gets the value of the nightSweat property.
	 * 
	 * @return possible object is {@link YNCodeType }
	 */
	public YNCodeType getNightSweat() {
		return nightSweat;
	}
	
	/**
	 * Sets the value of the nightSweat property.
	 * 
	 * @param value allowed object is {@link YNCodeType }
	 */
	public void setNightSweat(YNCodeType value) {
		this.nightSweat = value;
	}
	
	/**
	 * Gets the value of the fever property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getFever() {
		return fever;
	}
	
	/**
	 * Sets the value of the fever property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setFever(String value) {
		this.fever = value;
	}
	
	/**
	 * Gets the value of the presumptiveTBCaseIdentified property.
	 * 
	 * @return possible object is {@link YNCodeType }
	 */
	public YNCodeType getPresumptiveTBCaseIdentified() {
		return presumptiveTBCaseIdentified;
	}
	
	/**
	 * Sets the value of the presumptiveTBCaseIdentified property.
	 * 
	 * @param value allowed object is {@link YNCodeType }
	 */
	public void setPresumptiveTBCaseIdentified(YNCodeType value) {
		this.presumptiveTBCaseIdentified = value;
	}
	
	/**
	 * Gets the value of the presumptiveTBCaseReferredForDiagnosis property.
	 * 
	 * @return possible object is {@link YNCodeType }
	 */
	public YNCodeType getPresumptiveTBCaseReferredForDiagnosis() {
		return presumptiveTBCaseReferredForDiagnosis;
	}
	
	/**
	 * Sets the value of the presumptiveTBCaseReferredForDiagnosis property.
	 * 
	 * @param value allowed object is {@link YNCodeType }
	 */
	public void setPresumptiveTBCaseReferredForDiagnosis(YNCodeType value) {
		this.presumptiveTBCaseReferredForDiagnosis = value;
	}
	
	/**
	 * Gets the value of the sputumSamplesCollected property.
	 * 
	 * @return possible object is {@link YNCodeType }
	 */
	public YNCodeType getSputumSamplesCollected() {
		return sputumSamplesCollected;
	}
	
	/**
	 * Sets the value of the sputumSamplesCollected property.
	 * 
	 * @param value allowed object is {@link YNCodeType }
	 */
	public void setSputumSamplesCollected(YNCodeType value) {
		this.sputumSamplesCollected = value;
	}
	
	/**
	 * Gets the value of the tbDiagnosed property.
	 * 
	 * @return possible object is {@link YNCodeType }
	 */
	public YNCodeType getTBDiagnosed() {
		return tbDiagnosed;
	}
	
	/**
	 * Sets the value of the tbDiagnosed property.
	 * 
	 * @param value allowed object is {@link YNCodeType }
	 */
	public void setTBDiagnosed(YNCodeType value) {
		this.tbDiagnosed = value;
	}
	
}
