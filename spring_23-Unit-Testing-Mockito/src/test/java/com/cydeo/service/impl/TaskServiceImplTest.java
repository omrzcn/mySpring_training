package com.cydeo.service.impl;

import com.cydeo.dto.TaskDTO;
import com.cydeo.entity.Task;
import com.cydeo.mapper.TaskMapper;
import com.cydeo.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TaskServiceImplTest  {

    @Mock
    TaskRepository taskRepository;

    @Mock
    TaskMapper taskMapper;
    @InjectMocks
    TaskServiceImpl taskService;



    @ParameterizedTest
    @ValueSource(longs = {1L,2L,3L})
    void findById(long id) {

        Task task = new Task();

        when(taskRepository.findById(id)).thenReturn(Optional.of(task)); // its gonna give us Optional<Task>.
        when(taskMapper.convertToDto(task)).thenReturn(new TaskDTO());


        taskService.findById(id);

        verify(taskRepository).findById(id);
        verify(taskMapper).convertToDto(task);




    }
}