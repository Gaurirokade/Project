package com.vbs.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vbs.demo.Model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {

}
