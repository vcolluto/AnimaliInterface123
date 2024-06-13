package org.generation.italy.model;

public class Gatto implements Animale {

	@Override
	public void dormi() {
		System.out.println("ZZZMIAO!");
	}

	@Override
	public void mangia() {
		System.out.println("GMAMMIAO!");
	}

	@Override
	public void faiVerso() {
		System.out.println("MIAO!");
	}

}
