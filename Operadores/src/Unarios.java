
public class Unarios {

	public static void main(String[] args) {
		int preIncrementoOriginal = 8, preIncementoResultado;
		int posIncrementoOriginal = 8, posIncrementoResultado;
		
		// Pré-incremento
		System.out.printf("-----Pré incremento-----%n Valor original = %d%n", preIncrementoOriginal);
		preIncementoResultado = ++preIncrementoOriginal;
		System.out.printf("Após pré incrementar a variável original: %n resultado = %d, Valor Atualizado = %d%n", preIncementoResultado, preIncrementoOriginal);

		// Pós-incremento
		System.out.printf("%n-----Pós incremento-----%n Valor original = %d%n", posIncrementoOriginal);
		posIncrementoResultado = posIncrementoOriginal++;
		System.out.printf("Após pós incrementar a variável original: %n resultado = %d, Valor Atualizado = %d%n", posIncrementoResultado, posIncrementoOriginal);
	}

}
