import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Kategorien extends JFrame {

	//Text
	private JLabel labelKategorieHinzufuegen;
	
	// Textfeld
	private JTextField fieldKategorieHinzufuegen;
	
	//Buttons
	private JButton buttonOk;
	private JButton buttonLoeschen;
	
	private int anzahl;
	
	// Ansicht des Fensters
	public Kategorien(String titel, int anzahl){
		
		this.anzahl = anzahl;
		
		setTitle (titel);
		setDefaultCloseOperation (DISPOSE_ON_CLOSE); // Fenster wird mit Klick auf X geschlossen
		setLayout (new FlowLayout());
		
		setSize(500,500);
		setResizable (false);
		
		initComponents();
		
		// Ansicht in der Grafik
		add(buttonLoeschen);
		add(labelKategorieHinzufuegen);
		add(fieldKategorieHinzufuegen);
		add(buttonOk);
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	} // public Kategorie

	private void initComponents() {
	
		labelKategorieHinzufuegen = new JLabel ("Kategorie hinzufügen:");
		
		fieldKategorieHinzufuegen = new JTextField (50); // Groesse aenderbar
		
		buttonOk = new JButton ("Ok");
		buttonLoeschen = new JButton ("Löschen");
		
	 } //private void initComponents()
	
} // public class Kategorie
