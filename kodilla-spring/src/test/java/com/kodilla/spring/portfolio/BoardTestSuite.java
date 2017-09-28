package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)

    public class BoardTestSuite {

    @Test
    public void beansTest(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //when
        System.out.println("Beans:");

        //Then
        Arrays.stream(context.getBeanDefinitionNames()).
                forEach(System.out::println);
    }

    @Test
    public void testTaskAdd(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);

        boolean toDo =  board.getToDoList().getTasks().add("Task 1");
        boolean inProgress = board.getInProgressList().getTasks().add("Task 2");
        boolean done  =  board.getDoneList().getTasks().add("Task 3");


        board.getToDoList().getTasks().stream().forEach(System.out::println);
        board.getInProgressList().getTasks().stream().forEach(System.out::println);
        board.getDoneList().getTasks().stream().forEach(System.out::println);


        Assert.assertEquals(toDo,true);
        Assert.assertEquals(inProgress,true);
        Assert.assertEquals(done, true);


        }
    }



