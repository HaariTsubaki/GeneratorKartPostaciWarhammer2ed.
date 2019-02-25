package com.company;

public class KartaPostaci {
    //Człowiek, Niziołek, Krasnolud, Elf (PG, DS, RG)
    //Wybrany, Silny, Pospolity (DRS)
    //Pomiot Chaosu, Gor, Bestiogor, Minotaur, Centigor, Rykowiec, Szaman Rykowiec, Ogr, Olbrzym, Troll, Kurganin, (KS)
    //Krasnolud Chaosu, Demon Sługa, Demon Bestia, Pomniejszy Demon, (KS)
    //Chowaniec (KM)


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

    //Przydziela zmienną do zbadania ilości punktów żywotności postaci.
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
            return -1;
        }
    }

    //Przydziela zmienną do zbadania ilości punktów przeznaczenia postaci.
    public int punktyPrzeznaczenia() {
        int rzutPrzeznaczenia = 0 + losowanie.k10();
        if (rzutPrzeznaczenia >= 1 && rzutPrzeznaczenia <= 4) {
            return 1;
        } else if (rzutPrzeznaczenia >= 5 && rzutPrzeznaczenia <= 7) {
            return 2;
        } else if (rzutPrzeznaczenia >= 8 && rzutPrzeznaczenia <= 10) {
            return 3;
        } else {
            return -1;
        }
    }

    //Losuje wzrost postaci.
    public int wzrost(boolean plec) {
        if (plec) {
            return 160 + losowanie.k20();
        } else {
            return 150 + losowanie.k20();
        }
    }

    //Przydziela zmienną do zbadania wagi postaci.
    public int waga() {
        int rzutWaga = losowanie.k100();
        if (rzutWaga == 1) {
            return 1;
        } else if (rzutWaga >= 2 && rzutWaga <= 10) {
            return 2;
        } else if (rzutWaga >= 11 && rzutWaga <= 20) {
            return 3;
        } else if (rzutWaga >= 21 && rzutWaga <= 30) {
            return 4;
        } else if (rzutWaga >= 31 && rzutWaga <= 40) {
            return 5;
        } else if (rzutWaga >= 41 && rzutWaga <= 50) {
            return 6;
        } else if (rzutWaga >= 51 && rzutWaga <= 60) {
            return 7;
        } else if (rzutWaga >= 61 && rzutWaga <= 70) {
            return 8;
        } else if (rzutWaga >= 71 && rzutWaga <= 80) {
            return 9;
        } else if (rzutWaga >= 81 && rzutWaga <= 90) {
            return 10;
        } else if (rzutWaga >= 91 && rzutWaga <= 99) {
            return 11;
        } else if (rzutWaga == 100) {
            return 12;
        }
        return -1;
    }

    //Przydziela zmienną do zbadania koloru włosów postaci.
    public int kolorWlosow() {
        int rzutWlosy = 0 + losowanie.k10();
        if (rzutWlosy == 1) {
            return 1;
        } else if (rzutWlosy == 2) {
            return 2;
        } else if (rzutWlosy == 3) {
            return 3;
        } else if (rzutWlosy == 4) {
            return 4;
        } else if (rzutWlosy == 5) {
            return 5;
        } else if (rzutWlosy == 6) {
            return 6;
        } else if (rzutWlosy == 7) {
            return 7;
        } else if (rzutWlosy == 8) {
            return 8;
        } else if (rzutWlosy == 9) {
            return 9;
        } else if (rzutWlosy == 10) {
            return 10;
        } else {
            return -1;
        }
    }

    //Przydziela zmienną do zbadania koloru oczu postaci.
    public int kolorOczu() {
        int rzutOczy = 0 + losowanie.k10();
        if (rzutOczy == 1) {
            return 1;
        } else if (rzutOczy == 2) {
            return 2;
        } else if (rzutOczy == 3) {
            return 3;
        } else if (rzutOczy == 4) {
            return 4;
        } else if (rzutOczy == 5) {
            return 5;
        } else if (rzutOczy == 6) {
            return 6;
        } else if (rzutOczy == 7) {
            return 7;
        } else if (rzutOczy == 8) {
            return 8;
        } else if (rzutOczy == 9) {
            return 9;
        } else if (rzutOczy == 10) {
            return 10;
        } else {
            return -1;
        }
    }

    //Przydziela zmienną do zbadania znaków szczególnych postaci.
    public int znakiSzczegolne() {
        int rzutSzczegolne = 0 + losowanie.k10();
        if (rzutSzczegolne == 1) {
            return 1;
        } else if (rzutSzczegolne == 2) {
            return 2;
        } else if (rzutSzczegolne == 3) {
            return 3;
        } else if (rzutSzczegolne == 4) {
            return 4;
        } else if (rzutSzczegolne == 5) {
            return 5;
        } else if (rzutSzczegolne == 6) {
            return 6;
        } else if (rzutSzczegolne == 7) {
            return 7;
        } else if (rzutSzczegolne == 8) {
            return 8;
        } else if (rzutSzczegolne == 9) {
            return 9;
        } else if (rzutSzczegolne == 10) {
            return 10;
        } else {
            return -1;
        }
    }

    //Przydziela zmienną do zbadania liczby rodzeństwa postaci.
    public int liczbaRodzenstwa() {
        int rzutRodz = losowanie.k10();
        if (rzutRodz == 1) {
            return 1;
        } else if (rzutRodz >= 2 && rzutRodz <= 3) {
            return 2;
        } else if (rzutRodz >= 4 && rzutRodz <= 5) {
            return 3;
        } else if (rzutRodz >= 6 && rzutRodz <= 7) {
            return 4;
        } else if (rzutRodz >= 8 && rzutRodz <= 9) {
            return 5;
        } else if (rzutRodz == 10) {
            return 6;
        }
        return -1;
    }

    //Przydziela zmienną do zbadania znaku gwiezdnego postaci.
    public int znakGwiezdny() {
        int rzutGwiezdny = losowanie.k100();
        if (rzutGwiezdny >= 1 && rzutGwiezdny <= 5) {
            return 1;
        } else if (rzutGwiezdny >= 6 && rzutGwiezdny <= 10) {
            return 2;
        } else if (rzutGwiezdny >= 11 && rzutGwiezdny <= 15) {
            return 3;
        } else if (rzutGwiezdny >= 16 && rzutGwiezdny <= 20) {
            return 4;
        } else if (rzutGwiezdny >= 21 && rzutGwiezdny <= 25) {
            return 5;
        } else if (rzutGwiezdny >= 26 && rzutGwiezdny <= 30) {
            return 6;
        } else if (rzutGwiezdny >= 31 && rzutGwiezdny <= 35) {
            return 7;
        } else if (rzutGwiezdny >= 36 && rzutGwiezdny <= 40) {
            return 8;
        } else if (rzutGwiezdny >= 41 && rzutGwiezdny <= 45) {
            return 9;
        } else if (rzutGwiezdny >= 46 && rzutGwiezdny <= 50) {
            return 10;
        } else if (rzutGwiezdny >= 51 && rzutGwiezdny <= 55) {
            return 11;
        } else if (rzutGwiezdny >= 56 && rzutGwiezdny <= 60) {
            return 12;
        } else if (rzutGwiezdny >= 61 && rzutGwiezdny <= 65) {
            return 13;
        } else if (rzutGwiezdny >= 66 && rzutGwiezdny <= 70) {
            return 14;
        } else if (rzutGwiezdny >= 71 && rzutGwiezdny <= 75) {
            return 15;
        } else if (rzutGwiezdny >= 76 && rzutGwiezdny <= 80) {
            return 16;
        } else if (rzutGwiezdny >= 81 && rzutGwiezdny <= 85) {
            return 17;
        } else if (rzutGwiezdny >= 86 && rzutGwiezdny <= 90) {
            return 18;
        } else if (rzutGwiezdny >= 91 && rzutGwiezdny <= 95) {
            return 19;
        } else if (rzutGwiezdny >= 96 && rzutGwiezdny <= 100) {
            return 20;
        }
        return -1;
    }

    //Przydziela zmienną do zbadania daty urodzenia dla znaku Gwiazda Wieczorna
    public int dataUrodzA() {
        int rzutDatyUrodzA = losowanie.ak8();
        return rzutDatyUrodzA;
    }
    //Przydziela zmienną do zbadania daty urodzenia dla znaku Lancet
    public int dataUrodzB() {
        int rzutDatyUrodzB = losowanie.ak12();
        return rzutDatyUrodzB;
    }
    //Przydziela zmienną do zbadania daty dla większości znaków gwiezdnych
    public int dataUrodzC() {
        int rzutDatyUrodzC = losowanie.ak20();
        return rzutDatyUrodzC;
    }
    //Przydziela zmienną do zbadania daty urodzenia dla znaku Wół Gnuthus
    public int dataUrodzD() {
        int rzutDatyUrodzD = losowanie.ak40();
        return rzutDatyUrodzD;
    }

    //Przydziela zmienną do zbadania wieku postaci.
    public int wiek() {
        int rzutWiek = losowanie.k100();
        if (rzutWiek >= 1 && rzutWiek <= 5) {
            return 1;
        } else if (rzutWiek >= 6 && rzutWiek <= 10) {
            return 2;
        } else if (rzutWiek >= 11 && rzutWiek <= 15) {
            return 3;
        } else if (rzutWiek >= 16 && rzutWiek <= 20) {
            return 4;
        } else if (rzutWiek >= 21 && rzutWiek <= 25) {
            return 5;
        } else if (rzutWiek >= 26 && rzutWiek <= 30) {
            return 6;
        } else if (rzutWiek >= 31 && rzutWiek <= 35) {
            return 7;
        } else if (rzutWiek >= 36 && rzutWiek <= 40) {
            return 8;
        } else if (rzutWiek >= 41 && rzutWiek <= 45) {
            return 9;
        } else if (rzutWiek >= 46 && rzutWiek <= 50) {
            return 10;
        } else if (rzutWiek >= 51 && rzutWiek <= 55) {
            return 11;
        } else if (rzutWiek >= 56 && rzutWiek <= 60) {
            return 12;
        } else if (rzutWiek >= 61 && rzutWiek <= 65) {
            return 13;
        } else if (rzutWiek >= 66 && rzutWiek <= 70) {
            return 14;
        } else if (rzutWiek >= 71 && rzutWiek <= 75) {
            return 15;
        } else if (rzutWiek >= 76 && rzutWiek <= 80) {
            return 16;
        } else if (rzutWiek >= 81 && rzutWiek <= 85) {
            return 17;
        } else if (rzutWiek >= 86 && rzutWiek <= 90) {
            return 18;
        } else if (rzutWiek >= 91 && rzutWiek <= 95) {
            return 19;
        } else if (rzutWiek >= 96 && rzutWiek <= 100) {
            return 20;
        }
        return -1;
    }

    //Przydziela zmienną do zbadania wróżby losu
    public int wrozbaLosu(){
        return losowanie.k100();
    }


}