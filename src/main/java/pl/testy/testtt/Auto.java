package pl.testy.testtt;

public class Auto {

	
	private String nazwa;
	private int predkosc;
	
	public Auto(String nazwa, int predkosc) {
		super();
		this.nazwa = nazwa;
		this.predkosc = predkosc;
	}
	
	public String getNazwa() {
		return nazwa;
	}
	
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public int getPredkosc() {
		return predkosc;
	}
	
	public void setPredkosc(int predkosc) {
		this.predkosc = predkosc;
	}

	
}
