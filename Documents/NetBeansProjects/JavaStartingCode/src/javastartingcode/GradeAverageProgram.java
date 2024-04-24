/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javastartingcode;

import java.util.Scanner;
public class GradeAverageProgram {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            
            System.out.print("First Grade     : ");
            float firstGrade = s.nextFloat();
            System.out.print("Second Grade    : ");
            float secondGrade = s.nextFloat();
            System.out.print("Third Grade     : ");
            float thirdGrade = s.nextFloat();
            System.out.print("Fourth Grade    : ");
            float fourthGrade = s.nextFloat();
            
            
            float Formula = (firstGrade + secondGrade + thirdGrade + fourthGrade) /4;
            System.out.println("Your Grade is " + Formula);
            
            if (Formula > 100) {
               System.out.println("Invalid Grade");
            }
            
            else if (Formula >= 98 && Formula <= 100){
                System.out.println("With highest honors");
            }
            else if (Formula >= 95 && Formula <= 97.99){
                System.out.println("With high honors");
            }
            else if (Formula >= 90 && Formula <= 94.99){
                System.out.println("With honors");
            }
            else if (Formula >= 75 && Formula <= 89.99){
                System.out.println("PASSED");
            }
            else{
               System.out.println("FAILED!"); 
            }
                    
           
        }
}
