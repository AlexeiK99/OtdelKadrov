package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        OtdelKadrov otdelKadrov = new OtdelKadrov();
        Sotrudnik sotrudnikIvanov = otdelKadrov.addSotrudnik("Ivanov");
        Sotrudnik sotrudnikPetrov = otdelKadrov.addSotrudnik("Petrov");
        Sotrudnik sotrudnikVasya = otdelKadrov.addSotrudnik("Vasya");
        Sotrudnik sotrudnikKolya = otdelKadrov.addSotrudnik("Kolya");
        Sotrudnik sotrudnikSanya = otdelKadrov.addSotrudnik("Sanya");
        Sotrudnik sotrudnikDima = otdelKadrov.addSotrudnik("Dima");
        Sotrudnik sotrudnikStas = otdelKadrov.addSotrudnik("Stas");
        Sotrudnik sotrudnikIvan = otdelKadrov.addSotrudnik("Ivan");
        Sotrudnik sotrudnikSidorov = otdelKadrov.addSotrudnik("Sidorov");
        printSotrudnikList(otdelKadrov.getAllSotrudnik());
        try {
            sotrudnikSidorov.setManager(sotrudnikIvanov);
            sotrudnikPetrov.setManager(sotrudnikIvanov);
            sotrudnikVasya.setManager(sotrudnikIvanov);
            sotrudnikKolya.setManager(sotrudnikSidorov);
            sotrudnikSanya.setManager(sotrudnikSidorov);
            sotrudnikDima.setManager(sotrudnikPetrov);
            sotrudnikStas.setManager(sotrudnikVasya);
            sotrudnikIvan.setManager(sotrudnikSanya);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        printSotrudnikList(otdelKadrov.getAllSotrudnik());
        System.out.println();
        printSotrudnikList(otdelKadrov.getAllManager(sotrudnikIvan));
    }

    public static void printSotrudnikList(List<Sotrudnik> list) {
        for (Sotrudnik s : list) {
            System.out.println(s);
        }
    }
}
