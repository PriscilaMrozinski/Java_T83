package aula_exceptions;

//Exception é uma Classe própria do Java, pois faz a herança
public class ExcecaoSimples extends Exception {
	
	/**
	 * 
	 */
	
	//implementam a interface Serializable:
	private static final long serialVersionUID = 1L;
			// serialVersion é uma interface, 
			//garante que usará a versão correta, compatível da Classe com o objeto
			//é obrigatório colocar!
	
	//Polimorfismo sobrecarga:
	public ExcecaoSimples() {}
	public ExcecaoSimples(String mensagem) {
		super(mensagem);
	}

}
