/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author ASUS
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobilFarel = new Mobil();
        
        mobilFarel.warna = "Hitam";
        mobilFarel.tahunProduksi = 1999;
        
        System.out.println("Warna: " + mobilFarel.warna);
        System.out.println("Tahun Produksi: " + mobilFarel.tahunProduksi);
    }
    
}
