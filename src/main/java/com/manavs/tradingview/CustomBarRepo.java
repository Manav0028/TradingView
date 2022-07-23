package com.manavs.tradingview;

import org.springframework.data.repository.CrudRepository;

import java.util.Iterator;

public interface CustomBarRepo extends CrudRepository<CustomBar, Integer> {
    Iterable<CustomBar> findAllBySymbolOrderByBarIdDesc(String symbol);
    Iterable<CustomBar> findBySymbolOrderByBarIdDesc(String symbol);


}
