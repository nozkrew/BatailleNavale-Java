package com.company.objects;

import java.util.ArrayList;

public class Grille {

    protected ArrayList<Case> grille = new ArrayList<Case>();

    public Grille(){
    }

    public ArrayList<Case> getGrille() {
        return grille;
    }

    public void setGrille(ArrayList<Case> grille) {
        this.grille = grille;
    }
}
