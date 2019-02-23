package com.company;

public class Rasa {
    //Człowiek, Niziołek, Krasnolud, Elf (PG, DS, RG)
    //Wybrany, Silny, Pospolity (DRS)
    //Pomiot Chaosu, Gor, Bestiogor, Minotaur, Centigor, Rykowiec, Szaman Rykowiec, Ogr, Olbrzym, Troll, Kurganin,
    // Krasnolud Chaosu, Demon Sługa, Demon Bestia, Pomniejszy Demon,


    Losowanie losowanie = new Losowanie();

    String rasa = getClass().getSimpleName();

    int walkaWrecz = 0 + losowanie.k20();
    int umiejetnosciStrzeleckie = 0 + losowanie.k20();
    int krzepa = 0 + losowanie.k20();
    int odpornosc = 0 + losowanie.k20();
    int zrecznosc = 0 + losowanie.k20();
    int silaWoli = 0 + losowanie.k20();
    int inteligencja = 0 + losowanie.k20();
    int oglada = 0 + losowanie.k20();

    int ataki = 1;
    int zywotnosc = this.zywotnosc();
    int sila = krzepa / 10;
    int wytrzymalosc = odpornosc / 10;
    int szybkosc = 1;
    int magia = 0;
    int punktyObledu = 0;
    int punktyPrzeznaczenia = this.punktyPrzeznaczenia();

    public int zywotnosc() {
        int rzutZywotnosc = 0 + losowanie.k10();
        if (rzutZywotnosc >= 1 && rzutZywotnosc <= 3) {
            return 1;
        } else if (rzutZywotnosc >= 4 && rzutZywotnosc <= 6) {
            return 2;
        } else if (rzutZywotnosc >= 7 && rzutZywotnosc <= 9) {
            return 3;
        } else if (rzutZywotnosc == 10) {
            return 4;
        } else {
            return 404;
        }
    }

    public int punktyPrzeznaczenia() {
        int rzutPrzeznaczenia = 0 + losowanie.k10();
        if (rzutPrzeznaczenia >= 1 && rzutPrzeznaczenia <= 4) {
            return 1;
        } else if (rzutPrzeznaczenia >= 5 && rzutPrzeznaczenia <= 7) {
            return 2;
        } else if (rzutPrzeznaczenia >= 8 && rzutPrzeznaczenia <= 10) {
            return 3;
        } else {
            return 405;
        }
    }

    public int wzrost(boolean plec) {
        if (plec) {
            return 160 + losowanie.k20();
        } else {
            return 150 + losowanie.k20();
        }
    }

    public int waga() {
        int rzutWaga = losowanie.k100();
        return rzutWaga;
    }
}