package br.edu.ifpb.pweb2.pratica1;

public class Treinamento implements TreinamentoIntf {
	private TreinoIntf treino;
	
	public Treinamento(TreinoIntf treino) {
		this.treino = treino;
	}
	public Treinamento() {};
	@Override
	public void fazTreinamento() {
		System.out.println("Vamos lá");
		System.out.println("primeiro");
		treino.preparoFisico();
		System.out.println("Agora quero");
		treino.jogoTreino();
		System.out.println("Para terminar");
		treino.treinoTatico();
		
	}
	
	public void setTreino(TreinoIntf treino) {
		this.treino = treino;
		
	}
	

}
