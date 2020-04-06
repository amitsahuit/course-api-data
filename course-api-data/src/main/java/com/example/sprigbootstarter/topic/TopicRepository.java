package com.example.sprigbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{ 
	//1st arg wants the entity type and 2nd arg wants the return type of primary key..
	
	

}
