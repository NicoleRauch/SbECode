package fixtures_solution;

import java.time.*;

import hotdog.Bestellschluss;
import hotdog.Bestellung;
import hotdog.Mindestbestand;


public class BeiEinemMindestbestandVon {

	private int aktuellerBestand;
	private final Mindestbestand mindestbestand;
	private static final LocalTime AKTUELLE_UHRZEIT = LocalTime.now();
	private static final LocalTime BESTELLSCHLUSS = LocalTime.now().plusHours(1);

	public BeiEinemMindestbestandVon(final int mindestbestand) {
		this.mindestbestand = new Mindestbestand() {
			public int mindestbestandFuer(String wochentag) { return mindestbestand; }
		};
	}
	
	public void setUndEinemAktuellenBestandVon(int aktuellerBestand){
		this.aktuellerBestand = aktuellerBestand;
	}
	
	public Boolean wirdPotentiellBestellt() {
		return new Bestellung(mindestbestand, bestellschluss).wirdBestellt(aktuellerBestand, AKTUELLE_UHRZEIT, "montag");
	}

	private final static Bestellschluss bestellschluss = new Bestellschluss() {
		public LocalTime bestellschluss() { return BESTELLSCHLUSS; };
	};
}
