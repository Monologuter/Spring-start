package com.educy.mybatis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author 马小姐
 * @ClassName MybatisProperties
 * @Date 2020-11-10 17:40
 * @Version 1.0
 * @Description:
 */
@Component
@PropertySource("classpath:mybatis.properties")

public class MybatisProperties {
    @Value("${mybatis.driverClassName}")
    private String driverClassName ;

    @Value("${mybatis.url}")
    private String url;

    @Value("${mybatis.username}")
    private String username;

    @Value("${mybatis.password}")
    private String password;

    @Value("${mybatis.TypeAliasesPackage}")
    private String TypeAliasesPackage;

    @Value("${mybatis.mapperlocations}")
    private String mapperlocations;

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

    public String getTypeAliasesPackage() {
        return TypeAliasesPackage;
    }

    public void setTypeAliasesPackage(String typeAliasesPackage) {
        TypeAliasesPackage = typeAliasesPackage;
    }

    public String getMapperlocations() {
        return mapperlocations;
    }

    public void setMapperlocations(String mapperlocations) {
        this.mapperlocations = mapperlocations;
    }
}
