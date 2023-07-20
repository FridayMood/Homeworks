package Lesson6.Clinic;

public class ClinicMain {
    static Doctors surgeon = new Surgeon();
    static Doctors therapist = new Therapist();
    static Doctors dentist = new Dentist();

    public static void main(String[] args) {


        Patient patient = new Patient();
        Plan plan = new Plan(1);
        patient.setPlan(plan);
        patient.setName("Alena");
        findDoctor(patient);

    }

    public static void findDoctor(Patient patient) {
        switch (patient.getPlan().getCode()) {
            case 1:
                patient.getPlan().setDoctor(surgeon);
                surgeon.treat();
                break;
            case 2:
                patient.getPlan().setDoctor(dentist);
                dentist.treat();
                break;
            default:
                patient.getPlan().setDoctor(therapist);
                therapist.treat();
                break;
        }
    }

}
