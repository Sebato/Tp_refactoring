package org.example.seb;

//changer imports pour tester refactotrings

//Pre Refactoring
import org.example.seb.preRefactoring.Animal;
import org.example.seb.preRefactoring.Nourriture;

//Post Refactoring
//import org.example.seb.postRefactoring.Animal;
//import org.example.seb.postRefactoring.Nourriture;

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