/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javastartingcode;

import java.util.Scanner;

public class SwichCaseDefault {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
            
        System.out.print("Input A,B, or C: ");
        char grade = s.next().charAt(0); // inputting character
        
        switch(grade){
            case 'A':
                System.out.println("Outstanding");
                break;
            case 'B':
                System.out.println("Excellent");
                break;
            case 'C':
                System.out.println("Satisfactory");
                break;
            default:
                System.out.println("Invalid");
            
        }
        
    }
}
