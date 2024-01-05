package id.ac.unpas.ecycle.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gilman Arief
 */
public class MySqlConnection {
    // Informasi koneksi database (URL, username, dan password)
    private final String DB_URL = "jdbc:mysql://localhost/registrasi_masyarakat";
    private final String DB_USER = "root";
    private final String DB_PASS = "";
    
    // Objek instance dari kelas MySqlConnection
    public static MySqlConnection instance;
    
    // Metode untuk mendapatkan instance dari MySqlConnection (Singleton pattern)
    public static MySqlConnection getInstance() {
        // Jika instance belum ada, buat satu
        if (instance == null) {
            instance = new MySqlConnection();
        }
        // Mengembalikan instance yang sudah ada atau baru dibuat
        return instance;
    }
    
    // Metode untuk mendapatkan objek koneksi ke database
    public Connection getConnection() {
        Connection connection = null;
        try {
            // Mengatur driver JDBC untuk MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Membuat koneksi ke database menggunakan informasi yang telah diset
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (Exception e) {
            // Menangani exception dengan mencetak stack trace
            e.printStackTrace();
        }
        // Mengembalikan objek koneksi
        return connection;
    }
}
