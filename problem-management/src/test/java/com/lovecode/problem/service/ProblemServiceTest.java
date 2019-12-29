package com.lovecode.problem.service;

import com.lovecode.problem.BaseTest;
import com.lovecode.problem.exception.ObjectNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ProblemServiceTest extends BaseTest {
    @Autowired
    private ProblemService problemService;

    @Test
    void should_throw_object_not_found_exception_when_get_problem_but_not_found() {
        assertThrows(ObjectNotFoundException.class, () -> problemService.getProblemById(1L));
    }
}
