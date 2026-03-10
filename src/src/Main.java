package src;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo;
		long CPF;
		String nome;
		String telefone;
		String email;
		Endereco endereco;
		Pessoa pessoa;
		int codigoEndereco;
		String logradouro;
		int numero;
		String bairro;
		String complemento;
		String cidade;
		String estado;
		String uf; 
		long CEP;

		//Variavel que representa a entrada visivel
		Scanner entrada = new Scanner (System.in);
		
		//coletar os dados
		System.out.println("\ninforme um codigo: ");
		codigo = Integer.parseInt(entrada.nextLine());
		//
		System.out.println("\nInforme um CPF: ");
		CPF = Long.parseLong(entrada.nextLine());
		
		System.out.println("\nInforme o nome: ");
		nome = entrada.nextLine();
		
		System.out.println("\nInforme  um telefone: ");
		telefone = entrada.nextLine();
		
		System.out.println("\nInfomre um email: ");
		email = entrada.nextLine();
		
		//-coletar dados do endereço
		
		System.out.println("\nInfome um codigo de endereco: ");
		codigoEndereco = Integer.parseInt(entrada.nextLine());
		
		System.out.println("\nInforme um logradouro: ");
		logradouro = entrada.nextLine();
		
		System.out.println("\nInforme um número:");
		numero = Integer.parseInt(entrada.nextLine());
		
		System.out.println("\nInfome um bairro: ");
		bairro = entrada.nextLine();
		
		System.out.println("\nInforme um complemento: ");
		complemento = entrada.next();
		
		System.out.println("\nInforme uma cidade: ");
		cidade = entrada.nextLine();
		
		System.out.println("\nInforme um estado: ");
		estado = entrada.nextLine();
		
		System.out.println("\nInforme um UF: ");
		uf = entrada.nextLine();
		
		System.out.println("\nInforme um CEP: ");
		CEP = Long.parseLong(entrada.nextLine());
		
		//----CRIAR OBJETO ENDEREÇO PESSOA:
		endereco = new Endereco(codigo, logradouro, numero, bairro, complemento, cidade, estado, uf, CEP);
		pessoa = new Pessoa(codigo, CPF, nome, telefone, email, endereco);

		//----MOSTRAR O RESULTADO DOS DADOS
		System.out.println(pessoa.imprimir());//mostrar os dados
		
	}//fim do método

}//fim da classe
