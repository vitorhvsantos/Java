class TestaFuncionario{
	public static void main (String[] args){

		Funcionario func = new Funcionario("Vitor S");

		
		func.setDataEntrada(new Data(10,8,2010));
		func.setSalario(200);
		func.mostra();

		
	}

}
