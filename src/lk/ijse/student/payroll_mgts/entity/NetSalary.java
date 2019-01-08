/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.student.payroll_mgts.entity;

/**
 *
 * @author Kasun
 */
public class NetSalary {
    private int NetSalary_ID;
    private String Curr_Month;
    private double Basic_Salary;
    private double OT;
    private double ETF;
    private double EPF;
    private double NoPay;
    private double Attendance;
    private double Medical;
    private double Food;
    private double Transport;

    public NetSalary() {
    }

    public NetSalary(int NetSalary_ID, String Curr_Month, double Basic_Salary, double OT, double ETF, double EPF, double NoPay, double Attendance, double Medical, double Food, double Transport) {
        this.NetSalary_ID = NetSalary_ID;
        this.Curr_Month = Curr_Month;
        this.Basic_Salary = Basic_Salary;
        this.OT = OT;
        this.ETF = ETF;
        this.EPF = EPF;
        this.NoPay = NoPay;
        this.Attendance = Attendance;
        this.Medical = Medical;
        this.Food = Food;
        this.Transport = Transport;
    }

    /**
     * @return the NetSalary_ID
     */
    public int getNetSalary_ID() {
        return NetSalary_ID;
    }

    /**
     * @param NetSalary_ID the NetSalary_ID to set
     */
    public void setNetSalary_ID(int NetSalary_ID) {
        this.NetSalary_ID = NetSalary_ID;
    }

    /**
     * @return the Curr_Month
     */
    public String getCurr_Month() {
        return Curr_Month;
    }

    /**
     * @param Curr_Month the Curr_Month to set
     */
    public void setCurr_Month(String Curr_Month) {
        this.Curr_Month = Curr_Month;
    }

    /**
     * @return the Basic_Salary
     */
    public double getBasic_Salary() {
        return Basic_Salary;
    }

    /**
     * @param Basic_Salary the Basic_Salary to set
     */
    public void setBasic_Salary(double Basic_Salary) {
        this.Basic_Salary = Basic_Salary;
    }

    /**
     * @return the OT
     */
    public double getOT() {
        return OT;
    }

    /**
     * @param OT the OT to set
     */
    public void setOT(double OT) {
        this.OT = OT;
    }

    /**
     * @return the ETF
     */
    public double getETF() {
        return ETF;
    }

    /**
     * @param ETF the ETF to set
     */
    public void setETF(double ETF) {
        this.ETF = ETF;
    }

    /**
     * @return the EPF
     */
    public double getEPF() {
        return EPF;
    }

    /**
     * @param EPF the EPF to set
     */
    public void setEPF(double EPF) {
        this.EPF = EPF;
    }

    /**
     * @return the NoPay
     */
    public double getNoPay() {
        return NoPay;
    }

    /**
     * @param NoPay the NoPay to set
     */
    public void setNoPay(double NoPay) {
        this.NoPay = NoPay;
    }

    /**
     * @return the Attendance
     */
    public double getAttendance() {
        return Attendance;
    }

    /**
     * @param Attendance the Attendance to set
     */
    public void setAttendance(double Attendance) {
        this.Attendance = Attendance;
    }

    /**
     * @return the Medical
     */
    public double getMedical() {
        return Medical;
    }

    /**
     * @param Medical the Medical to set
     */
    public void setMedical(double Medical) {
        this.Medical = Medical;
    }

    /**
     * @return the Food
     */
    public double getFood() {
        return Food;
    }

    /**
     * @param Food the Food to set
     */
    public void setFood(double Food) {
        this.Food = Food;
    }

    /**
     * @return the Transport
     */
    public double getTransport() {
        return Transport;
    }

    /**
     * @param Transport the Transport to set
     */
    public void setTransport(double Transport) {
        this.Transport = Transport;
    }
    
    
}
