/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

import java.awt.Component;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author ASUS
 * NAMA: Muhammad Putra Ramadhan
 * NPM: 2410010262
 */
public class BarangTableModel extends AbstractTableModel {

    private static final String[] KOLOM = {"Nama Barang", "Kategori", "Harga", "Jumlah", "Sub Total"};
    private static final int minimalDiskon = 100_000;
    private static final int persenDiskon = 10;


    private final List<Barang> daftar = new ArrayList<>();

    public static String formatRupiah(long nilai) {
        return "Rp" + String.format("%,d", nilai).replace(',', '.');
    }

    @Override
    public int getRowCount() {
        return daftar.size();
    }

    @Override
    public int getColumnCount() {
        return KOLOM.length;
    }

    @Override
    public String getColumnName(int kolom) {
        return KOLOM[kolom];
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        Barang b = daftar.get(baris);
        return switch (kolom) {
            case 0 -> b.namaBarang();
            case 1 -> b.kategori();
            case 2 -> formatRupiah(b.harga());
            case 3 -> b.jumlah();
            case 4 -> formatRupiah(hitungSubTotal(b.harga(), b.jumlah()));
            default -> b.kategori();
        };
    }

    public Barang get(int baris) {
        return daftar.get(baris);
    }

    public void tambah(Barang barang) {
        daftar.add(barang);
        int baris = daftar.size() - 1;
        fireTableRowsInserted(baris, baris);
    }

    public void ubah(int baris, Barang barang) {
        daftar.set(baris, barang);
        fireTableRowsUpdated(baris, baris);
    }

    public void hapus(int baris) {
        daftar.remove(baris);
        fireTableRowsDeleted(baris, baris);
    }

    public static long hitungSubTotal(int harga, int jumlah) {
        return (long) harga * jumlah;
    }

    public long getTotal() {
        long total = 0;
        for (Barang b : daftar) {
            total += hitungSubTotal(b.harga(), b.jumlah());
        }
        return total;
    }

    public long getDiskon() {
        long total = getTotal();
        // pembagian long membulatkan ke bawah (nilai tidak negatif)
        return total >= minimalDiskon ? total * persenDiskon / 100 : 0;
    }

    public long getBayar() {
        return getTotal() - getDiskon();
    }

}
