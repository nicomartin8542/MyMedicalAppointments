import java.util.ArrayList;
import java.util.Date;

public class Doctor {

    //Atributos
    static int id = 0; //Autoincrement
    String name;
    String email;
    String speciality;

    //Constructor
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }

    //Otro constructor
    Doctor(String name, String speciality) {
        System.out.println("El otro Dorct or es: " + name);
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void  showName (){
        System.out.println("El nombre del Doctor es: " + name);
    }

    public void  showId() {
        System.out.println("ID Doctor" + id);
    }

    //Creo una collection de AviableAppointment
    ArrayList<AviableAppointment> aviableAppointments = new ArrayList<>();
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

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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
