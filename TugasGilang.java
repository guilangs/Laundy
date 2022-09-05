/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbaru;

import java.util.Scanner;

/**
 *
 * @author MOKLET GAMING
 */
public class Laundry {
    public static void main(String[] args) {
        //deklarasi
        Scanner in = new Scanner (System.in);
        String nama, alamat, nohp;
        int jum;
        //deklarasi harga
        int a,b,c,d, jumba; //jumlah bayar
        int hargaA=8000, hargaB=6000, hargaC=5000, hargaD=4000;
        
        
        System.out.println("Laundry Gilang");
        System.out.println("Jl. Danau Ranau, Sawojajar, Kec. Kedungkandang");
        System.out.println("Telp 085855162733");
        System.out.println("==============================================");
        System.out.print("Nama Customer = ");
        nama = in.nextLine();
        System.out.print("Alamat        = ");
        alamat = in.nextLine();
        System.out.print("No. Handphone = ");
        nohp = in.nextLine();
        System.out.println("----------------------------------------------");
        System.out.print("Jumlah Barang (Kg) = ");
        jum = in.nextInt();
        
        
        if (jum >=1 && jum <=3){
            //deklarasi
            int total = jum*hargaA, kembalian;
            System.out.println("Harga Perkilo  = Rp "+hargaA);
            System.out.println("Total Harga    = Rp "+total);
            System.out.print("Jumlah Bayar   = Rp ");
            jumba = in.nextInt();
            if (jumba>hargaA){
            kembalian = jumba-hargaA;
                System.out.println("Kembalian      = Rp "+kembalian);
            }else if (jumba<hargaA){
                System.out.println("Maaf Uang Anda Tidak Cukup");}
       }else if (jum >=4 && jum <=5){
            //deklarasi
            int total = jum*hargaB, kembalian;
            System.out.println("Harga Perkilo   = Rp "+hargaB);
            System.out.println("Total Harga     = Rp "+total);
            System.out.print("Jumlah Bayar    = Rp ");
            jumba = in.nextInt();
            if (jumba>hargaB){
            kembalian = jumba-hargaB;
                System.out.println("Kembalian      = Rp "+kembalian);
            }else if (jumba<hargaB){
                System.out.println("Maaf Uang Anda Tidak Cukup");}
       }else if (jum >=6 && jum <=10){
            //deklarasi
            int total = jum*hargaC, kembalian;
            System.out.println("Harga Perkilo   = Rp "+hargaC);
            System.out.println("Total Harga     = Rp "+total);
            System.out.print("Jumlah Bayar    = Rp ");
            jumba = in.nextInt();
            if (jumba>hargaC){
            kembalian = jumba-hargaC;
                System.out.println("Kembalian      = Rp "+kembalian);
            }else if (jumba<hargaC){
                System.out.println("Maaf Uang Anda Tidak Cukup");}
       }else if (jum > 10){
            //deklarasi
            int total = jum*hargaD, kembalian;
            System.out.println("Harga Perkilo   = Rp "+hargaD);
            System.out.println("Total Harga     = Rp "+total);
            System.out.print("Jumlah Bayar    = Rp ");
            jumba = in.nextInt();
            if (jumba>hargaD){
            kembalian = jumba-hargaD;
                System.out.println("Kembalian      = Rp "+kembalian);
            }else if (jumba<hargaD){
                System.out.println("Maaf Uang Anda Tidak Cukup");}
       }else if (jum < 1){
            System.out.println("ERROR data yang Anda masukkan salah !");}
        
        System.out.println("=================TERIMA KASIH=================");

    
    }
}
