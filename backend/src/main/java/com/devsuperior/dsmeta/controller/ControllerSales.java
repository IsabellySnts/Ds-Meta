package com.devsuperior.dsmeta.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devsuperior.dsmeta.model.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;



@RestController
@RequestMapping("sales")
public class ControllerSales {
	
	@Autowired
	private SaleRepository repository;
	
	
	@GetMapping
	public List<Sale> findSale(){
		
		return repository.findAll();
	}
	

}
