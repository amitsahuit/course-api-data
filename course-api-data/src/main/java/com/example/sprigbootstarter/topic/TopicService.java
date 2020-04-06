package com.example.sprigbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	/*private List<Topic> topics = Arrays.asList(new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Java", "Java", "Core Java Description"),
			new Topic("Java Script", "Java Script", "Java Script Description")); //Hard codedtopic values */
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Java", "Java", "Core Java Description"),
			new Topic("Java Script", "Java Script", "Java Script Description"))); //Converted Hardcoded list to mutable array.
	
	public List<Topic> getAllTopics(){
		//return topics;
		
		List<Topic> topics = new ArrayList<Topic>(); 
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id);
	}
	
	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		/*for(int i=0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}*/
		topicRepository.save(topic); //save methof can do both add and update also..
	}

	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
		
	}
}
