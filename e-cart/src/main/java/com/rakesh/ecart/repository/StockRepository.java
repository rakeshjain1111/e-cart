package com.rakesh.ecart.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rakesh.ecart.model.Stock;


@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

}
