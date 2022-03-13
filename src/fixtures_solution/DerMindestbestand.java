package fixtures_solution;

import hotdog.Mindestbestand;

public class DerMindestbestand {
	
	private String wochentag;

	public void setBeträgtAm(String wochentag){
		this.wochentag = wochentag;
	}
	
	public int Stück() {
		return new Mindestbestand().mindestbestandFuer(wochentag);
	}
}
