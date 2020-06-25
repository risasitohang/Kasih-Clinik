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

/**
 *
 * @author ITD
 */

public enum Perawatan {
    rawatJalan,
    rawatInap;
    
    void jenisPerawatan() {
        switch(this){
            case rawatJalan :
                System.out.println("Rawat Jalan dilakukan untuk mendiagnosa ataupun mengamati kesehatan pasien");
                break;
            case rawatInap :
                System.out.println("Rawat Inap yang mengharuskan opname untuk si pasien");
               break; 
        }
    }
}


