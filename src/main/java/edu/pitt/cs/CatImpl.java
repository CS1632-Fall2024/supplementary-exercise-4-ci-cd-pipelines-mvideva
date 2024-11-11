package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	private int id;
	private String name;
	private boolean isRented;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
		isRented = false;
	}

	public void rentCat() {
		if(!isRented) // available to rent
		{
			isRented = true;
		}
	}

	public void returnCat() {
		if(isRented) // available to return
		{
			isRented = false;
		}
	}

	public void renameCat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public boolean getRented() {
		return isRented;
	}

	public String toString() {
		return String.format("ID %d. %s", id, name);
	}
}