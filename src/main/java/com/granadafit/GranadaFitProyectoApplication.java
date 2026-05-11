package com.granadafit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.granadafit", "com/granadafit/controller", "com/granadafit/repository"})
public class GranadaFitProyectoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GranadaFitProyectoApplication.class, args);
    }

}
