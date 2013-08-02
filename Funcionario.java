public class Funcionario{
	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String rg;
	private int id;

//Construtores

	public Funcionario (String nome){
		this.nome = nome;
	}

	public Funcionario (){
		
	}

//metodos

	public void setNome(String nome){
		this.nome = nome;
}

	public String getNome (){
		return this.nome;
}

	public void setDepartamento (String departamento){
		this.departamento = departamento;
}

	public String getDepartamento(){
		return this.departamento;
}
	public void setSalario(double valor){
		this.salario = valor;
	
}

	public double getSalario(){
		return this.salario;
}
	

	public void recebeAumento (double valor){
		this.salario = salario + valor;

	}

	public void setDataEntrada(Data data){
		this.dataEntrada = data;
} 
	public Data getDataEntrada(){
		return this.dataEntrada;
}


	 public double getGanhoAnual(){
		return this.salario *12;		

	}

	public void mostra(){
		System.out.println("Nome "+ this.nome);
		System.out.println("Salario "+ salario);
		System.out.println("Data Entrada "+ dataEntrada.dataFormat());	
	
		


	}

}
