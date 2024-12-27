package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RegisterController {

    private static Map<String, String> users = new HashMap<>(); // Lưu trữ username và password

    @FXML
    private TextField newUsernameField;

    @FXML
    private PasswordField newPasswordField;

    // Phương thức để quay lại màn hình đăng nhập
    public void handleBackToLogin(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/Login.fxml"));
            Parent root = loader.load();

            // Lấy Stage hiện tại
            javafx.stage.Stage stage = (javafx.stage.Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

            // Thay đổi scene sang giao diện đăng nhập
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            Alert alert = new Alert(AlertType.ERROR, "Error loading Login screen.");
            alert.show();
        }
    }

    // Phương thức để xử lý việc đăng ký
    public void handleSubmit() {
        String newUsername = newUsernameField.getText();
        String newPassword = newPasswordField.getText();

        if (!newUsername.isEmpty() && !newPassword.isEmpty()) {
            if (users.containsKey(newUsername)) {
                Alert alert = new Alert(AlertType.ERROR, "Username already exists!");
                alert.show();
            } else {
                users.put(newUsername, newPassword); // Lưu thông tin đăng ký

                // Tạo thông báo thành công
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Registration Successful");
                alert.setHeaderText("User registered successfully!");

                // Thêm nút "Back to Login" vào thông báo
                javafx.scene.control.ButtonType backToLoginButton = new javafx.scene.control.ButtonType("Back to Login");
                alert.getButtonTypes().setAll(backToLoginButton, javafx.scene.control.ButtonType.CLOSE);

                // Xử lý sự kiện khi chọn "Back to Login"
                alert.showAndWait().ifPresent(response -> {
                    if (response == backToLoginButton) {
                        try {
                            // Chuyển đến màn hình đăng nhập
                            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/Login.fxml"));
                            Parent root = loader.load();

                            // Lấy Stage hiện tại
                            javafx.stage.Stage stage = (javafx.stage.Stage) newUsernameField.getScene().getWindow();

                            // Thay đổi scene
                            stage.setScene(new Scene(root));
                            stage.show();
                        } catch (IOException e) {
                            e.printStackTrace();
                            Alert errorAlert = new Alert(AlertType.ERROR, "Error loading Login screen.");
                            errorAlert.show();
                        }
                    }
                });
            }
        } else {
            Alert alert = new Alert(AlertType.ERROR, "Please fill in all fields.");
            alert.show();
        }
    }

    // Getter cho danh sách người dùng đã đăng ký
    public static Map<String, String> getUsers() {
        return users;
    }
}
