package org.example.encapsulateField.preRefactoring;

public class Human {
    public String sex;
    public String firstName;
    public String lastName;
    public double heightMeter;
    public int age;

    public Human(String sex, String firstName, String lastName, double heightMeter, int age) {
        this.sex = sex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.heightMeter = heightMeter;
        this.age = age;
    }
}
