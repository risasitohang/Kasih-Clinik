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
public class Pasien implements Pasien1 {
//    int idPasien;
//    String namaPasien;
//    String jenisKelamin;
//    String alamat;
//    int noTelp;
   ArrayList<Integer> idPasien = new ArrayList<>();
   ArrayList<String> namaPasien = new ArrayList<>();
   ArrayList<String> jenisKelamin = new ArrayList<>();
   ArrayList<String> alamat = new ArrayList<>();
   ArrayList<Integer> noTelp = new ArrayList<>();
//   int data = 100;
   Scanner scan = new Scanner(System.in);
public void addPasien(){
    System.out.println("==Data Pasien==");
    System.out.println("Id Pasien :");
    idPasien.add(scan.nextInt());
    System.out.println("Nama Pasien :");
    namaPasien.add(scan.next());
    System.out.println("Jenis Kelamin :");
    jenisKelamin.add(scan.next());
    System.out.println("Alamat Pasien :");
    alamat.add(scan.next());
    System.out.println("No Telp :");
    noTelp.add(scan.nextInt());
}
int x =0;
public void displayPasien(){
    if(idPasien.size()>0){
        for(int i =0; i< idPasien.size();i++){
        System.out.println("========Data Pasien==========");
            System.out.println("Id Pasien :"+idPasien.get(i).toString()+"\n"+
            "Nama Pasien :"+namaPasien.get(i)+"\n"+
            "Jenis Kelamin :"+jenisKelamin.get(i)+"\n"+
             "Alamat :"+alamat.get(i)+"\n"+
             "No Telepon :"+noTelp.get(i).toString());
            System.out.println("***************************");
    
        }
    }
    else{
        System.out.println("Tidak Ada data ditampilkan !");
    }
    
}
public void deletePasien(){
    System.out.println("Masukkan Id Pasien yang Ingin dihapus : ");
    int id = scan.nextInt();
    int r = idPasien.indexOf(id);
    if(r>=0){
        idPasien.remove(r);
        namaPasien.remove(r);
        jenisKelamin.remove(r);
        alamat.remove(r);
        noTelp.remove(r);
        System.out.println("Berhasil Dihapus !");
        System.out.println("*****************");
    } 
    else{
        System.out.println("Tidak ada data!");
    }
}
public void updatePasien(){
    System.out.println("Masukkan Id Pasien yang ingin diubah :");
    int idPas = scan.nextInt();
    int r = idPasien.indexOf(idPas);
    if(r>=0){
        System.out.println("=====Data Yang Baru======");
        System.out.println("Id Pasien (baru) :");
        Integer id = scan.nextInt();
        idPasien.set(r, id);
        
        System.out.println("Nama Pasien (baru) :");
        String nam = scan.next();
        namaPasien.set(r, nam);
        
        System.out.println("Jenis Kelamin (baru) :");
        String jen = scan.next();
        jenisKelamin.set(r, jen);
        
        System.out.println("Alamat (baru) :");
        String alam = scan.next();
        alamat.set(r, alam);
        
        System.out.println("No Telepon (baru) :");
        Integer noTel = scan.nextInt();
        noTelp.set(r, noTel);
    }
    }

    @Override
    public void addpasien() {
    System.out.println("==Data Pasien==");
    System.out.println("Id Pasien :");
    idPasien.add(scan.nextInt());
    System.out.println("Nama Pasien :");
    namaPasien.add(scan.next());
    System.out.println("Jenis Kelamin :");
    jenisKelamin.add(scan.next());
    System.out.println("Alamat Pasien :");
    alamat.add(scan.next());
    System.out.println("No Telp :");
    noTelp.add(scan.nextInt());
    }
}