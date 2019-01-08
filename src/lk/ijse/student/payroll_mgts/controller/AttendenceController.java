/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.student.payroll_mgts.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import lk.ijse.student.payroll_mgts.dao.DAOFactory;
import lk.ijse.student.payroll_mgts.dao.custom.AttendanceDAO;
import lk.ijse.student.payroll_mgts.dao.custom.EmployeeDAO;
import lk.ijse.student.payroll_mgts.entity.Attendance;
import lk.ijse.student.payroll_mgts.entity.Employee;

/**
 * FXML Controller class
 *
 * @author Kasun
 */
public class AttendenceController implements Initializable {

    @FXML
    private JFXTextField txtF_Name;
    @FXML
    private JFXTextField txtL_Name;
    @FXML
    private JFXTextField txtEmployeeID;
    @FXML
    private JFXTextField txtLevelID;
    @FXML
    private JFXTextField txtDate;
    @FXML
    private JFXTextField txtAttendanceID;
    @FXML
    private JFXTextField txtOverTime;
    @FXML
    private JFXTextField txtLateHours;
    @FXML
    private JFXTextField txtInTime;
    @FXML
    private JFXTextField txtOutTime;
    @FXML
    private JFXTextField txtPresentDays;
    @FXML
    private JFXTextField txtHalfLeaves;
    @FXML
    private JFXTextField txtNoPay;
    @FXML
    private JFXButton btnCancel;
    @FXML
    private JFXButton btnSave;
    @FXML
    private JFXButton btnNoPay;
    @FXML
    private JFXButton btnHalfLeave;
    @FXML
    private JFXButton btnUpdate;
    @FXML
    private JFXButton btnSearch;
    @FXML
    private JFXButton btnClearAll;
    private AttendanceDAO attendanceDAO;
    private EmployeeDAO employeeDAO;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            loadAttendanceDAO();
            loadEmployeeDAO();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AttendenceController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AttendenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    
    private void loadAttendanceDAO() throws ClassNotFoundException, SQLException{
        attendanceDAO=(AttendanceDAO)DAOFactory.getDAOFactory().getSuperDAO(DAOFactory.DAOFactTypes.ATTENDANCE);
    }
    private void loadEmployeeDAO() throws ClassNotFoundException, SQLException{
        employeeDAO=(EmployeeDAO)DAOFactory.getDAOFactory().getSuperDAO(DAOFactory.DAOFactTypes.EMPLOYEE);
    }
    
    @FXML
    private void txtEmployeeIDOnAction(ActionEvent event) {
    }

    @FXML
    private void btnCancelOnAction(ActionEvent event) {
    }

    private void searchEmployee(){
        try {
            String employeeID=txtEmployeeID.getText();
            Employee searchedEmployee = employeeDAO.search(employeeID);
            txtF_Name.setText(searchedEmployee.getFirstName());
            txtL_Name.setText(searchedEmployee.getLastName());
            txtLevelID.setText(searchedEmployee.getLevelID());
            txtDate.setText(searchedEmployee.getJoinDate());
        } catch (Exception ex) {
            Logger.getLogger(AttendenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void manageComponrnts(){
        txtF_Name.setDisable(true);
        txtL_Name.setDisable(true);
        txtLevelID.setDisable(true);
        txtDate.setDisable(true);
        txtPresentDays.setDisable(true);
        txtNoPay.setDisable(true);
        txtHalfLeaves.setDisable(true);
    }
    
    @FXML
    private void btnSaveOnActon(ActionEvent event) throws Exception {
        String attendenceID = txtAttendanceID.getText();
        String employeeID = txtEmployeeID.getText();
        String inTime = txtInTime.getText();
        String outTime = txtOutTime.getText();
        String currentDate = txtDate.getText();
        String overTime = txtOverTime.getText();
        String lateHours = txtLateHours.getText();
        //int halfLeaves = Integer.parseInt(txtHalfLeaves.getText());
        //int noPay = Integer.parseInt(txtNoPay.getText());
        int halfLeaves =200;
        int noPay=300;
        Attendance attendance=new Attendance(attendenceID, employeeID, inTime, outTime, currentDate, overTime, lateHours, halfLeaves, noPay);
        boolean isSaved = attendanceDAO.save(attendance);
        if(isSaved){
            Alert alert=new Alert(Alert.AlertType.INFORMATION, "Attendance Details Successfully Updated..",ButtonType.OK);
            alert.showAndWait();
        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR, "Attendance Details Added Unsuccessfully",ButtonType.OK);
            alert.showAndWait();
        }
    }

    @FXML
    private void btnNoPayOnActon(ActionEvent event) {
    }

    @FXML
    private void btnHalfLeaveOnAction(ActionEvent event) {
    }

    @FXML
    private void btnUpdateOnActon(ActionEvent event) {
    }

    @FXML
    private void btnSearchOnActon(ActionEvent event) {
    }

    @FXML
    private void btnClearAllOnActon(ActionEvent event) {
    }
    
}
