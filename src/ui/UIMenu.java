package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    //Constante
    public  static final  String[] MONTHS = {"Enero", "Febrero", "Marzo"};
    public  static  Doctor doctorLogged;
    public  static  Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. model.Doctor");
            System.out.println("2. model.Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    autUser(1);
                    response = 0;
                    break;
                case 2:
                    autUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void  autUser(int userType) {

        //userType = 1 Doctor
        //userType = 2 Paciente

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Nicolas Martin", "nico@gmail.com"));
        doctors.add(new Doctor("Rocio Loyola", "rocio@gmail.com"));
        doctors.add(new Doctor("Esteban Martin", "esteban@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Renzo" , "renzo@gmail.com"));
        patients.add(new Patient("Edu" , "Edu@gmail.com"));
        patients.add(new Patient("Renzo" , "renzo@gmail.com"));

        boolean emailCorrect = false;

        do {

            System.out.println("Insert your email: [a.gmail.com...]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (userType == 1) {
                for (Doctor doctor: doctors) {
                    if (doctor.getEmail().equals(email)) {
                        emailCorrect = true;
                        doctorLogged = doctor;
                        break;
                    }
                }

            }

            if (userType == 2) {
                for (Patient p : patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect=true;
                        patientLogged = p;
                    }
                }
            }

        } while (!emailCorrect);

    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i <= 2; i++) {
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