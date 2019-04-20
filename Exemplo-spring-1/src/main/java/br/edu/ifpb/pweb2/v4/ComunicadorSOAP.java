package br.edu.ifpb.pweb2.v4;
import java.util.Arrays;

public class ComunicadorSOAP implements ComunicadorIntf{

	@Override
	public void comuniqueComBanco(byte[] dados) {
		System.out.println("comunicando-se com o banco SOAP");
		System.out.println("{dados: "+Arrays.toString(dados)+" }");
		
	}

}
