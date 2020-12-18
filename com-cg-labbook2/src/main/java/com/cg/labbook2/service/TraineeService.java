package com.cg.labbook2.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.labbook2.repository.TraineeJpaRepository;
import com.cg.labbook2.trainee.Trainee;


@Service
public class TraineeService {
	@Autowired
	TraineeJpaRepository repository;
	
	public List<Trainee> getAllTrainees(){
		System.out.println("Get all employees");
		List<Trainee> trainee = new ArrayList<Trainee>();
       	repository.findAll().forEach(trainee1 -> trainee.add(trainee1));
       	return trainee;
	}
	
	public Trainee getTraineeById(int traineeId)
	{
		System.out.println("Get trainee by ID");
		return repository.findById(traineeId).get();
	}
	
	public void delete(int traineeId) {
 		System.out.println("Delete trainee by ID");
       	repository.deleteById(traineeId);
 	}
	
	public void saveOrUpdate(Trainee trainee) {
 		System.out.println("Save Or Update trainee");
       	repository.save(trainee);
 	}
	
	public void update(Trainee trainee, int id) {
 		System.out.println("Update trainee");
       	repository.save(trainee);
 	}
	
	
	  public Trainee getTraineeByName(String name) {
	  System.out.println("Get trainee by ID"); 
	  return repository.findByTraineeName(name); 
	  }
	 
	
}
