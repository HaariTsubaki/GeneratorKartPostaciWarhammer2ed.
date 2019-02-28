package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Umiejetnosci {

    public String umiejetnosci(int i) {
        String[] skill = new String[];
        BufferedReader bf;
        String linia;
        int max = 31;

        skill = new String[max];
        try {
            bf = new BufferedReader(new FileReader("Umiejetnosci.txt"));

            do {
                linia = bf.readLine();
                skill[i] = linia;
                i++;
                return linia;
            } while (linia != null);
        } catch (
                IOException ex) {
            System.out.println("Problem z odczytem pliku.");


        }return "błąd";

    }
}