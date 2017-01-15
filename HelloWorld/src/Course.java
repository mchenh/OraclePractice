import java.util.ArrayList;

public class Course {
	Professor teacher = new Professor();
	String name;
	int grade;
	ArrayList<Student> students = new ArrayList<Student>();
	
	Course(){}
	Course(Professor teacher, String name, int grade, ArrayList<Student> students){
		this.teacher = teacher;
		this.name = name;
		this.grade = grade;
		this.students = students;
	}
	public Professor getTeacher() {
		return teacher;
	}
	public void setTeacher(Professor teacher) {
		this.teacher = teacher;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
