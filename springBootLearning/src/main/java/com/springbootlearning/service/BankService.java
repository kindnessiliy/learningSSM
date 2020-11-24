package com.springbootlearning.service;

import com.springbootlearning.mapper.BankMapper;
import com.springbootlearning.pojo.Bank;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author:zyh
 * @Time:2020-11-22-16:23
 * @email:1269231889@qq.com
 */
@Service
public class BankService {
    @Resource
    private BankMapper bankMapper;

    public Bank findByName(String name){
        return bankMapper.selectByPrimaryKey(name);
    }
    @Transactional
    public void saveBank(Bank bank){
        //如果属性为空不会出现在insert语句上
        bankMapper.insertSelective(bank);
    }
}
