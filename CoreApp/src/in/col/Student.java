package in.col;

public class Student implements Comparable<Student>{
	int id;
	String name;
	int rank;

	public Student(int id, String name, int rank) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}

	/* 
	 * @Override public int compareTo(Student s) { // TODO Auto-generated method
	 * stub return this.id-s.id; }
	 */
	/*
	 * @Override public int compareTo(Student s) { // TODO Auto-generated method
	 * stub return this.name.compareTo(s.name); }
	 */
	
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.rank-s.rank;
	}

}
