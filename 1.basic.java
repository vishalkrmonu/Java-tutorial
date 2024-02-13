
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
class Demo
 {
    public static void main(String args[]) {
        // int a =70;
        // int b=8;
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();  //take input
        b = sc.nextInt();
        int c = a + b;
        System.out.println("a is" + a);
        System.out.println("b is" + b);
        System.out.println("add is" + c);
        System.out.println("modulus " + a % b);
        System.out.println("division " + a / b);
    }}

class Factorial {
    public static void main(String[] args) {
        int fact = 1, n, j;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(j = 1; j <= n; j++){
            fact = fact * j;
        }
        System.out.println("Factorial of " + j + " is = " + fact);
    }
}

class number1 {
    public static void main(String[] args) {
        int a = 7;
        if (a % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}