package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName(String studentName) {
		System.out.println("Student Name: " + studentName);
	}

	public void studentDept() {
		Student dept = new Student();
		String departmentName = dept.deptName();
		System.out.println("Department of the student: "+departmentName);
	}
	
	public void studentId(int studentId) {
		System.out.println("Student Id: " + studentId);
	}
	
	public static void main(String[] args) {
		Student stud =new Student();
		stud.collegeCode("A15456");
		stud.collegeName("Govt Coll");
		stud.collegeRank(5);
		stud.studentName("Elavarasi");
		stud.studentId(143122);
		stud.studentDept();
	}
}
	
