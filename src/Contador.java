import java.util.Scanner;
/**
	* <h1>Contator</h1>
	* A contador realiza calcula a diferença entre 2 números inteiros e realiza a contagem, imprimindo a mensagem "Imprimindo o número <x>" durante esta contagem
	* <p>
	*
	* @author  Everton Moraes
	* @version 1.0
	* @since   08/06/2024
	*/
public class Contador {
     /**
	* Este método recebe dois parâmetros através do terminal para iniciara contagem
	* @param parametroUm este é o primeiro parâmetro do método, número inicial da contagem
	* @param parametroDois este é o segundo parâmetro do método,número final da contagem
	*/
	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);
        //captura o primeirp parâmetro
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

        //captura o segundo parâmetro
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        
        //encerra as capturas
        terminal.close();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
            System.err.printf("Primeiro parâmetro informado: %d \nSegundo parâmetro informado: %d \n", parametroUm, parametroDois);
		}
		
	}
    /**
	* Este método é utilizado realizar  diferença entre 2 números inteiros, imprimirdo a contagem
	* @param parametroUm este é o primeiro parâmetro do método, número inicial da contagem
	* @param parametroDois este é o segundo parâmetro do método,número final da contagem
	*/
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável12 contagem
        for(int x=1; x<=contagem; x++){
            System.out.println("Imprimindo o número " + x + " (" + (parametroUm+x)+")");
        }
	}
}