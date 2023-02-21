package br.com.curso;

public class TiposOperadores {

	public static void main(String[] args) {
		int numero = 10;
		boolean ativo = false;

		System.out.println("Numero: " + numero);
		System.out.println("Ativo : " + ativo);
		System.out.println("=====================");

		System.out.println("Adiciona 2:   " + (numero + 2));
		System.out.println("Subtrai 2:    " + (numero - 2));
		System.out.println("Multiplica 2: " + (numero * 2));
		System.out.println("Dividi 2:     " + (numero / 2));
		System.out.println("Módulo 3:     " + (numero % 3));

		numero = -numero;
		System.out.println("Negação(+-):  " + numero);
		
		numero = -numero;
		System.out.println("Negação(--):  " + numero);
		
		numero++;
		System.out.println("Incrementa:   " + numero);

		numero--;
		System.out.println("Decrementa:   " + numero);

		System.out.println("! not Ativo:  " + !ativo);

		System.out.println("?: Ternário:  " + (ativo ? "Ativo" : "Inativo"));

		System.out.println("=====================");
		System.out.println("Lógicos:      " + "&& E  || OU");
		System.out.println("Relacionais:  " + "== / != / > / >= / < / <=");
	
	}

}
