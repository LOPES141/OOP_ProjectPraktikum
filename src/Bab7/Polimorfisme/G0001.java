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
public class G0001 extends Pembayaran{
    public String nama, alamat;
    public int saldo;
    public String kode;
    double diskon, bayar, total;
    public G0001(){
        this.nama = "Mohammad ridho";
        this.kode = "G0001";
        this.saldo = 5000000;
        this.alamat = "Malang, jl.lowokwaru no 50";
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
            diskon = 0.2;
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
        System.out.println("Member G0001 dengan diskon 20%");
    }
}
