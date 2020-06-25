/*
Nama    :Risa Jessica Sitohang
NIM     :11418044
Kelas   :42TRPL2
Tanggal :13 Desember 2019
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klinikkasih;

import java.util.Scanner;

/**
 *
 * @author ITD
 */
public class AplikasiSistemKlinik {
   public static Scanner in = new Scanner(System.in);
    private static boolean menu;
    public static void main(String[] args) {
     
        System.out.println("**SELAMAT DATANG DI KLINIK KASIH**");
        System.out.println("1. Log in");
        int a;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        if(a == 1){
            Perawat prt = new Perawat();
            prt.masuk();
        }
    }

 public static void menu() {
     //Scanner scan = new Scanner(System.in);
     boolean isLanjutkan = true;
     
     menu : while(isLanjutkan){
     System.out.println("====MENU UTAMA ====");  
     System.out.println("1. Data Pasien");
     System.out.println("2. Data Obat");
     System.out.println("3. Daftar Rekam Medis");
     System.out.println("4. Perawatan");
     System.out.println("5. Data Pembayaran");
     System.out.println("6. Keluar");
     System.out.println("==================");
     System.out.println("Pilih :");
     int pilih = Integer.parseInt(in.nextLine());
     switch (pilih){
         case 1 :
             Pasien();
             break;
         case 2 :
             Obat();
             break;
         case 3 :
             rekamMedis();
         case 4 :
             perawatan();
             break;
         case 5 :
             pembayaran();
         case 6 :
             System.exit(0);
            
     }
         
     }
       }
     private static void rekamMedis() {
         Scanner scan = new Scanner(System.in);
         RekamMedis RM = new RekamMedis();
         while(true){
             System.out.println("1. Tambah Data Rekam Medis");
             System.out.println("2. Tampil Data Rekam Medis");
             System.out.println("3. Edit Data Rekam Medis");
             System.out.println("4. Hapus Data Rekam Medis");
             System.out.println("5. Back");
             int input = scan.nextInt();
             switch(input){
                 case 1 :
                     RM.addRM();
                     break;
                 case 2 :
                     RM.display();
                     break;
                 case 3 :
                     RM.update();
                     break;
                 case 4 :
                     RM.delete();
                 case 5 :
                     menu();
                    
             }
         }
      }

    private static void Obat() {
        Scanner scan = new Scanner(System.in);
        Obat ob = new Obat();
        try{
        while(true){
            System.out.println("1. Tambah Data Obat");
            System.out.println("2. Tampil Data Obat");
            System.out.println("3. Edit Data Obat");
            System.out.println("4. Hapus Data Obat");
            System.out.println("5. Back");
            int input = scan.nextInt();
            switch(input){
                case 1 :
                    ob.addObat();
                    break;
                case 2 :
                    ob.display();
                    break;
                case 3 :
                    ob.updateObat();
                    break;
                case 4 :
                    ob.deleteObat();
                    break;
                case 5 :
                   menu();
            }
        }
        }
        catch(Exception e){
            System.out.println("Error");
        }
      }
        

    private static void perawatan() {
   Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan ID Pasien");
         int id = scan.nextInt();
         while(true){
        System.out.println("1. Rawat Jalan");
        System.out.println("2. Rawat Inap");
        int z = scan.nextInt();
        if(z == 1){
       Perawatan rawat = Perawatan.rawatInap;
            System.out.println("Rawat Jalan dilakukan untuk mendiagnosa ataupun mengamati kesehatan pasien");
       break;
        }else if(z == 2){
           Perawatan rawat = Perawatan.rawatJalan;
            System.out.println("Rawat Inap yang mengharuskan opname untuk si pasien");
        break;
        }
      }
   
}

    private static void pembayaran() {
        Scanner scan = new Scanner(System.in);
        Pembayaran bayar = new Pembayaran();
         while(true){
        System.out.println("Masukkan ID Pasien :");
        int id = scan.nextInt();
        System.out.println("Pilih :");
        System.out.println("1. Rawat Jalan");
        System.out.println("2. Rawat Inap");
        int bay = scan.nextInt();
            if(bay == 1){
                    System.out.println("==Rawat Jalan==");
                    System.out.println("Bayar : Rp150000");
                    menu();
            }else if (bay ==2){
                    System.out.println("==Rawat Inap==");
                    System.out.println("Masukkan Jumlah Hari :");
                    int hari = scan.nextInt();
                    int hasil = (hari * 200000);
                    System.out.println("Jumlah Pembayaran :"+hasil);
                    menu();
            }
      }
      }

    private static void Pasien() {
     Scanner scan = new Scanner(System.in);
     Pasien pasien = new Pasien();
     pasien.idPasien.add(12);
     pasien.namaPasien.add("Risa");
     pasien.jenisKelamin.add("Perempuan");
     pasien.alamat.add("Pematangsiantar");
     pasien.noTelp.add(7723);
     
     while(true){
     System.out.println("1. Tambah data Pasien");
     System.out.println("2. Tampil data Pasien");
     System.out.println("3. Edit data Pasien");
     System.out.println("4. Hapus data Pasien");
     System.out.println("5. Back");
        int input = scan.nextInt();
        switch(input){
            case 1 :
                pasien.addPasien();
                break;
            case 2 :
                pasien.displayPasien();
                break;
            case 3 :
                pasien.updatePasien();
                break;
            case 4 :
                pasien.deletePasien();
                break;
            case 5 :
                menu();
        }   
     }
    }
   
}
