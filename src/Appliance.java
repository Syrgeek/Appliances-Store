/**
 * This class represents the Appliance in task2 idea2 SE1 Assignment1.
 * It has four attributes: maker, model, price, and warranty.
 * @author Hassan Gamal Abo-Rasheed
 * @version 1.00 2015/6/10
 */

import java.util.Scanner;

public abstract class Appliance {
	private String maker;
	private String model;
	private double price;
	private int warranty;

	/** The Appliance method is a default constructor of Appliance class.*/
	protected Appliance() {
	};

	/** The Appliance method is a constructor of Appliance class.
	 * @param maker is the company maker name.
	 * @param model is the Appliance model.
	 * @param price is the value of Appliance price in US dollar.
	 * @param warranty is the value of the warranty.*/
	protected Appliance(String company, String model, double price, int warranty) {
		setMaker(company);
		setModel(model);
		setPrice(price);
		setWarranty(warranty);
	}

	// Setters
	/** The setMaker method assigns a given value to the Appliance maker. 
	  * @param company is the value to set the Appliance maker to. */
	public void setMaker(String company) {
		this.maker = company;
	}

	/** The setModel method assigns a given value to the Appliance model. 
	  * @param model is the value to set the Appliance model to. */
	public void setModel(String model) {
		this.model = model;
	}

	/** The setPrice method assigns a given value to the Appliance price in US dollar. 
	  * @param value is the value to set the Appliance price to. */
	public void setPrice(double value) {
		this.price = value;
	}

	/** The setWarranty method assigns a given value to the Appliance warranty in years. 
	  * @param value is the value to set the Appliance warranty to. */
	public void setWarranty(int value) {
		this.warranty = value;
	}

	// Getters
	/** The getMaker method returns the value of the Appliance maker.
     * @return returns the value of the Appliance maker. */
	public String getMaker() {
		return this.maker;
	}

	/** The getModel method returns the value of the Appliance model.
     * @return returns the value of the Appliance model. */
	public String getModel() {
		return this.model;
	}

	/** The getPrice method returns the value of the Appliance price.
     * @return returns the value of the Appliance price in US dollar. */
	public double getPrice() {
		return this.price;
	}

	/** The getWarranty method returns the value of the Appliance warranty.
     * @return returns the value of the Appliance warranty years. */
	public int getWarranty() {
		return this.warranty;
	}

	/** The toString method returns representation of a Appliance object.
	 * @Overrid */
	public String toString() {
		return ("Maker: " + getMaker() + " co.\nModel: " + getModel()
				+ ".\nPrice: $" + getPrice() + "\nWarranty: " + getWarranty() + " years.\n");
	}

	/** The add method extends warranty years by adding a given value to it.
	 * @param value is the value to be added to the appliance warranty. */
	public void extendWarranty(int value) {
		setWarranty(getWarranty() + value);
	}

	/** The add method permits the user to enter a new Appliance to the store.
	 * @Overrid */
	protected void add() {
		Scanner input = new Scanner(System.in);
		String maker;
		String model;
		double price;
		int warranty;
		System.out.print("Enter the company maker pls: ");
		maker = input.nextLine();
		System.out.print("Enter the item model pls: ");
		model = input.nextLine();
		System.out.print("Enter the item price pls: ");
		price = input.nextDouble();
		System.out.print("Enter the warranty years pls: ");
		warranty = input.nextInt();
		this.setMaker(maker);
		this.setModel(model);
		this.setPrice(price);
		this.setWarranty(warranty);
	}
}
