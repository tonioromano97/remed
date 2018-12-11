package com.gmail.tonioromano97.remed_11_12_2018;

import java.util.ArrayList;

public class Assistito {

    public Assistito(String nome){
        this.nome = nome;
        this.nameImg = "/drawable/user.png";
        this.farmaci = new ArrayList<Farmaco>();
    }

    public Assistito(String nome, String nameImg){
        this.nome = nome;
        this.nameImg = nameImg;
        this.farmaci = new ArrayList<Farmaco>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNameImg() {
        return nameImg;
    }

    public void setNameImg(String nameImg) {
        this.nameImg = nameImg;
    }

    public void addFarmaco(Farmaco f){
        this.farmaci.add(f);
    }

    public void removeFarmaco(Farmaco f){
        this.farmaci.remove(f);
    }

    private String nome;
    private String nameImg;
    private ArrayList<Farmaco> farmaci;
}