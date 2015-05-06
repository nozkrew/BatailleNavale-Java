package com.company.objects;

import java.util.ArrayList;

public class Bateau {
    private String nom;
    private boolean estCoule;
    protected int taille;

    public Bateau(String nom) {
        this.nom = nom;
        this.estCoule = false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isEstCoule() {
        return estCoule;
    }

    public void setEstCoule(boolean estCoule) {
        this.estCoule = estCoule;
    }
}
