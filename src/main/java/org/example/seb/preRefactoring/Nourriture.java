package org.example.seb.preRefactoring;

public class Nourriture {
    private String nom;
    private String couleur;

public Nourriture(String nom, String couleur) {
        this.nom = nom;
        this.couleur = couleur;
    }
    @Override
    public String toString() {
        return "Nourriture{" +
                "nom='" + nom + '\'' +
                '}';
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
