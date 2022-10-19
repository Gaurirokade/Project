package com.vbs.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vbs.demo.Model.Order;
import com.vbs.demo.dto.AllDetails;

@Service
public interface OrderService {

public 	void saveorderDetails(AllDetails saveallorderdetail);

public Order getorderById(int id);

public List<Order> getordertAllDetails();



}
