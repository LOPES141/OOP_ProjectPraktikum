/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab7.Polimorfisme;

/**
 *
 * @author user
 */
public class Pisang extends Buah{
    public Pisang(){
        this.nama = "Pisang";
    }
    
    void makanBuah(){
        System.out.println(nama+" di Makan dengan dikupas kulit pisang sebelum dimakan .");
    }
}
