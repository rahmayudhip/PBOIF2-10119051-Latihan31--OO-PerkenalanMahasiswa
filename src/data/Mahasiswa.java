/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author RYP
 */
public class Mahasiswa {
    public String nim;
    public String nama;
    
    public void perkenalanDiri(){
        System.out.println("Hello Everyone");
        System.out.println("My NIM is" + this.nim);
        System.out.println("My Name is " + this.nama);
        System.out.println("");
    }
}
