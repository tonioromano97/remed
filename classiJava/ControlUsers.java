package com.gmail.tonioromano97.remed_11_12_2018;

import java.util.ArrayList;

public class ControlUsers {

    public static boolean login(String email, String pw){
        for (Tutor u : tutors){
            if(u.getEmail().equalsIgnoreCase(email)&&u.getPassword().equals(pw)) {
                online = u;
                return true;
            }
        }
        return false;
    }

    public static void registerTutor(String nome, String cognome, String email, String pw){
        Tutor u = new Tutor(nome,cognome,email,pw);
        tutors.add(u);
    }

    public static Tutor tutorOnline(){
        return online;
    }

    public static void addAssistitoToTutor(String nome, String imgName, Tutor t){
        Assistito a = new Assistito(nome, imgName);
        t.addAssistito(a);
    }

    public static void removeAssistitoToTutor(Tutor t, Assistito a){
        t.removeAssistito(a);
    }

    public static void addFarmacoToAssistito(Assistito a, String n, int d, String p){
        Farmaco f = new Farmaco(n,d,p);
        a.addFarmaco(f);
    }

    public static void removeFarmacoToAssistito(Assistito a, Farmaco f){
        a.removeFarmaco(f);
    }

    private static ArrayList<Tutor> tutors = new ArrayList<Tutor>();
    private static Tutor online;
}
