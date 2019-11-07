/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3praktikum;

import java.util.ArrayList;
/**
 *
 * @author ilham-07010
 */
public class Sort {
  
    /**
     *
     * @param elektroniks
     */
    ArrayList<Elektronik> byNameElektronikAsc(ArrayList<Elektronik> elektronik){
        Elektronik temp;
        for (int i = 0; i < elektronik.size(); i++) {
            for (int j = 1; j < elektronik.size() - i; j++) {
                if (elektronik.get(j -1).getNama().compareTo(elektronik.get(j).getNama()) > 0) {
                    temp = elektronik.get(j -1);
                    elektronik.set(j - 1, elektronik.get(j));
                    elektronik.set(j, temp);
                }
            }
        }
        return elektronik;
    }
    ArrayList<Elektronik> byNameElektronikDesc(ArrayList<Elektronik> elektronik){
        Elektronik temp;
        for (int i = 0; i < elektronik.size(); i++) {
            for (int j = 1; j < elektronik.size() - i; j++) {
                if (elektronik.get(j).getNama().compareTo(elektronik.get(j-1).getNama()) > 0) {
                    temp = elektronik.get(j -1);
                    elektronik.set(j - 1, elektronik.get(j));
                    elektronik.set(j, temp);
                }
            }
        }
        return elektronik;
    }
    
    ArrayList<Elektronik> byStokElektronikAsc(ArrayList<Elektronik> elektronik){
        Elektronik temp;
        for (int i = 0; i < elektronik.size(); i++) {
            for (int j = 1; j < elektronik.size() - i; j++) {
                if (elektronik.get(j -1).getStok() > elektronik.get(j).getStok()) {
                    temp = elektronik.get(j -1);
                    elektronik.set(j - 1, elektronik.get(j));
                    elektronik.set(j, temp);
                }
            }
        }
        return elektronik;
    }
    
    
    ArrayList<Elektronik> byStokElektronikDesc(ArrayList<Elektronik> elektronik){
        Elektronik temp;
        for (int i = 0; i < elektronik.size(); i++) {
            for (int j = 1; j < elektronik.size() - i; j++) {
                if (elektronik.get(j -1).getStok() < elektronik.get(j).getStok()) {
                    temp = elektronik.get(j -1);
                    elektronik.set(j - 1, elektronik.get(j));
                    elektronik.set(j, temp);
                }
            }
        }
        return elektronik;
    }
    
    ArrayList<Elektronik> byHargaElektronikAsc(ArrayList<Elektronik> elektronik){
        Elektronik temp;
        for (int i = 0; i < elektronik.size(); i++) {
            for (int j = 1; j < elektronik.size() - i; j++) {
                if (elektronik.get(j -1).getHarga()> elektronik.get(j).getHarga()) {
                    temp = elektronik.get(j -1);
                    elektronik.set(j - 1, elektronik.get(j));
                    elektronik.set(j, temp);
                }
            }
        }
        return elektronik;
    }
    
    
    ArrayList<Elektronik> byHargaElektronikDesc(ArrayList<Elektronik> elektronik){
        Elektronik temp;
        for (int i = 0; i < elektronik.size(); i++) {
            for (int j = 1; j < elektronik.size() - i; j++) {
                if (elektronik.get(j -1).getHarga()< elektronik.get(j).getHarga()) {
                    temp = elektronik.get(j -1);
                    elektronik.set(j - 1, elektronik.get(j));
                    elektronik.set(j, temp);
                }
            }
        }
        return elektronik;
    }
    ArrayList<PecahBelah> byNamePecahBelahAsc(ArrayList<PecahBelah> pecahBelah){
        PecahBelah temp;
        for (int i = 0; i < pecahBelah.size(); i++) {
            for (int j = 1; j < pecahBelah.size() - i; j++) {
                if (pecahBelah.get(j -1).getNama().compareTo(pecahBelah.get(j).getNama()) > 0) {
                    temp = pecahBelah.get(j -1);
                    pecahBelah.set(j - 1, pecahBelah.get(j));
                    pecahBelah.set(j, temp);
                }
            }
        }
        return pecahBelah;
    }
    ArrayList<PecahBelah> byNamePecahBelahsDesc(ArrayList<PecahBelah> pecahBelah){
        PecahBelah temp;
        for (int i = 0; i < pecahBelah.size(); i++) {
            for (int j = 1; j < pecahBelah.size() - i; j++) {
                if (pecahBelah.get(j).getNama().compareTo(pecahBelah.get(j-1).getNama()) > 0) {
                    temp = pecahBelah.get(j -1);
                    pecahBelah.set(j - 1, pecahBelah.get(j));
                    pecahBelah.set(j, temp);
                }
            }
        }
        return pecahBelah;
    }
    
    ArrayList<PecahBelah> byStokPecahBelahAsc(ArrayList<PecahBelah> pecahBelah){
        PecahBelah temp;
        for (int i = 0; i < pecahBelah.size(); i++) {
            for (int j = 1; j < pecahBelah.size() - i; j++) {
                if (pecahBelah.get(j -1).getStok() > pecahBelah.get(j).getStok()) {
                    temp = pecahBelah.get(j -1);
                    pecahBelah.set(j - 1, pecahBelah.get(j));
                    pecahBelah.set(j, temp);
                }
            }
        }
        return pecahBelah;
    }
    
    
    ArrayList<PecahBelah> byStokPecahBelahDesc(ArrayList<PecahBelah> pecahBelah){
        PecahBelah temp;
        for (int i = 0; i < pecahBelah.size(); i++) {
            for (int j = 1; j < pecahBelah.size() - i; j++) {
                if (pecahBelah.get(j -1).getStok() < pecahBelah.get(j).getStok()) {
                    temp = pecahBelah.get(j -1);
                    pecahBelah.set(j - 1, pecahBelah.get(j));
                    pecahBelah.set(j, temp);
                }
            }
        }
        return pecahBelah;
    }
    
    ArrayList<PecahBelah> byHargaPecahBelahAsc(ArrayList<PecahBelah> pecahBelah){
        PecahBelah temp;
        for (int i = 0; i < pecahBelah.size(); i++) {
            for (int j = 1; j < pecahBelah.size() - i; j++) {
                if (pecahBelah.get(j -1).getHarga() > pecahBelah.get(j).getHarga()) {
                    temp = pecahBelah.get(j -1);
                    pecahBelah.set(j - 1, pecahBelah.get(j));
                    pecahBelah.set(j, temp);
                }
            }
        }
        return pecahBelah;
    }
    
    ArrayList<PecahBelah> byHargaPecahBelahDesc(ArrayList<PecahBelah> pecahBelah){
        PecahBelah temp;
        for (int i = 0; i < pecahBelah.size(); i++) {
            for (int j = 1; j < pecahBelah.size() - i; j++) {
                if (pecahBelah.get(j -1).getHarga()< pecahBelah.get(j).getHarga()) {
                    temp = pecahBelah.get(j -1);
                    pecahBelah.set(j - 1, pecahBelah.get(j));
                    pecahBelah.set(j, temp);
                }
            }
        }
        return pecahBelah;
    }
      
}
