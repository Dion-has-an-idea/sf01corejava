package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.orderdetails;
import com.example.demo.service.orderdetailservices;

@RestController
public class odcontroller {
	@Autowired
	public  orderdetailservices odser;
	
	
	@PostMapping("/addid")
	public orderdetails regid(@RequestBody orderdetails id )
	{
		return odser.addod(id);
	}
	
	@GetMapping("/getod")
   public List<orderdetails> getOd()
   {
	   return odser.getOd();
   }
   
   
   @DeleteMapping("/deleteod/{id}") 
   public void deleteod(@PathVariable Integer id )
   {
	   odser.deleteod(id);
   }
   
@PostMapping("/updateod")
public orderdetails updateod(@RequestBody orderdetails id )
{
 return odser.updateod(id);
}

		
}
