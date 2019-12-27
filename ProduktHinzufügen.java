import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProduktHinzufuegenActionListener extends JFrame {

	//Text
	private JLabel labelProduktname;
	private JLabel labelGewicht;
	private JLabel labelStueckpreis;
	private JLabel labelKategorie;
	private JLabel labelNeueKategorie;
	private JLabel labelLagernummer;
	private JLabel labelAnzahl; 
	
	// Textfelder
	private JTextField fieldProduktname;
	private JTextField fieldGewicht;
	private JTextField fieldStueckpreis;
	private JTextField fieldKategorie;
	private JTextField fieldNeueKategorie;
	private JTextField fieldLagernummer;
	private JTextField fieldAnzahl;
	
	//Button
	private JButton buttonProduktHinzufuegen;
	
	private int anzahl;
	
	// Ansicht des Fensters
	public ProduktHinzufuegenActionListener(String titel, int anzahl){
		
		this.anzahl = anzahl;
		
		setTitle (titel);
		setDefaultCloseOperation (DISPOSE_ON_CLOSE); // Fenster wird mit Klick auf X geschlossen
		setLayout (new FlowLayout());
		
		setSize(750,500);
		setResizable (false);
		
		initComponents();
		
		// Ansicht in der Grafik
		add(labelProduktname);
		add(fieldProduktname);
		add(labelGewicht);
		add(fieldGewicht);
		add(labelStueckpreis);
		add(fieldStueckpreis);
		add(labelKategorie);
		add(fieldKategorie);
		add(labelNeueKategorie);
		add(fieldNeueKategorie);
		add(labelLagernummer);
		add(fieldLagernummer);
		add(labelAnzahl);
		add(fieldAnzahl); 
		add(buttonProduktHinzufuegen);
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	} // public ProduktHinzufuegenActionListener

	private void initComponents() {
	
		labelProduktname = new JLabel ("Produktname: ");
		labelGewicht = new JLabel ("Gewicht (in kg): ");
		labelStueckpreis = new JLabel ("Stückpreis (in €): ");
		labelKategorie = new JLabel ("Kategorie: ");
		labelNeueKategorie = new JLabel ("neue Kategorie: ");
		labelLagernummer = new JLabel ("Lagernummer: ");
		labelAnzahl = new JLabel ("Anzahl: ");		
		
		fieldProduktname = new JTextField (25); // Groesse aenderbar
		fieldGewicht = new JTextField (5);
		fieldStueckpreis= new JTextField (25);
		fieldKategorie = new JTextField (25);
		fieldNeueKategorie = new JTextField (25);
		fieldLagernummer = new JTextField (6);
		fieldAnzahl = new JTextField (3);
		
		buttonProduktHinzufuegen = new JButton ("Produkt hinzufügen");
		
	 } //private void initComponents()
	
} // public class ProduktHinzufuegenActionListener
