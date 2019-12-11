/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author ilham-07010
 */
public class Controller {
    public static void main(String[] args){
        String text = "Belajar Pemrograman Java";
        
        String[] kata = text.split("");
        
        String text1 = kata[0];
        String text2 = kata[1];
        String text3 = kata[2];
        
        System.out.println("Text 1 = "+text1);
        System.out.println("Text 2 = "+text2);
        System.out.println("Text 3 = "+text3);
    }
}
