package com.company;

import java.awt.desktop.SystemEventListener;

public class Kalendarium {
    KartaPostaci kartaPostaci = new KartaPostaci();

    // Odbiera zmienną z karty postaci jeden raz i przekazuje tę samą zmienną metodom znakGwiezdny i znakGwiezdnyFokus.
    int gwiezdny = kartaPostaci.znakGwiezdny();

    // .........................................................................
    // Kolejność Znaków Gwiezdnych jest podana w kolejności w jakich po sobie następują.

    // Wypisuje znak gwiezdny postaci.
    public String znakGwiezdny() {

        if (gwiezdny == 1) {
            return "Wymund Pustelnik";
        } else if (gwiezdny == 2) {
            return "Wielki Krzyż";
        } else if (gwiezdny == 3) {
            return "Sznur Limnera";
        } else if (gwiezdny == 4) {
            return "Wół Gnuthus";
        } else if (gwiezdny == 5) {
            return "Smok Dragomas";
        } else if (gwiezdny == 6) {
            return "Gwiazda Uroku";
        } else if (gwiezdny == 7) {
            return "Pas Grungiego";
        } else if (gwiezdny == 8) {
            return "Mędrzec Mammit";
        } else if (gwiezdny == 9) {
            return "Głupiec Mummit";
        } else if (gwiezdny == 10) {
            return "Dwa byki";
        } else if (gwiezdny == 11) {
            return "Tancerka";
        } else if (gwiezdny == 12) {
            return "Bębniarz";
        } else if (gwiezdny == 13) {
            return "Dudy";
        } else if (gwiezdny == 14) {
            return "Vobist Ulotny";
        } else if (gwiezdny == 15) {
            return "Rozbity Wóz";
        } else if (gwiezdny == 16) {
            return "Tłusty Kozioł";
        } else if (gwiezdny == 17) {
            return "Kocioł Rhyi";
        } else if (gwiezdny == 18) {
            return "Złoty Kogut";
        } else if (gwiezdny == 19) {
            return "Lancet";
        } else if (gwiezdny == 20) {
            return "Gwiazda Wieczorna";
        }
        return "Błąd";

    }

    // Wypisuje opis znaku gwiezdnego.
    public String znakGwiezdnyFokus() {

        if (gwiezdny == 1) {
            return "Znak wytrzymałości.";
        } else if (gwiezdny == 2) {
            return "Znak czystości.";
        } else if (gwiezdny == 3) {
            return "Znak dokładności.";
        } else if (gwiezdny == 4) {
            return "Znak wiernej służby.";
        } else if (gwiezdny == 5) {
            return "Znak odwagi.";
        } else if (gwiezdny == 6) {
            return "Znak tajemnicy i iluzji.";
        } else if (gwiezdny == 7) {
            return "Znak sprawności wojennej.";
        } else if (gwiezdny == 8) {
            return "Znak mądrości.";
        } else if (gwiezdny == 9) {
            return "Znak instynktu.";
        } else if (gwiezdny == 10) {
            return "Znak płodności i rzemiosła.";
        } else if (gwiezdny == 11) {
            return "Znak miłości i pożądania.";
        } else if (gwiezdny == 12) {
            return "Znak zabawy i radości.";
        } else if (gwiezdny == 13) {
            return "Znak oszustwa.";
        } else if (gwiezdny == 14) {
            return "Znak ciemności i niepewności.";
        } else if (gwiezdny == 15) {
            return "Znak dumy.";
        } else if (gwiezdny == 16) {
            return "Znak ukrytej namiętności.";
        } else if (gwiezdny == 17) {
            return "Znak łaski, śmierci i tworzenia.";
        } else if (gwiezdny == 18) {
            return "Znak kupców i bogactwa.";
        } else if (gwiezdny == 19) {
            return "Znak nauki i talentu.";
        } else if (gwiezdny == 20) {
            return "Znak magii.";
        }
        return "Błąd";

    }

