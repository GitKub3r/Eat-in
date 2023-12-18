package Modelo;

public class Direccion {
	private String street;
	private String building;
	private String door;
	private String floor;
	
	public Direccion(String street, String building, String door, String floor) {
		this.street = street;
		this.building = building;
		this.door = door;
		this.floor = floor;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}
}
