package com.kodilla.hibernate1.task;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskListDao extends CrudRepository<TaskList,String> {
    List<TaskList> findByListName(String listName);
}
