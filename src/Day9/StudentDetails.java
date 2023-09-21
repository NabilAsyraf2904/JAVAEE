package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentDetails 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		List<StudentDetails> students = new ArrayList<>();
		System.out.println("Student Details (First Name, Last Name, Age, City): ");
		String line = sc.nextLine();
		while (!line.equals("end")) 
		{
			String[] data = line.split(" ");
			String firstName = data[0];
			String lastName = data[1];
			String age = data[2];
			String city = data[3];
			
			StudentDetails existingStudent = getStudent(students, firstName, lastName);
			
			if (existingStudent != null) 
			{
				existingStudent.setAge(age);
				existingStudent.setCity(city);
				System.out.println(existingStudent.getFirstName() + " " +
								   existingStudent.getAge() + " years old from " 
								   + existingStudent.getCity() + ".");
			} else 
			{
				StudentDetails student = new StudentDetails(firstName, lastName, age, city);
				System.out.println(student.getFirstName() + " " +
								   student.getAge() + " years old from " 
						   		   + student.getCity() + ".");				
				students.add(student);
			}
			System.out.println("\nStudent Details : ");
			line = sc.nextLine();
		}
			Collections.sort(students, (s1, s2) -> s1.getCity().compareTo(s2.getCity()));
			
			for (int i = 0; i < students.size(); i++)
			{
				System.out.print(students.get(i).getFirstName()+ " ");
				System.out.print(students.get(i).getLastName()+ " ");
				System.out.print(students.get(i).getAge()+ " ");
				System.out.print(students.get(i).getCity()+ " ");
				
				System.out.println("");
			}
	}


	static StudentDetails getStudent(List<StudentDetails> students, String firstName, String lastName) 
	{
		for (StudentDetails student : students) 
		{
			if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) 
			{
				return student;
			}
		}
		return null;
	}


	private String firstName;
	private  String lastName;
	private  String age;
	private  String city;
	
	public StudentDetails(String firstName, String lastName, String age, String city)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.city = city;

		
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getAge() 
	{
		return age;
	}

	public void setAge(String age) 
	{
		this.age = age;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

}
