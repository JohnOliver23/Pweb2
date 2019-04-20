package br.edu.ifpb.pweb2.pratica2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("treinamento")
/*cria outra referência
@Scope("prototype")
*/
/*cria a mesma referência*/
@Scope("singleton")
public class Treinamento implements TreinamentoIntf {
	/*
	@Autowired
	@Qualifier("treinoMeioTemporada")
	*/
	private TreinoIntf treino;
	
	/*@Autowired*/
	public Treinamento(/*@Qualifier("treinoInicioTemporada")*/TreinoIntf treino) {
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
	@Autowired
	@Qualifier("treinoInicioTemporada")
	public void setTreino(TreinoIntf treino) {
		this.treino = treino;
		
	}
	

}
