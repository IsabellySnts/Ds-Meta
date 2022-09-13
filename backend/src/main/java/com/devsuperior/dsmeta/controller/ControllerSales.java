package com.devsuperior.dsmeta.controller;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.devsuperior.dsmeta.model.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;



@RestController
@RequestMapping("sales")
public class ControllerSales {
	
	@Autowired
	private SaleRepository repository;
	
	
	@GetMapping
	public Page<Sale> findSale( @RequestParam(value = "minDate", defaultValue = "")String minDate, @RequestParam(value = "maxDate", defaultValue = "" )
	String maxDate, Pageable pageable){

		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(maxDate); LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
		
		
		return repository.findSales(min, max, pageable);
	}
	

}
