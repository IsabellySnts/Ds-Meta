package com.devsuperior.dsmeta.controller;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.devsuperior.dsmeta.model.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;
import com.devsuperior.dsmeta.services.SmsServices;



@RestController
@RequestMapping("sales")
public class ControllerSales {
	
	@Autowired
	private SaleRepository repository;
	@Autowired
	private SmsServices sms;
	
	
	
	@GetMapping
	public Page<Sale> findSale( Pageable pageable){

		
		return repository.findAll(pageable);
	}
	
	@GetMapping("/{id}/notification")
	public void notifysms( @PathVariable Long id) {
		
		sms.sendSms(id);
	}
	
	
	

}
