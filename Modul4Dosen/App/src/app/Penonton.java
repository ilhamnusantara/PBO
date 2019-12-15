/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
public class Penonton implements Manusia{
      String nama;
      int usia;
      String alamat;
    int tiket;
    String teks = "Terimakasih telah membeli tiket";
    public Penonton(String nama, int usia, String alamat, int tiket) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.tiket = tiket;
    }
    public void setTiket(int tiket) {
        this.tiket = tiket;
    }

      @Override
    public int getTiket() {
       return tiket;
    }
    
      @Override
    public void ucapan(){
        
    };
    
    void ucapan(String teks){
        this.teks = teks;
        System.out.println(teks);
    }

    @Override
    public void setTiket() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public int getUsia() {
        return usia;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }
    
    
    
}
