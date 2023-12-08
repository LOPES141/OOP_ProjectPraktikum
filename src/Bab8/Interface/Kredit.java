/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab8.Interface;

/**
 *
 * @author user
 */
public class Kredit {
    void cekKartuKredit(String norek,String input){
        if(norek.equals(input)){
            System.out.println("Pembayaran Kredit Success");
        }else{
            System.out.println("Pembayaran Gagal, Kata sandi salah");
        }
    }
}
