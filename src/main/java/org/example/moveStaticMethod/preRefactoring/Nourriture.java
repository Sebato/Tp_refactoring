package org.example.moveStaticMethod.preRefactoring;

public class Nourriture {
    private String nom;
    private String couleur;

public Nourriture(String nom, String couleur) {
        this.nom = nom;
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getNom() {
        return nom;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Nourriture{" +
                "nom='" + nom + '\'' +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
