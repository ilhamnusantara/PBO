/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3praktikum;

/**
 *
 * @author ilham-07010
 */
public class Barang {
    private String nama;
    private int stok;
    private int harga;
    
    public Barang(String nama, int stok, int harga){
    this.nama=nama;
    this.stok=stok;
    this.harga=harga;    
}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
        

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
    

    
}
