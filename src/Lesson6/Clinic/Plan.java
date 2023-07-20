package Lesson6.Clinic;

public class Plan {
    private int code;
    private Doctors doctor;

    public Plan(int code, Doctors doctor) {
        this.code = code;
        this.doctor = doctor;
    }

    public Plan(int code) {
        this.code = code;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public Doctors getDoctor()
    {
        return doctor;
    }

    public void setDoctor(Doctors doctor)
    {
        this.doctor = doctor;
    }
}
