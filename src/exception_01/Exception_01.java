/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_01;
import tv.Tools;
/**
 *
 * @author Admin
 */
public class Exception_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a = Tools.inputFloat("Hay nhap so thu nhat");
        float b = Tools.inputFloat("Hay nhap so thu hai");
        System.out.println("Tong 2 so a + b = " + (a+b));
    }
    
}
