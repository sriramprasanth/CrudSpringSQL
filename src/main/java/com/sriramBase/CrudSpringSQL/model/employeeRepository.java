package com.sriramBase.CrudSpringSQL.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface employeeRepository extends CrudRepository<employee,Integer> {
}
