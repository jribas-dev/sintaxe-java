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
	private int   numPedido   = 125499; // 4 bytes (pouco mais de 2 bilh�es)
	private long  numEstrelas = 12358799451231L; // 8 bytes (pouco mais que 9 quinquilh�es)
	
	// tipos decimais
	private float salarioMinimo = 1233.5698F; // 4 bytes 
	private double numPreciso   = 29354678.123456333; // 8 bytes 
	
	// tipo boleano
	private boolean clienteAtivo = true; // 1 bit
	
	// tipo Caracteres
	private char masculino = 'M'; // 2 bytes (1 char unicode = 2 bytes)
	private char charData[] = {'A', 'B', 'C', 'D'};
	
	public Primitivos() {
	}

	@Override
	public String toString() {
		return "Primitivos {\n\tidade: " + idade + "\n\tseqProduto: " + seqProduto + "\n\tnumPedido: " + numPedido
				+ "\n\tnumEstrelas: " + numEstrelas + "\n\tsalarioMinimo: " + salarioMinimo + "\n\tnumPreciso: "
				+ numPreciso + "\n\tclienteAtivo: " + clienteAtivo + "\n\tmasculino: " + masculino + "\n\tcharData: "
				+ Arrays.toString(charData) + "\n}";
	}
}

class Constantes {
	// constantes
	private final double NUM_PI = Math.PI;
	private final String MEU_NOME = "João M Z Ribas";
	private final String SMILE = new String(Character.toChars(0x1F600));
	
	public Constantes() {
	}

	@Override
	public String toString() {
		return "Constantes {\n\tNUM_PI: " + NUM_PI + "\n\tMEU_NOME: " + MEU_NOME + "\n\tSMILE: " + SMILE + "\n}";
	}
}
