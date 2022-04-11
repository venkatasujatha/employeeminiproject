package com.tectoro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.tectoro.model.EmployeeChinni;
import com.tectoro.service.serviceInterf;

@RestController
public class EmployeeController 
{
	@Autowired 
	private serviceInterf serviceInterf;
	
	@PostMapping("/save")
	public EmployeeChinni saveEmployeeChinni(@RequestBody EmployeeChinni chinni) {
		
		return serviceInterf.saveEmployeeChinni(chinni);
	}
	@DeleteMapping("/deleByName/{name}")
	public String deleteByName(@PathVariable  String name)
	{
		serviceInterf.deleteByName(name);
		return "delete";

		
	}
	@PutMapping("/update/{id}")
	public EmployeeChinni updateEmployeeChinni1(@PathVariable int id, @RequestBody EmployeeChinni chinni) 
	{
		return serviceInterf.updateEmployeeChinni(id,chinni);
		
	}
	
	@GetMapping("/get/{salary}")
	public List<EmployeeChinni> greatergetAllEmp(@PathVariable long salary){
		return serviceInterf.greaterGetAllEmp(salary);
	}
	@GetMapping("/saveget/{experience}")
	public List<EmployeeChinni> greaterGetList(@PathVariable int experience)
	{
		return serviceInterf.greaterGetList(experience);
		
	}
	@GetMapping("/descname")
	public List<EmployeeChinni> getDesecendingEmp()
	{
		return serviceInterf.getDesecendingEmp();
		
	}
	
}
