package com.company;

public class Main {

    public static void main(String[] args) {
//        for(int i=0; i<5000; i++){
//        //kod do testowania tutaj
//        }
        //Losowanie rzut = new Losowanie();
        //System.out.println(rzut.k10());
        //System.out.println(rzut.k20());
        //System.out.println(rzut.k100());
        //System.out.println(rzut.k1000());
        KartaPostaci kartaPostaci = new KartaPostaci();
        Kalendarium kalendarium = new Kalendarium();
        Umiejetnosci umiejetnosci = new Umiejetnosci();

        System.out.println("Nazwa rasy: "           + kartaPostaci.rasa);
        System.out.println("Wzrost: "               + kartaPostaci.wzrost(false));
        System.out.println("Waga: "                 + kartaPostaci.waga());
        System.out.println("Kolor Włosów: "         + kartaPostaci.kolorWlosow());
        System.out.println("Kolor Oczu: "           + kartaPostaci.kolorOczu());
        System.out.println("Znaki Szczególne: "     + kartaPostaci.znakiSzczegolne());
        System.out.println("Liczba rodzeństwa: "    + kartaPostaci.liczbaRodzenstwa());
        System.out.println("Znak Gwiezdny: "        + kalendarium.znakGwiezdny());
        System.out.println("Znak Gwiezdny opis: "   + kalendarium.znakGwiezdnyFokus());
        System.out.println("Urodzony w roku: "      + kalendarium.rokUrodzin() + " kalendarza Imperium, " + kalendarium.dataUrodzinDokladna());
        System.out.println("Wróżba losu: "          + kalendarium.wrozbaLosu());
        System.out.println("Wiek: "                 + kartaPostaci.wiek());
        System.out.println(kalendarium.kalendarzFocus(22));
        System.out.println(umiejetnosci.umiejetnosci(5));
        System.out.println(umiejetnosci.umiejetnosci(0));
        System.out.println(umiejetnosci.umiejetnosci(2);
        System.out.println(umiejetnosci.umiejetnosci(10);


        System.out.println();

        System.out.println("Walka wręcz: "              + kartaPostaci.walkaWrecz);
        System.out.println("Umiejętności strzeleckie: " + kartaPostaci.umiejetnosciStrzeleckie);
        System.out.println("Krzepa: "                   + kartaPostaci.krzepa);
        System.out.println("Odporność: "                + kartaPostaci.odpornosc);
        System.out.println("Zręczność: "                + kartaPostaci.zrecznosc);
        System.out.println("Siła woli: "                + kartaPostaci.silaWoli);
        System.out.println("Inteligencja: "             + kartaPostaci.inteligencja);
        System.out.println("Ogłada: "                   + kartaPostaci.oglada);
        System.out.println();

        System.out.println("Ataki: "                + kartaPostaci.ataki);
        System.out.println("Żywotność: "            + kartaPostaci.zywotnosc);
        System.out.println("Siła: "                 + kartaPostaci.sila);
        System.out.println("Wytrzymalość: "         + kartaPostaci.wytrzymalosc);
        System.out.println("Szybkość: "             + kartaPostaci.szybkosc);
        System.out.println("Magia: "                + kartaPostaci.magia);
        System.out.println("Punkty Obłędu: "        + kartaPostaci.punktyObledu);
        System.out.println("Punkty przeznaczenia: " + kartaPostaci.punktyPrzeznaczenia);

    }
}
