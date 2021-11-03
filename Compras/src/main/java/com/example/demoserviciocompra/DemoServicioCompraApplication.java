package com.example.demoserviciocompra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
/*@ComponentScan(basePackages = {"com.example.demoservicioproducto"})*/
public class DemoServicioCompraApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServicioCompraApplication.class, args);
    }

}
