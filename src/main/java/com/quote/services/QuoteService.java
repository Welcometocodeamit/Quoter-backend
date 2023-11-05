package com.quote.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.quote.models.Quote;
import com.quote.repositories.QuoteRepository;
import com.quote.responsewrapper.QuoteResponseWrapper;

@Service
public class QuoteService {
	
	@Autowired QuoteRepository quoteRepository;
	QuoteResponseWrapper wrapper=new QuoteResponseWrapper();
	
//	Get all services
	public ResponseEntity<?> getAllQuotes() {
		List<Quote> foundedQuotes=quoteRepository.findAll();
		if(foundedQuotes.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Quotes found, please add in some in database");
		}else {
			wrapper.setMessage("Following quotes found");
			wrapper.setData(foundedQuotes);
			return new ResponseEntity<> (wrapper, HttpStatus.FOUND);
		}
	}

}
