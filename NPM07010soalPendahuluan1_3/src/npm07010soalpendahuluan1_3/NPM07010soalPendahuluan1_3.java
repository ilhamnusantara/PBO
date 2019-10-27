/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm07010soalpendahuluan1_3;
import java.util.Scanner;

/**
 *
 * @author ilhamnusantara
 */
public class NPM07010soalPendahuluan1_3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Diameter :");
        int diameter=input.nextInt();
        System.out.print("TInggi :");
        int tinggi=input.nextInt();
        double pi = 3.14;
        double Volume = pi*diameter*tinggi;
        System.out.println("Volume tabung adalah "+Volume);
    }
    
}
