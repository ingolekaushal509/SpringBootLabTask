package dailyLabTask.day_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import dailyLabTask.day_03.Employee.EmployeeBuilder;

@SpringBootApplication
public class EmployeeCongfig {
	@Autowired
	Environment env;
	
	@Bean
	public EmployeeBuilder builder()
	{
		return (new EmployeeBuilder()
				.setEmployeeID(Integer.parseInt(env.getProperty("employeeID")))
				.setEmployeeName(env.getProperty("employeeName"))
				.setDepartment(env.getProperty("Department"))
				.setDesignation(env.getProperty("designation"))
				.setSalary(Double.parseDouble(env.getProperty("salary")))
				.setLocation(env.getProperty("location")));
	}
	
	public static void main(String[] args) {
		ApplicationContext context = 
				SpringApplication.run(EmployeeCongfig.class, args);
		Employee bean = context.getBean("employee",Employee.class);
		
		System.out.println(bean);
		
	}
}
