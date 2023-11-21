package org.example.seb;

import org.example.seb.preRefactoring.Animal;
import org.example.seb.preRefactoring.Nourriture;

public class Main {
    public static void main(String[] args) {

        Nourriture a = new org.example.seb.preRefactoring.Nourriture("pomme", "rouge");
        Nourriture b = new Nourriture("steak", "bleu");

        Animal.nomNourriture(a);
        Animal.nomNourriture(b);

        Animal.couleurNourriture(a);
        Animal.couleurNourriture(b);

    }
}