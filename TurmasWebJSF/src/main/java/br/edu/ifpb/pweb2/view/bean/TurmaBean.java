package br.edu.ifpb.pweb2.view.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.pweb2.controller.TurmaController;
import br.edu.ifpb.pweb2.model.Turma;

@Named
@SessionScoped
public class TurmaBean extends GenericBean implements Serializable {
	private static final long serialVersionUID = 1L;
	/* Formulário */
	private String nomeAluno;
	private String matriculaAluno;
	
	/* Propriedades internas */
	private Turma turmaSelecionada;
	
	@Inject
	TurmaController turmaController;
	
	/* Action Methods */
	
	public void matricularAluno(ActionEvent e) {
		turmaController.matricularAluno(turmaSelecionada.getId(), matriculaAluno, nomeAluno);
		this.nomeAluno = null;
		this.matriculaAluno = null;
		this.turmaSelecionada = turmaController.getTurmaById(turmaSelecionada.getId());
	}
	
	public Turma getTurma() {
		return turmaSelecionada;
	}

	public void setTurma(Turma turma) {
		this.turmaSelecionada = turmaController.getTurmaById(turma.getId());
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}


}
