package medicalCenter;

public class Doctor extends Person {
    private String drProfession;
    private String drEmail;

    public Doctor(String name, String surname, String id, String phoneNumber, String drProfession) {
        super(name, surname, id, phoneNumber, phoneNumber);
        this.drProfession = drProfession;
    }

    public Doctor(String name, String surname, String id, String phoneNumber) {
        super(name, surname, id, phoneNumber, phoneNumber);
    }

    public Doctor() {
    }

    public String getDrProfession() {
        return drProfession;
    }

    public void setDrProfession(String drProfession) {
        this.drProfession = drProfession;
    }

    public String getDrEmail() {
        return drEmail;
    }

    public void setDrEmail(String drEmail) {
        this.drEmail = drEmail;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "drProfession='" + drProfession + '\'' +
                ", drEmail='" + drEmail + '\'' +
                '}';
    }
}
