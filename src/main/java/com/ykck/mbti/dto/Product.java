package com.ykck.mbti.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int product_Id;
    private String product_Name;
    private String corporate;
    private int price;
    private int perDay;
    private int quantity;
    private String ingreidients;
    private String functionality;
    private String imageUrl;
    private int category_Id;
    
}
