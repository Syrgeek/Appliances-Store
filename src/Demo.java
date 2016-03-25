/**
 * This class is a demo for using WashingMachine, Stove and Refrigerator classes in the Appliances Store task
 * @author Hassan Gamal Abo-Rasheed
 * @version 1.00 2015/6/10
 * 
 * 
 */

import java.util.Scanner;

public class Demo {
	public static void main(String args[]) {

		int choice;
		final int MAX = 100;
		Store store = new Store(MAX);
		Scanner input = new Scanner(System.in);
		do {
			menu();
			choice = input.nextInt();
			switch (choice) {
			case 1:
				int choice2;
				System.out
						.println("\n1-Washing Machine.\n2-Refrigerator.\n3-Stove.\n4-Back.\n");
				choice2 = input.nextInt();
				store.addItem(choice2);
				break;
			case 2:
				String mod = new String();
				System.out.print("Enter the item model pls: ");
				mod = input.next();
				store.sellItem(mod);
				break;
			case 3:
				store.show();
				break;
			}
		} while (choice != 4);
	}

	/** The menu method shows the options that the user can enter. */
	public static void menu() {
		System.out
				.print("\n****************Welcome to Appliances Store****************\n");
		System.out
				.print("1-Add new item.\n2-Sell item.\n3-Show items.\n4-Exit.\n*************\n");
	}
}
