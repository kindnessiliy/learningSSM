package com.ssm.service;

import com.ssm.domain.Account;

import java.io.IOException;
import java.util.List;

/**
 * @author:zyh
 * @Time:2020-11-20-14:46
 * @email:1269231889@qq.com
 */
public interface AccountService {
    void save(Account account) throws IOException;
    List<Account> findAll() throws IOException;
}
