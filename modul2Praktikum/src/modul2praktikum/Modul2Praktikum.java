/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2praktikum;
import java.util.Scanner;
/**
 *
 * @author ilham-07010
 */
public class Modul2Praktikum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        karyawan pekerja = new karyawan();
        int pil;
        do{
        System.out.println("Selamat datang di PT. MAJU mundur");
        System.out.println("==========MENU==========");
        System.out.println("1. Insert Karyawan");
        System.out.println("2. Update Karyawan");
        System.out.println("3. Delete Karyawan");
        System.out.println("4. View Karyawan");
        System.out.print("Pilih menu : ");
        pil = input.nextInt();
        switch(pil){
            case 1 :
                System.out.println("======= Insert Karyawan ======");
                System.out.print("Masukkan nama : ");
                String nama = input.next();
                System.out.print("Masukkan jabatan : ");
                String jabatan = input.next();
                System.out.print("Masukkan alamat : ");
                String alamat = input.next();
                System.out.print("Masukkan Gaji : ");
                int jmlGaji = input.nextInt();
                
                pekerja.tambah(pekerja, nama, jabatan, alamat, jmlGaji);
                System.out.print("kembali ke menu : ");
                break;
            case 2 :
                System.out.println("======= Update Karyawan ======");
                System.out.print("Masukkan nama : ");
                String name = input.next();
                pekerja.update(pekerja, name);
                break;
            case 3 : 
                System.out.println("======= DELETE BELAKANG ======");
                System.out.print("Masukkan nama : ");
                String nam = input.next();
                pekerja.delete(pekerja,nam);
                break;
            case 4 :
                pekerja.lihat(pekerja);
                break;
        }
        }
        while(pil!=5);
    }
    
}
