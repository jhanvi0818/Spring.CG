package com.cg.labbook1d;

public class EmployeeService {
	
	private EmployeeDao dao;
	
	
	  public EmployeeService() {
	  
	  }
	  
	  public EmployeeService(EmployeeDao dao) { 
		  super(); this.dao = dao; 
		  }
	  
	  
	  public EmployeeDao getDao() 
	  { 
		  return dao; 
		  }
	  
	  public void setDao(EmployeeDao dao) 
	  { 
		  this.dao = dao; 
		  }
	 

	public Employee4 getEmployeeById(int id)
	{
	return dao.getEmployeeByID(id);
	
	}

}
