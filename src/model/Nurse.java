package model;

public class Nurse extends User{
    private String specility;

    public Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public void ShowDataUser() {
        System.out.println("Hospital: Cruz Verde");
        System.out.println("Departamentos: Nurtiologia");
    }

    public String getSpecility() {
        return specility;
    }

    public void setSpecility(String specility) {
        this.specility = specility;
    }
}
