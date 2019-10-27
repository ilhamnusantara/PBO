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
public class karyawan {
    Scanner input = new Scanner (System.in);
    private static class node{
        String nama;
        String jabatan;
        String alamat;
        int jmlGaji;
        node next;
        node prev;
        
        node(String NAMA, String JABATAN, String ALAMAT, int jmlGAJI){
            this.nama = NAMA;
            this.jabatan = JABATAN;
            this.alamat = ALAMAT;
            this.jmlGaji = jmlGAJI;
            this.next = null;
            this.prev = null;
        }
    }
    node head;
    node tail;
    
    
    void tambah(karyawan list, String nama, String jabatan, String alamat, int jmlGaji){
        node data_tambah = new node(nama, jabatan, alamat, jmlGaji);
        if(list.head==null){
            list.head = data_tambah;
            list.tail = data_tambah;
        }
        else{
            data_tambah.prev = list.tail;
            data_tambah.next = null;
            list.tail.next = data_tambah;
            list.tail = data_tambah;
        }
    }
    
    void update(karyawan list, String name){
        node view = list.head;
        String namaU;
        String jabatanU;
        String alamatU;
        int gajiU;
        while(view != null){
            if(view.nama == null ? name == null : view.nama.equals(name)){
            System.out.println("Nama : "+view.nama);
            System.out.println("Jabatan : "+view.jabatan);
            System.out.println("Alamat : "+view.alamat);
            System.out.println("Jumlah Gaji : "+view.jmlGaji);
            System.out.println("======== EDIT ===========");
            System.out.print("Nama : ");
            namaU = input.next();
            System.out.print("Jabatan : ");
            jabatanU = input.next();
            System.out.print("Alamat : ");
            alamatU = input.next();
            System.out.print("Jumlah Gaji : ");
            gajiU = input.nextInt();
            view.nama = namaU;
            view.jabatan = jabatanU;
            view.alamat = alamatU;
            view.jmlGaji = gajiU;
            }
            view = view.next;
        }
    }
    
    void delete(karyawan list, String name){
        node delete;
        delete = list.head;
        while(delete.nama == null ? name != null : !delete.nama.equals(name)){
            delete = delete.next;
        }
            if(delete.next == null){
            delete.prev.next = list.tail.next;
            list.tail.prev = delete.prev;
            
            }
            else if(delete.prev == null){
                delete.next.prev = list.head.prev;
                list.head.next = delete.next.next;
            }
            else{
                delete.next.prev = delete.prev;
                delete.prev.next = delete.next;
            }
    }
    
    void lihat(karyawan list){
        node view = list.head;
        System.out.println("=== DATA Karyawan ===");
        while(view != null){
            System.out.println("Nama : "+view.nama);
            System.out.println("Jabatan : "+view.jabatan);
            System.out.println("Alamat : "+view.alamat);
            System.out.println("Jumlah Gaji : "+view.jmlGaji);
            System.out.println("===================");
            view = view.next;
        }
    }
}
