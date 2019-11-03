/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3praktikum;
import java.util.ArrayList;
import java.util.Collections;
class Elektronik extends Barang{
    int daya;
    int id;
    ArrayList<Elektronik> elektronik;

    public Elektronik(int id, String nama, int stok, int harga,int daya) {
        super(nama, stok, harga);
        this.id=id;
        this.daya=daya;
        elektronik=new ArrayList<>();
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
    public void inpElektronik(int id,String nama,int stok, int harga, int daya){
        Elektronik elektroniks = new Elektronik(id,nama, stok, harga, daya);
        elektronik.add(elektroniks);
    }
    public ArrayList<Elektronik>getList(){
        return elektronik;
    } 
}
