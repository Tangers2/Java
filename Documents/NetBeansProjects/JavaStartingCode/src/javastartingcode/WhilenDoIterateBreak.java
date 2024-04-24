/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javastartingcode;

import java.util.Scanner;

public class WhilenDoIterateBreak {
    public static void main (String[] args){
        
        Scanner s = new Scanner(System.in);
        
        String[] names = {"David","Alenere", "Patrick", "Ace", "Jasfer"};
        
        System.out.print("Name To Search: ");
        String search = s.nextLine(); // searching a given name.
        
        int i = 0;
        
        while (i < names.length) {
    if (names[i].equalsIgnoreCase(search)) { 
        System.out.println("We Found " + names[i]);
        break; // Exit the loop if the name is found
    } else {
        // Print the name if not found, and continue searching
        System.out.println(names[i]);
    }
    i++;
}

// If the loop completes without finding the name, print the message
if (i == names.length) {
    System.out.print("The name is not in the database.");
}

        
        /*
        String[] names = {"david", "alenere", "ace", "jasfer", "patrick"};
        int i = 0;
        while (i < names.length){
            if (names[i].equalsIgnoreCase("ace")){
                System.out.println("We found " + names[i]);
               //break;
            }else{
                System.out.println(names[i]);
            }
            i++;
        }
        */
        /*
        int i = 0;
        //System.out.println(names.length); //counts the length of the array
        while (i < 5){
            
            System.out.println(i); 
            i++; // without this the output is infinite
            break;
        }
        System.out.println("FINISH"); 
        */
        /*
        int i= 5;
        do { // dowhile loop executes atleast one time. 
            System.out.println(i);// nauna ang execution bago ang condition.
            i++;            
        }while(i < 5);
          */ 
    }
    
}
