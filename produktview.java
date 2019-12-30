import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class productView extends JFrame {

	// text
	private JLabel labelDescription;
	private JLabel labelWeight;
	private JLabel labelPrice;
	private JLabel labelCategory;
	private JLabel labelStocknumber;
	private JLpbel labelQuantity; 
	private JLabel labelAddProduct;
	private JLabel labelRemoveProduct;
	
	// text fields
	private JTextField fieldDescription;
	private JTextField fieldWeight;
	private JTextField fieldPrice;
	private JTextField fieldCategory;
	private JTextField fieldStocknumber;
	private JTextField fieldAddProduct;
	private JTextField fieldRemoveProduct;
	
	// buttons
	private JButton buttonOkay;
	private JButton buttonDeleteProduct;
	
	// view of the window
	public productView (String titel){
		
		setTitle (titel);
		setDefaultCloseOperation (DISPOSE_ON_CLOSE); // click X to close the window
		setLayout (new FlowLayout());
		
		setSize(500,500); // Size: width, Length 
		setResizable (false);  // Employee can't change size
		
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
		add(labelStocknumber);
		add(fieldStocknumber);
		add(labelQuantity);
		add(labelAddProduct);
		add(fieldAddProduct);
		add(labelRemoveProduct);
		add(fieldRemoveProduct);
		add(buttonOkay);
		add(buttonDeleteProduct);
		
		setLocationRelativeTo(null); // Window appears in the middle of the screen
		setVisible(true); // window is visible
		
	} // public produktView

	private void initComponents() {
	
		labelDescription = new JLabel ("Produktname: ");
		labelWeight = new JLabel ("Gewicht (in kg): ");
		labelPrice = new JLabel ("Stückpreis ( in €) : ");
		labelCategory = new JLabel ("Kategorie: ");
		labelStocknumber = new JLabel ("Lagernummer: ");
		labelQuantity = new JLabel ("Anzahl: ");	//get.Quantity
		labelAddProduct = new JLabel ("Artikel hinzufügen:");
		labelRemoveProduct = new JLabel ("Artikel entnehmen:");
		
		fieldDescription = new JTextField (50); // Groesse aenderbar
		fieldWeight = new JTextField (5);
		fieldPrice= new JTextField (50);
		fieldCategory = new JTextField (50);
		fieldStocknumber = new JTextField (6);
		fieldAddProduct = new JTextField (3);
		fieldRemoveProduct = new JTextField (3);
		
		buttonOkay = new JButton ("Okay");
		buttonDeleteProduct = new JButton ("Produkt löschen");
		
		buttonOkay.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// text for the action of buttonOkay
				
			} // public void actionPerformed
			
			
		}); // buttonOkay.addActionListener (new ActionListener () 
		
		
	 } //private void initComponents()
	
} // public class productView
