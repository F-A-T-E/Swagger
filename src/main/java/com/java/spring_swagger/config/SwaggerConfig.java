package com.java.spring_swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description: TODO
 * @Date: 2020/10/20 18:30
 * @Author: miaoxiong
 * @ModifiedBy:miaoxiong
 * @Version 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /*

     */


    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                //扫描的那个接口的包
                .apis(RequestHandlerSelectors.basePackage("com.java.spring_swagger.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfoBuilder()
                        .title("SpringBoot整合Swagger使用")
                        .description("SpringBoot整合Swagger，详细信息。。。。")
                        .version("9.0")
                        .contact(new Contact("xiaochen","www.baidu.com","1359706026@qq.com"))
                        .license("The Baizhi License")
                        .licenseUrl("http://www.baizhiedu.com")
                        .build());
    }
}
