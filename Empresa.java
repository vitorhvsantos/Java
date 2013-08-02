class Empresa{
	String nome;
	String cnpj;
	Funcionario[] colaboradores;
	int posicaoLivre = 0; 


	
	void adicionaFuncionario (Funcionario f){
		if (posicaoLivre < colaboradores.length){
			this.colaboradores[posicaoLivre] = f;
			posicaoLivre ++;
		} else {
			System.out.println("Nao e possivel adicionar mais funcionario");
		}
	}

	    void mostraFuncionario(){
		for(int i=0 ; i < this.posicaoLivre; i++){
			
			//System.out.println("Funcionario na posicao: " + i +" Salario r$ "+  colaboradores[i].salario); 
			colaboradores[i].mostra();
			

		}

		
	}

}
