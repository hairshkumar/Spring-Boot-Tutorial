package com.employee.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.example.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {

}
