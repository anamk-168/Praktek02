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
public class RectangleAksi {
    public static void main(String[] args) {
      Rectangle rl= new Rectangle();
      rl.panjang = 9;
      rl.lebar = 3;
      
      rl.cetakinfo();
      System.out.println("Luas rectangle = "+ rl.hitungluas());
      rl.cetakLuas();  
      
      Rectangle r2 = new Rectangle();
      r2.cetakinfo();
      
      Rectangle r3 = new Rectangle(50,30);
      r3.cetakinfo();
     
    }
}
