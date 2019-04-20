package br.edu.ifpb.pweb2.v4;
import java.util.Arrays;

public class ComunicadorREST implements ComunicadorIntf{
	public  void comuniqueComBanco(byte[] dados) {
		System.out.println("comunicando-se com o banco REST");
		System.out.println("{dados: "+Arrays.toString(dados)+" }");
	}

}
