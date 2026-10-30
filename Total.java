import java.util.*;
public class Total {
    String department;
    int mark1;
    int mark2;
    String name;
    void displayName() {
        System.out.println("Name: " + name);
    }
    int totalMark() {
        return mark1 + mark2;
    }
    int[] getMarks() {
        int arr[] = {1, 2, 3, 4, 5};
        return arr;
    }
    public static void main(String[] args) {
        Total t = new Total();
        t.name = "Ram";
        t.department = "CSE";
        t.mark1 = 100;
        t.mark2 = 200;
        t.displayName();
        System.out.println("Total Marks: " + t.totalMark());
        int arr[] = t.getMarks();
        System.out.println("Marks: " + Arrays.toString(arr));
    }
}