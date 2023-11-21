package org.example.tom.postRefactoring;

public class Human {
    private String sex;
    private String firstName;
    private String lastName;
    private double heightMeter;
    private int age;

    public Human(String sex, String firstName, String lastName, double heightMeter, int age) {
        this.setSex(sex);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setHeightMeter(heightMeter);
        this.setAge(age);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHeightMeter() {
        return heightMeter;
    }

    public void setHeightMeter(double heightMeter) {
        this.heightMeter = heightMeter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
