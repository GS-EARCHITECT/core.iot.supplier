package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "uom_master_mgmt", "uom_details_mgmt"})
@EnableJpaRepositories(basePackages = { "uom_master_mgmt", "uom_details_mgmt" })
@ComponentScan({ "uom_master_mgmt", "uom_details_mgmt"})
public class IOTAdmin_Main extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(IOTAdmin_Main.class);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(IOTAdmin_Main.class, args);
	}
}