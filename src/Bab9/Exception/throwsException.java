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
public class throwsException {
    static void Error() throws ClassNotFoundException{
        System.out.println("Ada Yang Error NI!");
        throw new ClassNotFoundException("Error Sudah Saya Tangkap");
    }
    public static void main(String[] args) {
        try{
            throwsException.Error();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
