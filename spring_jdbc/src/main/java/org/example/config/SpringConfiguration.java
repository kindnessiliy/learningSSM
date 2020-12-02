package org.example.config;/*
    @author:zyh
    @Time:2020-11-08-13:03
    
    */

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("org.example")//组件扫描包
@Import(DataSourcesConfiguration.class)//加载其他配置类，为数组，可以导入多个配置类
public class SpringConfiguration {
}
