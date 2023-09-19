package net.codejava;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cars {
	private int id;
	private String name;
	private String model;
	private String color;
	private int year;
	private int reserved;
	private int sold;

	public Cars() {
	}

	public Cars(int id) {
		this.id = id;
	}

	public Cars(int id, String name, String model, String color, int year, int reserved, int sold) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.color = color;
		this.year = year;
		this.reserved = reserved;
		this.sold = sold;
	}

	/**
	 * 
	 * @return
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getReserved() {
		return reserved;
	}

	public void setReserved(int reserved) {
		this.reserved = reserved;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cars other = (Cars) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cars [id=" + id + ", name=" + name + ", model=" + model + ", color=" + color + ", year=" + year
				+ ", reserved=" + reserved + ", sold=" + sold + "]";
	}

}
