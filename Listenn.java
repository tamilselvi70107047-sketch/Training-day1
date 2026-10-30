import java.util.*;

public class Listenn {
    public static void main(String[] args) {
        String s = "silent";
        String t = "listen";

        int arr[] = new int[26];
        boolean Anagram = true;

        if (s.length() != t.length()) {
            Anagram = false;
        } else {
            for (char c : s.toCharArray()) {
                arr[c - 'a']++;
            }

            for (char c : t.toCharArray()) {
                arr[c - 'a']--;
            }

            for (int i : arr) {
                if (i != 0) {
                    Anagram = false;
                    break;
                }
            }
        }

        if (Anagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}