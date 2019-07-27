package br.edu.ifpb.pweb2.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
@ManagedBean(name="loginBean")
@SessionScoped
public class LoginBean {
	private String login, senha;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String autentique() {
		if (login.equals("admin") && senha.equals("changeit")) {
			return"successo";
		}
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null,
		new FacesMessage(FacesMessage.SEVERITY_WARN,
		"Usuário e/ou senha inválidos.",
		"Verifique se CAPSLOCK está ativada."));
		return null; //volta para a pagina onde está
		}

}
