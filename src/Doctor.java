import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

    //Atributos
    private String speciality;

    //Atributos para clase aviableApóintment
    private Date date;
    private String time;

    //constructor
    Doctor(String name, String email) {
        super(name, email);
        this.speciality = speciality;
    }

    //Comportamientos/Metodos

    //Creo una collection de AviableAppointment
    ArrayList<AviableAppointment> aviableAppointments = new ArrayList<>();


    //Comportamientos/Metodos
    public void addAviableAppointment (Date date, String time){
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

        public AviableAppointment(Date date, String time) {
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
