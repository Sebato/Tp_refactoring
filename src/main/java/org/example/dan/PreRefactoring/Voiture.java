package org.example.dan.PreRefactoring;

public class Voiture {
    private String marque;
    private String modele;
    private String moteurType;
    private String moteurCylindree;
    private String moteurPuissance;
    private String moteurCarburant;

    public Voiture(String marque, String modele, String moteur_type, String moteur_cylindree, String moteur_puissance, String moteur_carburant) {
        this.marque = marque;
        this.modele = modele;
        this.moteurType = moteur_type;
        this.moteurCylindree = moteur_cylindree;
        this.moteurPuissance = moteur_puissance;
        this.moteurCarburant = moteur_carburant;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMoteurType() {
        return moteurType;
    }

    public void setMoteurType(String moteurType) {
        this.moteurType = moteurType;
    }

    public String getMoteurCylindree() {
        return moteurCylindree;
    }

    public void setMoteurCylindree(String moteurCylindree) {
        this.moteurCylindree = moteurCylindree;
    }

    public String getMoteurPuissance() {
        return moteurPuissance;
    }

    public void setMoteurPuissance(String moteurPuissance) {
        this.moteurPuissance = moteurPuissance;
    }

    public String getMoteurCarburant() {
        return moteurCarburant;
    }

    public void setMoteurCarburant(String moteurCarburant) {
        this.moteurCarburant = moteurCarburant;
    }

    public String getMoteurInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Moteur: ");
        sb.append(moteurType);
        sb.append(" ");
        sb.append(moteurCylindree);
        sb.append(" ");
        sb.append(moteurPuissance);
        sb.append(" ");
        sb.append(moteurCarburant);
        return sb.toString();
    }
}
