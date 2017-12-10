package com.kodilla.hibernate2.manytomany.dao.facade;


import com.kodilla.hibernate2.manytomany.Company;
import com.kodilla.hibernate2.manytomany.Employee;
import com.kodilla.hibernate2.manytomany.dao.CompanyDao;
import com.kodilla.hibernate2.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate2.manytomany.facade.FindService;
import com.kodilla.hibernate2.manytomany.facade.FindServiceException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FindServiceTestSuite {

    /*@Autowired
    private FindService findService;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindByLastName() throws FindServiceException{
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stephanieClarcksonId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaKovalsyId = lindaKovalsky.getId();

        //When
        List<Company> employeeLastname = findService.searchCompanyByName("son");

        //Then
        Assert.assertEquals(1,employeeLastname.size());

        //CleanUp
        employeeDao.delete(johnSmithId);
        employeeDao.delete(stephanieClarcksonId);
        employeeDao.delete(lindaKovalsyId);
    }

    @Test
    public void testFindName() throws FindServiceException{
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        List<Company> companyName = findService.searchCompanyByName("ine");
        //Then
        Assert.assertEquals(1, companyName.size());
        //CleanUp
        companyDao.delete(softwareMachineId);
        companyDao.delete(dataMaestersId);
        companyDao.delete(greyMatterId);
    } */
}
