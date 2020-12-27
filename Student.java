package org.college;


public class Student extends Department{
	public void studentName()
	{
	System.out.println("Janani");
		}
	public void studentDept()
	{
	System.out.println("ECE");
		}
	public void studentId()
	{
	System.out.println("103");
		}
	public static void main(String[] args) {
		Student stu = new Student();
		stu.studentDept();
		stu.studentId();
		stu.studentName();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
		
	}

}