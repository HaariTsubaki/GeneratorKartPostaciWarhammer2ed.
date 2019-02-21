package com.company;

public class Rasa {
    //Człowiek, Niziołek, Krasnolud, Elf (PG, DS, RG)
    //Wybrany, Silny, Pospolity (DRS)
    //Pomiot Chaosu, Gor, Bestiogor, Minotaur, Centigor, Rykowiec, Szaman Rykowiec, Ogr, Olbrzym, Troll, Kurganin,
    // Krasnolud Chaosu, Demon Sługa, Demon Bestia, Pomniejszy Demon,

    Losowanie losowanie = new Losowanie();

    String rasa =                   getClass().getSimpleName();
    int walkaWrecz =                0 + losowanie.k20();
    int umiejetnosciStrzleckie =    0 + losowanie.k20();
    int krzepa =                    0 + losowanie.k20();
    int odpornosc =                 0 + losowanie.k20();
    int zrecznosc =                 0 + losowanie.k20();
    int silaWoli =                  0 + losowanie.k20();
    int inteligencja =              0 + losowanie.k20();
    int oglada =                    0 + losowanie.k20();

}
