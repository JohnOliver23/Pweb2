package br.edu.ifpb.pweb2.demo.model;

public class Aluno {
	private String nome;
	private String login;
	private String matricula;
	private String pais;
	private String linguagem;
	private String[] fluencia;
	
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	public String[] getFluencia() {
		return fluencia;
	}
	public void setFluencia(String[] fluencia) {
		this.fluencia = fluencia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

}
