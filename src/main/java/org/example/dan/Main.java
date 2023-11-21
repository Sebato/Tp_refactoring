package org.example.dan;

import org.example.dan.prerefactor.Voiture;

public class Main {
    public static void main(String[] args) {
        Voiture v = new Voiture("Honda", "Civic", "type_fort", "3412", "50 chevaux", "essence");
        System.out.println(v.getMoteurInfo());
    }

}
