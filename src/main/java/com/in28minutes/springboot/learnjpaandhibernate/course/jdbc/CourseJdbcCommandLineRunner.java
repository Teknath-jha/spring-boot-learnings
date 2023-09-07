package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repository.insert(new Course(1,"C++","Teknath"));
		repository.insert(new Course(2,"JAVA","Aman"));
		repository.insert(new Course(3,"Python","Rahul"));
		
		repository.deleteById((long)1);
		
		System.out.println(repository.findById(2));
		
		System.out.println(repository.findById(3));
		
	}
	
	
}
