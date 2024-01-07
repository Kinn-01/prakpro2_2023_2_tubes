/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.ecycle.dao;

import id.ac.unpas.ecycle.db.MySqlConnection;
import id.ac.unpas.ecycle.login.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import id.ac.unpas.ecycle.registrasi.Registrasi;
/**
 *
 * @author Gilman Arief
 */
public class RegistrasiDao {
    
    public int insert(Registrasi registrasi) {
        // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi query berhasil dilakukan atau tidak
        int result = -1;

        // try with resources digunakan untuk mengambil koneksi dari database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
            PreparedStatement statement = connection.prepareStatement("Insert into masyarakat(id, nama, email, alamat, tanggal_lahir, password) values (?, ?, ?, ?, ?, ?)");

            // statement.setString digunakan untuk mengisi parameter query dengan nilai dari parameter jenisMember
            statement.setInt(1, 0);
            statement.setString(2, registrasi.getNama());
            statement.setString(3, registrasi.getEmail());
            statement.setString(4, registrasi.getAlamat());
            statement.setString(5, registrasi.getTanggal_lahir());
            statement.setString(6, registrasi.getPassword());

            // result diberikan nilai dari eksekusi query (Berisi jumlah row dari statement berarti berhasil, Berisi 0 berarti gagal)
            result = statement.executeUpdate();
        } catch (SQLException e) {
            // jika terjadi error, maka akan ditampilkan errornya
            e.printStackTrace();
        }

        // mengembalikan nilai result
        return result;
    }
    
    public boolean show(Registrasi registrasi) {
    // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi query berhasil dilakukan atau tidak
    boolean result = false;

    // try with resources digunakan untuk mengambil koneksi dari database
    try (Connection connection = MySqlConnection.getInstance().getConnection()) {
        // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM masyarakat WHERE nama=? AND password=?");

        // statement.setString digunakan untuk mengisi parameter query dengan nilai dari parameter jenisMember
        statement.setString(1, registrasi.getNama());
        statement.setString(2, registrasi.getPassword());

        // ResultSet digunakan untuk menyimpan hasil query SELECT
        ResultSet resultSet = statement.executeQuery();

        // Jika resultSet memiliki hasil (baris data), set result ke true
        if (resultSet.next()) {
            result = true;
        }
    } catch (SQLException e) {
        // jika terjadi error, maka akan ditampilkan errornya
        e.printStackTrace();
    }

    // mengembalikan nilai result
    return result;
}

    
    
}
