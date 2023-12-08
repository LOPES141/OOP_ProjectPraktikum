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
public class Gaji_reward extends Gaji_abs_reward{
    double Menit, TnjBonus, TnjAnak, Gaji, Anak;
    int waktu;

    public int getWaktu() {
        return waktu;
    }
    public double getMenit() {
        return waktu;
    }

    public double getTnjBonus() {
        return TnjBonus;
    }

    public double getTnjAnak() {
        return TnjAnak;
    }
    
    
    @Override
    double tunjanganAnak() {
        if(Anak < 1 == true){
            Gaji = Gaji * 0.1;
        }else{
            Gaji = Gaji * 0.2;
        }
        return TnjAnak;
    }

    @Override
    double lembur() {
        Menit = (Menit * 12) + 25000;
        
        return 
    }
    
}
