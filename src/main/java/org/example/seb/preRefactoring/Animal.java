package org.example.seb.preRefactoring;

public class Animal {

    public Animal() {
    }

    public static void nomNourriture(Nourriture n){
        System.out.println(n.getNom());
    }

    public static void couleurNourriture(Nourriture a) {
        System.out.println(a.getCouleur());
    }
}
