public class Patient {

    private String name;
    private String email;
    private String addres;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double heigt;
    private String blood;

    //Constructor
    Patient (String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return  name ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() < 8) {
            System.out.println("El numero debe ser de 8 digitos");
            return;
        }
        this.phoneNumber = phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return weight + " Kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeigt() {
        return heigt + " Mts.";
    }

    public void setHeigt(double heigt) {
        this.heigt = heigt;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
