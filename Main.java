package com.company;

public class Main {

    public static void main(String[] args) {
        //for(int i=0; i<5000; i++{
        ////kod do testowania tutaj
        //}
        //Losowanie rzut = new Losowanie();
        //System.out.println(rzut.k10());
        //System.out.println(rzut.k20());
        //System.out.println(rzut.k100());
        //System.out.println(rzut.k1000());
        Rasa rasa = new Rasa();
        System.out.println("Nazwa rasy: "   + rasa.rasa);
        System.out.println("Wzrost: "       + rasa.wzrost(false));
        System.out.println("Waga: "         + rasa.waga());

        System.out.println();

        System.out.println("Walka wręcz: "              + rasa.walkaWrecz);
        System.out.println("Umiejętności strzeleckie: " + rasa.umiejetnosciStrzeleckie);
        System.out.println("Krzepa: "                   + rasa.krzepa);
        System.out.println("Odporność: "                + rasa.odpornosc);
        System.out.println("Zręczność: "                + rasa.zrecznosc);
        System.out.println("Siła woli: "                + rasa.silaWoli);
        System.out.println("Inteligencja: "             + rasa.inteligencja);
        System.out.println("Ogłada: "                   + rasa.oglada);
        System.out.println();

        System.out.println("Ataki: "                + rasa.ataki);
        System.out.println("Żywotność: "            + rasa.zywotnosc);
        System.out.println("Siła: "                 + rasa.sila);
        System.out.println("Wytrzymalość: "         + rasa.wytrzymalosc);
        System.out.println("Szybkość: "             + rasa.szybkosc);
        System.out.println("Magia: "                + rasa.magia);
        System.out.println("Punkty Obłędu: "        + rasa.punktyObledu);
        System.out.println("Punkty przeznaczenia: " + rasa.punktyPrzeznaczenia);

    }
}
