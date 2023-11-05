package com.quote.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quote.services.QuoteService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class QuoteController {
	
	@Autowired QuoteService quoteService;
	
//	Get all services
	@GetMapping("/quotes")
	public ResponseEntity<?> getAllQuotes(){
		return quoteService.getAllQuotes();
	}

}
