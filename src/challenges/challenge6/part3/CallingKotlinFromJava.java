package challenges.challenge6.part3;

import challenges.challenge6.part3.kotlincode.Challenge;
import challenges.challenge6.part3.kotlincode.Employee;
import challenges.challenge6.part3.kotlincode.KotlinCodeKt;

public class CallingKotlinFromJava {

    public static void main(String[] args) {

        KotlinCodeKt.sayHelloToJava("Student");

        Employee employee = new Employee("John", "Smith", 2010);
        employee.setStartYear(2009);

        Challenge.INSTANCE.doMath(5, 4);

        employee.takesDefault("arg1", "default");

    }
}
