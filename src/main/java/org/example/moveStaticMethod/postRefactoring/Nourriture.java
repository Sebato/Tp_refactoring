package org.example.moveStaticMethod.postRefactoring;

public class Nourriture {
    private String nom;
    private String couleur;

public Nourriture(String nom, String couleur) {
        this.nom = nom;
        this.couleur = couleur;
    }

    public void couleurNourriture() {
        System.out.println(getCouleur());
    }

    public void nomNourriture(){
        System.out.println(getNom());
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
