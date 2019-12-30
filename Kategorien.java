import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class category extends JFrame {

	// text
	private JLabel labelAddCategory;
	
	// text field
	private JTextField fieldAddCategory;
	
	// buttons
	private JButton buttonOkay;
	private JButton buttonDelete;
	
	// view of the window
	public category (String titel){
		
		setTitle (titel);
		setDefaultCloseOperation (DISPOSE_ON_CLOSE);  // click X to close the window
		setLayout (new FlowLayout());
		
		setSize(500,500); // Size: width, Length 
		setResizable (false); // Employee can't change size
		
		initComponents();
		
		// view in the graphic
		add(buttonDelete);
		add(labelAddCategory);
		add(fieldAddCategory);
		add(buttonOkay);
		
		setLocationRelativeTo(null); // Window appears in the middle of the screen
		setVisible(true); // window is visible
		
	} // public category

	private void initComponents() {
	
		labelAddCategory = new JLabel ("Kategorie hinzufügen:");
		
		fieldAddCategory = new JTextField (50); // Groesse aenderbar
		
		buttonOkay = new JButton ("Okay");
		buttonDelete = new JButton ("Löschen");
		
	 } //private void initComponents()
	
} // public class category
