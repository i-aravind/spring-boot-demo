package com.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springboot.cruddemo.entity.Employee;

@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it... no need to write any code!
	// Remove @Transactional annotation in service implementations since JPARepository provides it
	// No need for DAO interface and Implementations
}
