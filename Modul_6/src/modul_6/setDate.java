/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_6;
import java.text.*;
import java.util.*;
import java.awt.Font;

import javax.swing.*;

public class setDate extends Modal{
    private String tanggal;
    public String textDate;
    public String formateDate;
    public JLabel text;
    public String format1;
    public String Judul;
    public void judul(){
        Judul = "DATE FORMATTER ";
    }
    
    //overload
    public void judul(int angka){
        angka = 46;
        Judul = Judul + angka;
    }
    
    public String JUdul(){
        return this.Judul;
    }
    
    setDate(String textDate, String formateDate){
        this.textDate = textDate;
        this.formateDate=formateDate;
    }
        
    @Override
    public void DateValue(){
        if(this.formateDate.length() < 8 && this.formateDate.length() > 8){
            this.tanggal = "Format Salah";
        }
        if (this.formateDate.equals("dd/MM/yyyy")){
        this.format1 = this.textDate.substring(0, 2)+"/"+this.textDate.substring(2, 4)+"/"+this.textDate.substring(4, 8);
        System.out.println("Tanggal = "+ format1);
        }
        else if(this.formateDate.equals("yyyy/MM/dd")){
        this.format1 = this.textDate.substring(4, 8)+"/"+this.textDate.substring(2, 4)+"/"+this.textDate.substring(0, 2);
        System.out.println("Tanggal = "+ format1);
        }
        SimpleDateFormat sdf = new SimpleDateFormat(this.formateDate);
        Date date1 = null;
        try{
            date1 = sdf.parse(this.format1);
        }catch(ParseException e){
            System.out.println("Format salah");
        }
//        System.out.println(format);
        System.out.println(date1);
        
        this.tanggal = sdf.format(date1).toString();
        System.out.println(this.tanggal);
    }
    public String stringDate(){
        return this.tanggal;
}
}
