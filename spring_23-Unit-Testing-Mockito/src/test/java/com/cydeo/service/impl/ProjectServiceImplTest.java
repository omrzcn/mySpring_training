package com.cydeo.service.impl;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.entity.Project;
import com.cydeo.mapper.ProjectMapper;
import com.cydeo.repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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

        // find project by code
        when(projectRepository.findByProjectCode(anyString())).thenReturn(new Project());

        // return me projectDTO
        when(projectMapper.convertToDto(any( Project.class))).thenReturn(new ProjectDTO());


        // this will test getByProjectCode() by using our mocks.
        ProjectDTO projectDTO  = projectService.getByProjectCode(anyString());

        // i want to check the order
        InOrder inOrder = inOrder(projectRepository,projectMapper);
        inOrder.verify(projectRepository).findByProjectCode(anyString());
        inOrder.verify(projectMapper).convertToDto(any(Project.class));


        assertNotNull(projectDTO); // we want to see in here it is not null end of the test

    }

}