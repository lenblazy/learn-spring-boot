package com.lenibonje.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
    public List<Course> coursesList() {
        return Arrays.asList(
        new Course(1, "Spring boot","Mhindi" ) ,
        new Course(2, "SwiftUI","mzungu" ),
        new Course(4, "Learn azure","error" ),
        new Course(5, "Learn azure","error" ),
        new Course(6, "Learn azure","error" )
        );
    }

}