    // Wypisuje rok urodzin
    public int rokUrodzin() {
        int rok = 2522;
        int wiekPostaci = rok - kartaPostaci.wiek();
        return wiekPostaci;
    }

    // Wypisuje przybiżoną miesięczną datę urodzin.
    public String dataUrodzin() {

        if (gwiezdny == 1) {
            return "11 Przedwiedźmia - 30 Przedwiedźmia";
        } else if (gwiezdny == 2) {
            return "31 Przedwiedźmia - 16 Powiedźmia.";
        } else if (gwiezdny == 3) {
            return "17 Powiedźmia - 4 Zmiany Roku.";
        } else if (gwiezdny == 4) {
            return "5 Zmiany Roku - 10 Czasu Orki.";
        } else if (gwiezdny == 5) {
            return "11 Czasu Orki - 30 Czasu Orki.";
        } else if (gwiezdny == 6) {
            return "31 Czasu orki - 17 Czasu Sigmara.";
        } else if (gwiezdny == 7) {
            return "18 Czasu Sigmara - 4 Czasu Letniego.";
        } else if (gwiezdny == 8) {
            return "5 Czasu Letniego - 24 Czasu Letniego.";
        } else if (gwiezdny == 9) {
            return "25 Czasu Letniego - 10 Przed Tajemnicą.";
        } else if (gwiezdny == 10) {
            return "11 Przed Tajemnicą - 30 Przed Tajemnicą.";
        } else if (gwiezdny == 11) {
            return "31 Przed Tajemnicą - 16 Po Tajemnicy.";
        } else if (gwiezdny == 12) {
            return "17 Po Tajemnicy - 4 Czasu Zbiorów.";
        } else if (gwiezdny == 13) {
            return "5 Czasu Zbiorów - 24 Czasu Zbiorów.";
        } else if (gwiezdny == 14) {
            return "25 Czasu Zbiorów - 10 Czasu Warzenia.";
        } else if (gwiezdny == 15) {
            return "11 Czasu Warzenia - 30 Czasu Warzenia.";
        } else if (gwiezdny == 16) {
            return "31 Czasu Warzenia - 17 Czasu Mrozów.";
        } else if (gwiezdny == 17) {
            return "18 Czasu Mrozów - 4 Czasu Ulryka.";
        } else if (gwiezdny == 18) {
            return "5 Czasu Ulryka - 24 Czasu Ulryka.";
        } else if (gwiezdny == 19) {
            return "25 Czasu Ulryka - 2 Przedwiedźmia.";
        } else if (gwiezdny == 20) {
            return "3 Przedwiedźmia - 10 Przedwiedźmia. ";
        }
        return "Błąd";
    }

