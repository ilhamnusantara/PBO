/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07010main;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ilham-07010
 */
public class Main {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Pegawai> pegawaiArr = new ArrayList<>();
    static ArrayList<Pelanggan> pelangganArr = new ArrayList<>();
    static ArrayList<Cucian> cucianArry = new ArrayList<>();
    public static void main(String[] args) {
      int menu;
      do{
          System.out.println("\n\nSistem Informasi Laundry RPL!!!");
          Main.tampilkanData();
          System.out.println("\n\nMenu : ");
          System.out.println("1. Tambah Kasir");
          System.out.println("2. Tambah Pelanggan");
          System.out.println("3. Tambah Transaksi Cucian");
          System.out.println("0. Selesai");
          System.out.print("Masukkan nomor menu : ");
          menu = scan.nextInt();
          switch(menu){
              case 1:
                  Main.tambahKasir();
                  break;
              case 2:
                  Main.tambahPelanggan();
                  break;
              case 3:
                  Main.tambahCucian();
                  break;
              default:
                  menu = 0;
          System.out.println("Terima kasih telah menggunakan Sistem Informasi Laundry RPL!!!");
          }
      }while(menu!=0);
    }
    static void tampilkanData(){
      System.out.println("\n\nData Pegawai : ");
      for(int i = 0; i<pegawaiArr.size(); i++){
          System.out.println("ID Pegawai : "+pegawaiArr.get(i).getId() +", Nama : "+pegawaiArr.get(i).getNama()+", No. HP : "+ pegawaiArr.get(i).getNoHp());
      }
      System.out.println("\n\nData Pelanggan : ");
      for(int i = 0; i<pelangganArr.size(); i++){
          System.out.println("ID Pelanggan : "+pelangganArr.get(i).getId() +", Nama : "+pelangganArr.get(i).getNama()+", No. HP : "+ pelangganArr.get(i).getNoHp());
      }
      System.out.println("\n\nData Cucian :");
      for(int i = 0; i<cucianArry.size(); i++){
          System.out.println("Nama Pegawai : "+cucianArry.get(i).getPegawai().getNama() +", Nama Pelanggan : "+cucianArry.get(i).getPelanggan().getNama()+", Berat Cucian : "+ cucianArry.get(i).getBerat() + "KG, Harga Total Cucian : Rp."+cucianArry.get(i).getHargaTotal());
      }
    }
        static void tambahKasir(){
        System.out.println("Tamba Data Pegawai !!!");
        Pegawai pegawai =new Pegawai();
        System.out.println("ID Pegawai : "+String.valueOf(pegawaiArr.size()+1));
        pegawai.setId(pegawaiArr.size()+1);
        System.out.print("Nama Pegawai : ");
        pegawai.setNama(scan.next());
        System.out.print("Kata sandi Pegawai : ");
        pegawai.setKataSandi(scan.next());
        System.out.print("Nomor HP Pegawai : ");
        pegawai.setNoHp(scan.next());
        pegawaiArr.add(pegawai);
}
static void tambahPelanggan(){
    System.out.println("Tambah Pelanggan !!!");
    Pelanggan pelanggan = new Pelanggan();
//    Manusia man = new Manusia()
    System.out.println("ID Pelanggan : "+String.valueOf(pelangganArr.size()+1));
    pelanggan.setId(pelangganArr.size()+1);
    System.out.println("Nama Pelanggan : ");
    pelanggan.setNama(scan.next());
    System.out.println("Nomor HP Pelanggan : ");
    pelanggan.setNoHp(scan.next());
    
    pelangganArr.add(pelanggan);
    
}
static void tambahCucian(){
    System.out.println("Tambah Data Cucian!");
    Cucian cucian = new Cucian();
    System.out.print("ID Pegawai : ");
    cucian.setPegawai(pegawaiArr.get(scan.nextInt()-1));
    System.out.print("ID Pelanggan : ");
    cucian.setPelanggan(pelangganArr.get(scan.nextInt()-1));
    System.out.print("Berat cucian (KG): ");
    cucian.setBerat(scan.nextFloat());
    System.out.print("Harga totalnya adalah : Rp."+cucian.getHargaTotal());
    cucianArry.add(cucian);
}
}