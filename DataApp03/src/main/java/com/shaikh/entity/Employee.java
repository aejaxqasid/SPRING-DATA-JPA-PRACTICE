package com.shaikh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Double sal;
	private String addrs;
}
