/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.ecycle.dao;

import id.ac.unpas.ecycle.db.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gilman Arief
 */
public class LoginDao {
    public static boolean validateUser(String username, String password) {
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            String query = "SELECT login FROM registrasi_masyarakat WHERE username = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean changePassword(String username, String oldPassword, String newPassword) {
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // Check if the old password is correct
            if (validateUser(username, oldPassword)) {
                // Update the password
                String updateQuery = "UPDATE login SET password = ? WHERE username = ?";
                try (PreparedStatement updateStatement = connection.prepareStatement(updateQuery)) {
                    updateStatement.setString(1, newPassword);
                    updateStatement.setString(2, username);
                    int rowsAffected = updateStatement.executeUpdate();
                    return rowsAffected > 0; // Check if the update was successful
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
