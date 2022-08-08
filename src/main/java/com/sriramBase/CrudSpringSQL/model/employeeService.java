package com.sriramBase.CrudSpringSQL.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class employeeService {
    private static  employeeRepository repository;

    public employeeService(employeeRepository repository) {
        employeeService.repository = repository;
    }

    public static List<employee> getAllEmployees()
    {
       List<employee> l1=new ArrayList<>();
       repository.findAll().forEach(l1::add);
       return l1;
    }
    public static void addEmployee(employee e1)
    {
        System.out.println(e1);
        repository.save(e1);
    }
    public static void updateEmployee(employee e1,int id)
    {
        repository.save(e1);
    }
    public static void deleteEmployee(int id)
    {
        repository.deleteById(id);
    }
}
