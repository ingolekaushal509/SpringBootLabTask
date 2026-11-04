package dailyLabTask.day04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "company")
public class Company {

	private String companyName;
	private int employeeCount;
	private double annualRevenue;
	private boolean active;
	private char branchCode;
	private List<String> employeeName;
	private Map<Integer, String> employeeDepartments;
	private Set<String> uniqueSkills;
	private CompanyAddress address;
	private String[] location;

	public Company() {

	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public double getAnnualRevenue() {
		return annualRevenue;
	}

	public void setAnnualRevenue(double annualRevenue) {
		this.annualRevenue = annualRevenue;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public char getBranchcode() {
		return branchCode;
	}

	public void setBranchcode(char branchcode) {
		this.branchCode = branchcode;
	}

	public List<String> getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(List<String> employeeName) {
		this.employeeName = employeeName;
	}

	public Map<Integer, String> getEmployeeDepartments() {
		return employeeDepartments;
	}

	public void setEmployeeDepartments(Map<Integer, String> employeeDepartments) {
		this.employeeDepartments = employeeDepartments;
	}

	public Set<String> getUniqueSkills() {
		return uniqueSkills;
	}

	public void setUniqueSkills(Set<String> uniqueSkills) {
		this.uniqueSkills = uniqueSkills;
	}

	public CompanyAddress getAddress() {
		return address;
	}

	public void setAddress(CompanyAddress address) {
		this.address = address;
	}

	public String[] getLocation() {
		return location;
	}

	public void setLocation(String[] location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", employeeCount=" + employeeCount + ", annualRevenue="
				+ annualRevenue + ", active=" + active + ", branchcode=" + branchCode + ", employeeName=" + employeeName
				+ ", employeeDepartments=" + employeeDepartments + ", uniqueSkills=" + uniqueSkills + ", address="
				+ address + ", location=" + Arrays.toString(location) + "]";
	}

}
