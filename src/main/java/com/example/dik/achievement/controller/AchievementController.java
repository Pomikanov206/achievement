package com.example.dik.achievement.controller;

import com.example.dik.achievement.exception.ResourceNotFoundException;
import com.example.dik.achievement.model.Student;
import com.example.dik.achievement.repository.AchievementRepository;
import com.example.dik.achievement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class AchievementController {
    @Autowired
    AchievementRepository achievementRepository;
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/achievement/{id}")
    public ResponseEntity<Student> getStudentAchievement(@PathVariable(value = "id") Long studentId)
            throws ResourceNotFoundException {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Student not found for this id :" + studentId));

        return ResponseEntity.ok().body(student);
    }

    @GetMapping("/group_list")
    public ResponseEntity<String[]> getGroupList() {

        String[] groupList = new String[]{};

        return ResponseEntity.ok().body(groupList);
    }

    @GetMapping("/student_list")
    public ResponseEntity<List<Student>> getStudentList() {
        return null;
    }
}
