package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
//			@Autowired
//			private CourseJdbcRepository repository;

//		@Autowired
//		private CourseJpaRepository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repository.save(new Course(1,"C++","Teknath"));
		repository.save(new Course(2,"JAVA","Aman"));
		repository.save(new Course(3,"Python","Rahul"));
		
		repository.deleteById(1l);   //it is 1 L as long is req
		
		System.out.println(repository.findById(2l));
		
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findByAuthor("Aman"));
		System.out.println(repository.findByName("Python"));
		
	}
	
	
}
