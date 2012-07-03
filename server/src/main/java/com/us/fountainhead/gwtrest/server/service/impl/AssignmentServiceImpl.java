package com.us.fountainhead.gwtrest.server.service.impl;

import com.us.fountainhead.gwtrest.server.entity.*;
import com.us.fountainhead.gwtrest.server.service.AssignmentService;
import com.us.fountainhead.gwtrest.server.validate.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AssignmentServiceImpl implements AssignmentService {

    /**
     * findPupilAssignments
     * @param assignment
     * @return PupilAssignment
     * @see Assignment
     */
    @Override
    public List<PupilAssignment> findPupilAssignments(Assignment assignment) throws ValidationException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * findAssignmentsForCourse
     * @param course
     * @return Assignment
     * @see Course
     */
    @Override
    public List<Assignment> findAssignmentsForCourse(Course course) throws ValidationException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * assignGradeToPupilAssignment
     * @param pupilAssignment
     * @param grade
     * @see PupilAssignment
     * @see Integer
     */
    @Override
    public void assignGradeToPupilAssignment(PupilAssignment pupilAssignment, Integer grade) throws ValidationException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}