package Bab1.ClassObject;

public class Main {
    public static void main(String[] args){
        // membuat objek
        Kendaraan mobil = new Kendaraan();
        mobil.nama = "Mobil";
        mobil.warna = "Merah";
        mobil.merk = "Toyota";
        System.out.println("Nama Kendaraan  : " + mobil.nama);;
        System.out.println("Warna Kendaraan :" + mobil.warna);
        System.out.println("Merk Kendaraan  :" + mobil.merk);
        System.out.println("Nama Kendaraan  :" + mobil.jmlRoda(4)+"\n");
        System.out.println("Cara Kendaraan Bergerak : ");
        System.out.println("Saat Maju : ");
        mobil.kendaraanMaju();
        System.out.println("Saat Mundur : ");
        mobil.kendaraanMundur();
        System.out.println("Saat berhenti : " + mobil.nama);
        mobil.kendaraanBerhenti();
    }
}
