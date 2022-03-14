package hotdog;

import java.time.LocalTime;

public class Bestellschluss {
	private LocalTime bestellschluss = LocalTime.of(16, 0);

	public Bestellschluss(LocalTime bestellschluss) {
		this.bestellschluss = bestellschluss;
	}
	public Bestellschluss() {}

	public LocalTime bestellschluss(){
		return bestellschluss;
	}
}
