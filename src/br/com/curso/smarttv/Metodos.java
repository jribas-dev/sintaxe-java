package br.com.curso.smarttv;

public class Metodos {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		smartTv.powerOnOff();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.mudarCanal(7);
		smartTv.aumentaCanal();
		smartTv.aumentaCanal();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.mudarCanal(5);
		smartTv.dimunuiCanal();
		smartTv.powerOnOff();
	}

}
