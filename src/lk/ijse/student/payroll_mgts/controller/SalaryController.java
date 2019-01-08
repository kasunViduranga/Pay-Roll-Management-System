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
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import lk.ijse.student.payroll_mgts.dao.DAOFactory;
import lk.ijse.student.payroll_mgts.dao.custom.CalculateNetSalaryDAO;
import lk.ijse.student.payroll_mgts.dao.custom.EmployeeDAO;

/**
 * FXML Controller class
 *
 * @author Kasun
 */
public class SalaryController implements Initializable {

    @FXML
    private JFXTextField txtAttendance;
    @FXML
    private JFXTextField txtFood;
    @FXML
    private JFXTextField txtMedical;
    @FXML
    private JFXTextField txtTransport;
    @FXML
    private JFXTextField txtBasicSalary;
    @FXML
    private JFXTextField txtOT;
    @FXML
    private JFXTextField txtEPF;
    @FXML
    private JFXTextField txtTotalAllowences;
    @FXML
    private JFXTextField txtNoPay;
    @FXML
    private JFXTextField txtEtf;
    @FXML
    private JFXTextField txtSalaryAdvanced;
    @FXML
    private JFXTextField txtTotalDeductives;
    @FXML
    private JFXTextField txtNetSalary;
    @FXML
    private JFXButton btnCalculateNetSalary;
    
    private JFXTextField txtSearchEmployee;
    private CalculateNetSalaryDAO calculateNetSalary;
    private EmployeeDAO employeeDAO;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            loadEmployeeDAO();
            loadCalculateNetSalary();
            int month = new Date().getMonth();
            System.out.println(month);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalaryController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalaryController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(SalaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    private void loadCalculateNetSalary() throws ClassNotFoundException, SQLException{
        calculateNetSalary=(CalculateNetSalaryDAO)DAOFactory.getDAOFactory().getSuperDAO(DAOFactory.DAOFactTypes.NETSALARY);
        
    }
    private void loadEmployeeDAO() throws Exception{
        employeeDAO=(EmployeeDAO)DAOFactory.getDAOFactory().getSuperDAO(DAOFactory.DAOFactTypes.EMPLOYEE);
    }
    
    @FXML
    private void onActionId(ActionEvent event) {
    }

    @FXML
    private void btnCalculateNetSalaryOnAction(ActionEvent event) {
    }
}
