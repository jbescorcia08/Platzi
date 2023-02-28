package MyMedicalAppointments.src.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    //Atributos

    String speciality;


    public Doctor(String name, String email){
        super(name, email);
        this.speciality = speciality;
    }
    

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    ArrayList<AvailableApointment> availableApointments = new ArrayList<>();
    public void addAvailableAppointment(String date, String time){

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
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
               
        public AvailableApointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            this.time = time;
        }


        public Date getDate() {
            return date;
        }
        public String getDate(String DATE) {
            return format.format(date);
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



    @Override
    public void printDataUser() {
        // TODO Auto-generated method stub
        System.out.println("Soy un doctor.");
    }

}
