
package classes;

public class FilaP {
        public static int tamanho;
	public static int inicio;
	public static int fim;
	public static int total;
	public static int vetor[]; 
	public static void FilaP(){
		inicio = 0;
		fim = 0;
		total = 0;
		tamanho = 1000;
		vetor = new int [1000];
	}
	public static boolean vazia() {
		if (total == 0)
			return true;
		else
			return false;
	}
	public static boolean cheia() {
	if (total >= tamanho)
		return true;
	else
		return false;
	}
	public static void enfileirar(int elem) {
		if (!cheia())
		{ 
			vetor[fim] = elem;
			fim++;
			total++;
			if (fim >= tamanho)
				fim = 0;
		}
		else
			System.out.println("Fila Cheia");
		} 
	public static String desenfileirar(){
		String elem ; 
		if (vazia() == false)
		{
			elem = String.valueOf(vetor[inicio]);
			inicio++;
			if (inicio >= tamanho)
				inicio = 0;
			total --;
		}else
			elem = "Fila vazia"; 
		return elem; 
	}
	public void exibeFila(){
	for (int i = 0; i < total; i++)
		System.out.println("posicao " + i + " valor " + vetor[i]);
	}
}
