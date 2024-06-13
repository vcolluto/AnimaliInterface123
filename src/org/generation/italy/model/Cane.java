package org.generation.italy.model;

public class Cane implements Animale {

	@Override
	public void dormi() {
		System.out.println("ZZZBAU");
	}

	@Override
	public void mangia() {
		System.out.println("GNAMBAU");
	}

	@Override
	public void faiVerso() {
		System.out.println("BAU");
	}

}
