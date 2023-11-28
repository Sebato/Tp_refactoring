package org.example.extractClass.postRefactoring;

public class Voiture {
    private final Moteur moteur = new Moteur();
    private String marque;
    private String modele;

    public Voiture(String marque, String modele, String moteur_type, String moteur_cylindree, String moteur_puissance, String moteur_carburant) {
        this.marque = marque;
        this.modele = modele;
        this.moteur.setMoteurType(moteur_type);
        this.moteur.setMoteurCylindree(moteur_cylindree);
        this.moteur.setMoteurPuissance(moteur_puissance);
        this.moteur.setMoteurCarburant(moteur_carburant);
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
        return moteur.getMoteurType();
    }

    public void setMoteurType(String moteurType) {
        moteur.setMoteurType(moteurType);
    }

    public String getMoteurCylindree() {
        return moteur.getMoteurCylindree();
    }

    public void setMoteurCylindree(String moteurCylindree) {
        moteur.setMoteurCylindree(moteurCylindree);
    }

    public String getMoteurPuissance() {
        return moteur.getMoteurPuissance();
    }

    public void setMoteurPuissance(String moteurPuissance) {
        moteur.setMoteurPuissance(moteurPuissance);
    }

    public String getMoteurCarburant() {
        return moteur.getMoteurCarburant();
    }

    public void setMoteurCarburant(String moteurCarburant) {
        moteur.setMoteurCarburant(moteurCarburant);
    }

    public String getMoteurInfo() {
        return moteur.getMoteurInfo();
    }

}
