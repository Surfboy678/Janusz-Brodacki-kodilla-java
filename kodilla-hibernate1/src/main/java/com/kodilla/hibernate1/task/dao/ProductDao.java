package com.kodilla.hibernate1.task.dao;

import com.kodilla.hibernate1.invoice.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Integer> {
}
