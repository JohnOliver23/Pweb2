package br.edu.ifpb.pweb2.pratica2;

public class TreinamentoCrossFit implements TreinamentoIntf {

	private TreinoIntf treino;
	
	public TreinamentoCrossFit(TreinoIntf treino) {
		this.treino = treino;
	}
	
	@Override
	public void fazTreinamento() {
		System.out.println("vamos");
		treino.preparoFisico();
		System.out.println("Da o gas");
		treino.jogoTreino();
		System.out.println("Vai logo poww");
		treino.treinoTatico();
		
	}

}
