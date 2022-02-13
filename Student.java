package week3.day1;

public class Student {
	public void getStudentInfo( int id)
	{
		System.err.println(id);
	}
	public void getStudentInfo(int id , String name)
	{
		System.out.println(id);
		System.out.println(name);
	}
	public void getStudentInfo(String email, long phno)
	{
		System.out.println(email);
		System.out.println(phno);
	}
	public void getStudentInfo()
	{
		getStudentInfo(301);
		getStudentInfo(301, "Rajalakshmi");
		getStudentInfo("rajalakshmi231623@gmail.com", 9442245993L);
		
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.getStudentInfo();
	}
}