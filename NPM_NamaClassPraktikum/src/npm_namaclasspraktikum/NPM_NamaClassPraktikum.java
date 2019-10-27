/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm_namaclasspraktikum;
import java.util.Scanner;
/**
 *
 * @author ilhamnusantara
 */
public class NPM_NamaClassPraktikum {

    static double fahrenCel(int c){
        double rumus = 0.56*(c-32);
        return rumus;
    }
    static double fahrenReam(int c){
        double rumus = 0.4*(c-32);
        return rumus;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("====Konversi suhu Fahrenheit====");
                          System.out.println("1. Fahrenheit ke Celcius");
                          System.out.println("2. Fahreinheit ke Reamur");
                          System.out.print("masukkan menu : ");
                          int tmbl = input.nextInt();
                          int suhu;
                          switch(tmbl){
                              case 1 :
                                  System.out.println("Fahrentheit ke Celcius");
                                  System.out.print("Nilai suhu : ");
                                  suhu = input.nextInt();
                                  double rumus = fahrenCel(suhu);
                                  System.out.println("Konversi suhu dari Fahrenheit ke Reamur adalah "+rumus);
                                  break;
                              case 2 :
                                  System.out.println("Fahrenheit ke Reamur");
                                  System.out.print("Nilai suhu : ");
                                  suhu = input.nextInt();
                                  double rumus1 = fahrenReam(suhu);
                                  System.out.println("Konversi suhu dari Fahrenheit ke Reamur adalah "+rumus1);
                                  break;
                          }
    }
    
}
