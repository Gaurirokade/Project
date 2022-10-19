package com.vbs.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vbs.demo.Model.Item;
import com.vbs.demo.Model.Order;
import com.vbs.demo.Repository.ItemRepository;
import com.vbs.demo.Repository.OrderRepository;
import com.vbs.demo.dto.AllDetails;

@Service
public class OrderserviceImp  implements OrderService{
	@Autowired
	OrderRepository orderrepo;
	@Autowired
	ItemRepository itemrepo;

	@Override
	public void saveorderDetails(AllDetails saveallorderdetail) {
		
		
		// TODO Auto-generated method stub
		
		Order or = new Order();
		
		or.setOrderId(saveallorderdetail.getOrderId());
		or.setOrderDate(saveallorderdetail.getOrderDate());
		or.setOrderStatus(saveallorderdetail.getOrderStatus());
		
		
		Item it = new Item();
		it.setItemId(saveallorderdetail.getItemId());
		it.setItemName(saveallorderdetail.getItemName());
		it.setItemPrice(saveallorderdetail.getItemPrice());
		it.setItemQuality(saveallorderdetail.getItemQuality());
		
		orderrepo.save(or);
		itemrepo.save(it);
	}

	@Override
	public Order getorderById(int id) {
		// TODO Auto-generated method stub
		return orderrepo.findById(id).get();
		
		
	}

	@Override
	public List<Order> getordertAllDetails() {
		// TODO Auto-generated method stub
		return orderrepo.findAll();
	}

}
