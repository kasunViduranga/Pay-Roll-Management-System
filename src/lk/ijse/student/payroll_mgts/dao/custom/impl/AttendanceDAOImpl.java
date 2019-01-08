/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.student.payroll_mgts.dao.custom.impl;

import java.util.ArrayList;
import lk.ijse.student.payroll_mgts.dao.CrudUtil;
import lk.ijse.student.payroll_mgts.dao.custom.AttendanceDAO;
import lk.ijse.student.payroll_mgts.entity.Attendance;

/**
 *
 * @author Kasun
 */
public class AttendanceDAOImpl implements AttendanceDAO{

    @Override
    public boolean save(Attendance entity) throws Exception {
        String sql="call MarkAttendance(?,?,?,?,?,?,?,?,?)";
        return CrudUtil.executeUpdate(sql,entity.getAtt_ID_PK(),entity.getEmp_ID_FK(),entity.getIn_Time(),entity.getOut_Time(),entity.getDates(),entity.getOt_Hours() ,entity.getLate_Hours(),entity.getHalf_Leave(),entity.getNoPay());
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Attendance entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Attendance search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Attendance> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
