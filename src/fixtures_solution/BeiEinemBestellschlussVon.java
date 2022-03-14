package fixtures_solution;

import java.time.*;

import hotdog.Bestellschluss;
import hotdog.Bestellung;
import hotdog.Mindestbestand;

public class BeiEinemBestellschlussVon {

	private final static int VORHANDENE_MENGE = 1;
	private final static int MINDESTBESTAND = 10;
	
	private LocalTime aktuelleUhrzeit;
	private Bestellschluss bestellschluss;

	public BeiEinemBestellschlussVon(String bestellschluss) {
		this.bestellschluss = new Bestellschluss(LocalTime.parse(bestellschluss));
	}
	
	public void setUndDerAktuellenUhrzeit(String uhrzeit){
		this.aktuelleUhrzeit = LocalTime.parse(uhrzeit);
	}
	
	public Boolean wirdPotentiellBestellt() {
		return new Bestellung(mindestbestand, bestellschluss).wirdBestellt(VORHANDENE_MENGE, aktuelleUhrzeit, "montag");
	}
	
	private final static Mindestbestand mindestbestand = new Mindestbestand() {
		public int mindestbestandFuer(String wochentag) { return MINDESTBESTAND; }
	};
}
