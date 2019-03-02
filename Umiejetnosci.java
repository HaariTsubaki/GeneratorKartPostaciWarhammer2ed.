package com.company;

class Umiejetnosci {
    private String nazwa;

    public Umiejetnosci(String nazwa) {
        this.nazwa = nazwa;
    }

    public String opis() {
        return "brak opisu";
    }

    public String getNazwa() {
        return nazwa;
    }
}
// .........................................................................
//Umiejetnosci Podstawowe

class Charakteryzacja extends Umiejetnosci {
    public Charakteryzacja() {
        super("Charakteryzacja");
    }

    @Override
    public String opis() {
        return "Umiejętności związane z zamaskowaniem lub zmianą swojej aparycji.";
    }
}

class Dowodzenie extends Umiejetnosci {
    public Dowodzenie() {
        super("Dowodzenie");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Hazard extends Umiejetnosci {
    public Hazard() {
        super("Hazard");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Jezdziectwo extends Umiejetnosci {
    public Jezdziectwo() {
        super("Jeździectwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class MocnaGlowa extends Umiejetnosci {
    public MocnaGlowa() {
        super("Mocna Głowa");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class OpiekaNadZwierzetami extends Umiejetnosci {
    public OpiekaNadZwierzetami() {
        super("Opieka nad zwierzętami");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Plotkowanie extends Umiejetnosci {
    public Plotkowanie() {
        super("Plotkowanie");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Plywanie extends Umiejetnosci {
    public Plywanie() {
        super("Pływanie");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Powozenie extends Umiejetnosci {
    public Powozenie() {
        super("Powożenie");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Przekonywanie extends Umiejetnosci {
    public Przekonywanie() {
        super("Przekonywanie");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Przeszukiwanie extends Umiejetnosci {
    public Przeszukiwanie() {
        super("Przeszukiwanie");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class SkradanieSie extends Umiejetnosci {
    public SkradanieSie() {
        super("Skradanie się");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Spostrzegawczosc extends Umiejetnosci {
    public Spostrzegawczosc() {
        super("Spostrzegawczość");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class SztukaPrzetrwania extends Umiejetnosci {
    public SztukaPrzetrwania() {
        super("Sztuka przetrwania");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Targowanie extends Umiejetnosci {
    public Targowanie() {
        super("Targowanie");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class UkrywanieSie extends Umiejetnosci {
    public UkrywanieSie() {
        super("Ukrywanie się");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Wioslatstwo extends Umiejetnosci {
    public Wioslatstwo() {
        super("Wioślatstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Wspinaczka extends Umiejetnosci {
    public Wspinaczka() {
        super("Wspinaczka");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Wycena extends Umiejetnosci {
    public Wycena() {
        super("Wycena");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Zastraszanie extends Umiejetnosci {
    public Zastraszanie() {
        super("Zastraszanie");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

// .........................................................................
//Umiejętności Zaawansowane

class Brzuchomowstwo extends Umiejetnosci {
    public Brzuchomowstwo() {
        super("Brzuchomówstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class CzytanieIPsianie extends Umiejetnosci {
    public CzytanieIPsianie() {
        super("Czytanie i psianie");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class CzytanieZWarg extends Umiejetnosci {
    public CzytanieZWarg() {
        super("Czytanie z warg");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Gadanina extends Umiejetnosci {
    public Gadanina() {
        super("Gadanina");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Hipnoza extends Umiejetnosci {
    public Hipnoza() {
        super("Hipnoza");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Leczenie extends Umiejetnosci {
    public Leczenie() {
        super("Leczenie");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Nawigacja extends Umiejetnosci {
    public Nawigacja() {
        super("Nawigacja");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Oswajanie extends Umiejetnosci {
    public Oswajanie() {
        super("Oswajanie");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class OtwieranieZamkow extends Umiejetnosci {
    public OtwieranieZamkow() {
        super("Otwieranie zamków");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class SplatanieMagii extends Umiejetnosci {
    public SplatanieMagii() {
        super("Splatanie magii");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Sledzenie extends Umiejetnosci {
    public Sledzenie() {
        super("Śledzenie");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Torturowanie extends Umiejetnosci {
    public Torturowanie() {
        super("Torturowanie");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Tresura extends Umiejetnosci {
    public Tresura() {
        super("Tresura");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Tropienie extends Umiejetnosci {
    public Tropienie() {
        super("Tropienie");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Unik extends Umiejetnosci {
    public Unik() {
        super("Unik");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class WarzenieTrucizn extends Umiejetnosci {
    public WarzenieTrucizn() {
        super("Warzenie trucizn");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class WykrwyanieMagii extends Umiejetnosci {
    public WykrwyanieMagii() {
        super("Wykrwyanie magii");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class ZastawianiePulapek extends Umiejetnosci {
    public ZastawianiePulapek() {
        super("Zastawianie pułapek");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class ZwinnePalce extends Umiejetnosci {
    public ZwinnePalce() {
        super("Zwinne palce");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Zeglarstwo extends Umiejetnosci {
    public Zeglarstwo() {
        super("Żeglarstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

// .........................................................................
//Znajomości Języków
class Reikspikel extends Umiejetnosci {
    public Reikspikel() {
        super("Reikspikel");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Khazalid extends Umiejetnosci {
    public Khazalid() {
        super("Khazalid");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Eltharin extends Umiejetnosci {
    public Eltharin() {
        super("Eltharin");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Kislevarin extends Umiejetnosci {
    public Kislevarin() {
        super("Kislevarin");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Tileanski extends Umiejetnosci {
    public Tileanski() {
        super("Tileanski");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Bretonski extends Umiejetnosci {
    public Bretonski() {
        super("Bretoński");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Norski extends Umiejetnosci {
    public Norski() {
        super("Norski");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Klasyczny extends Umiejetnosci {
    public Klasyczny() {
        super("Klasyczny");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class NarzeczeNiziolkow extends Umiejetnosci {
    public NarzeczeNiziolkow() {
        super("Narzecze niziołkow");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Sylvanski extends Umiejetnosci {
    public Sylvanski() {
        super("Sylvański");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Goblinski extends Umiejetnosci {
    public Goblinski() {
        super("Gobliński");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Grumbarth extends Umiejetnosci {
    public Grumbarth() {
        super("Grumbarth");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class MrocznaMowa extends Umiejetnosci {
    public MrocznaMowa() {
        super("Mroczna mowa");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Squeekish extends Umiejetnosci {
    public Squeekish() {
        super("Squeekish");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

// .........................................................................
//Języki Tajemne
class TajemnyMagiczny extends Umiejetnosci {
    public TajemnyMagiczny() {
        super("Lingua Praestantia");
    }

    @Override
    public String opis() {
        return "Język majemny magiczny";
    }
}

class TajemnyElfi extends Umiejetnosci {
    public TajemnyElfi() {
        super("Anoqueyan");
    }

    @Override
    public String opis() {
        return "Język tajemny Wysokich Elfów";
    }

    class TajemnyKrasnoludzki extends Umiejetnosci {
        public TajemnyKrasnoludzki() {
            super("Tajemny Krasnoludzki");
        }

        @Override
        public String opis() {
            return "Język tajemny Krasnoludzki";
        }
    }
}

class TajemnyDemoniczny extends Umiejetnosci {
    public TajemnyDemoniczny() {
        super("Tajemny demoniczny");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}
// .........................................................................
//Umiejętności z Królestwo Magii

class WykuwanieRun extends Umiejetnosci {
    public WykuwanieRun() {
        super("Wykuwanie run");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

// .........................................................................
//Umiejętności Nauka

class Alchemia extends Umiejetnosci {
    public Alchemia() {
        super("Alchemia");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Astronomia extends Umiejetnosci {
    public Astronomia() {
        super("Astronomia");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Demonologia extends Umiejetnosci {
    public Demonologia() {
        super("Demonologia");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Duchy extends Umiejetnosci {
    public Duchy() {
        super("Duchy");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Filozofia extends Umiejetnosci {
    public Filozofia() {
        super("Filozofia");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class GenealogiaHeraldyka extends Umiejetnosci {
    public GenealogiaHeraldyka() {
        super("Genealogia i heraldyka");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Historia extends Umiejetnosci {
    public Historia() {
        super("Historia");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Inzynieria extends Umiejetnosci {
    public Inzynieria() {
        super("Inżynieria");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Magia extends Umiejetnosci {
    public Magia() {
        super("Magia");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Matematyka extends Umiejetnosci {
    public Matematyka() {
        super("Matematyka");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Nekromancja extends Umiejetnosci {
    public Nekromancja() {
        super("Nekromancja");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Prawo extends Umiejetnosci {
    public Prawo() {
        super("Prawo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Runy extends Umiejetnosci {
    public Runy() {
        super("Runy");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class StrategiaTaktyka extends Umiejetnosci {
    public StrategiaTaktyka() {
        super("Strategia i taktyka");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class SztukaN extends Umiejetnosci {
    public SztukaN() {
        super("Sztuka");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Teologia extends Umiejetnosci {
    public Teologia() {
        super("Teologia");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

// .........................................................................
//Umiejętności Kuglarstwo
class Akrobatyka extends Umiejetnosci {
    public Akrobatyka() {
        super("Akrobatyka");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Aktorstwo extends Umiejetnosci {
    public Aktorstwo() {
        super("Aktorstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Blaznowanie extends Umiejetnosci {
    public Blaznowanie() {
        super("Błaznowanie");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Gawedziarstwo extends Umiejetnosci {
    public Gawedziarstwo() {
        super("Gawędziarstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Komedianctwo extends Umiejetnosci {
    public Komedianctwo() {
        super("Komedianctwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Mimika extends Umiejetnosci {
    public Mimika() {
        super("Mimika");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Muzykalnosc extends Umiejetnosci {
    public Muzykalnosc() {
        super("Muzykalność");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class PolykanieOgnia extends Umiejetnosci {
    public PolykanieOgnia() {
        super("Połykanie ognia");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Spiew extends Umiejetnosci {
    public Spiew() {
        super("Śpiew");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Taniec extends Umiejetnosci {
    public Taniec() {
        super("Taniec");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class WrozenieZDloni extends Umiejetnosci {
    public WrozenieZDloni() {
        super("Wróżenie z dłoni");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Zonglerka extends Umiejetnosci {
    public Zonglerka() {
        super("Żonglerka");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

// .........................................................................
//Umiejętności Rzemiosło
class Aptekarstwo extends Umiejetnosci {
    public Aptekarstwo() {
        super("Aptekarstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Bednarstwo extends Umiejetnosci {
    public Bednarstwo() {
        super("Bednarstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Garbarstwo extends Umiejetnosci {
    public Garbarstwo() {
        super("Garbarstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Gotowanie extends Umiejetnosci {
    public Gotowanie() {
        super("Gotowanie");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Gornictwo extends Umiejetnosci {
    public Gornictwo() {
        super("Górnictwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Handel extends Umiejetnosci {
    public Handel() {
        super("Handel");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Jubilerstwo extends Umiejetnosci {
    public Jubilerstwo() {
        super("Jubilerstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Kaligrafia extends Umiejetnosci {
    public Kaligrafia() {
        super("Kaligrafia");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Kamieniarstwo extends Umiejetnosci {
    public Kamieniarstwo() {
        super("Kamieniarstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Kartografia extends Umiejetnosci {
    public Kartografia() {
        super("Kartografia");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Kowalstwo extends Umiejetnosci {
    public Kowalstwo() {
        super("Kowalstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Krawiectwo extends Umiejetnosci {
    public Krawiectwo() {
        super("Krawiectwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Mlynarstwo extends Umiejetnosci {
    public Mlynarstwo() {
        super("Młynarstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Piwowarstwo extends Umiejetnosci {
    public Piwowarstwo() {
        super("Piwowarstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Platnerstwo extends Umiejetnosci {
    public Platnerstwo() {
        super("Płatnerstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Rusznikarstwo extends Umiejetnosci {
    public Rusznikarstwo() {
        super("Rusznikarstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Rymarstwo extends Umiejetnosci {
    public Rymarstwo() {
        super("Rymarstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Stolarstwo extends Umiejetnosci {
    public Stolarstwo() {
        super("Stolarstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Szkutnictwo extends Umiejetnosci {
    public Szkutnictwo() {
        super("Szkutnictwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Szewstwo extends Umiejetnosci {
    public Szewstwo() {
        super("Szewstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class SztukaR extends Umiejetnosci {
    public SztukaR() {
        super("Sztuka");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Swiecarstwo extends Umiejetnosci {
    public Swiecarstwo() {
        super("Świecarstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class UprawaZiemi extends Umiejetnosci {
    public UprawaZiemi() {
        super("Uprawa ziemi");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class WyrobLukow extends Umiejetnosci {
    public WyrobLukow() {
        super("Wyrób łuków");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Zielarstwo extends Umiejetnosci {
    public Zielarstwo() {
        super("Zielarstwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

class Zlotnictwo extends Umiejetnosci {
    public Zlotnictwo() {
        super("Złotnictwo");
    }

    @Override
    public String opis() {
        return "brak opisu";
    }
}

// .........................................................................
//Umiejętności Sekretne Znaki

// .........................................................................
//Umiejętności Sekretny Język

// .........................................................................
//Umiejętności Wiedza