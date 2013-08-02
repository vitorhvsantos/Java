class TestaEmpresa{
	public static void main (String[] args){

// Objetos
		Empresa empresa = new Empresa();
		empresa.colaboradores = new Funcionario[4];
	

// Metodo para incluir 4 funcionarios
		for (int i =0; i < 4; i++){
			Funcionario f = new Funcionario("Vitor");
			f.setSalario(100);
			f.setDataEntrada(new Data(10,8,2010));
			empresa.adicionaFuncionario(f);

		}
		// Imprime os dados de todos os funcionarios
		empresa.mostraFuncionario();


	}

}
