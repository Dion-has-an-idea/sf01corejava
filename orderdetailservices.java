package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.orderdetails;
import com.example.demo.repository.odrepository;

@Service
public class orderdetailservices {

	@Autowired 
	public  odrepository  odrepo;
	public orderdetails addod(orderdetails id)
	{
		return odrepo.save(id);
	}
	public List<orderdetails> getOd()
	
	{
		return odrepo.findAll();
	}
	
	public void deleteod(int id)
	{
		odrepo.deleteById(id );
	}
	 
	 public orderdetails updateod(orderdetails id)
	 {
		 Integer odid=id.getId();
		 orderdetails odid1=odrepo.findById(odid).get();
		 odid1.setId(id.getId()); 
		 return odrepo.save(odid1);
	 } 
}
