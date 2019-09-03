package model;

public class Car {
	private String make = "";
	private double cost = 0;
	private int yearProduced = 0;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String make) {
		super();
		this.make = make;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getYearProduced() {
		return yearProduced;
	}

	public void setYearProduced(int yearProduced) {
		this.yearProduced = yearProduced;
	}
	
	

}
