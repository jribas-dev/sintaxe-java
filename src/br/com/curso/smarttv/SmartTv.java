package br.com.curso.smarttv;
/**
* <h1>Smart TV</h1>
* Esse objeto de Smart TV, é capaz de ligar/desligar, mudar volume e mudar de canal.
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  jribas-dev
* @version 1.0
* @since   23/02/2023
*/
public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public SmartTv() {
	}
	
	/**
	* <h1>powerOnOff</h1>
	* Este método é utilizado para ligar e desligar a TV
	* não possui parâmetros e retorno.
	*/
	public void powerOnOff () {
		ligada = !ligada;
		System.out.println("Ligada: " + ligada);
	}
	
	/**
	* <h1>aumentarVolume</h1>
	* Este método é utilizado para aumentar o volume da TV
	* não possui parâmetros e retorno.
	*/
	public void aumentarVolume () {
		volume++;
		System.out.println("Volume: " + volume);
	}

	/**
	* <h1>diminuirVolume</h1>
	* Este método é utilizado para diminuir o volume da TV
	* não possui parâmetros e retorno.
	*/
	public void diminuirVolume () {
		volume--;
		System.out.println("Volume: " + volume);
	}
	
	/**
	* <h1>aumentaCanal</h1>
	* Este método é utilizado para subir um canal da TV
	* não possui parâmetros e retorno.
	*/
	public void aumentaCanal () {
		canal++;
		System.out.println("Canal:  " + canal);
	}

	/**
	* <h1>diminuiCanal</h1>
	* Este método é utilizado para baixar um canal da TV
	* não possui parâmetros e retorno.
	*/
	public void dimunuiCanal () {
		canal--;
		System.out.println("Canal:  " + canal);
	}
	
	/**
	* <h1>mudarCanal</h1>
	* Este método é utilizado para mudar para o canal informado
	* não possui retorno.
	* @param novoCanal [int] informar o canal  
	*/
	public void mudarCanal (int novoCanal) {
		canal = novoCanal;
		System.out.println("Canal:  " + canal);
	}
}
