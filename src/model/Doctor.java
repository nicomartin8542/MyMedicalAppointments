package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

    //Atributos
    private String speciality;

    //Atributos para clase aviableApóintment
    private Date date;
    private String time;

    //constructor
    public Doctor(String name, String email) {
        super(name, email);
        this.speciality = speciality;
    }

    @Override
    public void ShowDataUser() {
        System.out.println("Hospital: Cruz roja");
        System.out.println("Departamente: oncologi");
    }

    //Comportamientos/Metodos

    //Creo una collection de AviableAppointment
    ArrayList<AviableAppointment> aviableAppointments = new ArrayList<>();


    //Comportamientos/Metodos
    public void addAviableAppointment (String date, String time){


        aviableAppointments.add(new Doctor.AviableAppointment(date, time));
    }

    //Devuelvo el array de appointment
    public ArrayList<AviableAppointment> getAviableAppointments () {
        return aviableAppointments;
    }

    //Clase anidada
    public static class AviableAppointment{
        private int id ;
        private Date date;
        private String time;

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        public AviableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }

        public Date getDate() {
            return date;
        }
        public String getDate(String date) {
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
    }
}
