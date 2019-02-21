package com.company;

import java.util.Random;

public class Losowanie {

        //Do losowania cech drugorzędnych(PG, DRS, KS), Liczby Rodzeństwa(PG), Miejsca Urodzenia Człowieka(PG), Koloru Oczu(PG),
        // Koloru Włosów(PG), Deformacje Wyglądu (RG)
    public int k10() {
        Random rand = new Random();
        return rand.nextInt((10 - 1) + 1) + 1;
    }
        // Do losowania Cech głównych postaci(PG, DRS, KS), Wzrostu(PG, DRS),
    public int k20() {
        Random rand = new Random();
        return rand.nextInt((20 - 2) + 1) + 2;
    }
        // Do losowania Profesji(PG, DRS, KS, RG), Zdolności(PG), Wagi(PG), Znaków Szczególnych(PG), Wieku(PG), Znaku Gwiezdnego(PG),
        //Miejsca Urodzenia Innych Ras(PG), Imion(PG, RG, DS), Nazwisk(PG, DS), Przydomków(PG), Przynależność Klanowa (DRS),
        //Manifestacje Chaosu(PG, KM, KS)
    public int k100() {
        Random rand = new Random();
        return rand.nextInt((100 - 1) + 1) + 1;
    }
        // Do losowania profesji z podręcznika(CC), Mutacji(KS)
    public int k1000() {
        Random rand = new Random();
        return rand.nextInt((1000 - 1) + 1) + 1;
    }


}
