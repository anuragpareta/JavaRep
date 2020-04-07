package oops_concepts;

public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.Emp_Name = "Gowtham";
		emp1.Emp_ID = 36336;
		emp1.Emp_Salary=40000;
		emp1.Display_Emp_Bonus();
				
		emp2.Emp_Name = "Juned";
		emp2.Emp_ID = 36356;
		emp2.Emp_Salary=30000;
		emp2.Display_Emp_Bonus();
	}

}
