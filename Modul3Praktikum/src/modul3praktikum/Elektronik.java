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
class Elektronik extends Barang{
    private int daya;
    private int id;
    
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
