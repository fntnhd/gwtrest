package com.us.fountainhead.gwtrest.server.service.impl;

import com.us.fountainhead.gwtrest.server.entity.*;
import com.us.fountainhead.gwtrest.server.service.CourseService;
import com.us.fountainhead.gwtrest.server.validate.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    /**
     * findCoursesForInstructor
     * @param instructor
     * @return Course
     * @see Instructor
     */
    @Override
    public List<Course> findCoursesForInstructor(Instructor instructor) throws ValidationException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}