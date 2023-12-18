package Modelo;

public class Pedido {
	private String burger;
	private String fries;
	private String drink;
	private double price;
	
	public Pedido(String burger, String fries, String drink, double price) {
		this.burger = burger;
		this.fries = fries;
		this.drink = drink;
		this.price = price;
	}

	public String getBurger() {
		return burger;
	}

	public void setBurger(String burger) {
		this.burger = burger;
	}

	public String getFries() {
		return fries;
	}

	public void setFries(String fries) {
		this.fries = fries;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
