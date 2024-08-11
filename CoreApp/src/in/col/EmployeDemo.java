package in.col;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeDemo {
	public static void main(String[] args) {
		List<Employee> s= new ArrayList<>();
		s.add(new Employee(102, "VENKAT", 215000.55));
		s.add(new Employee(104, "RUDRA", 312000.20));
		s.add(new Employee(103, "SAI", 15000));
		s.add(new Employee(105, "RITVIKA", 7800.00));
		s.add(new Employee(101, "HASWITHA", 442000.77));
		
//		Collections.sort(s, new EmpIdComparator());
//		Collections.sort(s,new EmpNameComparator());
		Collections.sort(s, new EmpSalComparator());
		
		for(Employee emp:s) {
			System.out.println(emp);
		}
	}
	
}
