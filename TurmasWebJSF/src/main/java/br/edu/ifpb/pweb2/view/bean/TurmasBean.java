package br.edu.ifpb.pweb2.view.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.pweb2.controller.TurmaController;
import br.edu.ifpb.pweb2.model.Turma;

@Named
@SessionScoped
public class TurmasBean extends GenericBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/* Formul�rio */
	private String nome;
	
	@Inject
	TurmaController turmaController;
	
	List<Turma> turmas;
	
	@PostConstruct
	public void init() {
		//turmas = turmaController.listarTurmas();
		turmas = null;
	}
	
	
	
	public void criarTurma(ActionEvent e) {
		turmaController.criarTurma(nome);
		turmas = turmaController.listarTurmas();
		nome = null;
	}
	
	public List<Turma> getTurmas() {
		return turmas;
	}
	

	public String pegarTurma(Turma turma) {
        TurmaBean turmaBean = (TurmaBean) this.getBean("turmaBean");
        turmaBean.setTurma(turma);
		return "turma";
		
	}

	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
