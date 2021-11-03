package com.example.demoserviciodonacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
/*@ComponentScan(basePackages = {"com.example.demoservicioproducto"})*/
public class DemoServicioDonacionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServicioDonacionApplication.class, args);
    }

}
