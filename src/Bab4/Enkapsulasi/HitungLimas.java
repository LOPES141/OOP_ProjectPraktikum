/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab4.Enkapsulasi;

/**
 *
 * @author user
 */
public class HitungLimas {
    private Double LuasAlas;
    public Double Tinggi;
    Double volume;
    
    public Double getLuasAlas(){
        return LuasAlas ;
        
    }
    public void setLuasAlas(Double LuasAlas){
        this.LuasAlas = LuasAlas;
    }
    public Double Tinggi(){
        return Tinggi;
    }
    Double volumeLimas(){
        volume = (getLuasAlas() * Tinggi/3);
        return volume;
    }
}
