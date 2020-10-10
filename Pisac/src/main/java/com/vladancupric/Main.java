package com.vladancupric;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		Logger logger = (Logger)context.getBean("logger");
		KonzolniPisac konzolniPisac = (KonzolniPisac)context.getBean("konzolniPisac");
		FajlPisac fajlPisac = (FajlPisac)context.getBean("fajlPisac");
		logger.pisiUFajl("Vladan");
		logger.pisiNaKonzolu("Vladan");
		
		((FileSystemXmlApplicationContext)context).close();

	}

}
