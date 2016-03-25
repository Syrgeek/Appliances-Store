/**
 * This class represents the Stove in task2 idea2 SE1 Assignment1
 * It has three attributes: burners, fuel and maxHeat  
 * @author Hassan Gamal Abo-Rasheed
 * @version 1.00 2015/6/10
 */

import java.util.Scanner;

public class Stove extends Appliance {

	private int burners;
	private String fuel;
	private int maxHeat;

	/** The Stove method is a default constructor of Stove class.*/
	public Stove() {
	};

	/** The Stove method is a constructor of Stove class.
	 * @param maker is the company maker name.
	 * @param model is the Stove model.
	 * @param price is the value of Stove price in US dollar.
	 * @param warranty is the value of the warranty.
	 * @param burners is the value of the number of the stove burners.
	 * @param fuel is the type of stove fuel.
	 * @param heat is the maximum stove heat.*/
	public Stove(String maker, String model, double price, int warranty,
			int burners, String fuel, int heat) {
		super(maker, model, price, warranty);
		setBurners(burners);
		setFuel(fuel);
		setMaxHeat(heat);
	}

	// Setters
	/** The setBurners method assigns a given value to the stove burners 
	  * @param burners is the value to set the stove burners to */
	public void setBurners(int burners) {
		this.burners = burners;
	}

	/** The setFuel method assigns a given fuel type to the stove fuel 
	  * @param fuel is the fuel type of the stove */
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	/** The setMaxHeat method assigns a given value to the stove maxHeat
	  * @param cap is the value to set the stove maximum heat.  */
	public void setMaxHeat(int heat) {
		this.maxHeat = heat;
	}

	// Getters
	/** The getBurners method returns the value of the number of stove burners.
     * @return returns the value of the number of stove burners. */
	public int getBurners() {
		return this.burners;
	}

	/** The getFuel method returns the value of the stove fuel type.
     * @return returns the type of the stove fuel type */
	public String getFuel() {
		return this.fuel;
	}

	/** The getMaxHeat method returns the value of the stove maximum heat.
     * @return returns the value of the stove maximum heat in fahrenheit */
	public int getMaxHeat() {
		return this.maxHeat;
	}

	/** The IncreaseBurners method increases the number stove burners by a given value.
	  * @param value is the value to be increased to the number of burners. */
	public void IncreaseBurners(int value) {
		setBurners(getBurners() + value);
	}

	/** The ChangeFuel method changes the stove fuel type.
	  * @param fuel is the value of the new fuel type. */
	public void ChangeFuel(String fuel) {
		setFuel(fuel);
	}

	/** The IncreaseMaxHeat method increases the stove maximum heat by given value
	  * @param value is the value to be increased to the stove maximum heat. */
	public void IncreaseMaxHeat(int value) {
		setMaxHeat(getMaxHeat() + value);
	}

	/** The toString method returns representation of a Stove object.
	 * @Overrid */
	public String toString() {
		return ("Stove Descriptions:\n*******************\n" + super.toString()
				+ "Number of burners: " + getBurners() + ".\nFuel type: "
				+ getFuel() + ".\nMaximum Temperature: " + getMaxHeat() + " °F.\n****************************\n\n");
	}

	/** The add method permits the user to enter a new stove to the store.
	 * @Overrid */
	public void add() {
		super.add();
		Scanner input = new Scanner(System.in);
		int burners, maxHeat;
		String fuel;

		System.out.print("Enter the number of burners pls: ");
		burners = input.nextInt();
		System.out.print("Enter the maximum heat pls: ");
		maxHeat = input.nextInt();
		System.out.print("Enter the fuel type pls: ");
		fuel = input.next();

		this.setBurners(burners);
		this.setFuel(fuel);
		this.setMaxHeat(maxHeat);
		
	}

}
