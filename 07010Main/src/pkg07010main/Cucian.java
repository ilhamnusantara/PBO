/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07010main;

/**
 *
 * @author ilham-07010
 */
public class Cucian {
  Pegawai pegawai;
  Pelanggan pelanggan;
  float berat;
  float hargaTotal;

    Pegawai getPegawai() {
        return pegawai;
    }

    void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    Pelanggan getPelanggan() {
        return pelanggan;
    }

    void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    float getBerat() {
        return berat;
    }

    void setBerat(float berat) {
        float perKilo = 5000;
        this.berat = berat;
        this.hargaTotal = this.getBerat()*perKilo;
    }

    float getHargaTotal() {
        return hargaTotal;
    }

  
  
}
