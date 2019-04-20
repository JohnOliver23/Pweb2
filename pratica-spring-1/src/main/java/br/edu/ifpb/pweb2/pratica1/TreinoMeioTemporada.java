package br.edu.ifpb.pweb2.pratica1;

public class TreinoMeioTemporada implements TreinoIntf {
	
	@Override
	public void preparoFisico() {
		System.out.println("Corrida leve de 30 minutos");
		
	}

	@Override
	public void jogoTreino() {
		System.out.println("Jogo com equipe com reservas");
		
	}

	@Override
	public void treinoTatico() {
		System.out.println("Cobran�a de penalti");
		
	}

}
