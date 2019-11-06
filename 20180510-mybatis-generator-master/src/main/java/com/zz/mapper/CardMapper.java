package com.zz.mapper;

import com.zz.model.Card;
import java.util.List;

public interface CardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Card record);

    Card selectByPrimaryKey(Integer id);

    List<Card> selectAll();

    int updateByPrimaryKey(Card record);
}