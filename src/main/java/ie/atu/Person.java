package ie.atu;

public class Person {
    String firstname;
    String lastname;
    int age;

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
