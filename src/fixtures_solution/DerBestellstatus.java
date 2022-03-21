package fixtures_solution;

import java.time.*;

import hotdog.Bestellschluss;
import hotdog.Bestellung;
import hotdog.Mindestbestand;

public class DerBestellstatus {

	private static final int VORHANDENE_MENGE = 1;
	private static final int MINDESTBESTAND = 10;
	private static final LocalTime AKTUELLE_UHRZEIT = LocalTime.of(13, 0);
	private static final LocalTime BESTELLSCHLUSS = LocalTime.of(14, 0);

	private Bestellung bestellung;

	public void reset() {
		bestellung = new Bestellung(mindestbestand,new Bestellschluss(BESTELLSCHLUSS));
	}
	
	public void setWennBestellungBereitsVersandtWurde(Boolean versandt) {
		if(versandt) { bestellung.versendeBestellung(); }
	}
	
	public Boolean wirdPotentiellBestellt() {
		return bestellung.wirdBestellt(VORHANDENE_MENGE, AKTUELLE_UHRZEIT, "montag");
	}
	
	private final static Mindestbestand mindestbestand = new Mindestbestand() {
		public int mindestbestandFuer(String wochentag) { return MINDESTBESTAND; }
	};
}
