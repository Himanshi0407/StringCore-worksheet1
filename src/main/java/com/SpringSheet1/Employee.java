package com.SpringSheet1;

public class Employee {
    private int empId;
    private String empName;
    private String empAddress;
    private Dept dept;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", dept=" + dept +
                '}';
    }

    public Employee() {
    }

    public Employee(int empId, String empName, String empAddress, Dept dept) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
        this.dept = dept;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
