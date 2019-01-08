/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.student.payroll_mgts.dao;

import java.sql.SQLException;
import lk.ijse.student.payroll_mgts.dao.custom.impl.AttendanceDAOImpl;
import lk.ijse.student.payroll_mgts.dao.custom.impl.CalculateNetSalaryDAOImpl;
import lk.ijse.student.payroll_mgts.dao.custom.impl.EmployeeDAOImpl;

/**
 *
 * @author Kasun
 */
public class DAOFactory {
    public static DAOFactory daoFactory;

    public enum DAOFactTypes {
        EMPLOYEE,ATTENDANCE,NETSALARY;
    }

    public static DAOFactory getDAOFactory(){
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public SuperDAO getSuperDAO(DAOFactTypes types) throws ClassNotFoundException, SQLException {
        switch (types) {
            case EMPLOYEE:
                return new EmployeeDAOImpl();
            case ATTENDANCE:
                return new AttendanceDAOImpl();
            case NETSALARY:
                return new CalculateNetSalaryDAOImpl();
            default:
                return null;
        }
    }
}
