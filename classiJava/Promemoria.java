package com.gmail.tonioromano97.remed_11_12_2018;

import java.util.Calendar;

public class Promemoria {
    public Promemoria(String nome, Calendar time) {
        this.nome = nome;
        this.time = time;
        this.text = "";
    }

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text=text;
    }

    private String nome,text;
    private Calendar time;
}
