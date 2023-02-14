package MyMedicalAppointments.src.model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    //Atributos

    String speciality;


    public Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del Doctor asignado es: " + name);
        this.speciality = speciality;
    }
    

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    ArrayList<AvailableApointment> availableApointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableApointments.add(new AvailableApointment(date, time));
    }

    public ArrayList<AvailableApointment> getAvailableAppApointments(){
        return availableApointments;
    }
    


    @Override
    public String toString() {
        return super.toString()+
        "\nDoctor [speciality=" + speciality + "]";
    }



    public static class AvailableApointment{
        private Date date;
        private String time;

               
        public AvailableApointment(Date date, String time) {
            this.date = date;
            this.time = time;
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
        public String toString() {
            return super.toString()+
            "AvailableApointment \ndate=" + date + ", \ntime=" + time ;
        }
        
        
             
    }

}
