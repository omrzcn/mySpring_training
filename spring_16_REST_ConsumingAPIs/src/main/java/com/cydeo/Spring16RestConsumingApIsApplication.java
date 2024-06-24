package com.cydeo;

import feign.Feign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
public class Spring16RestConsumingApIsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring16RestConsumingApIsApplication.class, args);
    }



    @Bean
   public RestTemplate restTemplate(){

        return new RestTemplate();
   }



}
