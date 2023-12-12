package com.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.entity.StudentsDetailsEntity;
import com.students.service.StudentsDetailsService;

@RestController
@RequestMapping("/api")
public class StudentsDetailsController {
	@Autowired
	StudentsDetailsService studentsDetailsService;
	    
	
	@GetMapping("/getStudentsDetailsEntityById/{id}")
	
	public StudentsDetailsEntity getStudentsDetailsEntityById (@PathVariable int id) {
		StudentsDetailsEntity std= studentsDetailsService.getStudentsDetailsEntityById(id);
		return  std;
		    
	}
	
@PostMapping("save/students_details")	
	
	public StudentsDetailsEntity saveStudentsDetailsEntity(@RequestBody StudentsDetailsEntity studentsDetailsEntity) {
	StudentsDetailsEntity stdinfo=studentsDetailsService.saveStudentsDetailsEntity(studentsDetailsEntity);
	return stdinfo;
}

@GetMapping("/_getStudentsDetailsEntityByAddress/{address}")
	
	public StudentsDetailsEntity getStudentsDetailsEntityByAddress(@PathVariable String address) {
	StudentsDetailsEntity std=studentsDetailsService.getStudentsDetailsEntityByAddress(address);
	return std;
}
@PutMapping("/updateStudentsDetailsEntity")

public StudentsDetailsEntity updateStudentsDetailsEntity(@RequestBody StudentsDetailsEntity studentsDetailsEntity ) {
	StudentsDetailsEntity std=studentsDetailsService.updateStudentsDetailsEntity(studentsDetailsEntity);
	return std;
}
@DeleteMapping("/_deleteStudentsDetailsById/{id}")
public void _deleteStudentsDetailsById(@PathVariable int id) {
	studentsDetailsService._deleteStudentsDetailsById(id);
}
   
@DeleteMapping("/deleteAll")
public void deleteAllStudentsDetails() {
	studentsDetailsService.deleteAllStudentsDetails();
}

}

	
	
	
	
	
	
	


