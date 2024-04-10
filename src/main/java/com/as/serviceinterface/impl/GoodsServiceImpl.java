package com.as.serviceinterface.impl;

import com.as.domain.Goods;
import com.as.mapper.GoodsMapper;
import com.as.serviceinterface.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<Goods> findAll() {
        try {
            return goodsMapper.selectAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public Goods findById(Integer goodsId) {
        try {
            System.out.println("通过id查找");
            return goodsMapper.selectByPrimaryKey(goodsId);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor =
            {Exception.class})
    public void add(Goods goods) {
        try {
            goodsMapper.insertSelective(goods);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor =
            {Exception.class})
    public void modify(Goods goods) {
        try {
            goodsMapper.updateByPrimaryKey(goods);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor =
            {Exception.class})
    public void deleteById(Integer goodsId) {
        try {
            goodsMapper.deleteByPrimaryKey(goodsId);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        }
}
