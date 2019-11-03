/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3praktikum;

import java.util.*;
/**
 *
 * @author ilham-07010
 */
public class Sorting {
  
    /**
     *
     * @param elektroniks
     */
    public void sortingElStok(ArrayList<Elektronik> elektroniks){
        Elektronik temp;
        if(elektroniks.size()>1){
            for(int x=0; x<elektroniks.size(); x++){
                for(int y=0; y<elektroniks.size()-y;y++){
                    if(elektroniks.get(y).getStok()<elektroniks.get(y+1).getStok()){
                        temp = elektroniks.get(y);
                        elektroniks.set(y,elektroniks.get(y+1));
                        elektroniks.set(y+1,temp);
                    }
                }
            }
        }
    }
}
