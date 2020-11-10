package com.educy.mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @Author 马小姐
 * @ClassName MybatisAutoConfiguration
 * @Date 2020-11-10 16:08
 * @Version 1.0
 * @Description:
 */
@ComponentScan(basePackages = "com.educy.mybatis")
@Configuration
@MapperScan(basePackages = "com.educy.mybatis")
public class MybatisAutoConfiguration {
    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3307/spring?useSSL=false");

        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.educy.mybatis");
        sqlSessionFactoryBean.setMapperLocations(new ClassPathResource("UserDao.xml"));
        return sqlSessionFactoryBean;
    }

}
