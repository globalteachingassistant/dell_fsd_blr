package com.model;

import java.util.Arrays;

public class User {
private String fullName;
private String email;
private String password;
private int age;
private String country;
private String gender;
private String[] hobby;
public User() {
	// TODO Auto-generated constructor stub
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String[] getHobby() {
	return hobby;
}
public void setHobby(String[] hobby) {
	this.hobby = hobby;
}
@Override
public String toString() {
	return "User [fullName=" + fullName + ", email=" + email + ", password=" + password + ", age=" + age + ", country="
			+ country + ", gender=" + gender + ", hobby=" + Arrays.toString(hobby) + "]";
}

}
