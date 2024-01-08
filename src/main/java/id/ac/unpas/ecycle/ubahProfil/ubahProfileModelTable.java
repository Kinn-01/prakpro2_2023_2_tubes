/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.ecycle.ubahProfil;

import id.ac.unpas.ecycle.registrasi.Registrasi;
import javax.swing.table.*;
import java.util.List;

/**
 *
 * @author Gilman Arief
 */
public class ubahProfileModelTable extends AbstractTableModel
{
    // Array columnNames untuk menyimpan nama-nama kolom
    private String[] columnNames = { "Nama", "Email", "Alamat", "Tanggal Lahir" };
    // Membuat List dengan nama data yang berisi Biodata untuk menyimpan data dari input
    private List<Registrasi> data;

    // Constructor ModelTable dengan parameter List<Biodata> data
    public ubahProfileModelTable(List<Registrasi> data) {
        // Set this.data dengan parameter data
        this.data = data;
    }

    // Fungsi untuk menambah jumlah kolom
    public int getColumnCount() {
        // Kembalikan panjang/ukuran dari array columnNames
        return columnNames.length;
    }

    // Fungsi untuk menambah jumlah baris
    public int getRowCount() {
        // Kembalikan jumlah data yang diterima/panjang dari ArrayList data
        return data.size();
    }

    // Fungsi untuk mendapatkan nama dari kolom yang dipilih dari parameter
    public String getColumnName(int col) {
        // Kembalikan elemen columnNames dengan index col
        return columnNames[col];
    }

    // Fungsi untuk mendapatkan nilai dari baris dan kolom tertentu
    public Object getValueAt(int row, int col) {
        // Menyimpan elemen dari List data dari baris yang dipilih ke Biodata rowItem
        Registrasi rowItem = data.get(row);
        // Membuat variable value untuk menyimpan nilai dari kolom yang dipilih
        String value = "";

        // Switch case untuk menentukan nilai dari variable value
        switch (col) {
            // Case Jika col bernilai 0
            case 0:
                // Set value dengan nama dari rowItem
                value = rowItem.getNama();
                break;
            // CaseJika col bernilai 1
            case 1:
                // Set value dengan Email dari rowItem
                value = rowItem.getEmail();
                break;
            // Case Jika col bernilai 2
            case 2:
                // Set value dengan Alamat dari rowItem
                value = rowItem.getAlamat();
                break;
            case 3:
                // set value dengan tanggal lahir dari rowItem
                value = rowItem.getTanggal_lahir();
                break;
        }
        // Kembalikan nilai value
        return value;
    }

    // Fungsi untuk mendapatkan nilai dari baris dan kolom tertentu
    public boolean isCellEditable(int row, int col) {
        // Kembalikan nilai false
        return false;
    }
    
    public void update(Registrasi value) {
        // Membuat variable i untuk menyimpan index dari data
        int i = 0;

        // Looping untuk mencari index dari data yang ingin diubah
        for (Registrasi b : data) {
            // Jika id dari data sama dengan id dari value
            if (b.getId() == value.getId()) {
                // Biodata tersebut menjadi value
                b = value;
                // Set List data ke-i dengan value
                data.set(i, value);
                // Mengubah nilai di table
                fireTableCellUpdated(data.size() - 1,
                        data.size() - 1);
            }
            // Increment i
            i++;
        }
    }
}
