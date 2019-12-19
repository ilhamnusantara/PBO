/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ilham-07010
 */
public class Tampung {
    private String Nama;
    private int NilaiIpa,NilaiIps,NilaiIndo;
    
    public Tampung(String nama, int nilaiIpa, int nilaiIps, int nilaiIndo){
        this.Nama = nama;
        this.NilaiIpa = nilaiIpa;
        this.NilaiIps = nilaiIps;
        this.NilaiIndo = nilaiIndo;
    }

    public String getNama() {
        return Nama;
    }

    public int getNilaiIpa() {
        return NilaiIpa;
    }

    public int getNilaiIps() {
        return NilaiIps;
    }

    public int getNilaiIndo() {
        return NilaiIndo;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setNilaiIpa(int NilaiIpa) {
        this.NilaiIpa = NilaiIpa;
    }

    public void setNilaiIps(int NilaiIps) {
        this.NilaiIps = NilaiIps;
    }

    public void setNilaiIndo(int NilaiIndo) {
        this.NilaiIndo = NilaiIndo;
    }
    
    
    
    
}
