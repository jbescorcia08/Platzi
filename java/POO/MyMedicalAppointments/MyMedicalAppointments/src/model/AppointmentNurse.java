package MyMedicalAppointments.src.model;

import java.util.Date;

public class AppointmentNurse implements Ischedulable {

    private int id;
    private Patient patient;
    private Nurse nurse;
    private Date date;
    private String time;

    public AppointmentNurse(Patient patient, Doctor doctor, Date date, String time) {
        this.patient = patient;
        this.nurse = nurse;
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

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
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

    @Override
    public void schedule(Date date, String time) {
        // TODO Auto-generated method stub
        
    }

    

}
