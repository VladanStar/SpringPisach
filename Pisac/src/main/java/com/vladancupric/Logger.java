package com.vladancupric;

public class Logger {
	
	private KonzolniPisac konzolniPisac;
	private FajlPisac fajlPisac;
	
	
	public Logger() {
		super();
	}
	public Logger(KonzolniPisac konzolniPisac, FajlPisac fajlPisac) {
		super();
		this.konzolniPisac = konzolniPisac;
		this.fajlPisac = fajlPisac;
	}
	public KonzolniPisac getKonzolniPisac() {
		return konzolniPisac;
	}
	public FajlPisac getFajlPisac() {
		return fajlPisac;
	}
	
	public void setKonzolniPisac(KonzolniPisac konzolniPisac) {
		this.konzolniPisac = konzolniPisac;
	}
	public void setFajlPisac(FajlPisac fajlPisac) {
		this.fajlPisac = fajlPisac;
	}
	public void pisiUFajl(String linija) {
		fajlPisac.pisiLiniju(linija);
	}
	public void pisiNaKonzolu(String linija) {
		konzolniPisac.pisiLiniju(linija);
	}
	

}
