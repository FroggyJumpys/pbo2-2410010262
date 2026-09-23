/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p01;

/**
 *
 * @author ASUS
 */
public class KartuMahasiswa {
    public String nama = "Muhammad Putra Ramadhan";
    public String npm = "2410010262";
    public String prodi = "Teknik Informatika";
    public int semester = 5;
    public String alasan = "Karena hobby coding mulai dari SMP. maka meneruskan ke kuliah.";
    
    public KartuMahasiswa() {};
    
    public void tampilkanKartu() {
        System.out.println("=================================");
        System.out.println("KARTU MAHASISWA PBO 2");
        System.out.println("=================================");
        System.out.println("Nama        : " + nama);
        System.out.println("NPM         :" + npm);
        System.out.println("Prodi       :" + prodi);
        System.out.println("Semester    :" + semester);
        System.out.println("Alasan      :" + alasan);
        System.out.println("=================================");
    }
    
}
