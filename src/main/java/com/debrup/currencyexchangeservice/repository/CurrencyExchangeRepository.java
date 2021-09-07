package com.debrup.currencyexchangeservice.repository;

import com.debrup.currencyexchangeservice.entity.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

      CurrencyExchange findByFromAndTo(String from, String to);
}
