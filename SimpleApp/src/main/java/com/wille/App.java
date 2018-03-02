package com.wille;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wille.service.SomeService;

@SpringBootApplication
public class App implements CommandLineRunner{

	
	@Autowired
	SomeService someService;
	
	@Override
	public void run(String... arg0) throws Exception {
		someService.doSomething();
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
