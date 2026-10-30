import java.util.*;

public class Silentt {
    public static void main(String[] args) {
        String s = "silent";
        String t = "listen";

        int arr[] = new int[26];

        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }

        System.out.println(Arrays.toString(arr));
    }
}