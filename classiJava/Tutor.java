package com.gmail.tonioromano97.remed_11_12_2018;

import java.util.ArrayList;

public class Tutor {

    public Tutor(String nome, String cognome, String email, String password){
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.assistiti = new ArrayList<Assistito>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addAssistito(Assistito a){
        this.assistiti.add(a);
    }

    public void removeAssistito(Assistito a){
        this.assistiti.remove(a);
    }


    private String nome;
    private String cognome;
    private String email;
    private String password;
    private ArrayList<Assistito> assistiti;
}
