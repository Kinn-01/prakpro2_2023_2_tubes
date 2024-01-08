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
    
    public int update(Registrasi registrasi) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "update masyarakat set nama = ?, alamat = ?, tanggal_lahir = ? where id = ?");

            statement.setString(1, registrasi.getNama());
            statement.setString(2, registrasi.getAlamat());
            statement.setString(3, registrasi.getTanggal_lahir());
            statement.setInt(4, registrasi.getId());

            result = statement.executeUpdate();

            
        } catch (SQLException e) {
            e.printStackTrace();
        }

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
    
    public int updatePassword(Registrasi registrasi) {
        // Variable result untuk menyimpan nilai dari eksekusi query apakah berhasil atau tidak
        int result = -1;

        // Try with resources untuk membuat koneksi ke database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // Membuat PreparedStatement untuk mengubah data di database
            PreparedStatement statement = connection.prepareStatement(
                    "update masyarakat set password = ? where nama = ?");

            // Set nilai dari parameter yang ada di query
            statement.setString(1, registrasi.getPassword());
            statement.setString(2, registrasi.getNama());

            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang diubah di database
            System.out.println("Reset Password : " + registrasi.getNama() + " " + registrasi.getPassword());

        } catch (SQLException e) {
            // Jika terjadi error, tampilkan error
            e.printStackTrace();
        }

        // Kembalikan nilai result
        return result;
    }
    
    public int delete(Registrasi registrasi) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("delete from masyarakat where id = ?");

            statement.setInt(1, registrasi.getId());

            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
    
    public List<Registrasi> findAll() {
        List<Registrasi> list = new ArrayList<>();

        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();) {

            try (ResultSet resultSet = statement.executeQuery("select * from masyarakat");) {

                while (resultSet.next()) {
                    Registrasi registrasi = new Registrasi();

                    registrasi.setNama(resultSet.getString("nama"));
                    registrasi.setEmail(resultSet.getString("email"));
                    registrasi.setAlamat(resultSet.getString("alamat"));
                    registrasi.setTanggal_lahir(resultSet.getString("tanggal_lahir"));

                    list.add(registrasi);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // mengembalikan nilai list
        return list;
    }
    
    public Registrasi select(String column, String value) {
        Registrasi registrasi = new Registrasi();

        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();) {
            try (ResultSet resultSet = statement
                    .executeQuery("select * from masyarakat where " + column + " = '" + value + "'");) {
                while (resultSet.next()) {
                    registrasi.setId(resultSet.getInt("id")); // id
                    registrasi.setNama(resultSet.getString("nama")); // nama
                    registrasi.setAlamat(resultSet.getString("alamat")); // alamat
                    registrasi.setTanggal_lahir(resultSet.getString("tanggal_lahir")); // no_telepon
                    
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return registrasi;
    }

//    public Registrasi select(String column, String value) {
//        Registrasi registrasi = new Registrasi();
//
//        try (
//                Connection connection = MySqlConnection.getInstance().getConnection();
//                Statement statement = connection.createStatement();) {
//            try (ResultSet resultSet = statement
//                    .executeQuery("select * from masyarakat where " + column + " = '" + value + "'");) {
//                while (resultSet.next()) {
//                    registrasi.setId(resultSet.getInt("id")); // id
//                    registrasi.setNama(resultSet.getString("nama")); // nama
//                    registrasi.setEmail(resultSet.getString("email"));
//                    registrasi.setAlamat(resultSet.getString("alamat")); // alamat
//                    registrasi.setTanggal_lahir(resultSet.getString("tangal_lahir")); // no_telepon
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return registrasi;
//    }
    
    
    
    
}
