package MyMedicalAppointments.src;
import static MyMedicalAppointments.src.ui.UIMenu.*;
import java.util.Date;

import MyMedicalAppointments.src.model.Doctor;
import MyMedicalAppointments.src.model.Nurse;
import MyMedicalAppointments.src.model.Patient;
import MyMedicalAppointments.src.model.User;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        System.out.println("\n");
        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatria");
        
        Patient patient1 = new Patient("jesus", "jassjhda@gmail.com");
        System.out.println(patient1);
        System.out.println("\n");

        myDoctor.addAvailableAppointment(new Date(), "12:12");
        myDoctor.addAvailableAppointment(new Date(), "13:12");
        myDoctor.addAvailableAppointment(new Date(), "14:12");
        myDoctor.addAvailableAppointment(new Date(), "15:12");
        System.out.println(myDoctor);

        User userDoc = new Doctor("jesus", "jesus@jesus.com");
        System.out.println(userDoc);
        userDoc.printDataUser();

        User userNu = new Nurse("jessi", "jessi@jessi.com", "pediatra");
        System.out.println(userNu);
        userNu.printDataUser();

        User userPa = new Patient("kessi", "jessi@jessi.com");
        System.out.println(userPa);
        userPa.printDataUser();


        
        /*
        for (Doctor.AvailableApointment aA : myDoctor.getAvailableAppApointments()) {
            System.out.println(aA.getDate()+" "+aA.getTime());
        }
        */


        /*System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        Patient patient2 = new Patient("Anahi", "anahi@mail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());*/

    }

}
