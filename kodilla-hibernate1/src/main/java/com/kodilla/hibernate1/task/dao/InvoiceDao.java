package com.kodilla.hibernate1.task.dao;

import com.kodilla.hibernate1.invoice.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceDao extends CrudRepository<Invoice, Integer> {
}
