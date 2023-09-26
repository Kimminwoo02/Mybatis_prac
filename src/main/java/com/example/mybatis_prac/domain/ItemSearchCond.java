package com.example.mybatis_prac.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemSearchCond {
    private String itemName;
    private Integer maxPrice;


}
