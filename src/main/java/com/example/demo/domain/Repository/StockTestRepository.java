package com.example.demo.domain.Repository;

import com.example.demo.domain.StockTest;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StockTestRepository extends JpaRepository<StockTest,Long>{

}
