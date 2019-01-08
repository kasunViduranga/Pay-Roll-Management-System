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
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import lk.ijse.student.payroll_mgts.dao.DAOFactory;
import lk.ijse.student.payroll_mgts.dao.custom.EmployeeDAO;
import lk.ijse.student.payroll_mgts.entity.Employee;

/**
 * FXML Controller class
 *
 * @author Kasun
 */
public class AddEmployController implements Initializable {

    @FXML
    private JFXTextField txtNICNO;
    @FXML
    private JFXTextField txtF_Name;
    @FXML
    private JFXTextField txtAddress;
    @FXML
    private JFXTextField txtSalary;
    @FXML
    private JFXTextField txtMobileNo;
    @FXML
    private JFXTextField txtL_Name;
    @FXML
    private JFXTextField txtSearchEmployeeID;
    @FXML
    private JFXTextField txtLevelID;
    @FXML
    private JFXTextField txtDOB;
    @FXML
    private JFXTextField txtMedicalAllowences;
    @FXML
    private JFXTextField txtPosition;
    @FXML
    private JFXTextField txtBasicSalary;
    @FXML
    private JFXTextField txtRegisteredDate;
    @FXML
    private TableView<Employee> employeeTableView;
    @FXML
    private JFXButton btnDeleteEmployee;
    @FXML
    private JFXButton btnSaveEmployee;
    @FXML
    private JFXButton btnUpdateEmployee;
    @FXML
    private JFXButton EmployeeSearch;
    @FXML
    private JFXButton btnClearAll;
    
    private EmployeeDAO employeeDAO;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    private void manageComponrnts(){
        txtF_Name.setDisable(true);
        txtL_Name.setDisable(true);
        txtLevelID.setDisable(true);
        txtDOB.setDisable(true);
        txtSearchEmployeeID.setDisable(true);
    }
    private void loadEmployeeDAO() throws ClassNotFoundException, SQLException{
        employeeDAO=(EmployeeDAO)DAOFactory.getDAOFactory().getSuperDAO(DAOFactory.DAOFactTypes.EMPLOYEE);
    }

