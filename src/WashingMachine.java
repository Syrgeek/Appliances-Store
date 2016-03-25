/**
 * This class represents the Washing Machine in task2 idea2 SE1 Assignment1
 * It has three attributes: capacity, spinSpeed and system  
 * @author Hassan Gamal Abo-Rasheed
 * @version 1.00 2015/6/10
 */

import java.util.Scanner;

public class WashingMachine extends Appliance {
	private double capacity;
	private int spinSpeed;
	private String system;

	/** The WashingMachine method is a default constructor of WashingMachine class.*/
	public WashingMachine() {
	};

	/** The WashingMachine method is a constructor of WashingMachine class.
	 * @param maker is the company maker name.
	 * @param model is the WM model.
	 * @param price is the value of WM price in US dollar.
	 * @param warranty is the value of the warranty.
	 * @param cap is the value of WM capacity in kg.
	 * @param spin is the value of spin speed in rpm.
	 * @param sys is the WM system type.*/
	public WashingMachine(String maker, String model, double price,
			int warranty, double cap, int spin, String sys) {
		super(maker, model, price, warranty);
		setCapacity(cap);
		setSpinSpeed(spin);
		setSystem(sys);
	}

	// Setters
	/** The setCapacity method assigns a given value to the WM capacity 
	  * @param cap is the value to set the WM capacity to */
	public void setCapacity(double cap) {
		this.capacity = cap;
	}

	/** The setSpinSpeed method assigns a given value to the WM spin speed 
	  * @param spin is the value to set the WM spin speed to */
	public void setSpinSpeed(int spin) {
		this.spinSpeed = spin;
	}

	/** The setSystem method assigns a given value to the WM working system 
	  * @param sys is the value to set the WM system to */
	public void setSystem(String sys) {
		this.system = sys;
	}

	// Getters
	/** The getCapacity method returns the value of the WM capacity.
     * @return returns the value of the WM capacity in kg */
	public double getCapacity() {
		return this.capacity;
	}

	/** The getSpinSpeed method returns the value of the WM spin speed.
     * @return returns the value of the WM spin speed in rpm */
	public int getSpinSpeed() {
		return this.spinSpeed;
	}

	/** The getSystem method returns the type of WM system.
     * @return returns the type of WM system*/
	public String getSystem() {
		return this.system;
	}

	/** The IncreaseCapacity method increases the WM capacity by given value
	  * @param value is the value to be increased to the WM capacity */
	public void IncreaseCapacity(double value) {
		setCapacity(getCapacity() + value);
	}

	/** The IncreaseSpinSpeed method increases the WM spin speed by given value
	  * @param value is the value to be increased to the WM spin speed */
	public void IncreaseSpinSpeed(int value) {
		setSpinSpeed(getSpinSpeed() + value);
	}

	/** The ChangeSystem method changes the WM working system type
	  * @param newSys is the type of new WM system */
	public void ChangeSystem(String newSys) {
		setSystem(newSys);
	}

	/** The toString method returns representation of a WashingMachine object.
	 * @Overrid */
	public String toString() {
		return ("Washing Machine Descriptions:\n*****************************\n"
				+ super.toString()
				+ "System: "
				+ getSystem()
				+ ".\nSpin Speed: "
				+ getSpinSpeed()
				+ " rpm.\nCapacity: "
				+ getCapacity() + " kg.\n**********************\n\n");
	}

	/** The add method permits the user to enter a new WM to the store.
	 * @Overrid */
	public void add() {
		super.add();
		Scanner input = new Scanner(System.in);
		double capacity;
		int spinSpeed;
		String sys;
		System.out.print("Enter the WM working system pls: ");
		sys = input.next();
		System.out.print("Enter the WM capacity pls: ");
		capacity = input.nextDouble();
		System.out.print("Enter the WM spin speed pls: ");
		spinSpeed = input.nextInt();

		this.setCapacity(capacity);
		this.setSpinSpeed(spinSpeed);
		this.setSystem(sys);
	
	}

}
