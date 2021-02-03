package com.certiware.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;



@Configuration
@PropertySource("classpath:datasource.properties")
public class UserConfig {


    @Value("${hj.username}")
    private String username;

    @Value("${hj.password}")
    private String password;

    @Value("${hj.url")
    private String url;

    @Override
    public String toString(){
        return "User{" +
        "username='" + username + '\'' +
        ", password=" + password +
        ", url='" + url + '\'' +
        '}';
    }
   
}
