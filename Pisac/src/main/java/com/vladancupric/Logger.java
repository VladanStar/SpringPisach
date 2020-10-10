package com.vladancupric;

import org.springframework.beans.factory.annotation.Autowired;

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
	@Autowired
	public void setKonzolniPisac(KonzolniPisac konzolniPisac) {
		this.konzolniPisac = konzolniPisac;
	}
	@Autowired
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
