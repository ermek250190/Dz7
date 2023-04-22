package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Magic magic = new Magic(200,300,500);

        Medic medic = new Medic(250,350,550,3);

        Warrior warrior = new Warrior(150,250,350);
        
        Hero [] heroes = {magic,medic,warrior};

        for (Hero mass : heroes) {
            System.out.println(mass);
        }

    }
}
