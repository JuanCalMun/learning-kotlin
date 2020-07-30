package challenges.challenge6.part2;

import challenges.challenge6.part2.kotlincode.Challenge;
import challenges.challenge6.part2.kotlincode.Employee;
import challenges.challenge6.part2.kotlincode.KotlinStuff;

public class CallingKotlinFromJava {

    public static void main(String[] args) {

        KotlinStuff.sayHelloToJava("Student");

        Employee employee = new Employee("John", "Smith", 2010);
        employee.startYear = 2009;

        Challenge.doMath(5, 4);

        employee.takesDefault("arg1");

    }
}
