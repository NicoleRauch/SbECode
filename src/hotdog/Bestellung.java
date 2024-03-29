package hotdog;

import java.time.LocalTime;

public class Bestellung {

	private boolean bestellungUnterwegs;
	private final Mindestbestand mindestbestand;
	private final Bestellschluss bestellschluss;

	public Bestellung(Mindestbestand mindestbestand, Bestellschluss bestellschluss) {
		this.mindestbestand = mindestbestand;
		this.bestellschluss = bestellschluss;
	}

	public void versendeBestellung() {
		bestellungUnterwegs = true;
	}

	public boolean wirdBestellt(int vorhandeneMenge, LocalTime time, String wochentag) {
		return time.isBefore(bestellschluss.bestellschluss())
				&& vorhandeneMenge <= mindestbestand.mindestbestandFuer(wochentag)
				&& !bestellungUnterwegs;
	}
}
