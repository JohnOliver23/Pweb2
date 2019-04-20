package br.edu.ifpb.pweb2.v4;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class ComunicadorSOAP implements ComunicadorIntf {
	
	@PostConstruct()
	public void init() {
		System.out.println("iniciando comunicador SOAP...");
	}

	@PreDestroy()
	public void finish() {
		System.out.println("finalizando o comunicador SOAP");
	}

	@Override
	public void comuniqueComBanco(byte[] dados) {
		System.out.println("comunicando-se com o banco SOAP");
		System.out.println("{dados: " + Arrays.toString(dados) + " }");

	}

}
