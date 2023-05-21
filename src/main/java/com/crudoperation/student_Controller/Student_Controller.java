package com.crudoperation.student_Controller;

import com.crudoperation.student_Repository.Student_Repository;
import com.crudoperation.student_entity.Student_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Student_Controller {
    @Autowired
    private Student_Repository studentRepository;

    //posting student information in repository
    @PostMapping("/post")
    public Student_Entity posting(@RequestBody Student_Entity student_entity){
       return studentRepository.save(student_entity);
    }
    @GetMapping("/getAll")
    public Iterable<Student_Entity> get_All(){
        return studentRepository.findAll();
    }


}
