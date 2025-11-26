/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Patient;

/**
 *
 * @author gaganaananda
 */
public class Patient {
    
    
    private String patientId;
    private String patientLstNm;
    private String patientFrstNm;
    private String ssn;
    private String patientAge;
    private String contactNo;
    private String address;
    private String gender;
    private boolean isTreatmentDone;
    private String appoitmentDate;
    private String patientMail;
    private String doctorType;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientLstNm() {
        return patientLstNm;
    }

    public void setPatientLstNm(String patientLstNm) {
        this.patientLstNm = patientLstNm;
    }

    public String getPatientFrstNm() {
        return patientFrstNm;
    }

    public void setPatientFrstNm(String patientFrstNm) {
        this.patientFrstNm = patientFrstNm;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isIsTreatmentDone() {
        return isTreatmentDone;
    }

    public void setIsTreatmentDone(boolean isTreatmentDone) {
        this.isTreatmentDone = isTreatmentDone;
    }

    public String getAppoitmentDate() {
        return appoitmentDate;
    }

    public void setAppoitmentDate(String appoitmentDate) {
        this.appoitmentDate = appoitmentDate;
    }

    public String getPatientMail() {
        return patientMail;
    }

    public void setPatientMail(String patientMail) {
        this.patientMail = patientMail;
    }

    public String getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType;
    }

    @Override
    public String toString() {
        return "Patient{" + "patientId=" + patientId + '}';
    }

    
    
    
    
}
