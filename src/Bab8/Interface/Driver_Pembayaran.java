/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab8.Interface;

import Bab7.Polimorfisme.*;

/**
 *
 * @author user
 */
public class Driver_Pembayaran {
    public static void main(String[] args) {
        //upcasting
        Pembayaran payment;
        payment = new P0001();
        payment.tampilkanMember();
        
        //
        Cash cash = new Cash();
        Kredit kredit = new Kredit();
        EMoney emoney = new EMoney();
        //
        if(payment instanceof P0001){
            P0001 p0001 = (P0001)payment;
            System.out.println("Jenis Member : "+p0001.member(p0001));
            System.out.println("Total Pembelian : "+p0001.hitPembayaran(500000));
        
            //memabayar dengan cash
            p0001.bayar = 600000;
            p0001.jenisPembayaran(cash);
            
            //pembayaran
            //p0001.InputpinKredit = "P0001";
            //p0001.jenisPembayaran(kredit);
            
            //
            //p0001.jenisPembayaran(emoney);
            
            //
            //System.out.println("Sisa Saldo : "+ p0001.potSaldo());
        }
    }
}
