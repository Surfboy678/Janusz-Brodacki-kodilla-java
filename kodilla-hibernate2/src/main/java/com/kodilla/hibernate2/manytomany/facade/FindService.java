package com.kodilla.hibernate2.manytomany.facade;
import com.kodilla.hibernate2.manytomany.Company;
import com.kodilla.hibernate2.manytomany.Employee;
import com.kodilla.hibernate2.manytomany.dao.CompanyDao;
import com.kodilla.hibernate2.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FindService.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> searchCompanyByName (String name) throws FindServiceException{
        List<Company> companyName = companyDao.searchCompanyByName("%" + name + "%");
        if(!companyName.isEmpty()){
            LOGGER.info("Company" + companyName + "found");
            return companyName;
        }else {
            LOGGER.error(FindServiceException.ERR_NOT_FOUND_COMPANY);
            throw new FindServiceException(FindServiceException.ERR_NOT_FOUND_COMPANY);
        }
    }
    public List<Employee> searchEmployeeByLastname(String lastName) throws FindServiceException{
        List<Employee> employeeLastname = employeeDao.searchEmployeeByLastname("%" + lastName + "%");
        if(!employeeLastname.isEmpty()){
            LOGGER.info("Employee" + employeeLastname + "found");
            return employeeLastname;
        }else {
            LOGGER.error(FindServiceException.ERR_NOT_FOUND_EMPLOYEE);
            throw new FindServiceException(FindServiceException.ERR_NOT_FOUND_EMPLOYEE);
        }
    }
}
