package oops_concepts;

public class Employee {
	String Emp_Name = "";
	int Emp_ID = 100;
	int Emp_Salary = 1000;
	
	public void Display_Emp_Bonus() {
		System.out.println("Employee "+ Emp_Name+" gets the bonus of "+(Emp_Salary * 0.20) );
	}

}
