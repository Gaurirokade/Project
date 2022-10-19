package com.vbs.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vbs.demo.Model.Order;
import com.vbs.demo.Service.OrderService;
import com.vbs.demo.dto.AllDetails;





@RestController
public class ControllerOrItem {
	@Autowired
	OrderService ordersservice;
	
	@PostMapping("student/saveDetails")
	public String saveStudentsDetails(@RequestBody AllDetails saveallorderdetail) {
		
		try {
			ordersservice.saveorderDetails(saveallorderdetail);
			
	}catch(Exception e) {		
      return "Failure"+e.getMessage();
}
		return "sucess";

	}
	@GetMapping("car/getcardetails")
	public Order GetCarDetailById(@RequestParam("id") int id)
	{
		return ordersservice.getorderById(id);
		
	}
	
	@GetMapping("car/getAllcardetails")
	public List<Order> GetCarDetailById()
	{
		return ordersservice.getordertAllDetails();
		
	}
}
