/**
 * This class represents the store in task2 idea2 SE1 Assignment1
 * It has one attribute array to store the appliances: arr 
 * @author Hassan Gamal Abo-Rasheed
 * @version 1.00 2015/6/10
 */
import java.util.ArrayList;

public class Store {
	private ArrayList<Appliance> arr;

	/** The Store method is a constructor of Store class.
	 * @param size is the value of initial store size.*/
	public Store(int size) {
		arr = new ArrayList<Appliance>(size);
	}

	/** The addItem method adds a new item to the store.
	 * @param i is the value of the appliance choice.*/
	public void addItem(int i) {
		Appliance a;
		switch (i) {
		case 1:
			a = new WashingMachine();
			a.add();
			arr.add(a);
			break;
		case 2:
			a = new Refrigerator();
			a.add();
			arr.add(a);
			break;
		case 3:
			a = new Stove();
			a.add();
			arr.add(a);
			break;
		default:
			break;
		}
	}

	/** The sellItem method delete item from the store if it is exist.
	 * @param mod is the value of the appliance model to be sold.*/
	public void sellItem(String mod) {
		for (Appliance a : arr) {
			if (a.getModel().equals(mod)) {
				arr.remove(a);
				System.out.println("Selling is done successfully.\n");
				return;
			}
		}
		System.out.println("Sorry this item is not exist.\n");
		return;
	}

	/** The show method prints all appliances in the store.*/
	public void show() {
		System.out.println("\t\tHouse Store Show\n\t\t****************\n");
		if (arr.isEmpty()) {
			System.out.println("There are no items in the store.");
			return;
		}
		for (Appliance a : arr)
			System.out.println(a);
	}

}