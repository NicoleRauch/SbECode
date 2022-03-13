package fixtures_solution;

import java.time.*;

import hotdog.Bestellschluss;
import hotdog.Bestellung;
import hotdog.Mindestbestand;

public class DerBestellstatus {

	private final static int VORHANDENE_MENGE = 1;
	private final static int MINDESTBESTAND = 10;
	private static final LocalTime AKTUELLE_UHRZEIT = LocalTime.now();
	private static final LocalTime BESTELLSCHLUSS = LocalTime.now().plusHours(1);

	private Bestellung bestellung;

	public void reset() {
		bestellung = new Bestellung(mindestbestand, bestellschluss);
	}
	
	public void setWennBestellungBereitsVersandtWurde(Boolean versandt) {
		if(versandt) {
			bestellung.versendeBestellung();
		}
	}
	
	public Boolean wirdPotentiellBestellt() {
		return bestellung.wirdBestellt(VORHANDENE_MENGE, AKTUELLE_UHRZEIT, "montag");
	}
	
	private final static Mindestbestand mindestbestand = new Mindestbestand() {
		public int mindestbestandFuer(String wochentag) { return MINDESTBESTAND; }
	};

	private final static Bestellschluss bestellschluss = new Bestellschluss() {
		public LocalTime bestellschluss() { return BESTELLSCHLUSS; };
	};
}
