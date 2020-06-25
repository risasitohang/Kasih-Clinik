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
public abstract class Data {
  String username, password;
    
    public void masuk(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Username :");
        username =  scan.next();
        System.out.println("Masukkan Password :");
        password = scan.next();
        if(!username.isEmpty() && !password.isEmpty()){
            String[] args = null;
            AplikasiSistemKlinik.menu();
        }
    }
}