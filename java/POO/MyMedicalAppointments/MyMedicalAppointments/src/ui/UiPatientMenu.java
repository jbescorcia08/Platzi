package MyMedicalAppointments.src.ui;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import MyMedicalAppointments.src.model.Doctor;

public class UiPatientMenu {
    public static void showPatientMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: "+UIMenu.patientLogged);
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointment");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response) {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;

            }
            
        }while(response!= 0);
    }
    private static void showBookAppointmentsMenu(){
        int response = 0;
        do{
            System.out.println(":: Book an appointment");
            System.out.println(":: Select date: ");
            //numeracion de la lista de fechas.
            //indice fecha seleccion

            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            for (int i = 0; i < UIDoctorMenu.doctorAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableApointment> availableAppointments = UIDoctorMenu.doctorAvailableAppointments.get(i).getAvailableAppApointments();

                Map<Integer, Doctor> doctorAppointment = new TreeMap<>();
                System.out.println();
            }
        }while(response != 0);
    }
}
