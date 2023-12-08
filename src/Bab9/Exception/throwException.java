/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab9.Exception;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class throwException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlkaki;
        System.out.println("Beapa Jumlah Kaki Kerbau");
        try{
            System.out.println("Jumlah Kaki");
            jmlkaki = input.nextInt();
            if(jmlkaki !=4){
                throw new NullPointerException("Terjadi Kesalahan NI!");
            }else{
                System.out.println("Benar Jumlah Kaki Kerbau 4");
            }
        }catch(NullPointerException e){
            e.printStackTrace();
        }
    }
}
