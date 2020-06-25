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
public class Obat {
    ArrayList<Integer> idObat = new ArrayList<>();
    ArrayList<String> nama = new ArrayList<>();
    ArrayList<String> jenis = new ArrayList<>();
    ArrayList<Integer> harga = new ArrayList<>();
    
//    int data = 100;
    Scanner scan = new Scanner(System.in);

public void addObat() {
    System.out.println("===DATA OBAT==");
    System.out.println("ID Obat :");
    idObat.add(scan.nextInt());
    System.out.println("Nama Obat :");
    nama.add(scan.next());
    System.out.println("Jenis Obat :");
    jenis.add(scan.next());
    System.out.println("Harga Obat (Rp):");
    harga.add(scan.nextInt());
    } 
public void display(){
    if(idObat.size()>0){
        for(int i = 0;i<idObat.size();i++){
            System.out.println("===DATA OBAT====");
            System.out.println("Id Obat :"+idObat.get(i).toString()+"\n"+
                    "Nama Obat :"+nama.get(i)+"\n"+
                    "Jenis Obat :"+jenis.get(i)+"\n"+
                    "Harga Obat :"+harga.get(i).toString());
            System.out.println("=========");
        }
    }
    else{
        System.out.println("Tidak ada Data!");
    }
}

public void updateObat(){
    System.out.println("Masukkan kode obat yang diUpdate :");
    int id = scan.nextInt();
    int r = idObat.indexOf(id);
    if(r>=0){
        System.out.println("====DATA OBAT TERBARU===");
        System.out.println("ID Obat :");
        int ob = scan.nextInt();
        idObat.set(r,ob);
        
        System.out.println("Nama Obat :");
        String nam = scan.next();
        nama.set(r, nam);
        
        System.out.println("Jenis Obat :");
        String jen = scan.next();
        jenis.set(r, jen);
        
        System.out.println("Harga Obat :");
        Integer har = scan.nextInt();
        harga.set(r, har);
        System.out.println("=========");
        
    }
}

public void deleteObat(){
    System.out.println("Masukkan ID obat yang ingin dihapus :");
    int id = scan.nextInt();
    int r = idObat.indexOf(id);
    if(r>=0){
        idObat.remove(r);
        nama.remove(r);
        jenis.remove(r);
        harga.remove(r);
        System.out.println("Berhasil Dihapus !");
        System.out.println("===============");
    }
    else{
        System.out.println("Tidak Ada Data !");
    }
}
}
