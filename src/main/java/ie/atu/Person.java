package ie.atu;

import java.util.Scanner;

public class Person {
    String firstname;
    String lastname;
    int age;

    //Default Constructor to initialize default values
    public Person(){
        this.firstname = "Damian";
        this.lastname = "Dobrzycki";
        this.age = 18;
    }

    //Constructor
    public Person(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    //Method to get user input
    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        this.firstname = scanner.nextLine();

        System.out.print("Enter last name: ");
        this.lastname = scanner.nextLine();

        System.out.print("Enter age: ");
        this.age = scanner.nextInt();

    }

    public void displayInfo(){
        System.out.println("Name: " + firstname + " " + lastname + ", Age: " + age);
    }
}
