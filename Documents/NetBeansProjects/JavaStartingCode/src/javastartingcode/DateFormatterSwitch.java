/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javastartingcode;

import java.util.Scanner;
public class DateFormatterSwitch {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Month: ");
        int month = s.nextInt();
        
        System.out.print("Date: ");
        int date = s.nextInt();
      
        System.out.print("Year: ");
        int year = s.nextInt();
        
        String monthWord = "";
        
        switch(month){
            case 1:
                monthWord = "January";
                break;
            case 2:
                monthWord = "February";
                break;
            case 3:
                monthWord = "March";
                break;
            case 4:
                monthWord = "April";
                break;
            case 5:
                monthWord = "May";
                break;
            case 6:
                monthWord = "June";
                break;
            case 7:
                monthWord = "July";
                break;
            case 8:
                monthWord = "August";
                break;
            case 9:
                monthWord = "September";
                break;
            case 10:
                monthWord = "October";
                break;
            case 11:
                monthWord = "November";
                break;
            case 12:
                monthWord = "December";
                break;
            default:
    }
        if (monthWord == ""){
            System.out.println("The month is invalid");
        }else{
             if (date > 31 || date <= 0) System.out.println("The date is invalid");
             else System.out.println(monthWord + " " + date + ", " + year);
    }
    }
}
