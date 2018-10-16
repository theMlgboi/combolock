/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package combolockdriver;

import javax.swing.JOptionPane;

/**
 *
 * @author anarc6700
 */
public class ComboLockDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComboLock sp1 = new ComboLock();
        
       String number12 = JOptionPane.showInputDialog("Enter the name of the first dog ");
        String name22 = JOptionPane.showInputDialog("Enter the name of the first dog ");
        String name32 = JOptionPane.showInputDialog("Enter the name of the first dog ");
      int number4= Integer.parseInt(number12);
       int number5 = Integer.parseInt(name22);
       int number6 = Integer.parseInt(name32);
      sp1.setNumber();
       sp1.setNumber2();
       sp1.setNumber3();
       
       sp1.setNumber122(number4);
      sp1.setNumber122(number5);
       sp1.setNumber122(number6);
       
       System.out.println(number4);
       System.out.println(sp1);
    }
    
}
