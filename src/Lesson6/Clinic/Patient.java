package Lesson6.Clinic;

public class Patient {
    private String name;
    private Plan plan;


    public Patient(String name, Plan plan) {
        this.name = name;
        this.plan = plan;
    }

    public Patient() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
