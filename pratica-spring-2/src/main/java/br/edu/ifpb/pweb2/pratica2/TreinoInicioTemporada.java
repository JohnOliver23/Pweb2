package br.edu.ifpb.pweb2.pratica2;

import org.springframework.stereotype.Component;

@Component("treinoInicioTemporada")
public class TreinoInicioTemporada implements TreinoIntf{

	@Override
	public void preparoFisico() {
		System.out.println("Corrida leve de 10 minutos");
		
	}

	@Override
	public void jogoTreino() {
		System.out.println("Jogo com equipe juniores");
		
	}

	@Override
	public void treinoTatico() {
		System.out.println("Cobran�a de escanteios e faltas");
		
	}
	

}
