
public class Professor extends Person{
	Course teaching = new Course();
	
	Professor(){}
	Professor(String fname, String lname, int age, int phone, String address,
				String birthday, int ssn, Course course){
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.birthday = birthday;
		this.ssn = ssn;
		this.teaching = course;
	}
	public Course getTeaching() {
		return teaching;
	}
	public void setTeaching(Course teaching) {
		this.teaching = teaching;
	}
	
}
