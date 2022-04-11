package com.tectoro.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.logging.log4j.util.PropertySource.Comparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tectoro.dao.EmployeeRepository;
import com.tectoro.model.EmployeeChinni;
@Service
public class serviceImplem implements serviceInterf 
{
	@Autowired
	EmployeeRepository empreposite;
	@Override
	public EmployeeChinni saveEmployeeChinni(EmployeeChinni chinni) {
		
		return empreposite.save(chinni);
	}
	@Override
	public void deleteByName(String name) {
		empreposite.deleteByName(name);
		
	}
	
	@Override
	public List<EmployeeChinni> greaterGetAllEmp(long salary) {
	
		List<EmployeeChinni> list2 = empreposite.findAll();
	
	List<EmployeeChinni> l =list2.stream().filter(i->i.getSalary()>salary).collect(Collectors.toList());
	return l;
	}
	
	@Override
	public EmployeeChinni updateEmployeeChinni(int id,EmployeeChinni chinni) {

		Optional<EmployeeChinni> findById = empreposite.findById(id);
		
		return empreposite.save(chinni);
		 
	}
				
	@Override
	public List<EmployeeChinni> greaterGetList(int experience) 
	{
		List<EmployeeChinni> list1=empreposite.findAll();
		List<EmployeeChinni> l1=list1.stream().filter(i->i.getExperience()>experience).collect(Collectors.toList());
		return l1;
	}
	@Override
	public List<EmployeeChinni> getDesecendingEmp()
	{
		List<EmployeeChinni> list2=empreposite.findAll();
		
		List<EmployeeChinni> list = list2.stream().sorted((i,j) -> i.getFirstName().compareToIgnoreCase(j.getFirstName())).collect(Collectors.toList());
		
		return list;
	}
		
}
