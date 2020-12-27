package org.college;

public class Students {
	public void getStudentInfo() {
		System.out.println("Student Result");
	}
	public void getStudentInfo(int id) {
		System.out.println("Id is 103");
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Id and Name is 103 Janu");
	}
	public void getStudentInfo(String email, int phoneNumber) {
		System.out.println("mail and p.num is janu@gmail.com 987128711");
	}

	public static void main(String[] args) {
		Students st =new Students();
		st.getStudentInfo();
		st.getStudentInfo(100);
		st.getStudentInfo(100, "Janu");
		st.getStudentInfo("janu@gmail.com", 987128711);
		

	}

}
