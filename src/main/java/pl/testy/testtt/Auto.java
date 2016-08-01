package pl.testy.testtt;

public class Auto {

	
	private String nazwa;
	private String marka;
	private int predkosc;
	
	
	public Auto(String nazwa, String marka, int predkosc) {
		super();
		this.nazwa = nazwa;
		this.marka = marka;
		this.predkosc = predkosc;
	}


	

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
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
