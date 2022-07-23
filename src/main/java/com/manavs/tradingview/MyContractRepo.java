package com.manavs.tradingview;

import org.springframework.data.repository.CrudRepository;

public interface MyContractRepo extends CrudRepository<MyContract, Integer> {
    MyContract findBySymbol(String symbol);
}
