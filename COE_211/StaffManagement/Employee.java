public class Employee {
	String firstName;
	String lastName;
	int age;
	double monthlySalary;

// Getter Methods

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

// Setter Methods

	public void setFirstName(String firstNameSet) {
		firstName = firstNameSet;
	}

	public void setLastName(String lastNameSet) {
		lastName = lastNameSet;
	}

	public void setAge(int ageSet) {
		age = ageSet;
	}

	public void setMonthlySalary(double monthlySalarySet) {
		monthlySalary = monthlySalarySet;	
	}

//Constructor

	public Employee(String firstName, String lastName, int age, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.monthlySalary = monthlySalary;
	}
	
}

	