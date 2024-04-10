package com.as.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

//@Configuration
//@PropertySource("classpath:application.properties")
//当我们开启后，整个类中都会从jdbcporperties中拿数据
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {
   /*@Value("${jdbc.url}")
    String url;
     @Value("${jdbc.driverClassName}")
    String className;
    @Value("${jdbc.username}")
    String userName;
    @Value("${jdbc.password}")
    String password;

    @Bean
    public DataSource getDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(className);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        return dataSource;
    }*/

//    @Bean
//    public DataSource getDataSource(JdbcProperties jdbc){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(jdbc.driverClassName);
//        dataSource.setUrl(jdbc.url);
//        dataSource.setUsername(jdbc.username);
//        dataSource.setPassword(jdbc.password);
//        return dataSource;
//    }

//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource getDataSource(){
//        return new DruidDataSource();
//    }
    @Bean
    public String getStr(){
        return " ";
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource getDataSource(){
        return new ComboPooledDataSource();
    }
}
