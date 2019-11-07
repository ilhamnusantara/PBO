/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3praktikum;
import java.util.*;
class Elektronik extends Barang{
    int daya;
    int id;

    public Elektronik(int id, String nama, int stok, int harga,int daya) {
        super(nama, stok, harga);
        this.id=id;
        this.daya=daya;
        
    }
    
    public void setDaya(int daya) {
        this.daya = daya;
    }

    public int getDaya() {
        return daya;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
