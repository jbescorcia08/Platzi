package MyMedicalAppointments.src;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Atributos
    static int id = 0; //Autoincrement
    String name;
    String email;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
    }

    Doctor(String name, String speciality){
        System.out.println("El nombre del Doctor asignado es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
    ArrayList<AvailableApointment> availableApointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableApointments.add(new AvailableApointment(date, time));
    }

    public ArrayList<AvailableApointment> getAvailableAppApointments(){
        return availableApointments;
    }


    public static class AvailableApointment{
        private int id;
        private Date date;
        private String time;

               
        public AvailableApointment(Date date, String time) {
            id++;
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

        
             
    }

}
