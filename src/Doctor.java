public class Doctor {

    //Atributos
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    //Constructor
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }

    //Otro constructor
    Doctor(String name) {
        System.out.println("El otro Dorctor es: " + name);
    }

    //Comportamientos
    public void  showName (){
        System.out.println("El nombre del Doctor es: " + name);
    }

    public void  showId() {
        System.out.println("ID Doctor" + id);
    }
}
