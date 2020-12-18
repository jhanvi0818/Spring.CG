package com.cg.labbook2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.labbook2.service.TraineeService;
import com.cg.labbook2.trainee.Trainee;


@RestController
public class TraineeController {
	@Autowired
	TraineeService service ;
	
	@GetMapping("/Trainee")
	public List<Trainee> getAllTrainees(){
		System.out.println("Get all employees");
		return service.getAllTrainees();
	}
	
	@GetMapping("/Trainee/{traineeId}")
	public Trainee getTraineeById(@PathVariable("traineeId")int traineeId)
	{	
		System.out.println("getTraineeById");
		return service.getTraineeById(traineeId);
	}
	
	@DeleteMapping("/Trainee/{traineeId}")
	private void deleteTrainee(@PathVariable("traineeId") int traineeId) {
		System.out.println("deleteTrainee");
		service.delete(traineeId);
	}


	@PostMapping("/Trainee")
	private int saveTrainee(@RequestBody Trainee trainee) {
		System.out.println("saveTrainee");
		service.saveOrUpdate(trainee);
		return trainee.getTraineeId();
	}

	@PutMapping("/Trainee")
	private Trainee update(@RequestBody Trainee trainee) {
		System.out.println("update");
		service.saveOrUpdate(trainee);
		return trainee;
	}
	
	
	  @GetMapping("/Trainee/name/{traineeName}") public Trainee
	  getTraineeByName(@PathVariable("traineeName")String traineeName) {
	  System.out.println("getTraineeByName"); 
	  return service.getTraineeByName(traineeName); }
	 
	
}
