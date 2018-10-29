/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan54.koordinat;

/**
 *Nama  : Brigita Julia Puspita Nai Goncalves
 *Kelas : PBO2
 *NIM   : 10117074
 *Deskripsi Program : program ini berisi program koordinat
 */
public class PBO210117074Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       WarnaKoordinat wk = new WarnaKoordinat ();
       wk.setNamaWarna("Jingga");
       wk.setX(10);
       wk.setY(4);
       System.out.println("Warna Koordinat "+wk.getNamaWarna());
       System.out.println("Kordinat Sumbu x : "+wk.getX()+", y : "+wk.getY());
    }
    
}
