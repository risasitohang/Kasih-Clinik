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
 * @param <T>
 */
public class Pembayaran <T> {
    int total;
    int idPasien;

    Pembayaran() {
      }

    public int getTotal() {
        return total;
    }

    public int getIdPasien() {
        return idPasien;
    }

    public Pembayaran(int total, int idPasien) {
        this.total = total;
        this.idPasien = idPasien;
    }
 
//    public void displayPembayaran(){
//        System.out.println("Id Pasien :"+idPasien+"\n"
//                + "Total Pembayaran"+total);
//    }
}
