/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2praktikum;

/**
 *
 * @author ilham-07010
 */
public class Node {
    public static class node{
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
    
}
