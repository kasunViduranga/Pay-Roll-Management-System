/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.student.payroll_mgts.model;

/**
 *
 * @author Kasun
 */
public class EmployeeDTO {
    private String empID_PK;
    private String firstName;
    private String lastName;
    private String levelID;
    private String dob;
    private String nicNo;
    private String Address;
    private double salary;
    private String mobileNo;
    private String joinDate;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String empID_PK, String firstName, String lastName, String levelID, String dob, String nicNo, String Address, double salary, String mobileNo, String joinDate) {
        this.empID_PK = empID_PK;
        this.firstName = firstName;
        this.lastName = lastName;
        this.levelID = levelID;
        this.dob = dob;
        this.nicNo = nicNo;
        this.Address = Address;
        this.salary = salary;
        this.mobileNo = mobileNo;
        this.joinDate = joinDate;
    }

    /**
     * @return the empID_PK
     */
    public String getEmpID_PK() {
        return empID_PK;
    }

    /**
     * @param empID_PK the empID_PK to set
     */
    public void setEmpID_PK(String empID_PK) {
        this.empID_PK = empID_PK;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the levelID
     */
    public String getLevelID() {
        return levelID;
    }

    /**
     * @param levelID the levelID to set
     */
    public void setLevelID(String levelID) {
        this.levelID = levelID;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the nicNo
     */
    public String getNicNo() {
        return nicNo;
    }

    /**
     * @param nicNo the nicNo to set
     */
    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the mobileNo
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * @param mobileNo the mobileNo to set
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * @return the joinDate
     */
    public String getJoinDate() {
        return joinDate;
    }

    /**
     * @param joinDate the joinDate to set
     */
    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
    
    
}
