
// util---> is one such package or library that contains collection of diff class and frame works
// scanner---> is a class  present in java.util package  and it is use to take input from a user for any primitive datatype
// import---> statement in java called scanner class within the java.util package

// public static void main(String[] args){} means main function

// Public:- it is an access specifier that means it will be accessed by publically.
//  Static:- it is access modifier that means when the java program is load then it will create the space in memory automatically.
//   Void:- it is a return type that is it does not return any value. 
//   main():- it is a method or a function()name.
// string[]args --->it store java command line argument

import java.util.Scanner;

class Demo {
    public static void sum(int a, int b) {
        int c = a + b;
        System.out.println("a is" + a);
        System.out.println("b is" + b);
        System.out.println("add is" + c);
        System.out.println("modulus " + a % b);
        System.out.println("division " + a / b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // take input
        int b = sc.nextInt();
        sum(a, b);
    }
}

// static nhi likhte hai toh obj bnana padta hai
class demo {
    public void sum1(int a, int b) {
        int c = a + b;
        System.out.println("a is" + a);
        System.out.println("b is" + b);
        System.out.println("add is" + c);
        System.out.println("modulus " + a % b);
        System.out.println("division " + a / b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // take input
        int b = sc.nextInt();
        demo d = new demo();
        d.sum1(a, b);
    }
}

class Fact {
    public static void factorial(int n) {
        int fact = 1, j;
        if(n==0){
            System.out.println(1);
        }
        for (j = 1; j <= n; j++) {
            fact = fact * j;
        }
        System.out.println("Factorial of " + n + " is = " + fact);
    }
    public static void main(String[] args) {
        factorial(0);
    }
}

class number1 {
    public static void even(int a){
        if(a%2==0){
            System.out.println("the value is even ");
        }else{
            System.out.println("the value is odd ");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
       even(a);
    }
}