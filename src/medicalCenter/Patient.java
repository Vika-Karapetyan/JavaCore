package medicalCenter;

public class Patient extends Person {
    private Doctor doctor;
    private String registerDate;

    public Patient(String name, String surname, String id, String phoneNumber, String number, Doctor doctor, String registerDate) {
        super(name, surname, id, phoneNumber, number);
        this.doctor = doctor;
        this.registerDate = registerDate;
    }

    public Patient() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "doctor=" + doctor +
                ", registerDate='" + registerDate + '\'' +
                '}';
    }
}
