package com.company;

public class Magic extends Hero{



    public Magic(int uron, int zdorovie, int supersposobnost) {
        super(uron, zdorovie, supersposobnost);
    }

    @Override
    public void appleSuperAbility() {
        System.out.println("Critical damage");

    }
}
