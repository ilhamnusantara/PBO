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

    static Scanner scan = new Scanner(System.in);
    //Elektronik elektroniks = new Elektronik(int id,String nama,int stok,int harga,int daya);
        

    public static void main(String[] args) {
        ArrayList<Elektronik> elektronik = new ArrayList<>();
        ArrayList<PecahBelah> pecahBelah = new ArrayList<>();
        Sort sort = new Sort();        
        int idE = 1;
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
                        System.out.println("id : "+idE);
                        System.out.print("Nama : ");
                        String nama = scan.next();
                        System.out.print("Stok barang : ");
                        int stok = scan.nextInt();
                        System.out.print("Harga barang : ");
                        int harga = scan.nextInt();
                        System.out.print("Daya Barang(Kwh) : ");
                        int daya = scan.nextInt();
                        elektronik.add(new Elektronik(idE,nama, stok, harga, daya));
                        idE++;
                        break;
                    case 2:
                        System.out.println("id : "+String.valueOf(pecahBelah.size()+1));
                        String idP = String.valueOf(pecahBelah.size()+1);
                        System.out.print("Nama : ");
                        String namaP = scan.next();
                        System.out.print("Stok barang : ");
                        int stokP = scan.nextInt();
                        System.out.print("Harga barang : ");
                        int hargaP = scan.nextInt();
                        System.out.print("Daya Barang(M2) : ");
                        int dayaP = scan.nextInt();
                        pecahBelah.add(new PecahBelah(idP,namaP, stokP, hargaP, dayaP));
                        break;
                }
                break;
            case 2:
                int a;
                System.out.println("Urutkan Barang");
                System.out.println("1. Elektronik");
                System.out.println("2. Pecah Belah");
                System.out.print("Pilih menu : ");
                int pilih2 = scan.nextInt();
                switch(pilih2){
                    case 1:
                        System.out.println("***BARANG ELEKTRONIK***");
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
                                        elektronik = sort.byNameElektronikAsc(elektronik);
                                        break;
                                    case 2:
                                        System.out.println("Pengurutan dari terkecil ke terbesar berdasarkan stok barang");
                                        elektronik = sort.byStokElektronikAsc(elektronik);
                                        break;
                                    case 3:
                                        System.out.println("Pengurutan dari terkecil ke terbesar berdasarkan harga barang");
                                        elektronik = sort.byHargaElektronikAsc(elektronik);
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
                                        elektronik = sort.byNameElektronikDesc(elektronik);
                                        break;
                                    case 2:
                                        System.out.println("Pengurutan dari terbesar ke terkecil berdasarkan stok barang");
                                        elektronik = sort.byStokElektronikDesc(elektronik);
                                        break;
                                    case 3:
                                        System.out.println("Pengurutan dari terbesar ke terkecil berdasarkan harga barang");
                                        elektronik = sort.byHargaElektronikDesc(elektronik);
                                        break;
                               }
                               break;
        }
                        break;
                    case 2:
                        System.out.println("***BARANG Pecah Belah***");
                        System.out.println("1. dari Terkecil ke Terbesar");
                        System.out.println("2. dari Terbesar ke Terkecil");
                        System.out.print("Pilih menu : ");
                        int pilih22 = scan.nextInt();
                        switch(pilih22){
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
                                                       
                                        break;
                                    case 3:
                                        System.out.println("Pengurutan dari terbesar ke terkecil berdasarkan harga barang");

                                        break;
                               }
                               break;
                        }
                                        break;
                                }
                            break;
        case 3:
        System.out.println("1. Barang Elektronik ");
        System.out.println("2. Barang Pecah Belah ");
        System.out.print("Pilih menu : ");
        int pilih3 = scan.nextInt();
        switch(pilih3){
        case 1:
        System.out.println("===========DATA Eletronik============");
        for (int i = 0; i < elektronik.size(); i++) {
            System.out.println("ID : "+elektronik.get(i).id);
            System.out.println("Nama : "+elektronik.get(i).getNama());
            System.out.println("Jumlah Stok : "+elektronik.get(i).getStok());
            System.out.println("Harga : "+elektronik.get(i).getHarga());
            System.out.println("Daya : "+elektronik.get(i).daya);
            
        }
        break;
        case 2:
        System.out.println("===========DATA Pecah Belah============");
        for (int y = 0; y < pecahBelah.size(); y++){
            System.out.println("ID : "+pecahBelah.get(y).id);
            System.out.println("Nama : "+pecahBelah.get(y).getNama());
            System.out.println("Jumlah Stok : "+pecahBelah.get(y).getStok());
            System.out.println("Harga : "+pecahBelah.get(y).getHarga());
            System.out.println("Ukuran (M2) : "+pecahBelah.get(y).ukuran);
        }
        }
        break;
        default:
        pilih = 0;
        }
    }while(pilih!=0);
  }
    
    
} 


    
    

