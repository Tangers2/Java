/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javastartingcode;

import java.util.Scanner;
public class ifelsestatement {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        /*
        System.out.print("Enter Age: ");
        int age = s.nextInt();
        boolean isVerified = true;
        
        if (age >= 18){
            System.out.println("You have Access");
            if (isVerified){
                System.out.println("Qualified");
            } else{
               System.out.println("Not Qualified");
            }
        }
        else if(age >= 13){
            System.out.println("You need parent consent!");
        }
        else{
            System.out.println("Access Denied");
        }
*/
        /*
        System.out.print("Enter Greetings: ");
        String greet = s.nextLine();
        
        if (greet.equalsIgnoreCase("Hello")){  // equals for case sensitivity. 
            System.out.println("Hi");
        }
        */
        
        /*
        boolean hasRuler = true;
        boolean hasBallpen = false;
        
        if (hasRuler || hasBallpen) System.out.println("You can come in"); //&&(and), ||(or), !(not)
        else System.out.println("You can come in");
        */
        
        int age = 18;
        boolean isVerified = true; //false
        
        if (age >= 18 && isVerified)
            System.out.println("You have access and is Qualified");
        else if (age >= 18 && !isVerified)
            System.out.println("You have access but not verified");
        else
            System.out.println("Access Denied");
   
        
}
}
