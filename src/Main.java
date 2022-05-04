import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Nicolas", "Cardiologo");
        myDoctor.addAviableAppointment(new Date(), "4pm");
        System.out.println(myDoctor.getAviableAppointments());

        Patient patient = new Patient("Nicolas", "nicomartin854@gmail.com");

       patient.setWeight(68.00);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

       //System.out.println(myDoctor.name);
        //System.out.println(myDoctor.speciality);

    }
}




