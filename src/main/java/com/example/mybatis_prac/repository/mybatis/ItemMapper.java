package com.example.mybatis_prac.repository.mybatis;

import com.example.mybatis_prac.domain.Item;
import com.example.mybatis_prac.domain.ItemSearchCond;
import com.example.mybatis_prac.domain.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ItemMapper {
    void save(Item item);

    void update(@Param("id")Long id, @Param("updateParam") ItemUpdateDto updateDto);

    List<Item> findAll(ItemSearchCond itemSearch);

    Optional<Item> findById(Long id);
}
