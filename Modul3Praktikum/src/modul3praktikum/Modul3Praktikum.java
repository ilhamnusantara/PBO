/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3praktikum;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author ilham-07010
 */
public class Modul3Praktikum {

    /**Elektronik;
     * @param args the command line arguments
     */
    static Scanner scan = new Scanner(System.in);
    //Elektronik elektroniks = new Elektronik(int id,String nama,int stok,int harga,int daya);
        
    
    public static void main(String[] args) {
        int e = 0;
        int p = 0;
        int id1 = e,stok1 = e,harga1 = e,daya1 = e;
        int id2 = p,stok2 = p,harga2 = p,ukuran2 = p;
        String nama1 = null;
        String nama2 = null;
        Elektronik elekstroniks = new Elektronik(id1, nama1, stok1, harga1, daya1);
        PecahBelah pecahBelahs = new PecahBelah(id2, nama2, stok2, harga2, ukuran2);
        
        int pilih;
        do{
        System.out.println();
        System.out.println("================================");
        System.out.println("SISTEM GUDANG DI KECAMATAN TAMAN");
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
                        System.out.println("id : "+e);
                        System.out.print("Nama : ");
                        String nama = scan.next();
                        System.out.print("Stok barang : ");
                        int stok = scan.nextInt();
                        System.out.print("Harga barang : ");
                        int harga = scan.nextInt();
                        System.out.print("Daya Barang(Kwh) : ");
                        int daya = scan.nextInt();
                        elekstroniks.inpElektronik(e, nama, stok, harga, daya);
                        e++;
                        break;
                    case 2:
                        System.out.println("id : "+p);
                        System.out.print("Nama : ");
                        String namaP = scan.next();
                        System.out.print("Stok barang : ");
                        int stokP = scan.nextInt();
                        System.out.print("Harga barang : ");
                        int hargaP = scan.nextInt();
                        System.out.print("Daya Barang(M2) : ");
                        int dayaP = scan.nextInt();
                        pecahBelahs.inpPecahBelah(p, namaP, stokP, hargaP, dayaP);
                        p++;
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
                System.out.println("======MENU MENAMPILKAN BARANG=======");
                System.out.println("1. Barang Elektronik ");
                System.out.println("2. Barang Pecah Belah ");
                System.out.print("Pilih menu : ");
                int pilih3 = scan.nextInt();
                switch(pilih3){
                    case 1:
                        System.out.println("===========DATA Eletronik============");
                        for(Elektronik cetak : elekstroniks.getList()){
                            System.out.println("ID                : "+ cetak.getId());
                            System.out.println("Nama              : "+ cetak.getNama());
                            System.out.println("Stok Barang       : "+ cetak.getStok());
                            System.out.println("Harga Barang      : "+ cetak.getHarga());
                            System.out.println("Daya Barang(Kwh)  : "+ cetak.getDaya());
                        }
                    break;
                    case 2:
                        System.out.println("===========DATA Pecah Belah============");
                        for(PecahBelah cetak1 : pecahBelahs.getList()){
                            System.out.println("ID                 : "+ cetak1.getId());
                            System.out.println("Nama               : "+ cetak1.getNama());
                            System.out.println("Stok Barang        : "+ cetak1.getStok());
                            System.out.println("Harga Barang       : "+ cetak1.getHarga());
                            System.out.println("Ukuran Barang(M2)  :"+ cetak1.getUkuran());
                        }
                }
                break;
            default:
                pilih = 0;
        }
    }while(pilih!=0);
  }
  
    static void Menu(int kata){
    int angka = kata;
        Sorting sorting = new Sorting();
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
                        if(angka == 1){    
                            System.out.println("BARANG ELEKTRONIK");
                            
                        }else if(angka == 2){
                            System.out.println("BARANG PECAHBELAH");    
                        }                
                        break;
                    case 2:
                        System.out.println("Pengurutan dari terkecil ke terbesar berdasarkan stok barang");
                        if(angka == 1){    
                            System.out.println("BARANG ELEKTRONIK");
                            sorting.sortingElStok(elektroniks);
                        }else if(angka == 2){
                            System.out.println("BARANG PECAHBELAH");    
                        }                  
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
    
    
} 


    
    

