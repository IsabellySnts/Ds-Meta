package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.model.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service
public class SalesServices {

	
	private SaleRepository repository;
	
	public List<Sale> findSales(){
		
		return repository.findAll();
	}
}
