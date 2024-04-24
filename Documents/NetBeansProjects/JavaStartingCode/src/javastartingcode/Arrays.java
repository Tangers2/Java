/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javastartingcode;

import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
 
       /*
String studentNames[] = {"David", "Alenere", "Ace", "Jasfer"};
System.out.println(studentNames[3]);

int numbers[] = { 1,2,3,4,5,6,7,8,9,10};
System.out.println(numbers[2] + numbers[5]);
       */
        /*
       String employeeNames[] = new String[20];
       int evenNumbers[] = new int [10];
       
       System.out.println("Enter Employee Name: ");
       employeeNames[0] = s.nextLine();
       
       System.out.println("The employee Name is: " + employeeNames[0] );
       */
       
       
        System.out.print("Index: ");
        int index = s.nextInt();
        String Email[] = {"Jungkook@gmail.com", "Auburn@gmail.com", "issay@gmail.com"};
        System.out.println("Email: " + Email[index]);
        String Username[] = {"jungcook", "auburn", "Issa"};
        System.out.println("Username: " + Username[index]);
        String Password[] = {"Kpop", "Intern", "2021"};
        System.out.println("Password: " + Password[index]);
     
   
    }
}
