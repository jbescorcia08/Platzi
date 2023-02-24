package MyMedicalAppointments.src.ui;

import java.util.Scanner;

public class UIDoctorMenu {
    public static void showDoctorMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor.");
            System.out.println("Bienvenido " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Scheduled appointments");

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
                System.out.println(monstSelect + ". " + UIMenu.MONTHS[monstSelect]);
                System.out.println("Coloca la fecha; [DD/MM/YYYY]");
                String date = sc.nextLine();

                System.out.println("Your date is: "+date+"\n1. correct\n2.cambiar fecha");
                
            } else if (response == 0) {
                showDoctorMenu();
            }
        } while (response != 0);
    }
}
