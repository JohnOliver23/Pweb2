package br.edu.ifpb.pweb2.v4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BancoApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//ComunicadorIntf comn = context.getBean("comn",ComunicadorIntf.class);
		MaquinaAutoAtendimentoIntf machine = context.getBean("machine",MaquinaAutoAtendimentoIntf.class);
		/*
		MaquinaAutoAtendimento machine =
				new MaquinaAutoAtendimento(comn);*/
		machine.credite(100.00);
		machine.debite(50.00);
		
	}

}
