package com.employee.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "departmentid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

	@Column(name = "name")
	private String name;

	public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}