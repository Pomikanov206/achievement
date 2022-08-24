package com.example.dik.achievement.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private int id;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_group")
    private String group;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "Student_Achievement",
            joinColumns = { @JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "achievement_id")})
    //@Column(name = "achievement_list")
    private Set<Achievement> achievements = new HashSet<>();

    public Student() {
    }

    public Student(int id, String name, String group, Set<Achievement> achievements) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.achievements = achievements;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Set<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(Set<Achievement> achievements) {
        this.achievements = achievements;
    }
}
