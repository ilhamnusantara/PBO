/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npmmodul2linklist;

/**
 *
 * @author ilhamnusantara
 */

class pegawai{
    private static class node {
        int nip;
        String nama;
        String jabatan;
        node next;
        node prev;
        
    node(int a, String b,String c){
        this.nip=a;
        this.nama=b;
        this.jabatan=c;
        this.next=null;
        this.prev=null;
    }    
    }
    node head;
    node tail;
    
    void tambah(pegawai list, int a, String nama,String jabatan){
        node data_pegawai=new node(a,nama,jabatan);
        if(list.head==null){
            list.head=data_pegawai;
            list.tail=data_pegawai;
        }
        else{
            data_pegawai.next=list.tail;
            data_pegawai.prev=null;
            list.tail.prev=data_pegawai;
            list.tail=data_pegawai;
        }
    }
    
    void lihat(pegawai list){
        node view=list.tail;
        System.out.println("===DATA PEGAWAI===");
        while(view != null){
            System.out.println(view.nama +"->"+view.jabatan);
            view=view.next;
        }
        System.out.println("=================");
    }
}
public class NpmModul2LinkList {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        pegawai karyawan = new pegawai();
        karyawan.tambah(karyawan, 1, "andi", "programer");
        karyawan.tambah(karyawan, 2, "budi", "desinger");
        karyawan.tambah(karyawan, 3, "cici", "PM");
        karyawan.tambah(karyawan, 4, "didi", "programer");
        karyawan.lihat(karyawan);
    }
    
}
