 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activityinschool;

import java.util.Scanner;
public class ActivityinSchool {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the two positive integers
        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();

        // Find the GCD using the Euclidean Algorithm
        int gcd = findGCD(num1, num2);

        // Display the process of finding the GCD
        System.out.println("r\tm\tn");
        System.out.println("--------------------------------");
        while (num2 != 0) {
            int remainder = num1 % num2;
            System.out.println(remainder + "\t" + num1 + "\t" + num2);
            num1 = num2;
            num2 = remainder;
        }
        System.out.println(num1 + "\t0\t0");

        // Display the GCD
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);

        scanner.close();
    }

    // Function to find the GCD using the Euclidean Algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
