import java.util.*;
class Student {
    String department;
    int mark1;
    int mark2;
    String name;
}
public class Dept {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.department = "CSE";
        s1.mark1 = 100;
        s1.mark2 = 200;
        s1.name = "Ram";

        Student s2 = s1;

        s2.name = "Vino";
        s2.department = "ECE";
        s2.mark1 = 200;
        s2.mark2 = 150;

        System.out.println(s1 == s2);

        System.out.println(s1.name);
        System.out.println(s1.department);
        System.out.println(s1.mark1);
        System.out.println(s1.mark2);
    }
}