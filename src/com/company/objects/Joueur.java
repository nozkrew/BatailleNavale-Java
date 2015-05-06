package com.company.objects;

import java.util.ArrayList;

/**
 * Created by Nozkrew on 24/04/2015.
 */
public class Joueur {
    private String nom;
    private String prenom;
    private GrilleBateaux grilleBateaux;
    private GrilleJeu grilleJeu;

    public Joueur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        grilleJeu = new GrilleJeu();
        grilleBateaux = new GrilleBateaux();
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
}
