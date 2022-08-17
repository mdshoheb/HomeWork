package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Cristiano, R");
		employee.setAge(36);
		employee.setSex('M');
		employee.setUsCitizen(false);

		System.out.println("Employee Name: " + employee.getName() + ",\nEmployee Age: " + employee.getAge()
				+ ",\nEmployee Gender: " + employee.getSex() + ",\nEmployee Citizenship: " + employee.isUsCitizen());

	}

}
