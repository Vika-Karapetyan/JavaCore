package medicalCenter;

public class Storage {
    private Person[] people = new Person[10];
    private int size;

    public void add(Person person) {
        if (size == people.length) {
            extend();
        }
        people[++size] = person;
    }

    public void searchDoctorById(String keyword) {
        for (int i = 0; i < size; i++) {
            if (people[i].getId().contains(keyword)) {
                System.out.println(people[i].getName() + " " + people[i].getSurname());
            }
        }
    }

    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            Doctor doctor = (Doctor) people[i];
            if (doctor.getDrProfession().equals(profession)) {
                System.out.println(doctor);
            }
        }
    }

    public void deleteDoctorByID(String keyword) {
        for (int i = 0; i < size; i++) {
            if (people[i].getId().equals(keyword)) {
                for (int j = 0; j < size; j++) {
                    people[j] = people[j + 1];
                }
                break;
            }
        }
        size--;
        System.out.println("Doctor is deleted");
    }

    public void changeDoctorById(String id,String name,String surname,String phoneNumber) {
        for (int i = 0; i < size; i++) {
            if (people[i].getId().equals(id)) {
                people[i].setName(name);
                people[i].setSurname(surname);
                people[i].setPhoneNumber(phoneNumber);
            }
        }
    }

    public void printPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Patient patient = (Patient) people[i];
            if (patient.getDoctor() == doctor) {
                System.out.println(people[i]);
            }
        }
    }

    public void printAllPatients() {
        for (int i = 0; i < size; i++) {
            System.out.println(people[i].getName() + " " + people[i].getSurname() + " " + people[i].getId() + " " + people[i].getPhoneNumber());
        }
    }

    private void extend() {
        Person[] tmp = new Person[people.length + 10];
        System.arraycopy(people, 0, tmp, 0, people.length);
        people = tmp;
    }


}
