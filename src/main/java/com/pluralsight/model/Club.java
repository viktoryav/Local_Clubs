package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Club {
	@Id
	@GeneratedValue
	private int id;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Child> children = new ArrayList<Child>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Child> getChildren() {
		return children;
	}
	public void setChildren(List<Child> children) {
		this.children = children;
	}
	
	public void addChild(Child child) {
		this.children.add(child);
	}
}
