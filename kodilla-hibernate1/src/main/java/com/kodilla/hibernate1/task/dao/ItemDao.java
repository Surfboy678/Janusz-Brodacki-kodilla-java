package com.kodilla.hibernate1.task.dao;

import com.kodilla.hibernate1.invoice.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemDao extends CrudRepository<Item,Integer> {
}
