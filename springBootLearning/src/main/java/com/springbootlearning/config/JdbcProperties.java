package com.springbootlearning.config;

/**
 * @author:zyh
 * @Time:2020-11-22-13:39
 * @email:1269231889@qq.com
 */
//从配置文件中读取配置项,配置类中类变量名必须要与前缀之后配置项名称保存相同（松散绑定）
//@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
