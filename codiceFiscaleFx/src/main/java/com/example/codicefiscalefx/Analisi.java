package com.example.codicefiscalefx;

import javafx.beans.property.StringProperty;

public class Analisi {
    private final static char[] vocali = {'a', 'e', 'i', 'o', 'u'};
    private final static char[] consonanti = {'b', 'c', 'd', 'f', 'g', 'h', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'z'};

    public Analisi() {    }

    public String estraiLettereNome(Persona daAnalizzare){
        return estraiLettere(daAnalizzare.getNome().toCharArray());
    }

    public String estraiLettereCognome(Persona daAnalizzare){
        return estraiLettere(daAnalizzare.getCognome().toCharArray());
    }

    public String estraiLettere(char[] stringa) {
        String lettereEstratteNome = "";
        int nTrovate = 0;

        for(char c : stringa){
            if(isConsonante(c) && nTrovate<3){
                lettereEstratteNome.concat(String.valueOf(c).toUpperCase()) ;
                nTrovate++;
            }
            if(nTrovate==3) break;
        }
        if(nTrovate<3){
            for(char c : stringa){
                if(isVocale(c) && nTrovate<3){
                    lettereEstratteNome.concat(String.valueOf(c).toUpperCase()) ;
                    nTrovate++;
                }
                if(nTrovate==3) break;
            }
        }
        if(nTrovate<3) lettereEstratteNome.concat("X");

        return lettereEstratteNome;
    }

    private boolean isConsonante(char lettera) {
        for (char c : consonanti) {
            if (c == lettera) return true;
        }
        return false;
    }

    private boolean isVocale(char lettera) {
        for (char c : vocali) {
            if (c == lettera) return true;
        }
        return false;
    }

    public String getLetteraMese(Persona daAnalizzare){
        return switch (mese) {
                case 1  -> 'A'; // Gennaio
                case 2  -> 'B'; // Febbraio
                case 3  -> 'C'; // Marzo
                case 4  -> 'D'; // Aprile
                case 5  -> 'E'; // Maggio
                case 6  -> 'H'; // Giugno (Attenzione: salta F e G)
                case 7  -> 'L'; // Luglio
                case 8  -> 'M'; // Agosto
                case 9  -> 'P'; // Settembre
                case 10 -> 'R'; // Ottobre
                case 11 -> 'S'; // Novembre
                case 12 -> 'T'; // Dicembre
                default -> throw new IllegalArgumentException("Mese non valido: " + mese);
            };
        }
    }
}




