/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3praktikum;
import java.util.ArrayList;

public class PecahBelah extends Barang{
    int ukuran;
    int id;
    ArrayList<PecahBelah> pecahBelah;

    public PecahBelah(int id,String nama, int stok, int harga,int ukuran) {
        super(nama, stok, harga);
        this.id = id;
        this.ukuran = ukuran;
        pecahBelah = new ArrayList<>();
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public void inpPecahBelah(int id,String nama, int stok, int harga, int ukuran){
        PecahBelah pecahBelahs = new PecahBelah(id, nama, stok, harga, ukuran);
        pecahBelah.add(pecahBelahs);
    }
    
    public ArrayList<PecahBelah>getList(){
        return pecahBelah;
    }
    
    
}
