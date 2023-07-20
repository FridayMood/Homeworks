package Lesson6.Clinic;

public class Therapist extends Doctors {

    @Override
    public void treat()
    {
        System.out.println("Терапевт проводит обследование");
    }
}
