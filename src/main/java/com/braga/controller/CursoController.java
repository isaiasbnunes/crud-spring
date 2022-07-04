package com.braga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.braga.model.Course;
import com.braga.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
public class CursoController {
    
  
    private CourseRepository courseRepository;

    

    public CursoController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    
    @GetMapping
    public List<Course> list(){
        return courseRepository.findAll();
    }
    
}
