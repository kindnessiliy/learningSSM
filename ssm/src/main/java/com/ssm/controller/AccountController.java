package com.ssm.controller;

import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * @author:zyh
 * @Time:2020-11-20-14:49
 * @email:1269231889@qq.com
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @ResponseBody
    //为了避免出现中英文转换问题，使用produces，进行转换
    @RequestMapping(value = "/save",produces = "text/html;charset=UTF-8")
    public String save(Account account) throws IOException {
        accountService.save(account);
        return "保存成功";
    }
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("accountList");
        try {
            modelAndView.addObject("accountList",accountService.findAll());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return modelAndView;
    }

}
