package com.students.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="/students_details")
public class StudentsDetailsEntity {
@Id
@GeneratedValue 

private int id;

private String name;
public StudentsDetailsEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public StudentsDetailsEntity(int id, String name, String fathersname, String mothersname, String address,
		String hobbies, String qualification) {
	super();
	this.id = id;
	this.name = name;
	this.fathersname = fathersname;
	this.mothersname = mothersname;
	this.address = address;
	this.hobbies = hobbies;
	this.qualification = qualification;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFathersname() {
	return fathersname;
}
public void setFathersname(String fathersname) {
	this.fathersname = fathersname;
}
public String getMothersname() {
	return mothersname;
}
public void setMothersname(String mothersname) {
	this.mothersname = mothersname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getHobbies() {
	return hobbies;
}
public void setHobbies(String hobbies) {
	this.hobbies = hobbies;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
private String fathersname;
private String mothersname;
private String address;
private String hobbies;
private String qualification;

}
