package br.edu.ifpb.pweb2.v4;

import java.util.Arrays;

public class ComunicadorText implements ComunicadorIntf {

	@Override
	public void comuniqueComBanco(byte[] dados) {
		System.out.println("comunicando-se com o banco Text");
		System.out.println("{dados: " + Arrays.toString(dados) + " }");
		
	}

}