    // Wypisuje dokładną miesięczną datę urodzin.
    public String dataUrodzinDokladna() {

        /*Przedwiedźmie     33
         * Hexennacht       1
         * Powiedźmie       32
         * Zmiany Roku      33
         * Równonoc         1
         * Czas Orki        33
         * Czas Sigmara     33
         * Czas Letni       33
         * Let Przesilenie  1
         * Przed Tajemnicą  33
         * Tajemnica        1
         * Po Tajemnicy     32
         * Czas Zbiorów     33
         * Równonoc         1
         * Czas Warzenia    33
         * Czas Mrozów      33
         * Czas Ulryka      33
         * Zim Przesilenie  1
         */

        /*1. Wymund Pustelnik     11 Przedwiedźmia - 30 Przedwiedźmia     20 dni    ok
         *2. Wielki Krzyż         31 Przedwiedźmia - 16 Powiedźmia        20 dni!   ok
         *3. Sznur Limnera        17 Powiedźmia - 4 Zmiany Roku           20 dni    ok
         *4. Wół Gnuthus          5 Zmiany Roku - 10 Czasu Orki           40 dni!   ok
         *5. Smok Dragomas        11 Czasu Orki - 30 Czasu Orki           20 dni    ok
         *6. Gwiazda Uroku        31 Czasu Orki - 17 Czasu Sigmara        20 dni    ok
         *7. Pas Grungiego        18 Czasu Sigmara - 4 Czasu Letniego     20 dni    ok
         *8. Mędrzec Mammit       5 Czasu Letniego - 24 Czasu Letniego    20 dni    ok
         *9. Głupiec Mummit       25 Czasu Letniego - 10 Przed Tajemnicą  20 dni!   ok
         *10 Dwa byki             11 Przed Tajemnicą - 30 Przed Tajemnicą 20 dni    ok
         *11 Tancerka             31 Przed Tajemnicą - 16 Po Tajemnicy    20 dni!   ok
         *12 Bębniarz             17 Po Tajemnicy - 4 Czasu Zbiorów       20 dni    ok
         *13 Dudy                 5 Czasu Zbiorów - 24 Czasu Zbiorów      20 dni    ok
         *14 Vobist Ulotny        25 Czasu Zbiorów - 10 Czasu Warzenia    20 dni!   ok
         *15 Rozbity Wóz          11 Czasu Warzenia - 30 Czasu Warzenia   20 dni    ok
         *16 Tłusty Kozioł        31 Czasu Warzenia - 17 Czasu Mrozów     20 dni    ok
         *17 Kocioł Rhyi          18 Czasu Mrozów - 4 Czasu Ulryka        20 dni    ok
         *18 Złoty Kogut          5 Czasu Ulryka - 24 Czasu Ulryka        20 dni    ok
         *19 Lancet               25 Czasu Ulryka - 2 Przedwiedźmia       12 dni!   ok
         *20 Gwiazda Wieczorna    3 Przedwiedźmia - 10 Przedwiedźmia      8 dni     ok
         */

        if (gwiezdny == 1) {                                                //ok
            return ((10 + kartaPostaci.dataUrodzC()) + " dnia Przedwiedźmia");
        } else if (gwiezdny == 2) {                                         //ok
            int a = kartaPostaci.dataUrodzC();
            if (a >= 1 && a <= 3) {
                return ((a + 30) + " dnia Przedwiedźmia");
            } else if (a == 4) {
                return "w Hexennacht";
            } else if (a >= 5 && a <= 20) {
                return ((a - 4) + " dnia Powiedźmia");
            } else {
                return "błąd 2";
            }
        } else if (gwiezdny == 3) {                                         //ok
            int a = kartaPostaci.dataUrodzC();
            if (a >= 1 && a <= 16) {
                return ((a + 16) + " dnia Powiedźmia");
            } else if (a >= 17 && a <= 20) {
                return ((a - 16) + " dnia Zmiany roku");
            } else {
                return "błąd 3";
            }
        } else if (gwiezdny == 4) {                                         //ok
            int a = kartaPostaci.dataUrodzD();
            if (a >= 1 && a <= 29) {
                return ((a + 4) + " dnia Zmiany roku");
            } else if (a == 30) {
                return "w Wiosenną Równonoc";
            } else if (a >= 31 && a <= 40) {
                return ((a - 30) + " dnia Czasu Orki");
            } else {
                return "błąd 4";
            }
        } else if (gwiezdny == 5) {                                         //ok
            return ((10 + kartaPostaci.dataUrodzC()) + " dnia Czasu Orki");
        } else if (gwiezdny == 6) {                                         //ok
            int a = kartaPostaci.dataUrodzC();
            if (a >= 1 && a <= 3) {
                return ((a + 30) + " dnia Czasu Orki");
            } else if (a >= 4 && a <= 20) {
                return ((a - 3) + " dnia Czasu Sigmara");
            } else {
                return "błąd 6";
            }
        } else if (gwiezdny == 7) {                                        //ok
            int a = kartaPostaci.dataUrodzC();
            if (a >= 1 && a <= 16) {
                return ((a + 17) + " dnia Czasu Sigmara");
            } else if (a >= 17 && a <= 20) {
                return ((a - 16) + " dnia Czasu Letniego");
            } else {
                return "błąd 7";
            }
        } else if (gwiezdny == 8) {                                         //ok
            return ((4 + kartaPostaci.dataUrodzC()) + " dnia Czasu Letniego");
        } else if (gwiezdny == 9) {                                         //ok
            int a = kartaPostaci.dataUrodzC();
            if (a >= 1 && a <= 9) {
                return ((a + 24) + " dnia Czasu Letniego");
            } else if (a == 10) {
                return "w Letnie Przesilenie";
            } else if (a >= 11 && a <= 20) {
                return ((a - 10) + " dnia Przed Tajemnicą");
            } else {
                return "błąd 9";
            }
        } else if (gwiezdny == 10) {                                        //ok
            return ((10 + kartaPostaci.dataUrodzC()) + " dnia Przed Tajemnicą");
        } else if (gwiezdny == 11) {                                        //ok
            int a = kartaPostaci.dataUrodzC();
            if (a >= 1 && a <= 3) {
                return ((a + 30) + " dnia Przed Tajemnicą");
            } else if (a == 4) {
                return "w dniu Tajemnicy";
            } else if (a >= 5 && a <= 20) {
                return ((a - 4) + " dnia Po Tajemnicy");
            } else {
                return "błąd 11";
            }
        } else if (gwiezdny == 12) {                                        //ok
            int a = kartaPostaci.dataUrodzC();
            if (a >= 1 && a <= 16) {
                return ((a + 16) + " dnia Po Tajemnicy");
            } else if (a >= 17 && a <= 20) {
                return ((a - 16) + " dnia Czasu Zbiorów");
            } else {
                return "błąd 12";
            }
        } else if (gwiezdny == 13) {                                        //ok
            return ((4 + kartaPostaci.dataUrodzC()) + " dnia Czasu Zbiorów");
        } else if (gwiezdny == 14) {                                        //ok
            int a = kartaPostaci.dataUrodzC();
            if (a >= 1 && a <= 9) {
                return ((a + 24) + " dnia Czasu Zbiorów");
            } else if (a == 10) {
                return "w Równonoc Jesienną";
            } else if (a >= 11 && a <= 20) {
                return ((a - 10) + " dnia Czasu Warzenia");
            } else {
                return "błąd 14";
            }
        } else if (gwiezdny == 15) {                                        //ok
            return ((10 + kartaPostaci.dataUrodzC()) + " dnia Czasu Warzenia");
        } else if (gwiezdny == 16) {                                        //ok
            int a = kartaPostaci.dataUrodzC();
            if (a >= 1 && a <= 3) {
                return ((a + 30) + " dnia Czasu Warzenia");
            } else if (a >= 4 && a <= 20) {
                return ((a - 3) + " dnia Czasu Mrozów");
            } else {
                return "błąd 16";
            }
        } else if (gwiezdny == 17) {                                        //ok
            int a = kartaPostaci.dataUrodzC();
            if (a >= 1 && a <= 16) {
                return ((a + 17) + " dnia Czasu mrozów");
            } else if (a >= 17 && a <= 20) {
                return ((a - 16) + " dnia Czasu Ulryka");
            } else {
                return "błąd 17";
            }
        } else if (gwiezdny == 18) {                                        //ok
            return ((4 + kartaPostaci.dataUrodzC()) + " dnia Czasu Ulryka");
        } else if (gwiezdny == 19) {
            int a = kartaPostaci.dataUrodzB();
            if (a >= 1 && a <= 9) {
                return ((a + 24) + " dnia Czasu Ulryka");
            } else if (a == 10) {
                return "w Zimowe Przesilenie";
            } else if (a >= 11 && a <= 12) {
                return ((a - 10) + " dnia Przedwiedźmia");
            } else {
                return "błąd 19";
            }
        } else if (gwiezdny == 20) {                                        //ok
            return ((2 + kartaPostaci.dataUrodzA()) + " dnia Przedwiedźmia");
        }
        return "Błąd";
    }
    // .........................................................................

