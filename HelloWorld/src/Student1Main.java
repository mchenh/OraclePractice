import java.util.*;
public class Student1Main {
	public static void main(String[] args){
		String quit = "q";
		String input = "a";
		
		ArrayList<StudentInformation> students = new ArrayList<StudentInformation>();
		StudentInformation student1 = new StudentInformation("Mike", "Ch1n", 25, 1231234, "11611 Clara Barton Dr", "April 10", 551225506, "CS");
		StudentInformation student2 = new StudentInformation("Dike", "Ch2n", 26, 1231234, "11611 Clara Barton Dr", "April 10", 551225506, "CS");
		StudentInformation student3 = new StudentInformation("Fike", "Ch3n", 27, 1231234, "11611 Clara Barton Dr", "April 10", 551225506, "CS");
		StudentInformation student4 = new StudentInformation("Xike", "Ch4n", 28, 1231234, "11611 Clara Barton Dr", "April 10", 551225506, "CS");
		StudentInformation student5 = new StudentInformation("Qike", "Ch5n", 29, 1231234, "11611 Clara Barton Dr", "April 10", 551225506, "CS");
		StudentInformation student6 = new StudentInformation("Eike", "Ch6n", 30, 1231234, "11611 Clara Barton Dr", "April 10", 551225506, "CS");
		StudentInformation student7 = new StudentInformation("Tike", "Ch7n", 31, 1231234, "11611 Clara Barton Dr", "April 10", 551225506, "CS");
		StudentInformation student8 = new StudentInformation("Uike", "Ch8n", 32, 1231234, "11611 Clara Barton Dr", "April 10", 551225506, "CS");
		StudentInformation student9 = new StudentInformation("Hike", "Ch9n", 33, 1231234, "11611 Clara Barton Dr", "April 10", 551225506, "CS");
		StudentInformation student10 = new StudentInformation("Jike", "Ch0n", 34, 1231234, "11611 Clara Barton Dr", "April 10", 551225506, "CS");
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		students.add(student7);
		students.add(student8);
		students.add(student9);
		students.add(student10);
		
		Scanner reader = new Scanner(System.in);
		while(input != quit){
			System.out.println("Menu Options: q = quit | 1 = Find by fname | 2 = Find by lname | 3 = Find by full | 4 = Find by age\n\n"); 
			input = reader.nextLine();
			
			if(input.equals(quit))
				System.exit(0);
			else if(input.equals("1")){
				System.out.println("First Name: ");
				String temp = reader.nextLine();
				for(int i=0; i<10; i++)
				{
					String check = students.get(i).getFname();
					
					if(temp.equals(check))
						System.out.println(students.get(i)+"\n\n");
				}
			}
			else if(input.equals("2")){

				System.out.println("Last Name: ");
				String temp = reader.nextLine();
				for(int i=0; i<10; i++)
				{
					String check = students.get(i).getLname();
					if(temp.equals(check))
						System.out.println(students.get(i)+"\n\n");
				}
			}
			else if(input.equals("3")){

				System.out.println("Full Name: ");
				String temp = reader.nextLine();
				for(int i=0; i<10; i++)
				{
					String check = students.get(i).getFullname();
					
					if(temp.equals(check))
						System.out.println(students.get(i)+"\n\n");
				}
			}
			else if(input.equals("4")){

				System.out.println("Age (Numbers only): ");
				int temp = reader.nextInt();
				for(int i=0; i<10; i++)
				{
					int check = students.get(i).getAge();
					
					if(temp == check)
						System.out.println(students.get(i)+"\n\n");
				}
				reader.nextLine();
			}
			else
				System.out.println("Invalid Input");
		}
			
		
	}

}
