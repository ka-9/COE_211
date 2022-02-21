import java.util.*;
public class EntryPoint {
	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);

		int insertions = (int) (Math.random()*10 + 1);
		Employee[] employeeArray = new Employee[insertions];
		
		for (int i = 0; i < insertions; ++i) {

			System.out.println("Please input the employee's first name: ");			
			String firstName = scan.nextLine();

			System.out.println("Please input the employee's last name: ");
			String lastName = scan.nextLine();

			System.out.println("Please input the employee's age: ");
			int age = scan.nextInt();
			scan.nextLine();

			System.out.println("Please input the employee's monthly salary: ");
			double monthlySalary = scan.nextDouble();
			scan.nextLine();

			employeeArray[i] = new Employee(firstName, lastName, age, monthlySalary);
			System.out.println("Employee information: " + employeeArray[i].getFirstName() + ", " + employeeArray[i].getLastName() + ", " +
 employeeArray[i].getAge() + ", " + employeeArray[i].getMonthlySalary());
			System.out.println("You have " + (insertions-i-1) + " insertions left.");
		
		}
	}
}