package com.cts;

//POJO - plain old java Object
public class Employee {

		
		//all variables shud be private
		//should have a no arg constructor
		//getter & setter methods for all private variables
	
		private int empId;
		private String empName;
		private String pass;
		private static String compName;
		
		public static String getCompName() {
			return compName;
		}
		public static void setCompName(String compName) {
			Employee.compName = compName;
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
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public Employee(int empId, String empName, String pass) {
			this.empId = empId;
			this.empName = empName;
			this.pass = pass;
		}
		
		
		
}
