/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab8.Interface;

/**
 *
 * @author user
 */
public class Cash implements dapatKembalian{   

    @Override
    public double kembalian(double total, double jmlUang) {
       double jmlKembalian;
        jmlKembalian = jmlUang - total;
        return jmlKembalian; 
    }
}
