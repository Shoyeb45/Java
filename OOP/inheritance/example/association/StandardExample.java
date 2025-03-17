package inheritance.example.association;

public class StandardExample {
    
}

class Student  {
    String name;
    float age;
    int rollNo;
    float cgpa;

    // has-a variable
    Address addr;

    // has-a variable;
    Address[] addresses;
}

class Address {
    int doorNo;
    int streetNo;
    String locality;
    int pincode;
    String city;
    String state;
    String country;
}