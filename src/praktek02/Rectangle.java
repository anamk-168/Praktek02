/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek02;

/**
 *
 * @author anam.ict.wbm
 */
public class Rectangle {
    double panjang;
    double lebar;
    
    void cetakinfo(){
        
        System.out.println("================");
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar +"+lebar);
        System.out.println("================");
    }
    
    double hitungluas(){
        double luas;
        luas=panjang*lebar;
        return luas;
        
    }
}
