package com.cg.labbook2.repository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cg.labbook2.trainee.Trainee;

public interface TraineeJpaRepository extends CrudRepository<Trainee, Integer> {
	Trainee findByTraineeName(String traineeName);
	
	/*
	 * @Query(value = "SELECT * FROM Trainee t WHERE t.traineeName = 'name'",
	 * nativeQuery=true ) public Trainee findTraineeByName(String name);
	 */
	 

}
