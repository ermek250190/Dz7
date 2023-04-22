package com.company;
public class Warrior extends Hero{


    public Warrior(int uron, int zdorovie, int supersposobnost) {
        super(uron, zdorovie, supersposobnost);
    }

    @Override
    public void appleSuperAbility() {
        System.out.println("Critical damage");
    }
}
