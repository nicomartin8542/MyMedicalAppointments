import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Nicolas", "Cardiologo");

        myDoctor.addAviableAppointment(new Date(), "4pm");
        myDoctor.addAviableAppointment(new Date(), "1pm");

        for (Doctor.AviableAppointment a: myDoctor.getAviableAppointments()) {
            System.out.println(a.getDate() + " " + a.getTime());
        }

        Patient patient = new Patient("Nicolas", "nicomartin854@gmail.com");

       patient.setWeight(68.00);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

         //System.out.println(myDoctor.name);
         //System.out.println(myDoctor.speciality);

    }
}




