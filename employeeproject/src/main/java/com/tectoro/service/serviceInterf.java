package com.tectoro.service;



import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.tectoro.model.EmployeeChinni;

public interface serviceInterf 
{
	//post
	EmployeeChinni saveEmployeeChinni(EmployeeChinni chinni);
	//delete
	public void deleteByName(String name);

	//put
	public EmployeeChinni updateEmployeeChinni(int id, EmployeeChinni chinni);
	
	//salary
	public List<EmployeeChinni> greaterGetAllEmp(long salary);
	
	//experience
	List<EmployeeChinni> greaterGetList(int experience);
	
	
	public List<EmployeeChinni> getDesecendingEmp();
	
	
	
}
