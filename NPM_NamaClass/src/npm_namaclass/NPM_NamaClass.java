/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm_namaclass;
import java.util.Scanner;
/**
 *
 * @author ilhamnusantara
 */
public class NPM_NamaClass {

    /**
     */

    static double reamurFah(int c ){
        double rumus = 2.25*c+32;
        return rumus;
    }
    static double reamurKel(int c){
        double rumus = 0.56*(c-32);
        return rumus;
    }
    static double reamurCel(int c){
        double rumus = 1.25*c;
        return rumus;
    }
    
    static double fahrenCel(int c){
        double rumus = 0.56*(c-32);
        return rumus;
    }
    static double fahrenReam(int c){
        double rumus = 0.4*(c-32);
        return rumus;
    }
    static double celciusReam(int c){
        double rumus = 0.8*c;
        return rumus;
    }
    static double celciusFah(int c){
        double rumus = 1.8*c+32;
        return rumus;
    }
    static double celciusKel(int c){
        double rumus = c + 273;
        return rumus;
    }
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String y;
        do{ 
        System.out.println("====Konversi Suhu====");
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Celsius");
        System.out.print("pilih : ");
        int pilih = input.nextInt();
        int suhu;
        switch(pilih){
            case 1 :
                  System.out.println("====Konversi suhu Reamur====");
                          System.out.println("1. Reamur ke Fahrenheit");
                          System.out.println("2. Reamur ke Kelvin");
                          System.out.println("3. Reamur ke Celcius");
                          System.out.print("masukkan menu : ");
                          int tombol = input.nextInt();
                          switch(tombol){
                              case 1 :
                                  System.out.println("Reamur ke Fahrentheit");
                                  System.out.print("Nilai suhu : ");
                                  suhu = input.nextInt();
                                  double rumus = reamurFah(suhu);
                                  System.out.println("Konversi suhu dari Reamur ke Fahrenheit adalah "+rumus);
                                  break;
                              case 2 :
                                  System.out.println("Reamur ke Kelvin");
                                  System.out.print("Nilai suhu : ");
                                  suhu = input.nextInt();
                                  double rumus2 = reamurKel(suhu);
                                  System.out.println("Konversi suhu dari Reamur ke Kelvin adalah "+rumus2);
                                  break;
                              case 3 :
                                  System.out.println("Reamur ke Celcius");
                                  System.out.print("Nilai suhu : ");
                                  suhu = input.nextInt();
                                  double rumus3 = reamurCel(suhu);
                                  System.out.println("Konversi suhu dari Reamur ke Celcius adalah "+rumus3);
                                  break; 
                          }
            break;
            case 2 :
                   System.out.println("====Konversi suhu Fahrenheit====");
                          System.out.println("1. Fahrenheit ke Celcius");
                          System.out.println("2. Fahreinheit ke Reamur");
                          System.out.print("masukkan menu : ");
                          int tmbl = input.nextInt();
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
                  
            break;
            case 3 :
                   System.out.println("====Konversi suhu Celcius====");
                          System.out.println("1. Celcius ke Reamur");
                          System.out.println("2. Celcius ke Fahrenheit");
                          System.out.println("3. Celcius ke Kelvin");
                          System.out.print("masukkan menu : ");
                          int tmbol = input.nextInt();
                          switch(tmbol){
                              case 1 :
                                  System.out.println("Celcius ke Reamur");
                                  System.out.print("Nilai suhu : ");
                                  suhu = input.nextInt();
                                  double rumus = celciusReam(suhu);
                                  System.out.println("Konversi suhu dari Fahrenheit ke Reamur adalah "+rumus);
                                  break;
                              case 2 :
                                  System.out.println("Celcius ke Fahrenheit");
                                  System.out.print("Nilai suhu : ");
                                  suhu = input.nextInt();
                                  double rumus1 = celciusFah(suhu);
                                  System.out.println("Konversi suhu dari Fahrenheit ke Reamur adalah "+rumus1);
                                  break;
                              case 3 :
                                  System.out.println("Celcius ke Kelvin");
                                  System.out.print("Nilai suhu : ");
                                  suhu = input.nextInt();
                                  double rumus2 = celciusKel(suhu);
                                  System.out.println("Konversi suhu dari Fahrenheit ke Reamur adalah "+rumus2);
                                  break;
                          }
            break;
            default :
                System.out.println("angka masukkan kelebihan");
                   
        }
        System.out.print("Apakah anda ingin mengulangi lagi (y/n) : ");
        y = input.next();
        
        
        }while("y".equals(y));
        
        }
}

        
    
    
  
        
