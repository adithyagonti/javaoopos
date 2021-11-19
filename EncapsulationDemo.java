package com.java;

public class EncapsulationDemo {
	
	 int empid;
     String empName;
     int empSalary;
     
	/**
	 * @return the empid
	 */
	public int getEmpid() {
		return empid;
	}


	/**
	 * @param empid the empid to set
	 */
	public void setEmpid(int empid) {
		this.empid = empid;
	}


	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}


	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}


	/**
	 * @return the empSalary
	 */
	public int getEmpSalary() {
		return empSalary;
	}


	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    EncapsulationDemo ed = new EncapsulationDemo();
    ed.setEmpid(101);
    ed.setEmpName("raju");
    ed.setEmpSalary(25000);
    System.out.println(ed.getEmpid());
    System.out.println(ed.getEmpName());
    System.out.println(ed.getEmpSalary());
	}

}
