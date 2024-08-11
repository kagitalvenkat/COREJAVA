package in.col;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDemo {
	public static void main(String[] args) {
		List<Student> s= new ArrayList<>();
		s.add(new Student(102, "VENKAT", 5));
		s.add(new Student(104, "RUDRA", 2));
		s.add(new Student(103, "SAI", 1));
		s.add(new Student(105, "RITVIKA", 3));
		s.add(new Student(101, "HASWITHA", 4));
		
		Collections.sort(s);
		
		for(Student student:s) {
			System.out.println(student);
		}
	}
}
