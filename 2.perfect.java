import java.util.Scanner;

class Day2 {
    public static void perfect(int n) {
        int sum = 0,c=0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
                c++;
            }
        }
        if(c==1)
        System.out.println("number is prime");
        else
        System.out.println("number is not prime");
        System.out.println("sum of factor is = " +sum);
        System.out.println("sum of factor is = " +c);

        if (n == sum) {
            System.out.println("number is perfect");
        }
        else{
            System.out.println("number is not perfect");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        perfect(n);
    }
}