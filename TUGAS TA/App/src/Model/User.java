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
public class User extends Manusia{
    private String username, password;
    private int nilaiIpa,nilaiIps,nilaiIndo;
    public User(String username, String password, String nama,String status, int nilaiIpa, int nilaiIps, int nilaiIndo) {
        super(nama, status);
        this.username = username;
        this.password = password;
        this.nilaiIpa = nilaiIpa;
        this.nilaiIps = nilaiIps;
        this.nilaiIndo = nilaiIndo;
    }

    public User(String guru, String guru0, String yanto, String guru1, Object object, Object object0, Object object1) {
       this.username = guru;
       this.password = guru0;
    }

    public User(String murid, String murid0, String ilham, String murid1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getNilaiIpa() {
        return nilaiIpa;
    }

    public int getNilaiIps() {
        return nilaiIps;
    }

    public int getNilaiIndo() {
        return nilaiIndo;
    }
    
    
}
