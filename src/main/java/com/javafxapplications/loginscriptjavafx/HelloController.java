package com.javafxapplications.loginscriptjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private Button loginButton;
    @FXML
    private CheckBox rememberPasswordCheckbox;

    private String username = "username";
    private String password = "password";

    @FXML
    protected void clearFields(){
        usernameTextField.clear();
        passwordTextField.clear();
    }

    @FXML
    protected void setLoginButton(){
        loginButton.setDisable(usernameTextField.getText().isEmpty() || passwordTextField.getText().isEmpty());
    }

    @FXML
    protected void loginClicked() {
        if (usernameTextField.getText().equalsIgnoreCase(username) && passwordTextField.getText().equalsIgnoreCase(password)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login Successful");
            alert.setHeaderText("Login Successful");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login Unsuccessful");
            alert.setHeaderText("Login Unsuccessful");
            alert.showAndWait();
        }
        clearFields();
    }

    @FXML
    protected void cancelClicked(){
        System.exit(0);
    }
}