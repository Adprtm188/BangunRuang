package com.mycompany.bangun_ruang;
public class Main {

    public static void main(String[] args) {
    Bangun_Ruang bangunruang = new Bangun_Ruang();
    
    Bola bola = new Bola();
    bola.r = 4;
    bola.volume();
    
    Kubus kubus = new Kubus();
    kubus.S = 6;
    kubus.volume();
    
    Tabung tabung = new Tabung();
    tabung.r = 21;
    tabung.t = 34;
    tabung.volume();
    
    LimasSegitiga limassegitiga = new LimasSegitiga();
    limassegitiga.LA = 13;
    limassegitiga.TL = 9;
    limassegitiga.volume();
    
    }
    }
