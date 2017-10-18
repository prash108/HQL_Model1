package com.app.hql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="cosmetic_table")
public class CosmeticsDTO implements Serializable
{

	@Column(name="cos_Brand")
 private String brand;
 public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Column(name="cos_cost")
private int cost;
@Column(name="cos_type")
 private String type;
@Column(name="cos_color")
 private String color;

//public constructor

public CosmeticsDTO()
{
	
}
 
 
}
