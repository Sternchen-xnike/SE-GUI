//class Datenbank

import java.io.Writer;
import java.io.FileWriter;
import java.io.File;

import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import java.text.SimpleDateFormat;
public class Database {

	private ArrayList<Product> data = new ArrayList<Product>();

	public void addProduct(String[] sa) {
		int price, weight, quantity, stocknumber;
		quantity = Integer.parseInt(sa[2]);			
		weight = Integer.parseInt(sa[3]);			
		price = Integer.parseInt(sa[4]);
		stocknumber = Integer.parseInt(sa[5]);
//			if (descriptionNotUsed(sa[0]) == false) System.out.println("error: description already in use");	
		if (quantity < 0) System.out.println("error: quantity < 0");
		else if (weight < 1) System.out.println("error: weight < 1");
		else if (price < 1) System.out.println("error: price < 1");
		else if (sa[5].length() != 6) System.out.println("stocknumber is not six digits");
//test if stocknumber is free			if (isFree(Integer.parseInt(sa[5]))) System.out.println("");
//			if (wouldNotExceedMaxWeight) System.out.println("");
		else {
			data.add(new Product(sa[0], sa[1], quantity, weight, price, stocknumber));
		}
	}


/*	public void addProduct(String description, String category, int quantity, int weight, int price, int stocknumber) {
		if weight is <= 0:
			error1
		elif totalweight would exceed maximumweight:
			error2
		elif description already in use:
			error3
		elif price <= 0:	
			error4
		elif stocknumber already in use:
			error5
		else:
			array.add(String description, String category, int quantity, int weight, int price, int stocknumber);
			update weighttotal of corresponding shelf
	} //addProduct
*/

	public boolean descriptionNotUsed(String description) {
		for (Product p : data) {if (p.getDescription() == description) return false;}
		return true;
	}

	public void editProduct(int index, String description, String category, int quantity, int weight, int price, int stocknumber) {
/*		prod = get(index)		
		if weight is <= 0:
			error1
		elif totalweight would exceed maximumweight:
			error2
		elif description already in use:
			error3
		elif price <= 0:	
			error4
		elif stocknumber already in use:
			error5
		else:
			array.remove(index);
			array.add(String description, String category, int quantity, int weight, int price, int stocknumber);
			update weighttotal of corresponding shelf		
*/		
	}

	public void deleteProduct(int index) {
		data.remove(index);
	}


		// initialize an array from external file
	public void initialize(String s) {
		ArrayList<String[]> array = new ArrayList<String[]>();
		Scanner scanner = null;
		File file = new File(s);
		try { scanner = new Scanner(file); }
		catch (FileNotFoundException e) {
//			prompt that file is corrupted and prompt to choose a different file or
//			prompt that file is corrupted and prompt to call service staff
			System.out.println("got it:\n" + e.getMessage());
		}
		
		int count = 0;
		int total = 0;
		int a;
		String[] tmparray = new String[6];
		while(scanner.hasNext()) {
			tmparray[count] = scanner.nextLine();
			if (tmparray[count].length() > 256) { 
				System.out.println("error, file corrupted, string too long"); 
				tmparray[count] = "error";
			} 
			if (count > 1) {
				try {
					a = Integer.parseInt(tmparray[count]);
				}
				catch (NumberFormatException e) {
					System.out.println("gotit, chief " + e.getMessage());
				}
			}
			total ++;
			count ++;
			if (count == 6) {
				count = 0;
				array.add(tmparray);
				tmparray = new String[6];
			}
		}
		if (total % 6 != 0) {
			System.out.println("error, file corrupted, line(s) added or removed");	
		}

		for (String[] sa : array) addProduct(sa);
	} //initialize

/******** don't know if needed ************

		try {
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
******************************************/


	public void save() {				
		// for testing
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
			FileWriter writer = new FileWriter(formatter.format(new Date()));
			// save to specific file
//			FileWriter writer = new FileWriter("specificfile");
			for (Product p : data) {
				writer.write(p.getDescription() + "\n");
				writer.write(p.getCategory() + "\n");
				writer.write(p.getQuantity() + "\n");
				writer.write(p.getWeight() + "\n");
				writer.write(p.getPrice() + "\n");
				writer.write(p.getStockNumber() + "\n");
			}
			writer.close();
		}
		catch (IOException e) {
			System.out.println("got it:\n" + e.getMessage());
		}	
	} //save
} //class
