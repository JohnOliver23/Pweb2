package br.edu.ifpb.pweb2.v4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BancoApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringBancoConf.class);
		
		MaquinaAutoAtendimento machine = context.getBean(MaquinaAutoAtendimento.class);
		
		MaquinaAutoAtendimentoIntf atm = context.getBean("banco24Horas",MaquinaAutoAtendimentoIntf.class);
		
		//MaquinaAutoAtendimento machine2 = context.getBean(MaquinaAutoAtendimento.class);
		machine.credite(100.00);
		machine.debite(50.00);
		System.out.println(machine);
		//System.out.println(machine2);
		atm.credite(150.00);
		atm.debite(170.00);
		
	}

}
