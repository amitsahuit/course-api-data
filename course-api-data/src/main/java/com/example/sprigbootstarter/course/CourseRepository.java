package com.example.sprigbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{ 
	//1st arg wants the entity type and 2nd arg wants the return type of primary key..
	
	//public List<Course> getCourcesByTopic(String topicId);
	
	public List<Course> findByName(String name); 	//Finds all the courses which is related to this Name.
	public List<Course> findByDescription(String des); 	//Finds all the courses which is related to this Description.
	public List<Course> findByTopicId(String topicId); 	//Finds all the courses which is related to this topicId.
	
}
