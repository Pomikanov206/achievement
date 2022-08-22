package com.example.dik.achievement.repository;

import com.example.dik.achievement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
