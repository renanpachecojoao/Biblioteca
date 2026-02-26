package src;

public class Pessoa {
	
	//1º Máxima do 0.0 = Encapsulamento
	private int codigo;
	private long cpf;
	private String nome;
	private String telefone; 
	private String email;
	
	public Pessoa () {
		this.codigo = 0;
		this.cpf = 0;
		this.nome = "";
		this.telefone = "";
		this.email = "";
		
	}//fim do construtor padrão[
	
	//2º Máxima da O.O = Sopbrecarga
	public Pessoa(int codigo, long cpf, String nome, String telefone, String email) {
		this.codigo = codigo;
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}//fim do construtor pessoa
	
	//Métodos modificadores
	public int getCodigo() {
		return this.codigo;
	}//fim do getcodigo
	public long getCPF() {
		return this.cpf;
	}//fim do getTelefone
	public String getNome() {
		return this.nome;
	}//fim do getTelefone
	public String getTelefone() {
		return this.telefone;
	}//fim do getTelefone
	public String getEmail() {
		return this.email;
	}//fim do getEmail
	
	public void setCodigo() {
		this.codigo = codigo;
	}// fim do setCodigo
	public void setCPF() {
		this.cpf = cpf;
	}//fim do setCPF
	public void setNome(){
		this.nome = nome;
	}//fim do setNome
	public void setTelefone() {
		this.telefone = telefone;
	}// fim do setTelefone
	public void setEmail() {
		this.email = email;
	}//fim do setEmail
	
	public String imprimir() {
		return "Codigo: " 		+ getCodigo() 	+
				"\nCPF: " 		+ getCPF() 		+
				"\nNome: " 		+ getNome()		+
				"\nTelefone: " 	+ getTelefone() +
				"\nEmail: " 	+ getEmail();
	}//fim do imprimir
	
}//fim da classe
