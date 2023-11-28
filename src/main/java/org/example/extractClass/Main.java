package org.example.extractClass;

import org.example.extractClass.preRefactoring.Voiture;

public class Main {
    public static void main(String[] args) {
        Voiture v1 = new Voiture("Honda", "Civic", "type_fort", "3412", "50 chevaux", "essence");
        System.out.println(v1.getMoteurInfo());

        org.example.extractClass.postRefactoring.Voiture v2 = new org.example.extractClass.postRefactoring.Voiture("Honda", "Civic", "type_fort", "3412", "50 chevaux", "essence");
        System.out.println(v2.getMoteurInfo());
    }

}
