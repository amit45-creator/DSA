import java.util.*;

public class PalindromeR {
    static boolean f(String s, int i) {
        int n = s.length();
        // base case
        if (i >= n / 2)
            return true;
        // check characters
        if (s.charAt(i) != s.charAt(n - i - 1))
            return false;
        // recursive step
        return f(s, i + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");

        String s = sc.nextLine();
        if (f(s, 0)) {
            System.out.println(s + "is a palindrome");
        } else {
            System.out.println(s + "is Not a palindrome");

        }

    }

}
// time complexity will be n/2