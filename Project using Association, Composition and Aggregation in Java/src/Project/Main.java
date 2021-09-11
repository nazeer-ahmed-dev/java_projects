package Project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String args[])
    {
        Student s1 = new Student("Nazeer","023-18-0062","7th","CS");
        Student s2 = new Student("Ahmed","023-18-0063","7th","CS");

        Student s3 = new Student("Safdar","023-18-0064","7th","EE");
        Student s4 = new Student("Madan","023-18-0065","7th","EE");

        List<Student> listOfCs = new ArrayList<>();
        listOfCs.add(s1);
        listOfCs.add(s2);
        Department CS = new Department("CS",listOfCs);

        List<Student> listOfEE = new ArrayList<>();
        listOfEE.add(s3);
        listOfEE.add(s4);
        Department EE = new Department("EE",listOfEE);

        List<Department> departments = new ArrayList<>();
        departments.add(CS);
        departments.add(EE);

        Institute institute = new Institute("IBA" , departments);
        institute.print1();



    }

}
