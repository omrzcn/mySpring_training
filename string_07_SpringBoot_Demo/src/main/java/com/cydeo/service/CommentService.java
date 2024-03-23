package com.cydeo.service;

import com.cydeo.config.AppConfigData;
import com.cydeo.config.DBConfigData;
import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class CommentService {

    private final CommentRepository commentRepository; // this interface is for saving object
    private final CommentNotificationProxy commentNotificationProxy; // this interface is for sending email.
    private final AppConfigData appConfigData;
    private final DBConfigData dbConfigData;

    public CommentService(CommentRepository commentRepository, @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy, AppConfigData appConfigData, DBConfigData dbConfigData) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        this.appConfigData = appConfigData;
        this.dbConfigData = dbConfigData;
    }

    public void publishComment(Comment comment){ // we are saving and pushing Comments
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

    public void printConfigData(){

        System.out.println(appConfigData.getUsername());
        System.out.println(appConfigData.getPassword());
        System.out.println(appConfigData.getUrl());
    }
    public void printDBConfigData(){
        System.out.println(dbConfigData.getUsername());
        System.out.println(dbConfigData.getPassword());
        System.out.println(dbConfigData.getType());
    }
}
