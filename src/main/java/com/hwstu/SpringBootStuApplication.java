package com.hwstu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//@ServletComponentScan(basePackages = "com.hwstu.web.servlet")
public class SpringBootStuApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootStuApplication.class)
//                .web(WebApplicationType.NONE)
                .run(args);
//        SpringApplication.run(SpringBootStuApplication.class, args);
    }

}
