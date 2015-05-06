package com.company.objects;

import java.util.ArrayList;

public class Grille {

    protected ArrayList<Case> grille = new ArrayList<Case>();
    protected int dimX = 10;
    protected int dimY = 10;

    public Grille(){
    }

    public ArrayList<Case> getGrille() {
        return grille;
    }

    public void setGrille(ArrayList<Case> grille) {
        this.grille = grille;
    }
}
