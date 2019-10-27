/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3praktikum;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ilham-07010
 */
public class Modul3Praktikum {

    /**
     * @param args the command line arguments
     */
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Elektronik> ElektronikArr = new ArrayList<>();
    static ArrayList<PecahBelah> PecahBelahArr = new ArrayList<>();
        
    
    public static void main(String[] args) {
        int pilih;
        do{
        System.out.println("SISTEM GUDANG DI KECAMATAN TAMAN");
        Modul3Praktikum.tampilBarang();
        System.out.println("1. Inputkan Barang ");
        System.out.println("2. Urutkan Barang ");
        System.out.println("3. Tampilkan Barang ");
        System.out.print("pilih menu : ");
        pilih = scan.nextInt();
        switch(pilih){
            case 1:
                System.out.println("Pilih Barang Inputan");
                System.out.println("1. Elektronik");
                System.out.println("2. Pecah Belah");
                System.out.print("Pilih menu : ");
                int pilih1 = scan.nextInt();
                switch(pilih1){
                    case 1:
                        tambahBarangElektronik();
                        break;
                    case 2:
                        tambahBarangPecahBelah();
                        break;
                }
                break;
            case 2:
                int a;
                System.out.println("Urutkan Barang");
                System.out.println("1. Elektronik");
                System.out.println("2. Pecah Belah");
                System.out.println("Pilih menu : ");
                int pilih2 = scan.nextInt();
                switch(pilih2){
                    case 1:
                          a=1;
                          Menu(a);
                        break;
                    case 2:
                          a=2;
                          Menu(a);
                        break;
                }
            break;
            case 3:
                break;
            default:
                pilih = 0;
        }
    }while(pilih!=0);
  }
  
    static void Menu(int kata){
    int angka = kata;
    if(angka == 1){    
    System.out.println("BARANG ELEKTRONIK");
    }else if(angka == 2){
    System.out.println("BARANG PECAHBELAH");    
    }
        System.out.println("1. dari Terkecil ke Terbesar");
        System.out.println("2. dari Terbesar ke Terkecil");
        System.out.print("Pilih menu : ");
        int pilih21 = scan.nextInt();
        switch(pilih21){
            case 1:
                System.out.println("dari TERKECIL ke TERBESAR");
                System.out.println("1. Berdasarkan Nama barang ");
                System.out.println("2. Berdasarkan Stok barang");
                System.out.println("3. Berdasarkan Harga barang");
                System.out.print("Pilih menu : ");
                int pilih211 = scan.nextInt();
                switch(pilih211){
                    case 1:
                        System.out.println("Pengurutan dari terkecil ke terbesar berdasarkan nama barang");
                                        
                        break;
                    case 2:
                        System.out.println("Pengurutan dari terkecil ke terbesar berdasarkan stok barang");
                                       
                        break;
                    case 3:
                        System.out.println("Pengurutan dari terkecil ke terbesar berdasarkan harga barang");
                                   
                        break;
                }
                break;
            case 2:
                System.out.println("dari TERBESAR ke TERKECIL");
                System.out.println("1. Berdasarkan Nama barang ");
                System.out.println("2. Berdasarkan Stok barang");
                System.out.println("3. Berdasarkan Harga barang");
                System.out.print("Pilih menu : ");
                int pilih212 = scan.nextInt();
                switch(pilih212){
                    case 1:
                        System.out.println("Pengurutan dari terbesar ke terkecil berdasarkan nama barang");
                                       
                        break;
                    case 2:
                        System.out.println("Pengurutan dari terbesar ke terkecil berdasarkan stok barang");
                        if(angka==1){
                            
                        }else if(angka==2){
                            
                        }                
                        break;
                    case 3:
                        System.out.println("Pengurutan dari terbesar ke terkecil berdasarkan harga barang");
                                        
                        break;
               }
               break;
            case 3:
                
                break;
        }
    }
    
    static  void tampilBarang(){
        System.out.println("\n\nData Barang Eletronik : ");
      for(int i = 0; i<ElektronikArr.size(); i++){
          System.out.println("ID : "+ElektronikArr.get(i).getId() +", Nama Barang : "+ElektronikArr.get(i).getNama()+", Stok Barang : "+ ElektronikArr.get(i).getStok()+", Harga Barang : "+ElektronikArr.get(i).getHarga()+", Daya KWh : "+ElektronikArr.get(i).getDaya());
      }
      System.out.println("\n\nData Barang PecahBelah : ");
      for(int i = 0; i<PecahBelahArr.size(); i++){
          System.out.println("ID : "+PecahBelahArr.get(i).getId() +", Nama Barang : "+PecahBelahArr.get(i).getNama()+", Stok Barang : "+ PecahBelahArr.get(i).getUkuran());
      }
    }
    static void tambahBarangElektronik(){
        
                Elektronik eletronik = new Elektronik();
                System.out.println("INPUTKAN BARANG");
                System.out.println("ID barang : "+ String.valueOf(ElektronikArr.size()+1));
                eletronik.setId(ElektronikArr.size()+1);
                System.out.print("1. Nama barang : ");
                eletronik.setNama(scan.next());
                System.out.print("2. Stok barang : ");
                eletronik.setStok(scan.nextInt());
                System.out.print("3. Harga barang : ");
                eletronik.setHarga(scan.nextInt());
                System.out.print("4. Daya (Kwh) : ");
                eletronik.setDaya(scan.nextInt());
                ElektronikArr.add(eletronik);                
    }
    
    static void tambahBarangPecahBelah(){
            
                PecahBelah pecahBelah = new PecahBelah();
                System.out.println("INPUTKAN BARANG");
                System.out.println("ID barang : "+ String.valueOf(PecahBelahArr.size()+1));
                pecahBelah.setId(PecahBelahArr.size()+1);
                System.out.print("1. Nama barang : ");
                pecahBelah.setNama(scan.next());
                System.out.print("2. Stok barang : ");
                pecahBelah.setStok(scan.nextInt());
                System.out.print("3. Harga barang : ");
                pecahBelah.setHarga(scan.nextInt());
                System.out.print("4. Ukuran barang(M2) : ");
                pecahBelah.setUkuran(scan.nextInt());
                PecahBelahArr.add(pecahBelah);
    }
} 


    
    

