package ie.atu;

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

    public void displayInfo(){
        System.out.println("Name: " + firstname + " " + lastname + ", Age: " + age);
    }
}
