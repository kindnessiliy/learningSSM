package com.ssm.mapper;

import com.ssm.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author:zyh
 * @Time:2020-11-19-16:20
 * @email:1269231889@qq.com
 */
public interface AccountMapper {
    void save(Account account);
    List<Account> findAll();
}
