package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

public class Family {
	private List<Parent> parents = new ArrayList<Parent>();
	private List<Child> children = new ArrayList<Child>();
	
	public List<Child> getChildren() {
		return children;
	}
	public void setChildren(List<Child> children) {
		this.children = children;
	}
	
}
