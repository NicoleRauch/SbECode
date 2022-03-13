package fixtures_solution;

import java.time.*;

import hotdog.Bestellschluss;
import hotdog.Bestellung;
import hotdog.Mindestbestand;

public class AusführungDerBestellung {
	private final static int MINDESTBESTAND = 10;
	private static final LocalTime BESTELLSCHLUSS = LocalTime.of(12, 0);
	private int vorhandeneMenge;
	private LocalTime aktuelleUhrzeit;
	private Bestellung bestellung;

	public void reset() {
		bestellung = new Bestellung(mindestbestand, bestellschluss);
	}
	
	public void setMindestbestandIstUnterschritten(Boolean unterschritten){
		vorhandeneMenge = unterschritten ? MINDESTBESTAND - 5 : MINDESTBESTAND + 5;}
	
	public void setBestellschlussIstSchonErreicht(Boolean erreicht){
		aktuelleUhrzeit = erreicht ? BESTELLSCHLUSS.plusHours(1) : BESTELLSCHLUSS.minusHours(1);}
	
	public void setBestellungBereitsVersandt(Boolean versandt){
		if(versandt) { bestellung.versendeBestellung(); }}
	
	public Boolean wirdBestellt(){
		return bestellung.wirdBestellt(vorhandeneMenge, aktuelleUhrzeit, "montag");
	}
	
	private final static Mindestbestand mindestbestand = new Mindestbestand() {
		public int mindestbestandFuer(String wochentag) { return MINDESTBESTAND; }
	};

	private final static Bestellschluss bestellschluss = new Bestellschluss() {
		public LocalTime bestellschluss() { return BESTELLSCHLUSS; };
	};

}
