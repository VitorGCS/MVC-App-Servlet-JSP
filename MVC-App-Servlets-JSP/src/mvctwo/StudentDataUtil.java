package mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	public static List<Student> getStudent(){
		
		//create an empty list
		List<Student> student = new ArrayList<>();
		
		//add sample data
		student.add(new Student("Mary","Public", "may@luv2code.com"));
		student.add(new Student("Maria","Public", "maris@luv2code.com"));
		student.add(new Student("Vitor","Public", "vitor@luv2code.com"));
		
		//return the list
		return student;
	}
}
