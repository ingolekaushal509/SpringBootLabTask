package dailyLabTask.day04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigurationProperties
public class Main {
	/*
	 * @Autowired Environment env;
	 * 
	 * public Company getCompany() { Company company = new Company();
	 * //company.setCompanyName(env.getProperty("company.company-name: ")); return
	 * company; }
	 */

	
	public static void main(String[] args) {
		ApplicationContext context=
				SpringApplication.run(Main.class, args);
		Company bean = context.getBean("company",Company.class);
		System.out.println(bean);
	}
}
