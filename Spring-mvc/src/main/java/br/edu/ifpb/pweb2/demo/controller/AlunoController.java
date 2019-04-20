package br.edu.ifpb.pweb2.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpb.pweb2.demo.model.Aluno;

@RequestMapping("/aluno")
@Controller
public class AlunoController {
	
	@RequestMapping("/")
	public String showFormAluno() {
		return "form-aluno-binding";
	}
	
	@RequestMapping("/cadastreAlunoBinding")
	public String cadastreAlunoBinding(Aluno aluno) {
		System.out.println(aluno.getNome()+" cadastrado com sucesso");
		return "aluno-cadastrado-binding";
	}
	
	@RequestMapping("showAlunoForm")
	public String showAlunoForm(Model model) {
		model.addAttribute("aluno", new Aluno());
		return "form-aluno";
	}
	
	@RequestMapping("cadastreAluno")
	public String cadastreAluno(@ModelAttribute("aluno") Aluno aluno) {
		System.out.println(aluno.getNome()+" aluno cadastrado");
		return "aluno-cadastrado";
	}
}