    private void loadEmployees() throws Exception{
        employeeTableView.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("Emp_ID"));
        employeeTableView.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("EmpF_Name"));
        employeeTableView.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("EmpL_Name"));
        employeeTableView.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("Level_ID"));
        employeeTableView.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("NIC_NO"));
        employeeTableView.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("Emp_Address"));
        employeeTableView.getColumns().get(6).setCellValueFactory(new PropertyValueFactory<>("Emp_DOB"));
        employeeTableView.getColumns().get(7).setCellValueFactory(new PropertyValueFactory<>("Basic_Salary"));
        employeeTableView.getColumns().get(8).setCellValueFactory(new PropertyValueFactory<>("Emp_ContactNo"));
        employeeTableView.getColumns().get(9).setCellValueFactory(new PropertyValueFactory<>("Dates")); 
    }
    
    @FXML
    private void btnClearAllClicked(MouseEvent event) {
        claerAll();
    }
    private void claerAll(){
        txtSearchEmployeeID.clear();
        txtF_Name.clear();
        txtL_Name.clear();
        txtLevelID.clear();
        txtDOB.clear();
        txtNICNO.clear();
        txtAddress.clear();
        txtSalary.clear();
        txtMobileNo.clear();
        txtPosition.clear();
        txtMedicalAllowences.clear();
    }
    @FXML
    private void btnSaveEmployeeClicked(MouseEvent event) throws Exception{
        
            saveEmployee();
        
    }
    private void saveEmployee() throws Exception{
        String employeeID=txtSearchEmployeeID.getText();
        String f_Name=txtF_Name.getText();
        String l_Name=txtL_Name.getText();
        String l_ID=txtLevelID.getText();
        String dob=txtDOB.getText();
        String nicNo=txtNICNO.getText();
        String address=txtAddress.getText();
        double salary=Double.parseDouble(txtSalary.getText());
        String mobileNo=txtMobileNo.getText();
        boolean isNotSaved = employeeDAO.save(new Employee(employeeID, f_Name, l_Name, l_ID, dob, nicNo,address, salary, mobileNo,new Date().toString()));
        if(isNotSaved){
            Alert alert=new Alert(Alert.AlertType.ERROR, "Employee Details Added Unsuccessfully",ButtonType.OK);
            alert.showAndWait();
        }else{
            claerAll();
            Alert alert=new Alert(Alert.AlertType.INFORMATION, "Employee Details Successfully Updated..",ButtonType.OK);
            alert.showAndWait();
        }
    }
    @FXML
    private void btnUpdateEmployeeClicked(MouseEvent event) throws Exception {
        String employeeID=txtSearchEmployeeID.getText();
        String f_Name=txtF_Name.getText();
        String l_Name=txtL_Name.getText();
        String l_ID=txtLevelID.getText();
        String dob=txtDOB.getText();
        String nicNo=txtNICNO.getText();
        String address=txtAddress.getText();
        double salary=Double.parseDouble(txtSalary.getText());
        String mobileNo=txtMobileNo.getText();
        boolean isUpdated = employeeDAO.update(new Employee(employeeID, f_Name, l_Name, l_ID, dob, nicNo, address, salary, mobileNo,new Date().toString()));
        if(isUpdated){
            Alert alert=new Alert(Alert.AlertType.INFORMATION, "Employee Details Successfully Updated..",ButtonType.OK);
            alert.showAndWait();
        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR, "Employee Details Updated Unsuccessfully",ButtonType.OK);
            alert.showAndWait();
        }
    }

    @FXML
    private void btnDeleteEmployeeClicked(MouseEvent event) throws Exception {
        String employeeID=txtSearchEmployeeID.getText();
        boolean delete = employeeDAO.delete(employeeID);
        if(delete){
            Alert alert=new Alert(Alert.AlertType.INFORMATION, "Employee Details Successfully Deleted..",ButtonType.OK);
            alert.showAndWait();
        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR, "Employee Details Deleted Unsuccessfully",ButtonType.OK);
            alert.showAndWait();
        }
    }

    @FXML
    private void EmployeeSearchClicked(ActionEvent event) throws Exception {
        String employeeID=txtSearchEmployeeID.getText();
        Employee searchedEmployee = employeeDAO.search(employeeID);
        txtF_Name.setText(searchedEmployee.getFirstName());
        txtL_Name.setText(searchedEmployee.getLastName());
        txtLevelID.setText(searchedEmployee.getLevelID());
        txtDOB.setText(searchedEmployee.getDob());
        txtNICNO.setText(searchedEmployee.getNicNo());
        txtAddress.setText(searchedEmployee.getAddress());
        txtSalary.setText(Double.toString(searchedEmployee.getSalary()));
        txtMobileNo.setText(searchedEmployee.getMobileNo());
    }

    @FXML
    private void txtNICNOOnAction(ActionEvent event) {
        txtAddress.requestFocus();
    }

    @FXML
    private void txtF_NameOnAction(ActionEvent event) {
        txtL_Name.requestFocus();
    }

    @FXML
    private void txtAddressOnAction(ActionEvent event) {
        txtSalary.requestFocus();
    }

    @FXML
    private void txtSalaryOnAction(ActionEvent event) {
        txtMobileNo.requestFocus();
    }

    @FXML
    private void txtMobileNoOnAction(ActionEvent event) {
        txtPosition.requestFocus();
    }

    @FXML
    private void txtL_NameOnAction(ActionEvent event) {
        txtLevelID.requestFocus();
    }

    @FXML
    private void txtSearchEmployeeIDOnAction(ActionEvent event) {
        txtF_Name.requestFocus();
    }

    @FXML
    private void txtLevelIDOnAction(ActionEvent event) {
        txtDOB.requestFocus();
    }

    @FXML
    private void txtDOBOnAction(ActionEvent event) {
        txtNICNO.requestFocus();
    }

    private void txtBasicSalaryOnAction(ActionEvent event) {
        txtMobileNo.requestFocus();
    }

    @FXML
    private void txtMedicalAllowencesOnAction(ActionEvent event) throws Exception {
        saveEmployee();
    }

    @FXML
    private void txtPositionOnAction(ActionEvent event) {
        txtMedicalAllowences.requestFocus();
    }
}
