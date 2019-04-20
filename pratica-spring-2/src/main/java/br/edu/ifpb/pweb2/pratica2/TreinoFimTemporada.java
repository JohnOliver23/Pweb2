package br.edu.ifpb.pweb2.pratica2;

public class TreinoFimTemporada implements TreinoIntf {

	@Override
	public void preparoFisico() {
		System.out.println("Corrida  pesada de 50 minutos");
		
	}

	@Override
	public void jogoTreino() {
		System.out.println("Jogo com equipe titular");
		
	}
	
	@Override
	public void treinoTatico() {
		System.out.println("marcação pesada e treino de escanteios");
		
	}
	

}
