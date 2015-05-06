package com.company.objects;

/**
 * Created by Nozkrew on 06/05/2015.
 */
public class PorteAvion extends Bateau {
    public PorteAvion(String p_nom){
        super(p_nom);
        placement = new Case[5];
    }
}
