package com.cydeo.service.impl;

import com.cydeo.mapper.UserMapper;
import com.cydeo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    UserRepository userRepository;

    @Mock
    UserMapper userMapper;

    @InjectMocks
    UserServiceImpl userService;



    @Test
    void findByUserName() {

        // i m calling real method inside the main which is the method i want to test
        userService.findByUserName("harold@manager.com");

        // checking the method runs or not.
        verify(userRepository).findByUserNameAndIsDeleted("harold@manager.com",false);


        //times
        verify(userRepository,times(1)).findByUserNameAndIsDeleted("harold@manager.com",false);

        //atLeastOnce()
        verify(userRepository,atLeastOnce()).findByUserNameAndIsDeleted("harold@manager.com",false);


        //atLeast()
        verify(userRepository,atLeast(1)).findByUserNameAndIsDeleted("harold@manager.com",false);
        verify(userRepository,atMostOnce()).findByUserNameAndIsDeleted("harold@manager.com",false);


        // InOrder
        InOrder inOrder = inOrder(userRepository,userMapper);

        inOrder.verify(userRepository).findByUserNameAndIsDeleted("harold@manager.com",false);
        inOrder.verify(userMapper).convertToDto(null);

    }



}