package com.crudoperation.student_entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student_Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Subject")
    private String subject;
    @Column(name = "Teacher")
    private String teacher;
    //default Constructor
    public Student_Entity() {
    }
    //Parameterized Constructor
    public Student_Entity(int id, String name, String subject, String teacher) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.teacher = teacher;
    }
    //getter and setter method
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
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getTeacher() {
        return teacher;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    //toString method Overriding
    @Override
    public String toString() {
        return "Student_Entity [id=" + id + ", name=" + name + ", subject=" + subject + ", teacher=" + teacher + "]";
    }
}

