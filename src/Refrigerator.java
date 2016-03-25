/**
 * This class represents the Refrigerator in task2 idea2 SE1 Assignment1
 * It has three attributes: type, capacity and coolingSystem
 * @author Hassan Gamal Abo-Rasheed
 * @version 1.00 2015/6/10
 */

import java.util.Scanner;

public class Refrigerator extends Appliance {

	private String type;
	private double capacity;
	private String coolingSystem;

	/** The Refrigerator method is a default constructor of Refrigerator class.*/
	public Refrigerator() {
	};

	/** The Refrigerator method is a constructor of Refrigerator class.
	 * @param maker is the company maker name.
	 * @param model is the Refrigerator model.
	 * @param price is the value of Refrigerator price in US dollar.
	 * @param warranty is the value of the warranty.
	 * @param cap is the value of Refrigerator capacity.
	 * @param type is the value of the Refrigerator type.
	 * @param sys is the Refrigerator cooling system.*/
	public Refrigerator(String maker, String model, double price, int warranty,
			double cap, String type, String sys) {
		super(maker, model, price, warranty);
		setCapacity(cap);
		setType(type);
		setCoolingSystem(sys);
	}

	// Setters
	/** The setCapacity method assigns a given value to the Refrigerator capacity. 
	  * @param cap is the value to set the Refrigerator capacity to. */
	public void setCapacity(double cap) {
		this.capacity = cap;
	}

	/** The setType method assigns a given value to the refrigerator type.
	  * @param type is the value to set the refrigerator type to. */
	public void setType(String type) {
		this.type = type;
	}

	/** The setCoolingSystem method assigns a given value to the refrigerator cooling system. 
	  * @param sys is the value to set the refrigerator cooling system to. */
	public void setCoolingSystem(String sys) {
		this.coolingSystem = sys;
	}

	// Getters
	/** The getCapacity method returns the value of the refrigerator capacity.
     * @return returns the value of the refrigerator capacity. */
	public double getCapacity() {
		return this.capacity;
	}

	/** The getType method returns the type of refrigerator.
     * @return returns the type of refrigerator. */
	public String getType() {
		return this.type;
	}

	/** The getCoolingSystem method returns the type of refrigerator cooling system.
     * @return returns the type of refrigerator cooling system*/
	public String getCoolingSystem() {
		return this.coolingSystem;
	}

	/** The IncreaseCapacity method increases the refrigerator capacity by given value
	  * @param value is the value to be increased to the refrigerator capacity */
	public void IncreaseCapacity(double value) {
		setCapacity(getCapacity() + value);
	}

	/** The ChangeType method changes the refrigerator type.
	  * @param type is the value of the new refrigerator type. */
	public void ChangeType(String type) {
		setType(type);
	}

	/** The ChangeCoolingSystem method changes the refrigerator cooling system.
	  * @param newSys is the value of the new cooling system. */
	public void ChangeCoolingSystem(String newSys) {
		setCoolingSystem(newSys);
	}

	/** The toString method returns representation of a Refrigerator object.
	 * @Overrid */
	public String toString() {
		return ("Refrigerator Descriptions:\n**************************\n"
				+ super.toString() + "Cooling System: " + getCoolingSystem()
				+ ".\nType: " + getType() + ".\nCapacity: " + getCapacity() + " cubic feet.\n**************************\n\n");
	}

	/** The add method permits the user to enter a new refrigerator to the store.
	 * @Overrid */
	public void add() {
		super.add();
		Scanner input = new Scanner(System.in);
		String type, coolingSystem;
		double capacity;

		System.out.print("Enter the refrigerator type pls: ");
		type = input.next();
		System.out.print("Enter the cooling system pls: ");
		coolingSystem = input.next();
		System.out.print("Enter the refrigerator capacity pls: ");
		capacity = input.nextDouble();

		this.setCapacity(capacity);
		this.setCoolingSystem(coolingSystem);
		this.setType(type);
		
	}

}
