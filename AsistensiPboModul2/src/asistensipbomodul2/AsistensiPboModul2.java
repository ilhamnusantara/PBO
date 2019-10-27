/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensipbomodul2;

import java.util.Scanner;

/**
 *
 * @author ilham-07010
 */
public class AsistensiPboModul2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nama = new String[8];
        String[] pass = new String[8];
        String[] status = new String[8];
        String[] alamat = new String[8];
        int[] gaji = new int[8];
        Scanner inp = new Scanner(System.in);

        nama[0] = "ilham";
        pass[0] = "admin";
        status[0] = "manager";
        alamat[0] = "Sidoarjo";
        gaji[0] = 1000000;

        nama[1] = "irul";
        pass[1] = "admin";
        status[1] = "karyawan";
        alamat[1] = "Surabaya";
        gaji[1] = 2500000;
        int i = 2;
        int pil;
        String y;
        String namaa;
        do {
            System.out.print("Masukkan nama = ");
            String name = inp.next();
            System.out.print("Masukkan pass= ");
            String password = inp.next();

            for (int a = 0; a < 7; a++) {
                if (name.equals(nama[a]) && password.equals(pass[a])) {
                    if (!"manager".equals(status[a])) {
                        System.out.println("=== KARYAWAN ===");
                        System.out.println("1. Info ");
                        System.out.println("2. Exit ");
                        System.out.print("pilih : ");
                        int pilih = inp.nextInt();
                        switch (pilih) {
                            case 1:
                                System.out.println("nama : " + nama[a]);
                                System.out.println("status : " + status[a]);
                                System.out.println("alamat : " + alamat[a]);
                                System.out.println("gaji : " + gaji[a]);
                                break;
                        }
                    } else {
                        do {
                            System.out.println("=== MANAGER ===");
                            System.out.println("1. Tambahkan user ");
                            System.out.println("2. View user ");
                            System.out.println("3. Update user ");
                            System.out.println("4. Delete user ");
                            System.out.println("5. Logout ");
                            System.out.print("Pilih : ");
                            pil = inp.nextInt();

                            switch (pil) {
                                case 1:
                                    System.out.println(" TAMBAH USER ");
                                    System.out.print("Nama = ");
                                    String nam1 = inp.next();
                                    System.out.print("Password = ");
                                    String pass1 = inp.next();
                                    System.out.print("Status = ");
                                    String stat1 = inp.next();
                                    System.out.print("Alamat = ");
                                    String alam1 = inp.next();
                                    System.out.print("Gaji = ");
                                    int gaj1 = inp.nextInt();
                                    nama[i] = nam1;
                                    pass[i] = pass1;
                                    status[i] = stat1;
                                    alamat[i] = alam1;
                                    gaji[i] = gaj1;
                                    i++;
                                    break;
                                case 2:
                                    for (int b = 0; b < i; b++) {
                                        System.out.println("Nama : " + nama[b]);
                                        System.out.println("Status : " + status[b]);
                                        System.out.println("Alamat : " + alamat[b]);
                                        System.out.println("Gaji : " + gaji[b]);
                                    }
                                    break;
                                case 3:
                                    System.out.print("Masukkan nama : ");
                                    namaa = inp.next();
                                    for (int c = 0; c < i; c++) {
                                        if (namaa.equals(nama[c])) {
                                            System.out.print("Status : ");
                                            String stat2 = inp.next();
                                            System.out.print("Gaji : ");
                                            int gaj2 = inp.nextInt();
                                            status[c] = stat2;
                                            gaji[c] = gaj2;
                                        }
                                    }
                                    break;
                                case 4:
                                    System.out.print("Masukkan nama : ");
                                    namaa = inp.next();
                                    for (int d = 0; d < i; d++) {
                                        if (namaa.equals(nama[d])) {
                                            nama[d] = nama[d + 1];
                                            pass[d] = pass[d + 1];
                                            status[d] = status[d + 1];
                                            alamat[d] = alamat[d + 1];
                                            gaji[d] = gaji[d + 1];
                                            i--;
                                        }
                                    }
                                    break;

                            }
                        } while (pil < 5);
                    }
                }
            }System.out.print("Apakah ingin login kembali : ");
             y = inp.next();
        } while ("y".equals(y));

    }

}
