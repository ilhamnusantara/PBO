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
public class Manusia {
    private String nama;
    private String status;
    private int umur;

    public Manusia(String nama, int umur, String status) {
        this.nama = nama;
        this.umur = umur;
        this.status = status;
    }

    public Manusia() {
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
    
    public String getStatus() {
        return status;
    }
}
