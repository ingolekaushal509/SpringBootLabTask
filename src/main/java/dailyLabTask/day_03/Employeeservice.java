package dailyLabTask.day_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dailyLabTask.day_03.Employee.EmployeeBuilder;

@Component
public class Employeeservice {
	
	@Autowired
	private EmployeeBuilder employeeBuilder;
	
	public Employee getEmployee()
	{
		Employee employee = employeeBuilder.build();
		return employee;
	}
}
