import java.util.Scanner;

class Day2 {
    public static void main(String[] args) {
        int i, n, s = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("the factor of " + n + " is");
        for (i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(i);
                s = s + i;
                c = c + 1;
            }
        }
        if (n % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
        if (s == n) {
            System.out.println("perfect number" + n);
        } else {
            System.out.println(" no perfect number");

        }
        System.out.println("the sum of factor " + s);
        System.out.println("the count of factor " + c);
        if (c == 1) {
            System.out.println(" number is prime number");
        } else {
            System.out.println(" no prime number");
        }

    }
}
