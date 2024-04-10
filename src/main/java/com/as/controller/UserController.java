package com.as.controller;

import com.as.domain.User;
import com.as.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("toupdate/{id}")
    public String toUpdate(Model model,@PathVariable("id") Long id){
        User user = userService.queryById(id);

        model.addAttribute("user",user);

        return "user/update";
    }

    @GetMapping("update")
    public String update(User user,Model model){

        //修改
        userService.update(user);
        //返回数据到新页面
        User user1 = userService.queryById(1l);
        model.addAttribute("user",user1);
        return "user/show";
    }
    @Autowired
    DataSource dataSource;
    @GetMapping("/show/{id}")
    public String show(Model model, @PathVariable Long id){
        User user = userService.queryById(id);


        System.out.println(dataSource);
        List list = new ArrayList();

        list.add("hello");
        list.add("world");
        model.addAttribute("user",user);
        model.addAttribute("list",list);
        return "user/show";
    }

    // 导航到新添页面的方法
    @RequestMapping("toinsert")
    public String toInsert() {
        System.out.println("准备跳转到新用户添加页...");
        return "user/insert";
    }
    // 新添
    @RequestMapping("insert")
    public String insert(User user) {
        System.out.println("拿到前台传递过来的数据 user -> " + user);
        userService.save(user);
        return "redirect:/show/" + user.getId();
    }
    /*--------------------------serviceinterface---------------------------------*/


    @Value("${page.size}")
    String pageSize;
    @Autowired
    com.as.serviceinterface.UserService userServiceImpl;

    @RequestMapping("queryByPage/{curPage}")
    public String queryByPage(@PathVariable("curPage") Integer curPage,Model model){
        if(curPage<1)
            curPage = 1;
        PageInfo pageInfo = userServiceImpl.queryByPage(curPage,Integer.valueOf(pageSize));

        model.addAttribute("pageInfo",pageInfo);
        return "user/showByPage";
    }


    /*----------------------------------------------------------------*/
}
