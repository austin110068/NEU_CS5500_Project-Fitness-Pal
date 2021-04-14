package edu.neu.fitnesspal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("edu.neu.fitnesspal.dao")
@SpringBootApplication
public class FitnesspalApplication {

    public static void main(String[] args) {
        SpringApplication.run(FitnesspalApplication.class, args);
    }

}
