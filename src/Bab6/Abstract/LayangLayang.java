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
public class LayangLayang extends BangunDatar{
    int d1, d2, a, b;
    
    public LayangLayang(){
        this.d1 = 5;
        this.d2 = 6;
        this.a = 12;
        this.b = 35;
    }
    
    @Override
    public double luas() {
        return (0.5*d1*d2);
    }

    @Override
    double keliling() {
        return (2*(a+b));
    }

}
