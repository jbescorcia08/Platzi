package MyMedicalAppointments.src.ui;

import java.util.ArrayList;
import java.util.Scanner;
import MyMedicalAppointments.src.model.Doctor;
import javax.print.Doc;
import javax.print.attribute.standard.Sides;

public class UIDoctorMenu {
    public static ArrayList<Doctor> doctorAvailableAppointments = new ArrayList<>();
    public static void showDoctorMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor.");
            System.out.println("Bienvenido " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Scheduled appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response) {
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;

            }

        } while (response != 0);
    }

    private static void showAddAvailableAppointmentsMenu() {
        int response = 0;
        do {
            System.out.println();
            System.out.println("::Add available appointments");
            System.out.println("Select a monts");

            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. return");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            if (response > 0 && response < 4) {
                int monstSelect = response;
                System.out.println(monstSelect + ". " + UIMenu.MONTHS[monstSelect-1]);
                System.out.println("Coloca la fecha; [DD/MM/YYYY]");
                String date = sc.nextLine();

                System.out.println("Your date is: " + date + "\n1. correct\n2.cambiar fecha");
                int responseDate = Integer.valueOf(sc.nextLine());
                if (responseDate == 2)
                    continue;

                int responseTime = 0;
                String time = "";

                do {
                    System.out.println("Insert the time available for date; " + date + " [16:00]");
                    time = sc.nextLine();
                    System.out.println("Your time is: " + time + " \n1. correct\n2.Change time");
                    responseTime = Integer.valueOf(sc.nextLine());

                } while (responseTime == 2);

                UIMenu.doctorLogged.addAvailableAppointment(date,time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);
            } else if (response == 0) {
                showDoctorMenu();                 
            }
        } while (response != 0);
    }
    private static void checkDoctorAvailableAppointments(Doctor doctor){
        if(doctor.getAvailableAppApointments().size() > 0 && !doctorAvailableAppointments.contains(doctor)){
            doctorAvailableAppointments.add(doctor);
        }
    }
}
