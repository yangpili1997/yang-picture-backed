package com.yang.yangpicturebacked;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.yang.yangpicturebacked.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class YangPictureBackedApplication {

    public static void main(String[] args) {
        SpringApplication.run(YangPictureBackedApplication.class, args);
    }

}
