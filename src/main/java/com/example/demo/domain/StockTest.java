package com.example.demo.domain;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "t_stock")
@Data
public class StockTest implements Serializable{
    @Id
    private String id;
    @Column(name = "stock_name")
    private String stockName;
    @Column(name = "date")
    private String date;
    @Column(name = "price")
    private String price;


}
