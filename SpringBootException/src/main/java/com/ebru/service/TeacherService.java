package com.ebru.service;


import com.ebru.model.Teacher;
import com.ebru.repository.TeacherRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Sample Service Class to show the repository injection
 * without control and exceptions
 */
@Transactional
@Service
public class TeacherService {


    @Autowired
    TeacherRepository teacherRepository;

    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }

    public Teacher getTeacher(Long id) {
        return teacherRepository.findById(id).get();
    }

    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher updateTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public String deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
        return "Success";
    }

}