/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab5.Override_Overload;

/**
 *
 * @author user
 */
public class mainTunjangan {
    public static void main(String[] args) {
        Tunjangan hitTunjangan = new Tunjangan();
        
        double tunjanganKaryawanBaru = hitTunjangan.hitungTunjangan(4000000);
        System.out.println("Tunjangan Dari Karyawan Baru : " + tunjanganKaryawanBaru);
        
        double tunjanganKaryawanLama = hitTunjangan.hitungTunjangan(6000000, 7);
        System.out.println("Tunjangan Dari Karyawan Lama : " + tunjanganKaryawanLama);
        
        double tunjanganjabatan = hitTunjangan.hitungTunjangan(9000000, 3, "manager");
        System.out.println("Tunjangan Dari Pengalaman dan Jabatan : " + tunjanganjabatan);
        
    }
}
