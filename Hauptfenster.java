import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Fenster_23_12_10_30 extends JFrame {

	// Text
	private JLabel labelBegriff;
	private JLabel labelProduktname;
	private JLabel labelStueckpreis;
	private JLabel labelGewicht;
	private JLabel labelKategorie;
	private JLabel labelAnzahl;
	private JLabel labelLagernummer;
	
	// Textfeld
	private JTextField fieldBegriff;
	
	// Buttons
	private JButton buttonProduktHinzufuegen;
	private JButton buttonKategorienBearbeiten;
	private JButton buttonSuche;
	
	private int anzahl;
	
	// Ansicht des Fensters
	public Fenster_23_12_10_30 (String titel, int anzahl) {
		
		this.anzahl = anzahl;
		
		setTitle (titel);
		setDefaultCloseOperation (DISPOSE_ON_CLOSE); // soll nach Schliessen im Hintergrund weiter laufen
		setLayout (new FlowLayout()); // setzt automatisch alles in einer Reihe -> spaeter noch aendern
		
		setSize (1000,750); // Groesse Breite, Laenge
		setResizable (false); // Mitarbeiter*in kann Groesse nicht veraendern
		
		initComponents();
		
		// Ansicht in der Grafik
		add (labelBegriff);
		add (fieldBegriff);
		add (buttonProduktHinzufuegen);
		add (labelProduktname);
		add (labelStueckpreis);
		add (buttonSuche);
		add (buttonKategorienBearbeiten);
		add (labelGewicht);
		add (labelKategorie);
		add (labelAnzahl);
		add (labelLagernummer);
		
		setLocationRelativeTo (null); // Fenster erscheint in der Mitte des Bildschirms
		setVisible (true); // Fenster ist sichtbar
		
	} // public Fenster_23_12_10_30

	// Komponenten ins Fenster bringen, eigene Methode da sonst zu unuebersichtlich
	private void initComponents() {
		// TODO Auto-generated method stub
		
		// Text
		labelBegriff = new JLabel ("Begriff");
		labelProduktname = new JLabel ("Produktname");
		labelStueckpreis = new JLabel ("Stückpreis");
		labelGewicht = new JLabel ("Gewicht");
		labelKategorie = new JLabel ("Kategorie");
		labelAnzahl = new JLabel ("Anzahl: " + anzahl);
		labelLagernummer = new JLabel ("Lagernummer");
		
		// Textfeld
		fieldBegriff = new JTextField (50); // Groesse spaeter aenderbar
		
		// Buttons
		buttonProduktHinzufuegen = new JButton ("Produkt hinzufügen");
		buttonSuche = new JButton ("Suche");
		buttonKategorienBearbeiten = new JButton ("Kategorien bearbeiten");
		buttonProduktHinzufuegen.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String begriff = fieldBegriff.getText();
				
				ProduktHinzufuegenActionListener meinNeuesProdukt = new ProduktHinzufuegenActionListener ("Produkt hinzufügen:", anzahl);
				
				
			} // public void actionPerformed (ActionEvent e)
			
		}); // buttonProduktHinzufuegen.addActionListener(new ActionListener ()		
		
		buttonKategorienBearbeiten.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Kategorien meineKategorien = new Kategorien ("Kategorien:", anzahl);
				
			} // public void actionPerformed(ActionEvent e)
			
		}); // buttonKategorienBearbeiten.addActionListener(new ActionListener() 
		
	} // private void initComponents()
	
} // public class Fenster_23_12_10_30
