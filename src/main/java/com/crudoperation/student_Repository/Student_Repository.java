package com.crudoperation.student_Repository;

import com.crudoperation.student_entity.Student_Entity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface Student_Repository extends CrudRepository<Student_Entity,Integer> {
}
