package com.example.sprigbootstarter.course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{ 
	//1st arg wants the entity type and 2nd arg wants the return type of primary key..
	
	

}
