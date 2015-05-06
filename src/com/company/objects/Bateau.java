package com.company.objects;

import java.util.ArrayList;

public class Bateau {
    private int taille;
    private String nom;
    private boolean estCoule;
    private ArrayList<Case> cases = new ArrayList<Case>();

    public Bateau(int taille, String nom) {
        this.taille = taille;
        this.nom = nom;
        this.estCoule = false;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
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

    public ArrayList<Case> getCases() {
        return cases;
    }

    public void setCases(ArrayList<Case> cases) {
        this.cases = cases;
    }
}
