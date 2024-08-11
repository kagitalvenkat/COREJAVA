package in.col;

import java.util.Comparator;

public class EmpSalComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) ((double)o1.salary-o2.salary);
	}

}
