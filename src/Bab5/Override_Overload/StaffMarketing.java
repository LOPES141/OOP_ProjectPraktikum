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
public class StaffMarketing extends Karyawan{
    public StaffMarketing(double gajiDasar){
        super(gajiDasar);
    }
    @Override
    public double hittunjangan(){
        return gajidasar*0.1 + 200000;
    }
}
