class Fibo {
	public static void main (String[] args){
		int anterior = 1;
		int atual = 1;
		System.out.print(atual+" ");
		while(anterior + atual < 100){
			int proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
			System.out.print(atual + " ");		
		}
	}
}
