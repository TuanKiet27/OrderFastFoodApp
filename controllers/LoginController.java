package controllers;

import java.util.Map;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.DatabaseConnection;

import java.sql.Connection;
public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;
    
    public void handleLogin() {
        Connection conn = DatabaseConnection.getConnection();
        if (conn != null) {
            System.out.println("Kết nối thành công!");
        } else {
            System.out.println("Kết nối thất bại!");
        }
    }

    public void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        Map<String, String> users = RegisterController.getUsers(); 

        if (users.containsKey(username) && users.get(username).equals(password)) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/Order.fxml"));
                Stage stage = (Stage) usernameField.getScene().getWindow();
                stage.setScene(new Scene(loader.load()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(AlertType.ERROR, "Invalid username or password!");
            alert.show();
        }
    }
    public void handleRegister(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/Register.fxml"));
            Stage stage = (Stage) usernameField.getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
