package br.edu.ifpb.pweb2.v4;

import java.nio.ByteBuffer;

import org.springframework.beans.factory.annotation.Autowired;

public class Banco24Horas implements MaquinaAutoAtendimentoIntf {
	
	private ComunicadorIntf comn;
	
	
	
	public Banco24Horas(ComunicadorIntf comn) {
		this.comn = comn;
	}

	@Override
	public void credite(double valor) {
		System.out.println("creditando "+valor + " na conta...");
		comn.comuniqueComBanco(toByteArray(valor));
		
	}

	@Override
	public void debite(double valor) {
		System.out.println("debitando "+valor + " na conta...");
		comn.comuniqueComBanco(toByteArray(valor));
		
		
	}
	public static byte[] toByteArray(double value) {
		byte[] bytes = new byte[8];
		ByteBuffer.wrap(bytes).putDouble(value);
		return bytes;
	}

	
	

	
}
