package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Tables")
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	private String email;
	private String city;
	private String profilePicFilename;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProfilePicFilename() {
		return profilePicFilename;
	}
	public void setProfilePicFilename(String profilePicFilename) {
		this.profilePicFilename = profilePicFilename;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", city=" + city
				+ ", profilePicFilename=" + profilePicFilename + "]";
	}
	
	


}
