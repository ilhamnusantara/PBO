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

   
    public static ArrayList<User> user = new ArrayList<User>();
    public static ArrayList<Tampung> tampung = new ArrayList<Tampung>();
    public String nama;
    public int nilaiIpa, nilaiIps, nilaiIndo;
    public static void insert(String username, String password, String nama, String status, int nilaiIpa, int nilaiIps, int nilaiIndo)
    {
        user.add(new User(username, password, nama, status,nilaiIpa, nilaiIps, nilaiIndo));
    }
    
    public static void wadah(String nama, int nilaiIpa, int nilaiIps, int nilaiIndo)
    {
        tampung.add(new Tampung(nama, nilaiIpa, nilaiIps, nilaiIndo));
    }     
    
//    public static void guruInsert(){
//        user.add(new User("guru", "guru", "yanto","guru",null,null,null));
//    }
    
    public static void setGuru(){
        user.add(0,new User("guru", "guru", "yanto","guru",null,null,null));
        if(user.size() > 1){
        for (int i = 1; i < user.size(); i++) {
            if(user.get(0).getUsername().equals(user.get(i).getUsername())){
               user.remove(i);
            }
        }
        }
        
    }
    
    public static String login(String username, String pass)
    {
        
        String hasil = "gagal";
        for (int i = 0; i<user.size(); i++)
        {
//            if(username.equals("guru")&& pass.equals("guru"))
//            {
//                hasil = "guru";
//            }
            if ((username == null ? user.get(i).getUsername() == null : username.equals(user.get(i).getUsername()))&& (pass == null ? user.get(i).getPassword() == null : pass.equals(user.get(i).getPassword())))
            {   
                if(username.equals("guru")&&pass.equals("guru")){
                    hasil = "guru";
                }else if(user.get(i).getStatus().equals("murid")){
//                    System.out.println(user.size());
                hasil = "murid";
            } 
          }
        }
        return hasil;
    }
    
    public static User getSiswa(String username, String password){
        for(int i = 0; i < user.size(); i++){
            if((username == null ? user.get(i).getUsername() == null : username.equals(user.get(i).getUsername()))&&password == user.get(i).getPassword()){
                return user.get(i);
            }
        }
        return user.get(1);
    }
}
