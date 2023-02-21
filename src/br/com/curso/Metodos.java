package br.com.curso;

import br.com.curso.model.SmartTv;

public class Metodos {

	public static void main(String[] args) {
		final int AUMENTA_CANAL = 1;
		final int DIMINUI_CANAL = -1;
		
		SmartTv smartTv = new SmartTv();
		
		smartTv.powerOnOff();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.mudarCanal(7);
		smartTv.mudarCanal(AUMENTA_CANAL);
		smartTv.mudarCanal(AUMENTA_CANAL);
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.mudarCanal(5);
		smartTv.mudarCanal(DIMINUI_CANAL);
		smartTv.powerOnOff();
	}

}
