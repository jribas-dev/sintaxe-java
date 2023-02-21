package br.com.curso.model;

public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public SmartTv() {
	}
	
	public void powerOnOff () {
		ligada = !ligada;
		System.out.println("Ligada: " + ligada);
	}
	
	public void aumentarVolume () {
		volume++;
		System.out.println("Volume: " + volume);
	}

	public void diminuirVolume () {
		volume--;
		System.out.println("Volume: " + volume);
	}
	
	public void mudarCanal (int novoCanal) {
		if (novoCanal > 1)
			canal = novoCanal;
		else
			canal = canal + novoCanal;
		
		System.out.println("Canal:  " + canal);
	}
}
