package com.as.serviceinterface;

import com.as.domain.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> findAll();
    Goods findById(Integer goodsId);
    void add(Goods goods);
    void modify(Goods goods);
    void deleteById(Integer goods);
}
