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
public class Attendance {
    private String att_ID_PK;
    private String emp_ID_FK;
    private String in_Time;
    private String out_Time;
    private String dates;
    private String ot_Hours;
    private String late_Hours;
    private int half_Leave;
    private int noPay;

    public Attendance() {
    }

    public Attendance(String att_ID_PK, String emp_ID_FK, String in_Time, String out_Time, String dates, String ot_Hours, String late_Hours, int half_Leave, int noPay) {
        this.att_ID_PK = att_ID_PK;
        this.emp_ID_FK = emp_ID_FK;
        this.in_Time = in_Time;
        this.out_Time = out_Time;
        this.dates = dates;
        this.ot_Hours = ot_Hours;
        this.late_Hours = late_Hours;
        this.half_Leave = half_Leave;
        this.noPay = noPay;
    }

    /**
     * @return the att_ID_PK
     */
    public String getAtt_ID_PK() {
        return att_ID_PK;
    }

    /**
     * @param att_ID_PK the att_ID_PK to set
     */
    public void setAtt_ID_PK(String att_ID_PK) {
        this.att_ID_PK = att_ID_PK;
    }

    /**
     * @return the emp_ID_FK
     */
    public String getEmp_ID_FK() {
        return emp_ID_FK;
    }

    /**
     * @param emp_ID_FK the emp_ID_FK to set
     */
    public void setEmp_ID_FK(String emp_ID_FK) {
        this.emp_ID_FK = emp_ID_FK;
    }

    /**
     * @return the in_Time
     */
    public String getIn_Time() {
        return in_Time;
    }

    /**
     * @param in_Time the in_Time to set
     */
    public void setIn_Time(String in_Time) {
        this.in_Time = in_Time;
    }

    /**
     * @return the out_Time
     */
    public String getOut_Time() {
        return out_Time;
    }

    /**
     * @param out_Time the out_Time to set
     */
    public void setOut_Time(String out_Time) {
        this.out_Time = out_Time;
    }

    /**
     * @return the dates
     */
    public String getDates() {
        return dates;
    }

    /**
     * @param dates the dates to set
     */
    public void setDates(String dates) {
        this.dates = dates;
    }

    /**
     * @return the ot_Hours
     */
    public String getOt_Hours() {
        return ot_Hours;
    }

    /**
     * @param ot_Hours the ot_Hours to set
     */
    public void setOt_Hours(String ot_Hours) {
        this.ot_Hours = ot_Hours;
    }

    /**
     * @return the late_Hours
     */
    public String getLate_Hours() {
        return late_Hours;
    }

    /**
     * @param late_Hours the late_Hours to set
     */
    public void setLate_Hours(String late_Hours) {
        this.late_Hours = late_Hours;
    }

    /**
     * @return the half_Leave
     */
    public int getHalf_Leave() {
        return half_Leave;
    }

    /**
     * @param half_Leave the half_Leave to set
     */
    public void setHalf_Leave(int half_Leave) {
        this.half_Leave = half_Leave;
    }

    /**
     * @return the noPay
     */
    public int getNoPay() {
        return noPay;
    }

    /**
     * @param noPay the noPay to set
     */
    public void setNoPay(int noPay) {
        this.noPay = noPay;
    }
    
    
    
}
