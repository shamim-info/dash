package com.students.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.students.entity.StudentsDetailsEntity;
import com.students.repository.StudentsDetailsRepository;
@Service
public class StudentsDetailsService {

	@Autowired
	StudentsDetailsRepository studentsDetailsRepository;
	//public  StudentsDetailsEntity saveStudentsDetailsEntity(StudentsDetailsEntity studentsDetailsEntity) {
	//		return studentsDetailsRepository.save(studentsDetailsEntity) ;
	
	public List<StudentsDetailsEntity> AllStudentsDetailsEntity() {
		
		return (List<StudentsDetailsEntity>)studentsDetailsRepository.findAll() ;
	}
	public StudentsDetailsEntity StudentsDetailsEntityById(int id) {
		
		return studentsDetailsRepository.findById(id);
	}
	public StudentsDetailsEntity getStudentsDetailsEntityById(int id) {
		
		return studentsDetailsRepository.findById(id);
	}
	public StudentsDetailsEntity saveStudentsDetailsEntity(StudentsDetailsEntity studentsDetailsEntity) {
		
		return studentsDetailsRepository.save(studentsDetailsEntity);
	}
	public StudentsDetailsEntity getStudentsDetailsEntityByAddress(String address) {
		// TODO Auto-generated method stub
		return studentsDetailsRepository.findByAddress(address);
	}
	public StudentsDetailsEntity updateStudentsDetailsEntity(StudentsDetailsEntity studentsDetailsEntity) {
		
		return studentsDetailsRepository.save(studentsDetailsEntity);
	}
	public void _deleteStudentsDetailsById(int id) {
		studentsDetailsRepository.deleteById(id);
		
	}
	public void deleteAllStudentsDetails() {
		studentsDetailsRepository.deleteAll();
		
	}
	
	}
	
	
	
	
	
	
	
	
	


