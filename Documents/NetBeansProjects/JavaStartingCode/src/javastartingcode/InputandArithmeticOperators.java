/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javastartingcode;

import java.util.Scanner;
public class InputandArithmeticOperators {
    
    public static void main(String[] args) {
    
    int x;
    int y;
    int result;
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter Num 1: ");
    x = scan.nextInt();
    
    System.out.print("Enter Num 2: ");
    y = scan.nextInt();
    
    result = x + y;
    
    System.out.println("Result: " + x + " + " + y + " = " + result);


    }

}
