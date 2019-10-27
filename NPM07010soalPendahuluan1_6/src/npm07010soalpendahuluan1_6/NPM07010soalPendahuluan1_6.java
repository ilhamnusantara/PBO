/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm07010soalpendahuluan1_6;
import java.util.Scanner;
/**
 *
 * @author ilhamnusantara
 */
public class NPM07010soalPendahuluan1_6 {

    /**
     */
    static void menu(){
        System.out.println("===============================");
            System.out.println("1. prosedure luas lingkaran");
            System.out.println("2. fungsi luas lingkaran");
            System.out.println("3. fungsi bangun lingkaran");
            System.out.println("4. fungsi bangun tabung");
    }
    
    static void procedureluasLingkaran(double diameter)
    {
        double jari = diameter/2;
    }
    
    static double fungsiLuasLingkaran(double diameter){
        double jari = diameter/2;
        double luas = jari;
        return luas;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan diamater(meter) : ");
        double dm=input.nextDouble();
        menu();
        
    }
    
}
