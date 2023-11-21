package org.example.dan.prerefactor;

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

    public String getModele() {
        return modele;
    }

    public String getMoteur_type() {
        return moteurType;
    }

    public String getMoteur_cylindree() {
        return moteurCylindree;
    }

    public String getMoteur_puissance() {
        return moteurPuissance;
    }

    public String getMoteur_carburant() {
        return moteurCarburant;
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
