package com.mycompany.bangun_ruang;
public class Tabung {
    double r,t;
    double volume(){
    double volume = 22.0/7.0*r*r*t;
        System.out.println("Volume tabung:"+volume+"cm3");
        return volume;
    }
}
