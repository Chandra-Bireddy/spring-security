package com.cts.swrbd.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="employees")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long empId;


@NotEmpty(message="first name can not be empty")
@NotNull(message="first name can not be null")
private String firstName;


@NotEmpty(message="last name can not be null")
@NotNull(message="last name can not be null")
private String lastName;


//@Min(value=25000,message="basic can not be less than 25000")
//@Max(value=45000,message="basic can not be greater than 45000")
private double basic;

@DateTimeFormat(iso=ISO.DATE)
private LocalDate joinDate;

@Enumerated(EnumType.STRING)
private Department dept;

//@Pattern(regexp="[1-9] {9}",message="Mobile number is expected to be 10 digits")
@NotNull(message="Mobile num can not be omitted")
private String mobileNumber;

@Email(message="email must be a valid one")
@NotNull(message="email can not be omitted")
private String email;

public long getEmpId() {
	return empId;
}
public void setEmpId(long empId) {
	this.empId = empId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public double getBasic() {
	return basic;
}
public void setBasic(double basic) {
	this.basic = basic;
}
public LocalDate getJoinDate() {
	return joinDate;
}
public void setJoinDate(LocalDate joinDate) {
	this.joinDate = joinDate;
}
public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}




}