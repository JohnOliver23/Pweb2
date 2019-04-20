package br.edu.ifpb.pweb2.pratica2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TreinoApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(TreinoSpringConfig.class);
		
		TreinamentoIntf treinamento = context.getBean("treinamento", TreinamentoIntf.class);
		treinamento.fazTreinamento();
//		TreinamentoIntf treinamento2 = context.getBean(TreinamentoIntf.class);
//		System.out.println(treinamento);
//		System.out.println(treinamento2);
		
		context.close();
		
	}

}
