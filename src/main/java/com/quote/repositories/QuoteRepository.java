package com.quote.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quote.models.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Integer> {

}
