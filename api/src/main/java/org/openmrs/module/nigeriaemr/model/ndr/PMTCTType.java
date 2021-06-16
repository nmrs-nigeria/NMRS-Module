
package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for PMTCTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PMTCTType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ANCNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Immunization" type="{}ImmunizationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeliveryEncounter" type="{}DeliveryEncounterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AntenatalRegistration" type="{}AntenatalRegistrationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChildBirthDetails" type="{}ChildBirthDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChildFollowup" type="{}ChildFollowupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InfantPCRTesting" type="{}InfantPCRTestingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HealthFacilityVisits" type="{}HealthFacilityVisitsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartnerDetails" type="{}PartnerDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InfantRapidTest" type="{}InfantRapidTestType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaternalCohort" type="{}MaternalCohortType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PMTCTHTS" type="{}PMTCTHTSType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PMTCTType", propOrder = {
    "ancNumber",
    "immunization",
    "deliveryEncounter",
    "antenatalRegistration",
    "childBirthDetails",
    "childFollowup",
    "infantPCRTesting",
    "healthFacilityVisits",
    "partnerDetails",
    "infantRapidTest",
    "maternalCohort",
    "pmtcthts"
})
public class PMTCTType {

    @XmlElement(name = "ANCNumber")
    protected String ancNumber;
    @XmlElement(name = "Immunization")
    protected List<ImmunizationType> immunization;
    @XmlElement(name = "DeliveryEncounter")
    protected List<DeliveryEncounterType> deliveryEncounter;
    @XmlElement(name = "AntenatalRegistration")
    protected List<AntenatalRegistrationType> antenatalRegistration;
    @XmlElement(name = "ChildBirthDetails")
    protected List<ChildBirthDetailsType> childBirthDetails;
    @XmlElement(name = "ChildFollowup")
    protected List<ChildFollowupType> childFollowup;
    @XmlElement(name = "InfantPCRTesting")
    protected List<InfantPCRTestingType> infantPCRTesting;
    @XmlElement(name = "HealthFacilityVisits")
    protected List<HealthFacilityVisitsType> healthFacilityVisits;
    @XmlElement(name = "PartnerDetails")
    protected List<PartnerDetailsType> partnerDetails;
    @XmlElement(name = "InfantRapidTest")
    protected List<InfantRapidTestType> infantRapidTest;
    @XmlElement(name = "MaternalCohort")
    protected List<MaternalCohortType> maternalCohort;
    @XmlElement(name = "PMTCTHTS")
    protected List<PMTCTHTSType> pmtcthts;

    /**
     * Gets the value of the ancNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANCNumber() {
        return ancNumber;
    }

    /**
     * Sets the value of the ancNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANCNumber(String value) {
        this.ancNumber = value;
    }

    /**
     * Gets the value of the immunization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the immunization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImmunization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImmunizationType }
     * 
     * 
     */
    public List<ImmunizationType> getImmunization() {
        if (immunization == null) {
            immunization = new ArrayList<ImmunizationType>();
        }
        return this.immunization;
    }

    /**
     * Gets the value of the deliveryEncounter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryEncounter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryEncounter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryEncounterType }
     * 
     * 
     */
    public List<DeliveryEncounterType> getDeliveryEncounter() {
        if (deliveryEncounter == null) {
            deliveryEncounter = new ArrayList<DeliveryEncounterType>();
        }
        return this.deliveryEncounter;
    }

    /**
     * Gets the value of the antenatalRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the antenatalRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAntenatalRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AntenatalRegistrationType }
     * 
     * 
     */
    public List<AntenatalRegistrationType> getAntenatalRegistration() {
        if (antenatalRegistration == null) {
            antenatalRegistration = new ArrayList<AntenatalRegistrationType>();
        }
        return this.antenatalRegistration;
    }

    /**
     * Gets the value of the childBirthDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childBirthDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildBirthDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildBirthDetailsType }
     * 
     * 
     */
    public List<ChildBirthDetailsType> getChildBirthDetails() {
        if (childBirthDetails == null) {
            childBirthDetails = new ArrayList<ChildBirthDetailsType>();
        }
        return this.childBirthDetails;
    }

    /**
     * Gets the value of the childFollowup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childFollowup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildFollowup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildFollowupType }
     * 
     * 
     */
    public List<ChildFollowupType> getChildFollowup() {
        if (childFollowup == null) {
            childFollowup = new ArrayList<ChildFollowupType>();
        }
        return this.childFollowup;
    }

    /**
     * Gets the value of the infantPCRTesting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infantPCRTesting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfantPCRTesting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfantPCRTestingType }
     * 
     * 
     */
    public List<InfantPCRTestingType> getInfantPCRTesting() {
        if (infantPCRTesting == null) {
            infantPCRTesting = new ArrayList<InfantPCRTestingType>();
        }
        return this.infantPCRTesting;
    }

    /**
     * Gets the value of the healthFacilityVisits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthFacilityVisits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthFacilityVisits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthFacilityVisitsType }
     * 
     * 
     */
    public List<HealthFacilityVisitsType> getHealthFacilityVisits() {
        if (healthFacilityVisits == null) {
            healthFacilityVisits = new ArrayList<HealthFacilityVisitsType>();
        }
        return this.healthFacilityVisits;
    }

    /**
     * Gets the value of the partnerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerDetailsType }
     * 
     * 
     */
    public List<PartnerDetailsType> getPartnerDetails() {
        if (partnerDetails == null) {
            partnerDetails = new ArrayList<PartnerDetailsType>();
        }
        return this.partnerDetails;
    }

    /**
     * Gets the value of the infantRapidTest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infantRapidTest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfantRapidTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfantRapidTestType }
     * 
     * 
     */
    public List<InfantRapidTestType> getInfantRapidTest() {
        if (infantRapidTest == null) {
            infantRapidTest = new ArrayList<InfantRapidTestType>();
        }
        return this.infantRapidTest;
    }

    /**
     * Gets the value of the maternalCohort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maternalCohort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaternalCohort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaternalCohortType }
     * 
     * 
     */
    public List<MaternalCohortType> getMaternalCohort() {
        if (maternalCohort == null) {
            maternalCohort = new ArrayList<MaternalCohortType>();
        }
        return this.maternalCohort;
    }

    /**
     * Gets the value of the pmtcthts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtcthts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPMTCTHTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PMTCTHTSType }
     * 
     * 
     */
    public List<PMTCTHTSType> getPMTCTHTS() {
        if (pmtcthts == null) {
            pmtcthts = new ArrayList<PMTCTHTSType>();
        }
        return this.pmtcthts;
    }

}
