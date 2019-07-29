package br.edu.ifpb.pweb2.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import br.edu.ifpb.pweb2.controller.TurmaController;
import br.edu.ifpb.pweb2.model.Turma;

@FacesConverter("TurmasConverter")
public class TurmasConverter implements Converter {
	@Inject
	TurmaController turmaController;
	@Override
	public Object getAsObject(FacesContext fc, UIComponent c, String valorTela) {
		System.out.println("asObject: "+valorTela);

		return ((Turma) turmaController.getTurmaById(Long.parseLong(valorTela)));
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent c, Object valor) {
		System.out.println("asString: "+valor.getClass() +"-"+valor);
		return valor.toString();
	}

}
