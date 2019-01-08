/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.student.payroll_mgts.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Kasun
 */
public class LoginController implements Initializable {

    @FXML
    private JFXTextField txtUserName;
    @FXML
    private JFXPasswordField txtPassword;
    @FXML
    private JFXButton btnNewUser;
    @FXML
    private AnchorPane mainPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void isLogIn(MouseEvent event) throws IOException {
        Parent root= FXMLLoader.load(this.getClass().getResource("/lk/ijse/student/payroll_mgts/view/Dashboard.fxml"));
        Scene tempScence= new Scene(root);
        Stage stage= (Stage) this.mainPane.getScene().getWindow();
        stage.setScene(tempScence);
        stage.centerOnScreen();
            
        TranslateTransition tempTranslate = new TranslateTransition(Duration.millis(600), root);
        tempTranslate.setFromY(-tempScence.getWidth());
        tempTranslate.setToY(0);
        tempTranslate.play();
    }

    @FXML
    private void cancel(MouseEvent event) {
        Stage stage= (Stage) this.mainPane.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void isnewUser(MouseEvent event) {
    }
    
}
