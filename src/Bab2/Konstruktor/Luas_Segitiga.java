/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab2.Konstruktor;

/**
 *
 * @author user
 */
public class Luas_Segitiga {
    int alas, tinggi;
    double luas;
    
    //menginiasialisasi nilai alas konstruktor
    public Luas_Segitiga(){
       this.alas = 10;
    }
    //method
    public double Luas(){
       luas = (alas*tinggi)/2;
       return luas;
    }
}
