/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm07010soalpendahuluan1_4;
import java.util.Scanner;
/**
 *
 * @author ilhamnusantara
 */
public class NPM07010soalPendahuluan1_4 {

    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String y;
        do{
        System.out.println("Konversi umur");
        System.out.print("Masukkan umur : ");
        int umur = input.nextInt();
        if(umur < 5){
            System.out.println("Kategori Balita");
        }else if(umur > 50){
            System.out.println("Kategori Tua");
        }else if(umur > 5 && umur < 18){
            System.out.println("Kategori Anak-anak");
        }else if(umur > 17 && umur < 51){
            System.out.println("Kategori Dewasa");
        }
        System.out.print("Apakah ingin mengulangi(y/n) : ");
        y = input.next();
        }
        while(y.equals("y"));
        }
        
        
}   

