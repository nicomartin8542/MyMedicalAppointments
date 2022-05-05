public class Patient extends  User{
    private String birthday;
    private double weight;
    private double heigt;
    private String blood;

    //Constructor
    Patient (String name, String email) {
        super(name, email);
        //mas instrucciones  para sobreescribir un constructor

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

    @Override
    public String toString() {
        return super.toString() + "Age: " + birthday + " Weigth: " + weight +
                "\n Heigth: " + heigt + " Blood: " + blood;
     }
}
