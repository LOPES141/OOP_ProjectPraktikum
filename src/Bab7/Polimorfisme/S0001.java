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
public class S0001 extends Pembayaran{
    public String nama, alamat;
    public int saldo;
    public String kode;
    double diskon, bayar, total;
    public S0001(){
        this.nama = "Mohammad Harifin";
        this.kode = "S0001";
        this.saldo = 500000;
        this.alamat = "Malang, jl.singosari no 23";
    }
    public double hasil(){
        return diskon;
    }

    @Override
    double hitPembayaran(double bayar) {
        diskon = bayar*diskon;
        total = bayar - diskon;
        return total;
    }

    @Override
    double cekKode(String Input) {
        if(Input.compareTo(kode)==0){
            diskon = 0.1;
        }else{
            diskon = 0;
        }
        return diskon;
    }
    double potSaldo(){
        return this.saldo - total;
    }

    @Override
    void tampilkanMember() {
        System.out.println("Member S0001 dengan diskon 10%");
    }
    
    
}
