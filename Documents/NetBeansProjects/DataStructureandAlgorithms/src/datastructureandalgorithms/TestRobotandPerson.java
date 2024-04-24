/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datastructureandalgorithms;

/**
 *
 * @author issay
 */
public class TestRobotandPerson {
    
    public static void main(String[] args) {
        Robot r1 = new Robot("Tom", "red", 30);
        Robot r2 = new Robot("Jerry", "blue", 40);
        
        r1.introduce();
        r2.introduce();
        
        
        Person p1 = new Person("Alice", "aggressive", false);
        Person p2 = new Person("Becky", "talkative", true);
        
        
        p1.robotOwned = r2;
        p2.robotOwned = r1;
        
        //p1.robotOwned.introduce();
        //p2.robotOwned.introduce();
        
        p1.introduce();
        p2.introduce();
    
    }
}
class Robot{
    String name;
    String color;
    int weight;
    
    Robot(String n, String c, int w){
        this.name = n;
        this.color = c;
        this.weight = w;
    }
    
    void introduce(){
        System.out.println("My name is "+ this.name);
        System.out.println("My color is "+ this.color);
        System.out.println("and I weight "+ this.weight);
        System.out.println("-----------------------");
    }
}
class Person{
    String name;
    String personality;
    boolean isSitting;
    Robot robotOwned;
    
    Person(String n, String p, boolean i){
        this.name = n;
        this.personality = p;
        this.isSitting = i;
    }
    void introduce(){
        System.out.println("My name is "+ this.name);
        System.out.println("I am "+ this.personality);
        System.out.println("Am I Sitting? "+ this.isSitting);
        System.out.println("-----------------------");
    }
    void sitDown(){
        this.isSitting = true;
    }
    void standUp(){
        this.isSitting = false;
        
        
    }
}