package com.mycompany.bangun_ruang;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Silahkan Memasukkan Bangun Ruang (Bola, Kubus, Tabung, Limas Segitiga): ");
    String br = input.nextLine();
        
    Bangun_Ruang bangunruang = new Bangun_Ruang();
    switch(br){
        
    case "Bola":
    Bola bola = new Bola();
    System.out.print("Masukan nilai jari-jari (r) : ");
    double er = input.nextDouble();
    bola.r = er;
    bola.volume();
    break;
    
    case "Kubus":
    Kubus kubus = new Kubus();
    System.out.print("Masukan nilai sisi (s) : ");
    double es = input.nextDouble();
    kubus.S = es;
    kubus.volume();
    break;
    
    case "Tabung":
    Tabung tabung = new Tabung();
        System.out.print("Masukan nilai tinggi (t) : ");
        double te = input.nextDouble();
        System.out.print("Masukan nilai jari-jari (r) : ");
        double je = input.nextDouble();
    tabung.r = te;
    tabung.t = je;
    tabung.volume();
    break;
    
    case "Limas Segitiga":
    LimasSegitiga limassegitiga = new LimasSegitiga();
        System.out.print("Masukan nilai luas alas (LA) : ");
        double el = input.nextDouble();
        System.out.print("Masukan nilai tinggi limas (TL) : ");
        double ti = input.nextDouble();
    limassegitiga.LA = el;
    limassegitiga.TL = ti;
    limassegitiga.volume();
    break;
    
    default:
    System.out.println("Rumus Tidak Ada!");
    }
  }
}
