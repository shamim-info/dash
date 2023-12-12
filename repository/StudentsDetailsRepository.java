package com.students.repository;

import org.springframework.data.repository.CrudRepository;

import com.students.entity.StudentsDetailsEntity;
import com.students.service.StudentsDetailsService;
import java.util.List;


public interface  StudentsDetailsRepository extends CrudRepository<StudentsDetailsEntity, Integer>  {
	
	StudentsDetailsEntity findById(int id);

	StudentsDetailsEntity findByAddress(String address);
	
}
