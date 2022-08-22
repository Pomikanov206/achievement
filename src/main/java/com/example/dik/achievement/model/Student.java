package com.example.dik.achievement.model;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_group")
    private String group;
    /*
    Achievements save in JSON format
     */
    @Column(name = "achievement_list")
    private String achievements;
}
