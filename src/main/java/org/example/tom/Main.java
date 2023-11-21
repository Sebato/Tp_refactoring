package org.example.tom;

public class Main {
    public static void main(String[] args) {
        //Pre-Refactoring
        System.out.println("Pre-Refactoring test:");

        org.example.tom.PreRefactoring.Human preRefHuman = new org.example.tom.PreRefactoring.Human("Homme", "Tom", "Simula",1.70, 22);

        // Accessing attributes
        System.out.println("\tValue before update:");
        System.out.println("\t\tSex: " + preRefHuman.sex);
        System.out.println("\t\tFirst Name: " + preRefHuman.firstName);
        System.out.println("\t\tLast Name: " + preRefHuman.lastName);
        System.out.println("\t\tHeight: " + preRefHuman.heightMeter);
        System.out.println("\t\tAge: " + preRefHuman.age);

        // Updating attributes
        preRefHuman.sex = "Female";
        preRefHuman.firstName = "Jane";
        preRefHuman.lastName = "Smith";
        preRefHuman.heightMeter = 1.65;
        preRefHuman.age = 30;

        // Display updated attributes
        System.out.println("\tUpdated Attributes:");
        System.out.println("\t\tSex: " + preRefHuman.sex);
        System.out.println("\t\tFirst Name: " + preRefHuman.firstName);
        System.out.println("\t\tLast Name: " + preRefHuman.lastName);
        System.out.println("\t\tHeight: " + preRefHuman.heightMeter);
        System.out.println("\t\tAge: " + preRefHuman.age);
    }
}