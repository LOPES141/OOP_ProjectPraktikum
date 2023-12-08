/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab6.Abstract;

public class JajarGenjang extends BangunDatar{
    double a,t,b;
    public JajarGenjang(){
        this.a = 8;
        this.t = 3;
        this.b = 9;
    }

    @Override
    public double luas() {
        return (a*t);
    }

    @Override
    double keliling() {
        return (2*(a*t));
    }
}
