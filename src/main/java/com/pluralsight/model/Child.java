package com.pluralsight.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Child extends Person{
	
	public Child() {
		super();
	}
	
	public Child(Club club) {
		super();
		this.club = club;
	}
	@Temporal(TemporalType.DATE)
	private Date birthday;
	@Transient
	private int age;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "children")
	private List<Parent> parents = new ArrayList<Parent>();
	@ManyToOne(optional=false)
	private Club club = new Club();
	
	public int getAge() {
		
		return age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public List<Parent> getParents() {
		return parents;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setParents(List<Parent> parents) {
		this.parents = parents;
	}
}
