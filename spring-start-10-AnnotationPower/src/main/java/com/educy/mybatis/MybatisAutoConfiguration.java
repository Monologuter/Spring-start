package com.educy.mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @Author 马小姐
 * @ClassName MybatisAutoConfiguration
 * @Date 2020-11-10 16:08
 * @Version 1.0
 * @Description:
 */
@Configuration
@ComponentScan(basePackages = "com.educy.mybatis")
@MapperScan(basePackages = "com.educy.mybatis")
public class MybatisAutoConfiguration {
    @Autowired
    private MybatisProperties mybatisProperties;
    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl("jdbc:mysql://localhost:3307/spring?useSSL=false");
        dataSource.setUrl(mybatisProperties.getUrl());

//        dataSource.setUsername("root");
        dataSource.setUsername(mybatisProperties.getUsername());
//        dataSource.setPassword("123456");
        dataSource.setPassword(mybatisProperties.getPassword());
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setDriverClassName(mybatisProperties.getDriverClassName());
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
//        sqlSessionFactoryBean.setTypeAliasesPackage("com.educy.mybatis");
        sqlSessionFactoryBean.setTypeAliasesPackage(mybatisProperties.getTypeAliasesPackage());
//        sqlSessionFactoryBean.setMapperLocations(new ClassPathResource("UserMapper.xml"));
        try {
            PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
//            Resource[] resources = pathMatchingResourcePatternResolver.getResources("com.educy.mybatis/*Mapper.xml");
            Resource[] resources = pathMatchingResourcePatternResolver.getResources(mybatisProperties.getMapperlocations());
            sqlSessionFactoryBean.setMapperLocations(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSessionFactoryBean;
    }
}
