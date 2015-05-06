package com.company.objects;

/**
 * Created by Nozkrew on 06/05/2015.
 */
public class ContreTorpilleur extends Bateau {

    public ContreTorpilleur(String p_nom){
        super(p_nom);
        placement = new Case[3];
    }
}
