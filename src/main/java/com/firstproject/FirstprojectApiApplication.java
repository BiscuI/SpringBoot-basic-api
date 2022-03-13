package com.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.firstproject.entities.Category;
import com.firstproject.repositories.CategoryRepository;

@SpringBootApplication
public class FirstprojectApiApplication implements CommandLineRunner{
	
	@Autowired
	public CategoryRepository categoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category catOne = new Category(1L, "Electronics");	
		Category catTwo = new Category(2L, "Books");
		
		categoryRepository.save(catOne);
		categoryRepository.save(catTwo);
	}

}
