import java.util.*;

public class Gcd {
    public static int gcd(int n1, int n2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0)
                arr1.add(i);
        }
        for (int j = 1; j <= n2; j++) {
            if (n2 % j == 0)
                arr2.add(j);
        }

        int a = arr1.size() - 1;
        int b = arr2.size() - 1;
        while (a >= 0 && b >= 0) {
            if (arr1.get(a).equals(arr2.get(b))) {
                return arr1.get(a);
            } else if (arr1.get(a) > arr2.get(b)) {
                a--;
            } else {
                b--;
            }
        }
        return 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        gcd(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd(n1, n2));

    }

}
