package com.company.objects;

/**
 * Created by Nozkrew on 06/05/2015.
 */
public class Croiseur extends Bateau {
    public Croiseur(String p_nom){
        super(p_nom);
        placement = new Case[4];
    }
}
