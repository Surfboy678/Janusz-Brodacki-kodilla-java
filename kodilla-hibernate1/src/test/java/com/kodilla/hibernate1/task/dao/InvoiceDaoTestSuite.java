package com.kodilla.hibernate1.task.dao;

import com.kodilla.hibernate1.invoice.Invoice;
import com.kodilla.hibernate1.invoice.Item;
import com.kodilla.hibernate1.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){

        //Given
        Product product = new Product("Glasses");
        Product product2 = new Product("Sunglasses");
        Item item1 = new Item(new BigDecimal(580),1);
        Item item2 = new Item(new BigDecimal(234),1);
        item1.setProduct(product);
        item2.setProduct(product2);
        product.getItems().add(item1);
        product2.getItems().add(item2);
        Invoice invoice = new Invoice("345/09/2017");
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        //Then
        Assert.assertNotEquals(0, id);
        //CleanUp
        invoiceDao.delete(id);
    }
}
