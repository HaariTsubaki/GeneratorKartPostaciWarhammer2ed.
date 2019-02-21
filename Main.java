package com.company;

public class Main {

    public static void main(String[] args) {
        Losowanie rzut = new Losowanie();
        //System.out.println(rzut.k10());
        //System.out.println(rzut.k20());
        //System.out.println(rzut.k100());
        //System.out.println(rzut.k1000());
        Rasa rasa = new Rasa();
        System.out.println("Nazwa rasy: " + rasa.rasa);
        System.out.println("Walka wręcz: " + rasa.walkaWrecz);
        System.out.println("Umiejętności strzeleckie: " + rasa.umiejetnosciStrzleckie);
        System.out.println("Krzepa: " + rasa.krzepa);
        System.out.println("Odporność:" + rasa.odpornosc);
        System.out.println("Zręczność: " + rasa.zrecznosc);
        System.out.println("Siła woli: " + rasa.silaWoli);
        System.out.println("Inteligencja: " + rasa.inteligencja);
        System.out.println("Ogłada: " + rasa.oglada);
    }
}
