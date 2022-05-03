import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Nicolas", "Cardiologo");
        myDoctor.addAviableAppointment(new Date(), "4pm");
        System.out.println(myDoctor.getAviableAppointments());

        //System.out.println(myDoctor.name);
        //System.out.println(myDoctor.speciality);

    }
}




