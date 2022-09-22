package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.service.OrganisationService;
import com.test.model.*;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableWebMvc
@EnableSwagger2
public class EmployeeTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeTestApplication.class, args);
	}
	@Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select()
	         .apis(RequestHandlerSelectors.basePackage("com.test")).build();
	   }
	/*
	 * @Bean CommandLineRunner runner(OrganisationService orgService) { return args
	 * -> { // read json and write to db ObjectMapper mapper = new ObjectMapper();
	 * mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
	 * TypeReference<List<Organisation>> typeReference = new
	 * TypeReference<List<Organisation>>(){}; InputStream inputStream =
	 * TypeReference.class.getResourceAsStream("/json/org.json"); try {
	 * List<Organisation> org = mapper.readValue(inputStream,typeReference);
	 * orgService.save(org); System.out.println("Users Saved!"); } catch
	 * (IOException e){ System.out.println("Unable to save users: " +
	 * e.getMessage()); } }; }
	 */

}
