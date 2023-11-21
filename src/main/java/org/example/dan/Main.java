package org.example.dan;

import org.example.dan.PreRefactoring.Voiture;

public class Main {
    public static void main(String[] args) {
        Voiture v1 = new Voiture("Honda", "Civic", "type_fort", "3412", "50 chevaux", "essence");
        System.out.println(v1.getMoteurInfo());

        org.example.dan.PostRefactoring.Voiture v2 = new org.example.dan.PostRefactoring.Voiture("Honda", "Civic", "type_fort", "3412", "50 chevaux", "essence");
        System.out.println(v2.getMoteurInfo());
    }

}
