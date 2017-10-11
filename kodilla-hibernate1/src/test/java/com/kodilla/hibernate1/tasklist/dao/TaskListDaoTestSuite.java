package com.kodilla.hibernate1.tasklist.dao;


import com.kodilla.hibernate1.task.TaskList;
import com.kodilla.hibernate1.task.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;



@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "List Name";

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LISTNAME,"listName");
        taskListDao.save(taskList);
        String description = taskList.getDescription();

        //When
        List<TaskList> readTasklist = taskListDao.findByListName(description);

        //Then
        Assert.assertEquals(1,readTasklist.size());

        //CleanUp
        taskListDao.delete(taskList);
    }

}
