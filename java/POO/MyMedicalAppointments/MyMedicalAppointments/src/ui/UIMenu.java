package MyMedicalAppointments.src.ui;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.Doc;

import MyMedicalAppointments.src.model.Doctor;
import MyMedicalAppointments.src.model.Patient;

public class UIMenu {

    public static String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }
    private static void authUser(int userType){
        // 1 doctor
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("jose", "jose@doctor.com"));
        doctors.add(new Doctor("david", "david@doctor.com"));
        doctors.add(new Doctor("luz", "luz@doctor.com"));
        // 2 patient
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("carol", "carol@patient.com"));
        patients.add(new Patient("jose", "jose@patient.com"));
        patients.add(new Patient("cristian", "cristian@patient.com"));

        boolean emailCorret = false;
        do{
            System.out.println("Ingresa tu correo [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (userType == 1){
                for(Doctor d : doctors){
                    if(d.getEmail().equals(email)){
                        emailCorret = true; 
                        //odtener los datos del usuarios
                        doctorLogged = d;
                        //showDoctorMenu
                    }
                }
            }
            if(userType == 2){
                for(Patient p : patients){
                    if(p.getEmail().equals(email)){
                        emailCorret = true; 
                        //odtener los datos del usuarios
                        patientLogged = p;
                        //showPatientMenu
                    }
                }
            }

        }while(!emailCorret);
    }
    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i +". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
