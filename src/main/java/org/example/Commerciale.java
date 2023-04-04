package org.example;

public class Commerciale extends Salarie{

    float chiffreDaffaire;
    int Commision;

    public Commerciale(int matricule, String categorie, String service, String nom, int salaire, float chiffreDaffaire, int commision) {
        super(matricule, categorie, service, nom, salaire);
        this.chiffreDaffaire = chiffreDaffaire;
        Commision = commision;
    }

    public Commerciale(float chiffreDaffaire, int commision) {
        this.chiffreDaffaire = chiffreDaffaire;
        Commision = commision;
    }

    public float getChiffreDaffaire() {
        return chiffreDaffaire;
    }

    public void setChiffreDaffaire(float chiffreDaffaire) {
        this.chiffreDaffaire = chiffreDaffaire;
    }

    public int getCommision() {
        return Commision;
    }

    public void setCommision(int commision) {
        Commision = commision;
    }
}
