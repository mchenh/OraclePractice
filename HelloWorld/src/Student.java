import java.util.*;

public class Student extends Person {
	int gpa;
	ArrayList<Course> current = new ArrayList<Course>();
	ArrayList<Course> previous = new ArrayList<Course>();

	Student(){}
	Student(String fname, String lname, int age, int phone, String address,
				String birthday, int ssn, ArrayList<Course> current, ArrayList<Course> previous){
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.birthday = birthday;
		this.ssn = ssn;
		this.current = current;
		this.previous = previous;
	}
	public int getGpa() {
		int average = 0;
		for(int i = 0; i < previous.size(); i++)
		{
			average += previous.get(i).getGrade();
		}
		gpa = average/previous.size();
		return gpa;
	}
	public ArrayList<Course> getCurrent() {
		return current;
	}
	public void setCurrent(ArrayList<Course> current) {
		this.current = current;
	}
	public ArrayList<Course> getPrevious() {
		return previous;
	}
	public void setPrevious(ArrayList<Course> previous) {
		this.previous = previous;
	}
}
