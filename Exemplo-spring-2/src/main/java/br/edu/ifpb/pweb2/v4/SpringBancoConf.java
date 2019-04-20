package br.edu.ifpb.pweb2.v4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"br.edu.ifpb.pweb2.v4"})
public class SpringBancoConf {
	@Bean
	public ComunicadorIntf comunicadorText() {
		return new ComunicadorText();
	}
	@Bean
	public MaquinaAutoAtendimentoIntf banco24Horas() {
		return (MaquinaAutoAtendimentoIntf) new Banco24Horas(comunicadorText());
	}
	

}
