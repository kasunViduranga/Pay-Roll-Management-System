/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.student.payroll_mgts.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.student.payroll_mgts.dao.CrudUtil;
import lk.ijse.student.payroll_mgts.dao.custom.EmployeeDAO;
import lk.ijse.student.payroll_mgts.entity.Employee;

/**
 *
 * @author Kasun
 */
public class EmployeeDAOImpl implements EmployeeDAO{

    @Override
    public boolean save(Employee entity) throws Exception {
        String sql="call EmployeeProsedure(?,?,?,?,?,?,?,?,?,?)";
        return CrudUtil.executeUpdate(sql,entity.getEmpID_PK(),entity.getFirstName(),entity.getLastName(),entity.getLevelID(),entity.getNicNo(),entity.getAddress(),entity.getDob(),entity.getSalary(),entity.getMobileNo(),entity.getJoinDate());
    }

    @Override
    public boolean delete(String emp_ID) throws Exception {
        String sql="call DeleteEmployee(?)";
        return CrudUtil.executeUpdate(sql,emp_ID);
    }

    @Override
    public boolean update(Employee entity) throws Exception {
        String sql="call UpdateEmployee(?,?,?,?,?,?,?,?,?,?)";
        return CrudUtil.executeUpdate(sql,entity.getEmpID_PK(),entity.getFirstName(),entity.getLastName(),entity.getLevelID(),entity.getNicNo(),entity.getAddress(),entity.getDob(),entity.getSalary(),entity.getMobileNo(),entity.getJoinDate());
    }

    @Override
    public Employee search(String emp_ID) throws Exception {
        String sql="call SearchEmployee(?)";
        ResultSet search = CrudUtil.executeQuery(sql,emp_ID);
        Employee employee = null;
        if(search.next()){
            employee = new Employee(search.getString(1),search.getString(2),search.getString(3),search.getString(4),search.getString(5),search.getString(6),search.getString(7),search.getDouble(8),search.getString(9),search.getString(10));
        }
        return employee;
    }

    @Override
    public ArrayList<Employee> getAll() throws Exception {
        ArrayList<Employee> getAllList=new ArrayList<>();
        String sql="call GetAllEmployees()";
        ResultSet allCustomers = CrudUtil.executeQuery(sql);
        while(allCustomers.next()){
            getAllList.add(new Employee(allCustomers.getString(1),allCustomers.getString(2),allCustomers.getString(3),allCustomers.getString(4),allCustomers.getString(5),allCustomers.getString(6),allCustomers.getString(7),allCustomers.getDouble(8),allCustomers.getString(9),allCustomers.getString(10)));
        }
        return getAllList;
    }

    
    
}
