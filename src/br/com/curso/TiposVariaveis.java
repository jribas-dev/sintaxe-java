package br.com.curso;

import java.util.Arrays;

public class TiposVariaveis {

	public static void main(String[] args) {

		Primitivos tipoPrimitivo = new Primitivos();
		System.out.println(tipoPrimitivo);
		
		Constantes tipoConstantes = new Constantes();
		System.out.println(tipoConstantes);

	}
}

class Primitivos {
	// tipos inteiros
	private byte  idade       = 43;     // 1 byte (-128 ... 127)
	private short seqProduto  = 976;    // 2 bytes (-32768 ... 32767)
	private int   numPedido   = 125499; // 4 bytes (pouco mais de 2 bilhões)
	private long  numEstrelas = 12358799451231L; // 8 bytes (pouco mais que 9 quinquilhões)
	
	// tipos decimais
	private float salarioMinimo = 1233.5698F; // 4 bytes 
	private double numPreciso   = 29354678.123456333; // 8 bytes 
	
	// tipo boleano
	private boolean clienteAtivo = true; // 1 bit
	
	// tipo Caracteres
	private char emojiPadrao = '\uF600'; // 2 bytes (1 char unicode = 2 bytes)
	private char charData[] = {'A', 'B', 'C'};
	
	public Primitivos() {
	}

	@Override
	public String toString() {
		return getClass().getName() + " {\n\tidade: " + idade + "\n\tseqProduto: " + seqProduto + "\n\tnumPedido: "
				+ numPedido + "\n\tnumEstrelas: " + numEstrelas + "\n\tsalarioMinimo: " + salarioMinimo
				+ "\n\tnumPreciso: " + numPreciso + "\n\tclienteAtivo: " + clienteAtivo + "\n\temojiPadrao: "
				+ emojiPadrao + "\n\tcharData: " + Arrays.toString(charData) + "\n}";
	}
}

class Constantes {
	// constantes
	private final double NUM_PI = Math.PI;
	private final String MEU_NOME = "João Manoel Zaffani Ribas";
	
	public Constantes() {
	}

	@Override
	public String toString() {
		return getClass().getName() + " {\n\tNUM_PI: " + NUM_PI + "\n\tMEU_NOME: " + MEU_NOME + "\n}";
	}
}
