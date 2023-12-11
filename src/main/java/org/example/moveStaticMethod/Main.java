package org.example.moveStaticMethod;

//changer imports pour tester refactotrings

//Pre Refactoring
//import org.example.seb.preRefactoring.Animal;
//import org.example.seb.preRefactoring.Nourriture;

//Post Refactoring
import org.example.moveStaticMethod.postRefactoring.Nourriture;

public class Main {
    public static void main(String[] args) {

        Nourriture a = new Nourriture("pomme", "rouge");
        Nourriture b = new Nourriture("steak", "bleu");

        //Animal.nomNourriture(a);
        a.nomNourriture();
        //Animal.nomNourriture(b);
        b.nomNourriture();

        a.couleurNourriture();
        b.couleurNourriture();

    }
}
