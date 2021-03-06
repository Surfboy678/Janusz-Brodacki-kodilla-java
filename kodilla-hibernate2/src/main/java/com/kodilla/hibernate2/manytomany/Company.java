package com.kodilla.hibernate2.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@NamedQuery(
        name = "Company.searchCompanyByName",
        query = "FROM Company WHERE name LIKE :fragmentNameOfCompany"
)

@NamedNativeQuery(
        name = "Company.retrieveCompanyWhoseNameBegins",
        query = "SELECT * FROM COMPANIES\n" +
                "WHERE LEFT(COMPANY_NAME, 3) = :STRING",
        resultClass = Company.class
)
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }
    @ManyToMany(cascade = CascadeType.ALL,mappedBy ="companies" )
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