    // Wypisuje najważniejsze wydarzenie z roku urodzin postaci.
    public String kalendarzFocus(int wiek) {
        int rok = 2522;
        int wiekKal = rok - wiek;

        if (wiekKal > 2506) {
            return "Jesteś zbyt młody aby rozpocząć przygodę w tym świecie.";
        } else if (wiekKal == 2500) {
            return "Tego roku w Imperium odbyły się liczne festyny z okazji 25 wieków od narodzin Sigmara.";
        } else if (wiekKal == 2502) {
            return "Tego samego roku w Imperium konorowany na Imperatora został Karl Franz.";
        } else if (wiekKal == 2497) {
            return "Tego samego roku w Kislevie Radii Bokha powraca z dziczy z niedźwiedziem Urskin i staje się pierwszym kapłanem Ursuna od ponad 4 wieków. Przyjmuje tytuł Borysa Ursusa.";
        } else if (wiekKal == 2493) {
            return "Tego samego roku Car Borys Bokha pokonuje armię zwierzoludzi pod murami Praag zyskując tytuł 'Bokha Czerwonego'.";
        } else if (wiekKal == 2492) {
            return "Tego samego roku Car Vladimir Bokha  umiera w trakcie walki z goblinami na wschód od Kislevu. Jego syn Borys Bokha uzyskuje w spadku pogrążonpy w biedzie Carat.";
        } else if (wiekKal == 2491) {
            return "Tego samego roku w Bretonii w nieznanych okolicznościach wymordowany zostaje klasztor La Maisontaal. Krążą plotki o ataku żywych trupów.";
        } else if (wiekKal == 2488) {
            return "Tego samego roku w Bretonii ogłoszono koniec wojny rycerskiej wymierzonej w zielonoskórych.";
        } else if (wiekKal == 2465) {
            return "Tego samego roku w Kislevie upada okrutny reżim Carycy Katarzyny kiedy jej syn Carewicz Paweł zadaje jej śmiertelną ranę i umieszcza jej zwłoki w bloku lodu.";
        } else if (wiekKal == 2449) {
            return "Tego samego roku w Marienburgu wybuchają zamieszki w związku z wprowadzeniem ograniczenia wpływów pracowniczych.";
        } else if (wiekKal == 2448) {
            return "Tego samego roku Marienburg zostaje zalany przez powódź. Rada miejska rozpoczyna usprawnienie systemu odwadniającego i rozbudowę murów.";
        } else if (wiekKal == 2429) {
            return "Tego samego roku Marienburg odłącza się od Imperium. W związku z tym wydarzeniem Imperator Dieter IV traci koronę na rzecz Wilhelma III.";
        } else if (wiekKal == 2424) {
            return "Tego samego roku Imperium zostało zaatakowane przez armię orków dowodzonych przez Groma. Armie splądrowały północną i wschodnią część Imperium w tym Nuln. Następnie armie orków zbudowały ogromną flotę żeglując na zachód.";
        } else if (wiekKal == 2421) {
            return "Tego samego roku do Imperium dochodzą pogłoski o tym, że Bretonia ogłosiła wojnę rycerską wymierzoną w zielonoskórych.";
        } else if (wiekKal == 2420) {
            return "Tego samego roku w Imperium zaczęły krążyć plotki o armii orków zbierającej siły, które następnego roku splądrowały północne i wschodnie Imperium paląc do szczętu miasto Nuln.";
        } else if (wiekKal == 2400) {
            return "Tego roku w Imperium odbyły się liczne festyny z okazji 24 wieków od narodzin Sigmara.";
        } else if (wiekKal == 2400) {
            return "Tego roku w Imperium odbyły się liczne festyny z okazji 24 wieków od narodzin Sigmara.";
        } else if (wiekKal == 2400) {
            return "Tego roku w Imperium odbyły się liczne festyny z okazji 24 wieków od narodzin Sigmara.";
        } else if (wiekKal == 2400) {
            return "Tego roku w Imperium odbyły się liczne festyny z okazji 24 wieków od narodzin Sigmara.";
        } else if (wiekKal == 2400) {
            return "Tego roku w Imperium odbyły się liczne festyny z okazji 24 wieków od narodzin Sigmara.";
        } else if (wiekKal == 2397) {
            return "Wciąż słychać opowiadania o porwaniu wszystkich dzieci z zamku Siegfried w Sylvanii ponad dekadę temu.";
        } else if (wiekKal < 2397) {
            return "Jesteś za stary aby rozpocząć nową przygodę.";
        }
        return "błąd";
    }

