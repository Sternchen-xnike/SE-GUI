import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class mainWindow extends JFrame {

	// text
	private JLabel labelTerm;
	private JLabel labelDescription;
	private JLabel labelPrice;
	private JLabel labelWeight;
	private JLabel labelCategory;
	private JLabel labelQuantity;
	private JLabel labelStocknumber;
	
	// text fields
	private JTextField fieldTerm;
	
	// buttons
	private JButton buttonAddProduct;
	private JButton buttonEditCategories;
	private JButton buttonSearch;
	
	// view of the window
	public mainWindow (String titel) {
		
		setTitle (titel);
		setDefaultCloseOperation (DISPOSE_ON_CLOSE); // should continue to run in the background after closing
		setLayout (new FlowLayout()); 
		
		setSize (1000,750); // Size: width, Length 
		setResizable (false); // Employee cannot change size
		
		initComponents();
		
		// View in the graphic
		add (labelTerm);
		add (fieldTerm);
		add (buttonAddProduct);
		add (labelDescription);
		add (labelPrice);
		add (buttonSearch);
		add (buttonEditCategories);
		add (labelWeight);
		add (labelCategory);
		add (labelQuantity);
		add (labelStocknumber);
		
		setLocationRelativeTo (null); // Window appears in the middle of the screen
		setVisible (true); // window is visible
		
	} // public mainWindow

	// Bring components into the window, own method otherwise too confusing
	private void initComponents() {
		
		// text
		labelTerm = new JLabel ("Begriff: ");
		labelDescription = new JLabel ("Produktname: ");
		labelPrice = new JLabel ("Stückpreis: ");
		labelWeight = new JLabel ("Gewicht: ");
		labelCategory = new JLabel ("Kategorie: ");
		labelQuantity = new JLabel ("Anzahl: "); // get Quantity?
		labelStocknumber = new JLabel ("Lagernummer: ");
		
		// text field
		fieldTerm = new JTextField (256); // Groesse noch links und rechts hin und her switchen 
		
		// buttons
		buttonAddProduct = new JButton ("Produkt hinzufügen");
		buttonSearch = new JButton ("Suche");
		buttonEditCategories = new JButton ("Kategorien bearbeiten");
		buttonAddProduct.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				addProduct myNewProduct = new addProduct ("Produkt hinzufügen:"); 
						
			} // public void actionPerformed (ActionEvent e)
			
		}); // buttonAddProduct.addActionListener(new ActionListener ()		
		
		buttonEditCategories.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				 category myCategories = new category ("Kategorien:");
				
			} // public void actionPerformed(ActionEvent e)
			
		}); // buttonEditCategories.addActionListener(new ActionListener() 
		
	} // private void initComponents()
	
} // public class mainWindow
