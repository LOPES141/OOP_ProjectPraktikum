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
public class mainTunjanganKaryawan {
    public static void main(String[] args) {
        Manager manager = new Manager(8000000);
        StaffMarketing staff= new StaffMarketing(4500000);
        
        System.out.println("Tunjangan Manager : "+manager.hittunjangan());
        System.out.println("Tunjangan staff marketing : "+staff.hittunjangan());
    }
}
