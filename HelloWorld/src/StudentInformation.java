public class StudentInformation 
{
	String fname = "N/A";
	String lname = "N/A";
	String fullname = "N/A";
	int age = 0;
	int phone = 0;
	String address = "N/A";
	String birthday = "N/A";
	int ssn = 0;
	String course = "N/A";
	
	StudentInformation(){}
	StudentInformation(String first, String last, int years, int phoneNum, String addy, String birth, int social, String major){
		this.fname = first;
		this.lname = last;
		this.fullname = first + " " + last;
		this.age = years;
		this.phone = phoneNum;
		this.address = addy;
		this.birthday = birth;
		this.ssn = social;
		this.course = major;
	}
	
	public String toString() {
		String info = "First Name: "+this.fname+"\nLast Name: "+this.lname+"\nFull Name: "+this.fullname+"\nAge: "+this.age+"\nPhone Num: "+
				this.phone+"\nAddress: "+this.address+"\nBirthday: "+this.birthday+"\nSSN: "+this.ssn+"\nCourse: "+this.course;
		return info;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
		this.fullname = this.fname + " " + this.lname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
		this.fullname = this.fname + " " + this.lname;
	}
	public String getFullname() {
		return fullname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
