 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activityinschool;

import java.util.Scanner;
public class eudiclan {


  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Number 1: ");
    int Num1 = s.nextInt();
     
    System.out.print("Number 2: ");
    int Num2 = s.nextInt();
     
    //reminder of m / n wil be needed in r and n.
     
    int r = Num1 % Num2; // modulo of num1 and num2 = R. 4
    int m = Num2; // 6
    int n = r; // 4
     
    System.out.print("r");
    System.out.print("\tm");
    System.out.println("\t n");
    System.out.println("--------------------");
     
    System.out.print(r);
    System.out.print("\t" + m);
    System.out.println("\t" + n);
     
     
    //int r = Num1 % Num2; 10/6 r 4  
    //int m = Num2; 6
    //int n = r; 4
    // 6 % 4 = 2 
    while ( m !=  0){
      int remainder = m % n;
      System.out.print(remainder); //r
       
      System.out.print("\t" + m);
      int PreviousRemainder = remainder; //n
      System.out.println("\t" + PreviousRemainder);
      m--;
    }

  }
   
}



