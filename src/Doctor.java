public class Doctor {

    //Atributos
    int id;
    String name;
    String speciality;

    //Constructor
    Doctor(){
        System.out.printf("Construyendo el objeto Doctor");
    }

    //Otro constructor
    Doctor(String name) {
        System.out.printf("El otro Dorctor es: " + name);
    }


    //Comportamientos
    public void  showName (){
        System.out.printf("\nEl nombre del Doctor es: " + name);
    }
}
