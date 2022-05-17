package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UiDoctorMenu {

    public static ArrayList<Doctor> doctorsAviableAppoitment = new ArrayList<>();

    public static  void  showDoctorMenu() {

        int response  = 0 ;

        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Aviable Appointment");
            System.out.println("2. My Scheduled Appointment");
            System.out.println("0. Logout");


            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                  break;

                case 2:
                  break;

                case 0:
                    break;
            }

        } while (response != 0);
    }

    private static void  showAddAviableAppointmentsMenu ()  {
        int response = 0 ;
        do {
            System.out.println("::Add Aviable Apponintment");
            System.out.println(":: Select a Month");

            for (int i = 0; i < 3; i++) {
                int j = i + 1 ;
                System.out.println( j + ". " + UIMenu.MONTHS[i]);
            }

            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response < 4 ) {

                int monthSelected = response ;
                System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected]);

                System.out.println("Insert the date aviable: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Usted ingreso esta fecha: " + date + "\n1. Correcto\n2. Incorecto");

                int responseDate = Integer.valueOf(sc.nextLine());
                if (responseDate == 2 ) continue;

                int responseTime = 0 ;
                String time = "";
                do {
                    System.out.println("Insert the time aviable for date " + date + "[16:00]");
                    time = sc.nextLine();
                    System.out.println("Usted ingreso esta hora: " + time + "\n1. Correcto\n2. Incorecto");
                    checkDoctoAviableAppointment(UIMenu.doctorLogged);
                } while (responseTime == 2);

                UIMenu.doctorLogged.addAviableAppointment(date, time);
            } else if (response == 0) {
                showDoctorMenu();
            }


        } while (response != 0);
    }

    private  static void  checkDoctoAviableAppointment (Doctor doctor) {
        if (doctor.getAviableAppointments().size() > 0 && !doctorsAviableAppoitment.contains(doctor)) {
            doctorsAviableAppoitment.add(doctor);
        }
    }


}
