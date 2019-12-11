/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import java.util.*;
/**
 *
 * @author ilham-07010
 */
public class Controller {
    public static void main(String[] args){
        String text = "Belajar Pemrograman Java";
        
        String[] kata = text.split("");
        
        String text1 = kata[0];
        String text2 = kata[1];
        String text3 = kata[2];
        
        System.out.println("Text 1 = "+text1);
        System.out.println("Text 2 = "+text2);
        System.out.println("Text 3 = "+text3);
    }
    static ArrayList<User> user = new ArrayList<User>();
    
//    public static void insert(String nama, int umur, String status, String username, String pass)
//    {
//        user.add(new User("guru", "guru", "yanto", 45, "Guru"));
//        user.add(new User("murid", "murid", "ilham", 20, "Murid"));
//    }
    public static void insert()
    {
        user.add(new User("guru", "guru", "yanto", 45, "Guru"));
        user.add(new User("murid", "murid", "ilham", 20, "Murid"));
    }
    public static String login(String username, String pass)
    {
        String hasil = "gagal";
        for (int i = 0; i<user.size(); i++)
        {
            if(username.equals("guru")&& pass.equals("guru"))
            {
                hasil = "guru";
            }
            else if (username.equals(user.get(i).getNama())&& pass.equals(user.get(i).getNama())&&user.get(i).getStatus().equals("Murid"))
            {
                hasil = "murid";
            } 
        }
//        if(user.equals("guru")&& pass.equals("guru"))
//        {
//            hasil = "guru";
//        }
//        else if (user.equals("murid")&& pass.equals("murid"))
//        {
//            hasil = "murid";
//        }
        return hasil;
    }
    
}
