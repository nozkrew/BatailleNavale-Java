package com.company.objects;

public class Case {

    private int X;
    private int Y;
    private boolean estPris;

    public Case() {
    }

    public Case(int x, int y, boolean p_pris) {
        X = x;
        Y = y;
        estPris = p_pris;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public boolean isEstPris() {
        return estPris;
    }

    public void setEstPris(boolean estPris) {
        this.estPris = estPris;
    }
}
