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

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ITD
 */
public class RekamMedis {
    //Merupakan Generics
    ArrayList <Integer> IdPasien = new ArrayList<>();
    ArrayList <Integer> IdRekamMedis = new ArrayList<>();
    ArrayList <String> TanggalPemeriksa = new ArrayList<>();
    ArrayList <Integer> Tensi = new ArrayList<>();
    ArrayList <Integer> DetakJantung = new ArrayList<>();
    
//    int RM = 100;
    Scanner scan = new Scanner(System.in);
    
    public void addRM(){
        System.out.println(" Rekam Medis Pasien");
        System.out.println("Id Pasien :");
        IdPasien.add(scan.nextInt());
        System.out.println("Id Rekam Medis Pasien :");
        IdRekamMedis.add(scan.nextInt());
        System.out.println("Tanggal Pemeriksaan :");
        TanggalPemeriksa.add(scan.nextLine());
        System.out.println("Tensi (mmHg) :");
        Tensi.add(scan.nextInt());
        System.out.println("Besar detak jantung (BPM): ");
        DetakJantung.add(scan.nextInt());
    }
int x = 0;
public void display(){
   if(IdPasien.size()>0){
        for(int i =0; i< IdPasien.size();i++){
        System.out.println("========Data Rekam Medis==========");
            System.out.println("Id Pasien :"+IdPasien.get(i).toString()+"\n"+
            "Id Rekam Medis :"+IdRekamMedis.get(i)+"\n"+
            "Tanggal Pemeriksaan :"+TanggalPemeriksa.get(i)+"\n"+
             "Tensi(mmHg) :"+Tensi.get(i)+"\n"+
             "Detak JAntung (BPM) :"+DetakJantung.get(i).toString());
            System.out.println("===============================");
    
        }
    }
    else{
        System.out.println("Tidak Ada data ditampilkan !");
    }
    }
public void delete(){
    System.out.println("Masukkan ID Pasien :");
    int idPasien = scan.nextInt();
    int r = IdPasien.indexOf(idPasien);
    if(r>=0){
        IdPasien.remove(r);
        IdRekamMedis.remove(r);
        TanggalPemeriksa.remove(r);
        Tensi.remove(r);
        DetakJantung.remove(r);
    }else{
        System.out.println("Tidak ada data !");
    }
}

public void update(){
    System.out.println("Masukkan Id Pasien :");
    int idPasien = scan.nextInt();
    int r = IdPasien.indexOf(idPasien);
    if(r>=0){
        System.out.println("===DATA BARU===");
        System.out.println("Masukkan Id Pasien :");
        Integer pas = scan.nextInt();
        IdPasien.set(r,pas);
        
        System.out.println("Masukkan Id Rekam Medis :");
        Integer med = scan.nextInt();
          scan.nextInt();
        IdRekamMedis.set(r, med);
        
        System.out.println("Tanggal Pemeriksaan :");
        String tgl = scan.nextLine();
        TanggalPemeriksa.set(r, tgl);
        
        System.out.println("Tensi (mmHg) :");
        Integer tensi = scan.nextInt();
        Tensi.set(r, med);
        
        System.out.println("Detak Jantung (BPM) :");
        Integer det = scan.nextInt();
        DetakJantung.set(r, det);    }
    
    }
}


