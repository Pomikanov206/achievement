package com.example.dik.achievement.config;

import com.example.dik.achievement.model.Student;
import com.example.dik.achievement.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(StudentRepository studentRepository){
        return args -> {
            log.info("Preloading " + studentRepository.save(new Student(1,"Bob","group1",null)));
            log.info("Preloading " + studentRepository.save(new Student(2,"Stan", "group2", null)));
        };
    }
}
