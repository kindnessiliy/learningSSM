package com.springbootlearning.service;

import com.springbootlearning.pojo.Bank;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



/**
 * @author:zyh
 * @Time:2020-11-22-19:19
 * @email:1269231889@qq.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BankServiceTest {
    @Autowired
    private BankService bankService;
    @Test
    public void findByName() {
        Bank zyh = bankService.findByName("zyh");
        System.out.println(zyh);
    }

    @Test
    public void saveBank() {
        Bank bank = new Bank();
        bank.setName("daofen");
        bank.setMoney(8000.0);
        bankService.saveBank(bank);
    }
}