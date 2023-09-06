package com.hunganh.cellphones_clientweb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.NumberFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductBox {
    private short id;
    private String name;
    private Double unitPrice;
    private Double standardCost;
    private ProductPhoto thumbnail;
    private int discount;
    private String voucher;
    private long avgRating;
}
