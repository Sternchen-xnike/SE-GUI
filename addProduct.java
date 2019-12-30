import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class addProduct extends JFrame {

	// text
	private JLabel labelDescription;
	private JLabel labelWeight;
	private JLabel labelPrice;
	private JLabel labelCategory;
	private JLabel labelNewCategory;
	private JLabel labelStocknumber;
	private JLabel labelQuantity; 
	
	// text fields
	private JTextField fieldDescription;
	private JTextField fieldWeight;
	private JTextField fieldPrice;
	private JTextField fieldCategory;
	private JTextField fieldNewCategory;
	private JTextField fieldStocknumber;
	private JTextField fieldQuantity;
	
	// button
	private JButton buttonAddProduct;
	
	// view of the window
	public addProduct (String titel){
		
		setTitle (titel);
		setDefaultCloseOperation (DISPOSE_ON_CLOSE); // click X to close the window
		setLayout (new FlowLayout()); 
		
		setSize(750,500); // Size: width, Length
		setResizable (false); // Employee can't change size
		
		initComponents();
		
		// view in the graphic
		add(labelDescription);
		add(fieldDescription);
		add(labelWeight);
		add(fieldWeight);
		add(labelPrice);
		add(fieldPrice);
		add(labelCategory);
		add(fieldCategory);
		add(labelNewCategory);
		add(fieldNewCategory);
		add(labelStocknumber);
		add(fieldStocknumber);
		add(labelQuantity);
		add(fieldQuantity); 
		add(buttonAddProduct);
		
		setLocationRelativeTo(null); // Window appears in the middle of the screen
		setVisible(true); // window is visible
		
	} // public addProduct

	private void initComponents() {
	
		labelDescription = new JLabel ("Produktname: ");
		labelWeight = new JLabel ("Gewicht (in kg): ");
		labelPrice = new JLabel ("Stückpreis (in €): ");
		labelCategory = new JLabel ("Kategorie: ");
		labelNewCategory = new JLabel ("neue Kategorie: ");
		labelStocknumber = new JLabel ("Lagernummer: ");
		labelQuantity = new JLabel ("Anzahl: ");		
		
		fieldDescription = new JTextField (25); // Groesse aenderbar
		fieldWeight = new JTextField (5);
		fieldPrice= new JTextField (25);
		fieldCategory = new JTextField (25);
		fieldNewCategory = new JTextField (25);
		fieldStocknumber = new JTextField (6);
		fieldQuantity = new JTextField (3);
		
		buttonAddProduct = new JButton ("Produkt hinzufügen");
		
	 } //private void initComponents()
	
} // public class addProduct
