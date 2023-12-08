/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab9.Exception;

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Lat_Exception {
    public static void main(String[] args) {
        try{
            int a, b, hasil;
            //membuat scanner
            Scanner keyboard = new Scanner(System.in);
            System.out.println("=====Program Pembagian======");
            System.out.println("Masukkan Angka 1 = ");
            a = Integer.parseInt(keyboard.next());
            System.out.println("Masukkan Angka ke-2 = ");
            b = Integer.parseInt(keyboard.next());
            hasil = a/b;
            System.out.println(Integer.toString(hasil));
        }catch(ArithmeticException c){
            JOptionPane.showMessageDialog(null, "Nilai Pembagi Tidak Boleh 0", "warning!!", 2);
        }catch(NumberFormatException d){
            JOptionPane.showMessageDialog(null, "Input Yang anda Masukan Huruf bukan Angka", "warning!!", 2);
        }finally{
            System.out.println("Terima kasih Sudah Menjalankan Progaram");
        }
    }
}
