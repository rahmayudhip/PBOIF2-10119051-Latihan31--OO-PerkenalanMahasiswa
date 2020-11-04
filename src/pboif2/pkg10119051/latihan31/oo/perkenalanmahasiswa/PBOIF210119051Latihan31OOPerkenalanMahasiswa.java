/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan31.oo.perkenalanmahasiswa;



/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program perkenalan mahasiswa
 */

import data.Mahasiswa;

public class PBOIF210119051Latihan31OOPerkenalanMahasiswa {
   
    public static void perkenalandiri(){
       Mahasiswa mahasiswa1 = new Mahasiswa();
       mahasiswa1.nim = "10119051";
       mahasiswa1.nama = "Rahmayudhi Prakoso";
       mahasiswa1.perkenalanDiri();
       
       Mahasiswa mahasiswa2 = new Mahasiswa();
       mahasiswa2.nim = "10110270";
       mahasiswa2.nama = "Indra Tiola";
       mahasiswa1.perkenalanDiri();
       
       Mahasiswa mahasiswa3 = new Mahasiswa();
       mahasiswa3.nim = "10110271";
       mahasiswa3.nama = "Robi Tanzil Ganefi";
       mahasiswa1.perkenalanDiri();
       
       Mahasiswa mahasiswa4 = new Mahasiswa();
       mahasiswa4.nim = "1011069";
       mahasiswa4.nama = "Muhammad Nur Awaludin";
       mahasiswa1.perkenalanDiri();
       
       
    }
    
      public static void main(String[] args) {
       perkenalandiri();
    }

}
    

