package org.example.moveStaticMethod.preRefactoring;

public class Animal {

    public Animal() {
    }

    public static void nomNourriture(Nourriture n){
        System.out.println(n.getNom());
    }

    //défaut : methode statique fait des opérations sur un objet extérieur (ici Nourriture)
    //refactoring visé : déplacer la méthode dans la classe concernée (Nourriture)

    public static void couleurNourriture(Nourriture a) {
        System.out.println(a.getCouleur());
    }
}
