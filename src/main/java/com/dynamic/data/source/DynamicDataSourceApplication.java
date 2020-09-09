package com.dynamic.data.source;

import com.dynamic.data.source.core.handler.DataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
/**
 * @author mqz
 */
@Configuration
@EnableAutoConfiguration
@MapperScan(basePackages = {"com.dynamic.data.source.**.mapper.**"})
@ComponentScan(basePackages = {"com.dynamic.data.source"})
@Import({DataSourceRegister.class})
public class DynamicDataSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDataSourceApplication.class, args);
    }

}
