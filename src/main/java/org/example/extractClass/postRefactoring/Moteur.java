package org.example.extractClass.postRefactoring;

public class Moteur {
    private String moteurType;
    private String moteurCylindree;
    private String moteurPuissance;
    private String moteurCarburant;

    public Moteur() {
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