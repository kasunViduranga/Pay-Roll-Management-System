/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.student.payroll_mgts.dao.custom.impl;

import java.util.ArrayList;
import lk.ijse.student.payroll_mgts.dao.CrudUtil;
import lk.ijse.student.payroll_mgts.dao.custom.CalculateNetSalaryDAO;
import lk.ijse.student.payroll_mgts.entity.NetSalary;

/**
 *
 * @author Kasun
 */
public class CalculateNetSalaryDAOImpl implements CalculateNetSalaryDAO{

    @Override
    public boolean save(NetSalary entity) throws Exception {
        String sql="call AddNetSalary(?,?,?,?,?,?,?,?,?,?,?)";
        return CrudUtil.executeUpdate(sql,2,entity.getCurr_Month(),entity.getBasic_Salary(),entity.getOT(),entity.getETF(),entity.getEPF(),entity.getNoPay(),entity.getAttendance(),entity.getMedical(),entity.getFood(),entity.getTransport());
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(NetSalary entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NetSalary search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<NetSalary> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
