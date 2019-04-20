package br.edu.ifpb.pweb2.pratica1;

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
		System.out.println("Cobrança de escanteios e faltas");
		
	}
	

}
