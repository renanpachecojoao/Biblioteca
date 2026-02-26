package src;

public class Endereco {
	private String logradouro;
	private int numero;
	private String bairro;
	private String complemento;
	private String cidade;
	private String estado;
	private String uf;
	private long CEP;
	
	public Endereco () {
		this.logradouro = "";
		this.numero = 0;
		this.bairro = "";
		this.complemento = "";
		this.estado = "";
		this.uf = "";
		this.CEP = 0;
	}//fim do construtor
	
	public Endereco(String logradouro, int numero, String bairro, String complemento, 
			String estado, String uf, long CEP) {
		
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado =  estado;
		this.uf = uf;
		this.CEP = CEP;
	}//Fim do construtor
	
	public String getLogradouro() {
		return this.logradouro;
	}// fim do getlogradouro
	public int getNumero() {
		return this.numero;
	}// fim do getnumero
	public String getBairro() {
		return this.bairro;
	}// fim do getBairro
	public String getComplemento() {
		return this.complemento;
	}// fim do getComplemento
	public String getEstado() {
		return this.estado;
	}// fim do getcomplemento
	public String getuf() {
		return this.estado;
	}// fim do getestado
	public long getCEP() {
		return this.CEP;
	}// fim do getCEP

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}//fim do setLogradouro
	public void setNumero(int numero) {
		this.numero = numero;
	}//fim do setnumero
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}//fim do setbairro
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}//fim do setComplemento
	public void setEstado(String estado) {
		this.estado = estado;
	}//fim do setEstado
	public void setuf(String uf) {
		this.uf = uf;
	}//fim do setuf
	public void setCEP(long CEP) {
		this.CEP = CEP;
	}//fim do setLogradouro
	
	public String imprimir() {
		return "Logradouro: " 		+ getLogradouro() 	+
				"\nNúmero: " 		+ getNumero() 		+
				"\nBairro: " 		+ getBairro() 		+
				"\nComplemento: " 	+ getComplemento() 	+
				"\nEstado: "		+ getEstado()		+
				"\nUF: "			+ getuf()			+
				"\nCEP: "			+ getCEP();
	}//fim da classe imprimir
}//fim da classe
