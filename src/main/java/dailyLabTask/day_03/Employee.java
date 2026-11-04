package dailyLabTask.day_03;

import org.springframework.stereotype.Component;
@Component
public class Employee {
	
	private int employeeID;
	private String employeeName;
	private String Department;
	private String designation;
	private double salary;
	private String location;
	
	public Employee(EmployeeBuilder builder)
	{
		this.employeeID=builder.employeeID;
		this.employeeName= builder.employeeName;
		this.Department= builder.Department;
		this.designation=builder.designation;
		this.salary=builder.salary;
		this.location=builder.location;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", Department=" + Department
				+ ", designation=" + designation + ", salary=" + salary + ", location=" + location + "]";
	}
	
	
	static class EmployeeBuilder
	{
		private int employeeID;
		private String employeeName;
		private String Department;
		private String designation;
		private double salary;
		private String location;
		
		public EmployeeBuilder()
		{
			
		}

		public int getEmployeeID() {
			return employeeID;
		}

		public EmployeeBuilder setEmployeeID(int employeeID) {
			this.employeeID = employeeID;
			return this;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public EmployeeBuilder setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
			return this;
		}

		public String getDepartment() {
			return Department;
		}

		public EmployeeBuilder setDepartment(String department) {
			Department = department;
			return this;
		}

		public String getDesignation() {
			return designation;
		}

		public EmployeeBuilder setDesignation(String designation) {
			this.designation = designation;
			return this;
		}

		public double getSalary() {
			return salary;
		}

		public EmployeeBuilder setSalary(double salary) {
			this.salary = salary;
			return this;
		}

		public String getLocation() {
			return location;
		}

		public EmployeeBuilder setLocation(String location) {
			this.location = location;
			return this;
		}
		
		public Employee build()
		{
			Employee employee = new Employee(this);
			employee.setEmployeeID(this.employeeID);
			employee.setEmployeeName(this.employeeName);
			employee.setDepartment(this.Department);
			employee.setDesignation(this.designation);
			employee.setSalary(this.salary);
			employee.setLocation(this.location);
			return employee;
			
		}
		
	}
}
