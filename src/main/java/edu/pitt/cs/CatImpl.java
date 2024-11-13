package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	private int id;
	private String name;
	private boolean rented = false;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void rentCat() {
		rented = true;
	
	}

	public void returnCat() {
		rented = false; 
	}

	public void renameCat(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public boolean getRented() {
		return rented;
	}
	// is "ID 1. Garfield".
	public String toString() {
		String cat = "ID "+ this.id+ ". " + this.name;
		return cat;
	}

}