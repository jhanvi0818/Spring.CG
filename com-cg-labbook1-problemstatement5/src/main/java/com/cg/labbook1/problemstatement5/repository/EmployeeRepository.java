package com.cg.labbook1.problemstatement5.repository;


  import org.springframework.data.repository.CrudRepository;

import com.cg.labbook1.problemstatement5.employee.Employee;
  
  
  
  public interface EmployeeRepository extends CrudRepository<Employee, Integer>
  {
  
  }
 