    // Wypisuje wróżbę losu
    public String wrozbaLosu(){
        int wrozba = kartaPostaci.wrozbaLosu();

    if (wrozba >= 1 && wrozba <= 3) {
        return "Zguba twa nadejdzie w mroku.";
    } else if (wrozba >= 4 && wrozba <= 6) {
        return "Strzeż się zwierza z pól. I czerwonej bestii.";
    } else if (wrozba >= 7 && wrozba <= 9) {
        return "Słowo pisane twą zgubę przypieczętuje.";
    } else if (wrozba >= 10 && wrozba <= 12) {
        return "Umrzesz gdy tchu ci zabraknie.";
    } else if (wrozba ==13) {
        return "Trzy razy po trzy razy i raz jeszcze trzy - to znak twojej śmierci.";
    } else if (wrozba >= 14 && wrozba <= 16) {
        return "Duszę twą pożre Bestia Mosiężna.";
    } else if (wrozba >= 17 && wrozba <= 22) {
        return "W strawie swej ptaka nie ujrzysz ani ryby ościstej.";
    } else if (wrozba >= 23 && wrozba <= 28) {
        return "Zemsta bogów dosięgnie cię!";
    } else if (wrozba >= 29 && wrozba <= 34) {
        return "W łożu umrzesz choć nie swoim.";
    } else if (wrozba >= 35 && wrozba <= 38) {
        return "Blask Morrslieba poprowadzi cię do bram umarłych.";
    } else if (wrozba >= 39 && wrozba <= 44) {
        return "Zgubą twą woda będzie. Strzeż się wody!";
    } else if (wrozba >= 45 && wrozba <= 48) {
        return "Dobroć twoja złem podszyta. Męstwo twe to śmiech głupca.";
    } else if (wrozba >= 49 && wrozba <= 53) {
        return "Nie wachaj się, by tajemnicę na skraju przepaści poznać.";
    } else if (wrozba >= 54 && wrozba <= 58) {
        return "Zguba twa z góry na cię spadnie.";
    } else if (wrozba >= 59 && wrozba <= 65) {
        return "Ciało twe pożre mroczny pomór.";
    } else if (wrozba >= 66 && wrozba <= 68) {
        return "Kres wieszczą płomienie przed okiem ukryte.";
    } else if (wrozba >= 69 && wrozba <= 72) {
        return "Duma twym losem. Próżność kresem.";
    } else if (wrozba >= 73 && wrozba <= 75) {
        return "I spożywać będziesz jadło z misy zepsucia.";
    } else if (wrozba >= 76 && wrozba <= 78) {
        return "Losem twym zaćmiony wzrok.";
    } else if (wrozba >= 79 && wrozba <= 85) {
        return "Kto mieczem wojuje, po ostrzu jego krew spłynie.";
    } else if (wrozba >= 86 && wrozba <= 88) {
        return "Umrzesz po trzykroć przeklęty.";
    } else if (wrozba >= 89 && wrozba <= 92) {
        return "Srebrne ostrze powita cię na progu śmierci.";
    } else if (wrozba >= 93 && wrozba <= 95) {
        return "Strzeż się zieleni...";
    } else if (wrozba >= 96 && wrozba <= 97) {
        return "Nie zaznasz łaski Ranalda.";
    } else if (wrozba >= 98 && wrozba <= 99) {
        return "Czas poznasz gdy posłańca Morra dojrzysz.";
    } else if (wrozba == 100) {
        return "Bogowie skrywają swe zamiary wobec ciebie.";
    }
        return "Błąd";

    }
}
