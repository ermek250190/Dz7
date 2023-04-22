package com.company;

public class Medic extends Hero{
    private int healPoints;


    public Medic(int uron, int zdorovie, int supersposobnost, int healPoints) {
        super(uron, zdorovie, supersposobnost);
        this.healPoints = healPoints;
    }

    @Override
    public void appleSuperAbility() {
        System.out.println("Critical damage");
    }

    public void incraseExperience(){
        for (int i = 0; i < healPoints; i++) {
            System.out.println(i);

        }

    }
}
