package com.company;

public abstract class Hero implements HavingSuperAbility{
    private int uron;
    private int zdorovie;
    private int supersposobnost;



    public Hero(int uron, int zdorovie, int supersposobnost) {
        this.uron = uron;
        this.zdorovie = zdorovie;
        this.supersposobnost = supersposobnost;
    }

    public int getUron() {
        return uron;
    }

    public void setUron(int uron) {
        this.uron = uron;
    }

    public int getZdorovie() {
        return zdorovie;
    }

    public void setZdorovie(int zdorovie) {
        this.zdorovie = zdorovie;
    }

    public int getSupersposobnost() {
        return supersposobnost;
    }

    public void setSupersposobnost(int supersposobnost) {
        this.supersposobnost = supersposobnost;
    }
}
