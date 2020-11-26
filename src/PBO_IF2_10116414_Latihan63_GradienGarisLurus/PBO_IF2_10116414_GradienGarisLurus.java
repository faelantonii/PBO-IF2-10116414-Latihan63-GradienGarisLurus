/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan63_GradienGarisLurus;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan gradien garis lurus
 */
public class PBO_IF2_10116414_GradienGarisLurus {
    public static void main(String[] args) {
        Koordinat koordinat1 = new Koordinat(2, 10, 5, 7);
        Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);
        
        System.out.println("Garis yang melalui titik (2,10) dan (5,7) "
            + "memiliki gradien sebesar " + koordinat1.hitungGradien());
        System.out.println("Garis yang melalui titik (5,1) dan (3,12) "
            + "memiliki gradien sebesar " + koordinat2.hitungGradien());
    }
}
