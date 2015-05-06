package com.company.objects;

import java.util.ArrayList;

/**
 * Created by Nozkrew on 24/04/2015.
 */
public class Joueur {
    private String nom;
    private String prenom;
    private ArrayList<Bateau> bateaux = new ArrayList<Bateau>();
    private GrilleBateaux grilleBateaux = new GrilleBateaux();
    private GrilleJeu grilleJeu = new GrilleJeu();

    public Joueur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public ArrayList<Bateau> getBateaux() {
        return bateaux;
    }

    public void setBateaux(ArrayList<Bateau> bateaux) {
        this.bateaux = bateaux;
    }
}
