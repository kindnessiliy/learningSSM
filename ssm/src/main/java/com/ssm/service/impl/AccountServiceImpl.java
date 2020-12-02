package com.ssm.service.impl;

import com.ssm.domain.Account;
import com.ssm.mapper.AccountMapper;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

/**
 * @author:zyh
 * @Time:2020-11-20-14:47
 * @email:1269231889@qq.com
 */
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public void save(Account account) throws IOException {
        accountMapper.save(account);
    }

    @Override
    public List<Account> findAll() throws IOException {
        List<Account> all = accountMapper.findAll();
        return all;
    }
}
