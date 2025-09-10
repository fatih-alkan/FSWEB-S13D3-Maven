package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double price;
    String job;
    String country;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double price, String job, String country) {
        this(firstName, lastName, age); // chaining -> diğer constructor'ı çağırır
        this.price = price;
        this.job = job;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    public double getPrice() {
        return price;
    }

    public String getJob() {
        return job;
    }

    public String getCountry() {
        return country;
    }
}

