/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

/**
 *
 * @author ASUS
 * NAMA: Muhammad Putra Ramadhan
 * NPM: 2410010262
 */
public enum Kategori {
    LAINNYA("Lainnya"),
    ALAT("Alat Tulis");

    private final String label;

    Kategori(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
