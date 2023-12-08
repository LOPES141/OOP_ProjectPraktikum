/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab6.Abstract;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Luas Dan Keliling");
        LayangLayang x = new LayangLayang();
        System.out.println("-------------------------------");
        System.out.println("Luas Layang - Layang : "+ x.luas());
        System.out.println("Keliling Layang -Layang : "+ x.keliling());
        System.out.println("-------------------------------");
        JajarGenjang y = new JajarGenjang();
        System.out.println("Luas Jajargenjang : "+ y.luas());
        System.out.println("Keliling Jajargenjang : "+ y.keliling());
    }
}
