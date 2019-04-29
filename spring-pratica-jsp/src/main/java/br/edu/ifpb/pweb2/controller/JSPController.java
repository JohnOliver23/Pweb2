package br.edu.ifpb.pweb2.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class JSPController {
	
	@RequestMapping("showObjetosImplicitos")
	public String showObjetosPreDefinidos() {
		return "objetos-jsp";
	}
	
	@RequestMapping("showAtributos")
	public String showAtributo(Model model) {
		model.addAttribute("nome", "fulano de tal");
		int numeros[] = new int[] {1,2,3,4,5};
		model.addAttribute("numeros", numeros);
		List<Integer> pares = Arrays.asList(2, 4, 6, 8);
		model.addAttribute("pares", pares);
		return "show-atributos";
	}
	
	@RequestMapping("showForEach")
	public String showForEach(Model model) {
		String estados [] = new String[] {"PB","PE","RN","CE"};
		model.addAttribute("estados", estados);
		List<Integer> pares = Arrays.asList(2, 4, 6, 8);
		model.addAttribute("pares", pares);
		return "show-foreach";
		
	
	}
	
	@RequestMapping("showIf")
	public String showIf(Model model) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		model.addAttribute("numeros", numeros);
		return "show-if";
		
	}
	@RequestMapping("showFormatNumber")
	public String showFormatNumber(Model model) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		model.addAttribute("numeros", numeros);
		return "show-formatnumber";
	}
}
