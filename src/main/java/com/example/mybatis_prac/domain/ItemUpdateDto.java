package com.example.mybatis_prac.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemUpdateDto {
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;
}
