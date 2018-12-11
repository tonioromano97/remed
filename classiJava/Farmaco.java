package com.gmail.tonioromano97.remed_11_12_2018;

import java.util.ArrayList;
import java.util.Calendar;

public class Farmaco {

    public Farmaco(String nome, int dose, String posizione){
        this.nome = nome;
        this.dose = dose;
        this.posizione = posizione;
        this.alarms = new ArrayList<Calendar>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public String getPosizione() {
        return posizione;
    }

    public void setPosizione(String p) {
        this.posizione = p;
    }

    public void addAlarm(Calendar time){
        alarms.add(time);
    }

    private String nome, posizione;
    private int dose;
    private ArrayList<Calendar> alarms;
}
