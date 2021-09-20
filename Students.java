package week3.day1.assignments;

public class Students {
	
	public void getStudentInfo(String name)
	{	
		System.out.println("Student Name: "+name);
	}
	public void getStudentInfo(String name, int id)
	{	
		System.out.println("Student Name: "+name);
		System.out.println("Student Id: "+id);
	}
	public void getStudentInfo(int id, String email, long phoneNumber)
	{	
		System.out.println("Student email: "+email);
		System.out.println("Student Number: "+phoneNumber);
	}
	public static void main(String[] args) {
		Students stdInfo = new Students();
		stdInfo.getStudentInfo("Elavarasi");
		stdInfo.getStudentInfo("Maneesh", 143122);
		stdInfo.getStudentInfo(144446, "email", 789456123);
	}
		
}
