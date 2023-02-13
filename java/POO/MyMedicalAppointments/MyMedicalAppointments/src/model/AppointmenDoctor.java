package MyMedicalAppointments.src.model;

import javax.print.Doc;
import java.util.Date;

public class AppointmenDoctor {
    private int id;
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private String time;

    public AppointmenDoctor(Patient patient, Doctor doctor, Date date, String time) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
}
