package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="animal_details")
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "animal_aid_seq", initialValue = 1)
	@Column(name = "Animal_Id",scale = 20)
	private int aid;
	
	@Column(name = "Name", length = 20)
	private String aname;
	
	@Column(name = "Age", length = 10)
	private int age;
	
	@Column(name = "Sub_Specie")
	private String subspecie;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="category")
	private String category;
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(int aid, String aname, int age, String subspecie, String gender, String category) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.age = age;
		this.subspecie = subspecie;
		this.gender = gender;
		this.category=category;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSubspecie() {
		return subspecie;
	}

	public void setSubspecie(String subspecie) {
		this.subspecie = subspecie;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Animal [aid=" + aid + ", aname=" + aname + ", age=" + age + ", subspecie=" + subspecie + ", gender="
				+ gender + "]";
	}
	
}
