package com.cydeo.service.impl;

import com.cydeo.mapper.ProjectMapper;
import com.cydeo.repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ProjectServiceImplTest {


    @Mock
    ProjectRepository projectRepository;

    @Mock
    ProjectMapper projectMapper;


    @InjectMocks
    ProjectServiceImpl projectService;


    @Test
    void getByProjectCode() {




    }
}