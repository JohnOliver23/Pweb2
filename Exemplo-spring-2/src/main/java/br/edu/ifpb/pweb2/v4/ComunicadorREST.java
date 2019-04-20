package br.edu.ifpb.pweb2.v4;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class ComunicadorREST implements ComunicadorIntf {

	@PostConstruct()
	public void init() {
		System.out.println("iniciando comunicador REST...");
	}

	@PreDestroy()
	public void finish() {
		System.out.println("finalizando o comunicador REST");
	}

	public void comuniqueComBanco(byte[] dados) {
		System.out.println("comunicando-se com o banco REST");
		System.out.println("{dados: " + Arrays.toString(dados) + " }");
	}

}
