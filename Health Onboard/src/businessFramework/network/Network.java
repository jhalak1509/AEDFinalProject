/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.network;

import java.time.LocalDate;
import java.time.LocalTime;
//import java.util.Date;

/**
 *
 * @author jhalaksurve
 */
public class Appointment {
    
    int appointmentId;
    int doctorId;
    int patientId;
    char reasonForVisit;
    LocalDate dateOfVisit;
    LocalTime timeOfVisit;

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public char getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(char reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

    public LocalDate getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(LocalDate dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public LocalTime getTimeOfVisit() {
        return timeOfVisit;
    }

    public void setTimeOfVisit(LocalTime timeOfVisit) {
        this.timeOfVisit = timeOfVisit;
    }
    
    
}
