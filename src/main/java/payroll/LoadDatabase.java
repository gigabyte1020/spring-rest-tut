package payroll;

import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Configuration
class LoadDatabase {
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository)
	{
		return args->{
			log.info("Preloading into db: "+repository.save(new Employee("Ram", "SE1")));
		};
	}
	
}
