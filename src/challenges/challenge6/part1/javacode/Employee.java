package challenges.challenge6.part1.javacode;

public class Employee {

    private String lastName;
    private float[] salaryLast3Years;
    private String firstName;
    private int startYear;

    public Employee(String firstName, String lastName, int startYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startYear = startYear;
        salaryLast3Years = new float[3];
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float[] getSalaryLast3Years() {
        return salaryLast3Years;
    }

    public void setSalaryLast3Years(float[] salaryLast3Years) {
        this.salaryLast3Years = salaryLast3Years;
    }
}
