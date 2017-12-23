package com.example.demo.service.Impl;

import com.example.demo.domain.Repository.StockTestRepository;
import com.example.demo.domain.StockTest;
import com.example.demo.service.StockTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockTestServiceImpl implements StockTestService {
    @Autowired
    StockTestRepository stockTestRepository;

    @Override
    public List<StockTest> findAll(){
        return stockTestRepository.findAll();
    }

}
