package com.example.codicefiscalefx;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Persona {
    private StringProperty nome;
    private StringProperty cognome;
    private StringProperty sesso; // M o F
    private StringProperty dataNascita; // in formato gg/mm/aaaa
    private StringProperty luogoNascita;

    public Persona(StringProperty nome, StringProperty cognome, StringProperty sesso, StringProperty dataNascita, StringProperty luogoNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
        this.dataNascita = dataNascita;
        this.luogoNascita = luogoNascita;
    }

    public String getNome() {
        return nome.get();
    }

    public StringProperty nomeProperty() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome.set(nome);
    }

    public String getCognome() {
        return cognome.get();
    }

    public StringProperty cognomeProperty() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome.set(cognome);
    }

    public String getSesso() {
        return sesso.get();
    }

    public StringProperty sessoProperty() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso.set(sesso);
    }

    public String getDataNascita() {
        return dataNascita.get();
    }

    public StringProperty dataNascitaProperty() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita.set(dataNascita);
    }

    public String getLuogoNascita() {
        return luogoNascita.get();
    }

    public StringProperty luogoNascitaProperty() {
        return luogoNascita;
    }

    public void setLuogoNascita(String luogoNascita) {
        this.luogoNascita.set(luogoNascita);
    }

    private String[] suddividiDataNascita(){
        return dataNascita.get().split("/");
    }
    public String getGiorno(){
        return suddividiDataNascita()[0];
    }
    public String getMese(){
        return suddividiDataNascita()[1];
    }
    public String getAnno(){
        return suddividiDataNascita()[2];
    }

}
