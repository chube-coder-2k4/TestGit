/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tools {
    /**
     * Ham phuc vu cho viec nhap du lieu la so thuc
     * @param mess
     * @return 
     */
    public static float inputFloat(String mess){
        float result = 0;
        boolean lapNua = true;
        Scanner sc = new Scanner(System.in);
        do{
        try{
        System.out.println(mess);
        String tam = sc.nextLine();
        result = Float.parseFloat(tam);
        lapNua = false;
        }
        catch(Exception e){
            System.out.println("Du lieu khong hop le");
        }
        }while(lapNua);
        
        return result;
    } 
}
