/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.student.payroll_mgts.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kasun
 */
public class DashboardController implements Initializable {

    @FXML
    private AnchorPane mainPain;
    @FXML
    private AnchorPane dashboardPain;

    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

   

    @FXML
    private void logout(MouseEvent event) {
        Stage stage  = (Stage) mainPain.getScene().getWindow();
         Alert a=new Alert(Alert.AlertType.INFORMATION, "Are you Sure, do you want LogOut in Payroll Management System?", ButtonType.YES);
         a.showAndWait();
         stage.close();
    }

    @FXML
    private void minimize(MouseEvent event) {
        Stage stage  = (Stage) mainPain.getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    private void manageReport(ActionEvent event) {
        
    }

    @FXML
    private void manageAttendens(ActionEvent event) {
        try {
            AnchorPane an=FXMLLoader.load(this.getClass().getResource("/lk/ijse/student/payroll_mgts/view/Attendence.fxml"));
            dashboardPain.getChildren().add(an);
        } catch (IOException ex) {
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void manageSalary(ActionEvent event) {
        try {
            AnchorPane an=FXMLLoader.load(this.getClass().getResource("/lk/ijse/student/payroll_mgts/view/Salary.fxml"));
            dashboardPain.getChildren().add(an);
        } catch (IOException ex) {
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void Setting(ActionEvent event) {
    }

    @FXML
    private void manageEmployee(ActionEvent event) {
        try {
            AnchorPane an=FXMLLoader.load(this.getClass().getResource("/lk/ijse/student/payroll_mgts/view/AddEmploy.fxml"));
            dashboardPain.getChildren().add(an);
        } catch (IOException ex) {
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
