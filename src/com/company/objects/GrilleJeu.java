package com.company.objects;

/**
 * Created by Nozkrew on 24/04/2015.
 */
public class GrilleJeu extends Grille {
    public GrilleJeu(){
        for(int i = 0; i < dimX; i++){
            for(int j = 0; j < dimY; j++){
                grille.add(new Case(i, j, false));
            }
        }
    }
}
