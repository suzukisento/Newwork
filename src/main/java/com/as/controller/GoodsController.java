package com.as.controller;

import com.as.domain.Goods;
import com.as.serviceinterface.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping("/showAll")
    public String showAll(Model model){
        List<Goods> goodsList = goodsService.findAll();
        model.addAttribute("goodsList", goodsList);
        return "goods/showAll";
    }
    @RequestMapping("/showPage/{pageNum}")
    public String showPage(@PathVariable("pageNum") Integer pageNum,
                           Model model){
        if(pageNum < 1)
            pageNum = 1;
        PageHelper.startPage(pageNum, 3);
        List<Goods> goodsList = goodsService.findAll();
        PageInfo<Goods> pageInfo = new PageInfo<>(goodsList);
        model.addAttribute(pageInfo);
        return "goods/showByPage";
    }
    @RequestMapping("/showOne/{goodsId}")
    public String showOne(@PathVariable("goodsId") Integer goodsId, Model model) {
        Goods goods = goodsService.findById(goodsId);
        model.addAttribute("goods", goods);
        return "goods/showOne";
    }
    @RequestMapping("/pay")
    public String pay(HttpServletRequest request, Model model){
        double totalPrice = Double.parseDouble(request.getParameter("totalPrice"));
        String tradeNo = UUID.randomUUID().toString().replace("-", "");
        String name = request.getParameter("name");
        model.addAttribute("totalPrice", totalPrice);
        model.addAttribute("tradeNo", tradeNo);
        model.addAttribute("name", name);
        return "goods/pay";
    }
}
